package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.ChiTietPhieuThueTienIch;
import quanlynhatro.doanchuyennganh.entity.compositekey.ChiTietPhieuThueTienIchId;

@Repository
public interface IChiTietPhieuThueTienIchRepository extends JpaRepository<ChiTietPhieuThueTienIch, ChiTietPhieuThueTienIchId> {
}
