package quanlynhatro.doanchuyennganh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import quanlynhatro.doanchuyennganh.entity.HoaDonHangThang;
import quanlynhatro.doanchuyennganh.service.HoaDonHangThangService;

import java.util.List;

@RestController
@RequestMapping("/HoaDonHangThang")
@CrossOrigin(origins = "http://localhost:3000")
public class HoaDonHangThangController implements IController<HoaDonHangThang> {
    @Autowired
    HoaDonHangThangService hoaDonHangThangService;

    @Override
    @GetMapping("/")
    public List<HoaDonHangThang> getAll() {
        return hoaDonHangThangService.getAll();
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
