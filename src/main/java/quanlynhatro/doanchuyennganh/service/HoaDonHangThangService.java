package quanlynhatro.doanchuyennganh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quanlynhatro.doanchuyennganh.dto.response.HoaDonHangThangResponseDTO;
import quanlynhatro.doanchuyennganh.entity.HoaDonHangThang;
import quanlynhatro.doanchuyennganh.repository.IChiTietPhieuThueTienIchRepository;
import quanlynhatro.doanchuyennganh.repository.IHoaDonHangThangRepository;
import quanlynhatro.doanchuyennganh.repository.ISoDienRepository;
import quanlynhatro.doanchuyennganh.repository.ISoNuocRepository;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<HoaDonHangThang> getAll() {
        return hoaDonHangThangRepository.findAll();
    }

    @Override
    public HoaDonHangThang insert(HoaDonHangThang hoaDonHangThang) {
        return null;
    }

    @Override
    public HoaDonHangThang update(HoaDonHangThang hoaDonHangThang) {
        return null;
    }

    public List<HoaDonHangThangResponseDTO> insertHoaDonsTheoThang(int month) {
        List<HoaDonHangThangResponseDTO> hoaDonHangThangResponseDTOS = new ArrayList<>();


        for (HoaDonHangThangResponseDTO hoaDonHangThangResponseDTO : hoaDonHangThangResponseDTOS) {


        }

        return hoaDonHangThangResponseDTOS;
    }
}
