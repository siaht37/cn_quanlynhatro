package quanlynhatro.doanchuyennganh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Chi_Tiet_Hoa_Don_Hang_Thang")
public class ChiTietHoaDonHangThang {
    @Id
    @ManyToOne
    @JoinColumn(name = "maHoaDonHangThangF")
    private HoaDonHangThang hoaDonHangThang;

    @Id
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "maPhieuThueF", referencedColumnName = "maPhieuThueF"),
            @JoinColumn(name = "maTienIchF", referencedColumnName = "maTienIchF")
    })
    private ChiTietPhieuThueTienIch chiTietPhieuThueTienIch;
}
