package quanlynhatro.doanchuyennganh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HoaDonDenBu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maHoaDonDenBu;

    @ManyToOne
    @JoinColumn(name = "maPhieuThueF")
    private PhieuThueTienIch phieuThueTienIch;

    @ManyToOne
    @JoinColumn(name = "userNameF")
    private TaiKhoan taiKhoan;

    private Date ngayLap;

    private boolean trangThaiThanhToan;

}
