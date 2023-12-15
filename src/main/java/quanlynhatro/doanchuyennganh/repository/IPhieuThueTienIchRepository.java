package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.PhieuThueTienIch;
@Repository
public interface IPhieuThueTienIchRepository extends JpaRepository<PhieuThueTienIch, Integer> {
}
