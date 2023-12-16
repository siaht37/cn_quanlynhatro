package quanlynhatro.doanchuyennganh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quanlynhatro.doanchuyennganh.entity.Phong;
import quanlynhatro.doanchuyennganh.service.PhongService;

import java.util.List;

@RestController
@RequestMapping("/Phong")
public class PhongController implements IController<Phong> {
    @Autowired
    private PhongService phongService;

    @Override
    @GetMapping("/")
    public List<Phong> getAll() {
        return phongService.getAll();
    }

    @Override
    @PostMapping("/")
    public Phong insert(Phong phong) {
        return phongService.insert(phong);
    }

    @Override
    @PutMapping("/")
    public Phong update(Phong phong) {
        return phongService.insert(phong);
    }
}
