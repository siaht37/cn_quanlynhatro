package quanlynhatro.doanchuyennganh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quanlynhatro.doanchuyennganh.entity.TaiKhoan;
import quanlynhatro.doanchuyennganh.service.TaiKhoanService;

import java.util.List;

@RestController
@RequestMapping("/TaiKhoan")
public class TaiKhoanController implements IController<TaiKhoan> {
    @Autowired
    private TaiKhoanService taiKhoanService;

    @Override
    @GetMapping("/")
    public List<TaiKhoan> getAll() {
        return taiKhoanService.getAll();
    }

    @Override
    @PostMapping("/")
    public TaiKhoan insert(TaiKhoan taiKhoan) {
        return taiKhoanService.insert(taiKhoan);
    }

    @Override
    @PutMapping("/")
    public TaiKhoan update(TaiKhoan taiKhoan) {
        return taiKhoanService.update(taiKhoan);
    }
}
