package quanlynhatro.doanchuyennganh.service;

import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface ILoaiService<S> {
    public List<S> getAllPhong();

    public S insert();
    public void delete();
    public S getById();
    public S update();

}
