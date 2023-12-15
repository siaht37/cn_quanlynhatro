package quanlynhatro.doanchuyennganh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quanlynhatro.doanchuyennganh.entity.TaiKhoan;
import quanlynhatro.doanchuyennganh.repository.ITaiKhoanRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TaiKhoanService implements IService<TaiKhoan> {
    @Autowired
    ITaiKhoanRepository taiKhoanRepository;

    @Override
    public List<TaiKhoan> getAll() {
        return taiKhoanRepository.findAll();
    }

    //! nếu null thì thông báo username đã tồn tại
    @Override
    public TaiKhoan insert(TaiKhoan taiKhoan) {
        Optional<TaiKhoan> optional = taiKhoanRepository.findById(taiKhoan.getUserName());
        if(optional.isEmpty())
            return taiKhoanRepository.save(taiKhoan);
        else
            return null;
    }

    @Override
    public TaiKhoan update(TaiKhoan taiKhoan) {

        return taiKhoanRepository.save(taiKhoan);
    }
}
