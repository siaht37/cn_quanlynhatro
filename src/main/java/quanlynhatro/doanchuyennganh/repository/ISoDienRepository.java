package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.SoDien;
import quanlynhatro.doanchuyennganh.entity.SoNuoc;
import quanlynhatro.doanchuyennganh.entity.compositekey.SoDienId;

import java.util.Date;

@Repository
public interface ISoDienRepository  extends JpaRepository<SoDien, SoDienId> {
}
