package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.HopDongThuePhong;
@Repository
public interface IHopDongThuePhongRepository extends JpaRepository<HopDongThuePhong, Integer> {
}
