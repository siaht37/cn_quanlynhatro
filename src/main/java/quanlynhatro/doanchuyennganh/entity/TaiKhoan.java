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
public class TaiKhoan {
    @Id
    private String userName;

    @ManyToOne
    @JoinColumn(name = "maRoleF")
    private Role role;

    private String email;
    private String password;

    @OneToMany(mappedBy = "taiKhoan")
    @JsonBackReference
    Set<HopDongThuePhong> hopDongThuePhongs;

    @OneToMany(mappedBy = "taiKhoan")
    @JsonBackReference
    Set<HoaDonHangThang> hoaDonHangThangs;
}
