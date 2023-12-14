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
public class HopDongThuePhong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maHopDong;

    @ManyToOne
    @JoinColumn(name = "maPhongF")
    private Phong phong;

    @ManyToOne
    @JoinColumn(name = "userNameF")
    private TaiKhoan taiKhoan;

    private Date ngayLap;
    private String noiDung;
    private String tinhTrang;
    private String cCCD;
    private String ten;
    private String sdt;
    private String diaChiThuongTru;

    @OneToMany(mappedBy = "hopDongThuePhong")
    List<HoaDonHangThang> hoaDonHangThangs;
}
