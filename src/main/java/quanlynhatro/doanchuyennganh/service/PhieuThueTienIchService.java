package quanlynhatro.doanchuyennganh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quanlynhatro.doanchuyennganh.entity.ChiTietPhieuThueTienIch;
import quanlynhatro.doanchuyennganh.entity.PhieuThueTienIch;
import quanlynhatro.doanchuyennganh.entity.TaiKhoan;
import quanlynhatro.doanchuyennganh.entity.TienIch;
import quanlynhatro.doanchuyennganh.entity.compositekey.ChiTietPhieuThueTienIchId;
import quanlynhatro.doanchuyennganh.repository.IChiTietPhieuThueTienIchRepository;
import quanlynhatro.doanchuyennganh.repository.IPhieuThueTienIchRepository;
import quanlynhatro.doanchuyennganh.repository.ITaiKhoanRepository;
import quanlynhatro.doanchuyennganh.repository.ITienIchRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PhieuThueTienIchService implements IService<PhieuThueTienIch> {

    @Autowired
    private IPhieuThueTienIchRepository phieuThueTienIchRepository;
    @Autowired
    private IChiTietPhieuThueTienIchRepository chiTietPhieuThueTienIchRepository;

    @Autowired
    private ITienIchRepository tienIchRepository;
    @Autowired
    private ITaiKhoanRepository taiKhoanRepository;

    @Override
    public List<PhieuThueTienIch> getAll() {
        return phieuThueTienIchRepository.findAll();
    }

    @Override
    public PhieuThueTienIch insert(PhieuThueTienIch phieuThueTienIch) {
        return null;
    }

    public List<ChiTietPhieuThueTienIch> insert(String username, List<Integer> maTienIches) {
        //
        Optional<TaiKhoan> taiKhoan = taiKhoanRepository.findByUserName(username);
        List<ChiTietPhieuThueTienIch> chiTietPhieuThueTienIches = new ArrayList<>();
        if (taiKhoan.isEmpty()) {
            return null;
        }
        List<TienIch> mulTienIch = tienIchRepository.findAllById(maTienIches);

        PhieuThueTienIch phieuThueTienIchSaved = PhieuThueTienIch.builder()
                .taiKhoan(taiKhoan.get())
                .ngayLap(new Date())
                .build();
        phieuThueTienIchRepository.save(phieuThueTienIchSaved);

        for (TienIch tienIch : mulTienIch) {
            ChiTietPhieuThueTienIch chiTietPhieuThueTienIch = ChiTietPhieuThueTienIch.builder()
                    .tinhTrang(tienIch.getTinhTrang())
                    .phieuThueTienIch(phieuThueTienIchSaved)
                    .tienIch(tienIch)
                    .build();

            chiTietPhieuThueTienIches.add(chiTietPhieuThueTienIch);
        }

        return chiTietPhieuThueTienIchRepository.saveAll(chiTietPhieuThueTienIches);
    }

    @Override
    public PhieuThueTienIch update(PhieuThueTienIch phieuThueTienIch) {
        return null;
    }

    public List<ChiTietPhieuThueTienIch> update(Integer maPhieuThue, List<Integer> maTienIches) {
        PhieuThueTienIch phieuThueTienIch = phieuThueTienIchRepository.findById(maPhieuThue).get();
        List<TienIch> mulTienIch = tienIchRepository.findAllById(maTienIches);
        List<ChiTietPhieuThueTienIch> chiTietPhieuThueTienIches = phieuThueTienIch.getChiTietPhieuThueTienIches().stream().toList();

        ArrayList<ChiTietPhieuThueTienIchId> chiTietPhieuThueTienIchIds = new ArrayList<>();

        for (ChiTietPhieuThueTienIch chiTietPhieuThueTienIch : chiTietPhieuThueTienIches) {
            ChiTietPhieuThueTienIchId chiTietPhieuThueTienIchId = new ChiTietPhieuThueTienIchId(phieuThueTienIch, chiTietPhieuThueTienIch.getTienIch());
            chiTietPhieuThueTienIchIds.add(chiTietPhieuThueTienIchId);
        }
        chiTietPhieuThueTienIchRepository.deleteAllById(chiTietPhieuThueTienIchIds);

        for (TienIch tienIch : mulTienIch) {
            ChiTietPhieuThueTienIch chiTietPhieuThueTienIch = ChiTietPhieuThueTienIch.builder()
                    .tinhTrang(tienIch.getTinhTrang())
                    .phieuThueTienIch(phieuThueTienIch)
                    .tienIch(tienIch)
                    .build();
            chiTietPhieuThueTienIches.add(chiTietPhieuThueTienIch);
        }
        return chiTietPhieuThueTienIches;
    }
}
