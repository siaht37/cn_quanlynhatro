package quanlynhatro.doanchuyennganh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quanlynhatro.doanchuyennganh.entity.HoaDonHangThang;
import quanlynhatro.doanchuyennganh.repository.IHoaDonHangThangRepository;

import java.util.List;

@Service
public class HoaDonHangThangService implements IService<HoaDonHangThang> {
    @Autowired
    private IHoaDonHangThangRepository hoaDonHangThangRepository;

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
}
