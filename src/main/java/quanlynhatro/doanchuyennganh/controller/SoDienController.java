//package quanlynhatro.doanchuyennganh.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import quanlynhatro.doanchuyennganh.entity.SoDien;
//import quanlynhatro.doanchuyennganh.service.SoDienService;
//
//import java.util.List;
//@RestController
//@RequestMapping("/SoDien")
//public class SoDienController implements IController<SoDien>{
//    @Autowired
//    SoDienService soDienService;
//    @Override
//    @GetMapping("/")
//    public List<SoDien> getAll() {
//        return soDienService.getAll();
//    }
//
//    @Override
//    @PostMapping("/")
//    public SoDien insert(SoDien soDien) {
//        return soDienService.insert(soDien);
//    }
//
//    @Override
//    @PutMapping("/")
//    public SoDien update(SoDien soDien) {
//        return soDienService.update(soDien);
//    }
//}
