//package quanlynhatro.doanchuyennganh.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import quanlynhatro.doanchuyennganh.entity.SoNuoc;
//import quanlynhatro.doanchuyennganh.service.SoNuocService;
//
//import java.util.List;
//@RestController
//@RequestMapping("/SoNuoc")
//public class SoNuocController implements IController<SoNuoc>{
//    @Autowired
//    SoNuocService soNuocService;
//    @Override
//    @GetMapping("/")
//    public List<SoNuoc> getAll() {
//        return soNuocService.getAll();
//    }
//
//    @Override
//    @PostMapping("/")
//    public SoNuoc insert(SoNuoc soNuoc) {
//        return soNuocService.insert(soNuoc);
//    }
//
//    @Override
//    @PutMapping("/")
//    public SoNuoc update(SoNuoc soNuoc) {
//        return soNuocService.update(soNuoc);
//    }
//}