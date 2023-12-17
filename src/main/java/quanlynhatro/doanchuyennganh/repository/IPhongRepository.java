package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.Phong;

import java.util.List;

@Repository
public interface IPhongRepository extends JpaRepository<Phong, Integer> {
    @Query("SELECT COUNT(p) FROM Phong p WHERE p.conTrong = true")
    int countPhongByConTrongIsTrue();

    @Query("SELECT p from Phong p where p.conTrong = false ")
    List<Phong> findByConTrongIsFalse();
}
