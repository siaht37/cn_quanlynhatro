package quanlynhatro.doanchuyennganh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quanlynhatro.doanchuyennganh.entity.ChiTietPhieuThueTienIch;
import quanlynhatro.doanchuyennganh.entity.PhieuThueTienIch;
import quanlynhatro.doanchuyennganh.entity.TaiKhoan;
import quanlynhatro.doanchuyennganh.entity.TienIch;
import quanlynhatro.doanchuyennganh.repository.IChiTietPhieuThueTienIchRepository;
import quanlynhatro.doanchuyennganh.repository.IPhieuThueTienIchRepository;
import quanlynhatro.doanchuyennganh.repository.ITaiKhoanRepository;
import quanlynhatro.doanchuyennganh.repository.ITienIchRepository;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;
@Service
public class PhieuThueTienIchService implements IService<PhieuThueTienIch>{

    @Autowired
   private  IPhieuThueTienIchRepository phieuThueTienIchRepository;
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

    public ChiTietPhieuThueTienIch insert(String username,List<TienIch> tienIches){
        //
        Optional<TaiKhoan> taiKhoan =taiKhoanRepository.findByUserName(username);
        if(taiKhoan.isEmpty()){
            return null;
        }else{
            PhieuThueTienIch phieuThueTienIchSaved = new PhieuThueTienIch();
            phieuThueTienIchSaved.setTaiKhoan(taiKhoan.get());
            phieuThueTienIchSaved.setNgayLap(new Date());
            PhieuThueTienIch phieuThueTienIch = phieuThueTienIchRepository.save(phieuThueTienIchSaved);
            for (TienIch tienIch:tienIches) {
                ChiTietPhieuThueTienIch chiTietPhieuThueTienIch = new ChiTietPhieuThueTienIch();
                chiTietPhieuThueTienIch.setTinhTrang(tienIch.getTinhTrang());
                chiTietPhieuThueTienIch.setPhieuThueTienIch(phieuThueTienIchSaved);
                chiTietPhieuThueTienIch.setTienIch(tienIch);
                return chiTietPhieuThueTienIchRepository.save(chiTietPhieuThueTienIch);
            }

        }

        return null;
    }

    @Override
    public PhieuThueTienIch update(PhieuThueTienIch phieuThueTienIch) {
        return null;
    }
}
