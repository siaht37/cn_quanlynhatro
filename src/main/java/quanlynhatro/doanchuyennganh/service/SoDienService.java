package quanlynhatro.doanchuyennganh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quanlynhatro.doanchuyennganh.entity.SoDien;
import quanlynhatro.doanchuyennganh.repository.ISoDienRepository;

import java.util.List;
@Service
public class SoDienService implements IService<SoDien> {
    @Autowired
    ISoDienRepository soDienRepository;
    @Override
    public List<SoDien> getAll() {
        return soDienRepository.findAll();
    }

    @Override
    public SoDien insert(SoDien soDien) {
        return soDienRepository.save(soDien);
    }

    @Override
    public SoDien update(SoDien soDien) {
        return soDienRepository.save(soDien);
    }
}
