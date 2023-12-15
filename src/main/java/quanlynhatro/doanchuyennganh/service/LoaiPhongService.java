package quanlynhatro.doanchuyennganh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quanlynhatro.doanchuyennganh.entity.LoaiPhong;
import quanlynhatro.doanchuyennganh.repository.ILoaiPhongRepository;

import java.util.List;
@Service
public class LoaiPhongService implements ILoaiService<LoaiPhong> {
    @Autowired
    private ILoaiPhongRepository phongRepository;

    @Override
    public List<LoaiPhong> getAllPhong() {

        List<LoaiPhong> phongs = phongRepository.findAll();
        return phongs;
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
