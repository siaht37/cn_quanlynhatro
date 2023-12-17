package quanlynhatro.doanchuyennganh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quanlynhatro.doanchuyennganh.dto.response.HoaDonHangThangResponseDTO;
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

    @GetMapping("/HoaDonsTheoUserName/{username}")
    public List<HoaDonHangThang> getByUserName(@PathVariable String username) {
        return hoaDonHangThangService.getByTaiKhoan(username);
    }

    @GetMapping("/getByUserNameAndStateIsFalse/{username}")
    public List<HoaDonHangThang> getByUserNameAndStateIsFalse(@PathVariable String username) {
        return hoaDonHangThangService.getByTaiKhoanAndStateIsFalse(username);
    }

    @Override
    public HoaDonHangThang insert(HoaDonHangThang hoaDonHangThang) {
        return null;
    }

    @PostMapping("/createHoaDonsByMonthYear/{month}/{year}")
    public List<HoaDonHangThangResponseDTO> createHoaDonsByMonthYear(@PathVariable Integer month, @PathVariable Integer year) {
        return hoaDonHangThangService.createHoaDonsByMonthYear(month, year);
    }

    @Override
    public HoaDonHangThang update(HoaDonHangThang hoaDonHangThang) {
        return null;
    }
}
