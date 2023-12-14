package quanlynhatro.doanchuyennganh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietPhieuThueTienIch {
    @Id
    @ManyToOne
    @JoinColumn(name = "maPhieuThueF")
    private PhieuThueTienIch phieuThueTienIch;

    @Id
    @ManyToOne
    @JoinColumn(name = "maTienIchF")
    private TienIch tienIch;

    private String tinhTrang;

    @OneToMany(mappedBy = "chiTietPhieuThueTienIch")
    List<ChiTietHoaDonHangThang> chiTietHoaDonHangThangs;

    @OneToMany(mappedBy = "chiTietPhieuThueTienIch")
    List<ChiTietHoaDonDenBu> chiTietHoaDonDenBus;
}
