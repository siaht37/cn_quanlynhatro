package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.TaiKhoan;
@Repository
public interface ITaiKhoanRepository extends JpaRepository<TaiKhoan, String> {
}
