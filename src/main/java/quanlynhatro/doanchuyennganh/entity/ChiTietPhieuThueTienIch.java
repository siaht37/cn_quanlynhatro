package quanlynhatro.doanchuyennganh.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

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
    @JsonBackReference
    Set<ChiTietHoaDonHangThang> chiTietHoaDonHangThangs;

    @OneToMany(mappedBy = "chiTietPhieuThueTienIch")
    @JsonBackReference
    Set<ChiTietHoaDonDenBu> chiTietHoaDonDenBus;
}
