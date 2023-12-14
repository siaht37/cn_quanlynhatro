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
public class TaiKhoan {
    @Id
    private String userName;

    @ManyToOne
    @JoinColumn(name = "maRoleF")
    private Role role;

    private String email;
    private String password;

    @OneToMany(mappedBy = "taiKhoan")
    List<HopDongThuePhong> hopDongThuePhongs;

    @OneToMany(mappedBy = "taiKhoan")
    List<HoaDonHangThang> hoaDonHangThangs;
}
