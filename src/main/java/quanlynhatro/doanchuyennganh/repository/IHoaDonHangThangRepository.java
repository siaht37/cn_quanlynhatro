package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.HoaDonHangThang;

@Repository
public interface IHoaDonHangThangRepository extends JpaRepository<HoaDonHangThang, Integer> {
}
