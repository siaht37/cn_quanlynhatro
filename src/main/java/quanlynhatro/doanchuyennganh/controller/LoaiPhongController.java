package quanlynhatro.doanchuyennganh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import quanlynhatro.doanchuyennganh.entity.LoaiPhong;
import quanlynhatro.doanchuyennganh.service.LoaiPhongService;
import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/LoaiPhong")
public class LoaiPhongController implements IController<LoaiPhong>{
    @Autowired
    private LoaiPhongService phongService;

    @Override
    @GetMapping("/")
    public List<LoaiPhong> getAllPhong() {
        List<LoaiPhong> loaiPhongs = phongService.getAllPhong();
        return loaiPhongs;
    }

    @Override
    public LoaiPhong insert() {
        return null;
    }

    @Override
    public void delete() {

    }

    @Override
    public LoaiPhong getById() {
        return null;
    }

    @Override
    public LoaiPhong update() {
        return null;
    }


}
