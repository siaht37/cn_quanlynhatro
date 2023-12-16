package quanlynhatro.doanchuyennganh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quanlynhatro.doanchuyennganh.dto.PhieuThueTienIchInsertDTO;
import quanlynhatro.doanchuyennganh.entity.ChiTietPhieuThueTienIch;
import quanlynhatro.doanchuyennganh.entity.PhieuThueTienIch;
import quanlynhatro.doanchuyennganh.service.PhieuThueTienIchService;

import java.util.List;

@RestController
@RequestMapping("/PhieuThueTienIch")
public class PhieuThueTienIchController implements IController<PhieuThueTienIch> {
    @Autowired
    private PhieuThueTienIchService phieuThueTienIchService;

    @Override
    @GetMapping("/")
    public List<PhieuThueTienIch> getAll() {
        return phieuThueTienIchService.getAll();
    }

    @Override
    public PhieuThueTienIch insert(PhieuThueTienIch phieuThueTienIch) {
        return null;
    }

    @PostMapping(value = "/")
    public List<ChiTietPhieuThueTienIch> insert(@RequestBody PhieuThueTienIchInsertDTO chiTietPhieuThueTienIchInsertDTO) {
        return phieuThueTienIchService.insert(chiTietPhieuThueTienIchInsertDTO.username, chiTietPhieuThueTienIchInsertDTO.tienIches);
    }

    // JWT
    @Override
    public PhieuThueTienIch update(PhieuThueTienIch phieuThueTienIch) {
        return null;
    }

    @PutMapping("/")
    public List<ChiTietPhieuThueTienIch> update(Integer maPhieuThue, List<Integer> maTienIches) {
        return phieuThueTienIchService.update(maPhieuThue, maTienIches);
    }
}
