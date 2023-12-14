package quanlynhatro.doanchuyennganh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhieuThueTienIch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maPhieuThue;

    @ManyToOne
    @JoinColumn(name = "userNameF")
    private TaiKhoan taiKhoan;

    private Date ngayLap;

    @OneToMany(mappedBy = "phieuThueTienIch")
    List<HoaDonDenBu> hoaDonDenBus;

    @OneToMany(mappedBy = "phieuThueTienIch")
    List<ChiTietPhieuThueTienIch> chiTietPhieuThueTienIches;
}
