package quanlynhatro.doanchuyennganh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import quanlynhatro.doanchuyennganh.dto.ChiTietPhieuThueTienIchInsertDTO;
import quanlynhatro.doanchuyennganh.entity.ChiTietPhieuThueTienIch;
import quanlynhatro.doanchuyennganh.entity.PhieuThueTienIch;
import quanlynhatro.doanchuyennganh.entity.TienIch;
import quanlynhatro.doanchuyennganh.service.PhieuThueTienIchService;

import java.util.List;
@RestController
@RequestMapping("/PhieuThueTienIch")
public class PhieuThueTienIchController implements  IController<PhieuThueTienIch>{
    @Autowired
    PhieuThueTienIchService phieuThueTienIchService;
    @Override
    @GetMapping("/")
    public List<PhieuThueTienIch> getAll() {
        return phieuThueTienIchService.getAll();
    }

    @Override
    public PhieuThueTienIch insert(PhieuThueTienIch phieuThueTienIch) {
        return null;
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ChiTietPhieuThueTienIch insert(@RequestBody ChiTietPhieuThueTienIchInsertDTO chiTietPhieuThueTienIchInsertDTO){
        return phieuThueTienIchService.insert(chiTietPhieuThueTienIchInsertDTO.username,chiTietPhieuThueTienIchInsertDTO.tienIches);
    }

    @Override
    public PhieuThueTienIch update(PhieuThueTienIch phieuThueTienIch) {
        return null;
    }
}
