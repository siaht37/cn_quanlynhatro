package quanlynhatro.doanchuyennganh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quanlynhatro.doanchuyennganh.entity.HoaDonHangThang;
import quanlynhatro.doanchuyennganh.entity.TaiKhoan;
import quanlynhatro.doanchuyennganh.repository.*;

import java.util.List;
import java.util.Optional;

@Service
public class HoaDonHangThangService implements IService<HoaDonHangThang> {
    @Autowired
    private IHoaDonHangThangRepository hoaDonHangThangRepository;
    @Autowired
    private ISoDienRepository soDienRepository;
    @Autowired
    private ISoNuocRepository soNuocRepository;
    @Autowired
    private IChiTietPhieuThueTienIchRepository chiTietPhieuThueTienIchRepository;
    @Autowired
    private IPhongRepository phongRepository;
    @Autowired
    private IHopDongThuePhongRepository hopDongThuePhongRepository;
    @Autowired
    private ITaiKhoanRepository taiKhoanRepository;

    @Override
    public List<HoaDonHangThang> getAll() {
        return hoaDonHangThangRepository.findAll();
    }

    public List<HoaDonHangThang> getByTaiKhoan(String usename) {
        Optional<TaiKhoan> taiKhoan = taiKhoanRepository.findByUserName(usename);
        return hoaDonHangThangRepository.findByTaiKhoan(taiKhoan.get());
    }

    @Override
    public HoaDonHangThang insert(HoaDonHangThang hoaDonHangThang) {
        return null;
    }

    @Override
    public HoaDonHangThang update(HoaDonHangThang hoaDonHangThang) {
        return null;
    }


//    public List<HoaDonHangThangResponseDTO> insertHoaDonsTheoThang(int month) {
//        List<HoaDonHangThangResponseDTO> hoaDonHangThangResponseDTOS = new ArrayList<>();
//        List<Phong> phongs = phongRepository.findByConTrongIsFalse();
//
//        for (Phong phong : phongs) {
//            HoaDonHangThangResponseDTO hoaDonHangThangResponseDTO = HoaDonHangThangResponseDTO.builder()
//                    .hoaDonHangThang(hoaDonHangThangRepository.findByHopDongThuePhong(hopDongThuePhongRepository.findByPhong(phong)))
//                    .build();
//
//
//        }
//
//        return hoaDonHangThangResponseDTOS;
//    }
}
