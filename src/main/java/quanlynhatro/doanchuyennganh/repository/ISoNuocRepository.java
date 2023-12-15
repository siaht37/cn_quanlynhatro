package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.SoNuoc;
@Repository
public interface ISoNuocRepository extends JpaRepository<SoNuoc, Integer> {
}
