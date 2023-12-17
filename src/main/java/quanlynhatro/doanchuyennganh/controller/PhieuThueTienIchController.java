package quanlynhatro.doanchuyennganh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quanlynhatro.doanchuyennganh.dto.request.PhieuThueTienIchRequestDTO;
import quanlynhatro.doanchuyennganh.entity.ChiTietPhieuThueTienIch;
import quanlynhatro.doanchuyennganh.entity.PhieuThueTienIch;
import quanlynhatro.doanchuyennganh.service.PhieuThueTienIchService;

import java.util.List;

@RestController
@RequestMapping("/PhieuThueTienIch")
@CrossOrigin(origins = "http://localhost:3000")
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
    public List<ChiTietPhieuThueTienIch> insert(@RequestBody PhieuThueTienIchRequestDTO chiTietPhieuThueTienIchInsertDTO) {
        return phieuThueTienIchService.insert(chiTietPhieuThueTienIchInsertDTO.getUsername(), chiTietPhieuThueTienIchInsertDTO.getMaTienIches());
    }

    // JWT
    @Override
    public PhieuThueTienIch update(PhieuThueTienIch phieuThueTienIch) {
        return null;
    }

    @PutMapping("/")
    public List<ChiTietPhieuThueTienIch> update(@RequestBody PhieuThueTienIchRequestDTO phieuThueTienIchRequestDTO) {
        return phieuThueTienIchService.update(phieuThueTienIchRequestDTO.getMaPhieuThue(), phieuThueTienIchRequestDTO.getMaTienIches());
    }

    @GetMapping("/getAllTienIchDaThueByUsername/{username}")
    public List<ChiTietPhieuThueTienIch> getAllTienIchDaThueByTaiKhoan(@PathVariable("username") String username) {

        return phieuThueTienIchService.getAllTienIchDaThueByTaiKhoan(username);
    }
}
