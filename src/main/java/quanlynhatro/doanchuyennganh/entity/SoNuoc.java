package quanlynhatro.doanchuyennganh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import quanlynhatro.doanchuyennganh.entity.compositekey.SoDienId;
import quanlynhatro.doanchuyennganh.entity.compositekey.SoNuocId;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(SoNuocId.class)
public class SoNuoc {
    @Id
    private Date ngayNhap;
    public double so;
    public double donGia;

    @Id
    @ManyToOne
    @JoinColumn(name = "maPhongFPK")
    private Phong phong;
}
