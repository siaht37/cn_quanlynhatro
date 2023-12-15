package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.SoDien;
@Repository
public interface ISoDienRepository extends JpaRepository<SoDien, Integer> {
}
