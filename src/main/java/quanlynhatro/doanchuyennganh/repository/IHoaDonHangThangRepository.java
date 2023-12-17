package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.HoaDonHangThang;
import quanlynhatro.doanchuyennganh.entity.TaiKhoan;

import java.util.List;

@Repository
public interface IHoaDonHangThangRepository extends JpaRepository<HoaDonHangThang, Integer> {
//    HoaDonHangThang findByHopDongThuePhong(HopDongThuePhong hopDongThuePhong);


    List<HoaDonHangThang> findByTaiKhoan(TaiKhoan taiKhoan);

}
