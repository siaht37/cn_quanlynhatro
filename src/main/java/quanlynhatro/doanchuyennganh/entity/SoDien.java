package quanlynhatro.doanchuyennganh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import quanlynhatro.doanchuyennganh.entity.compositekey.SoDienId;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(SoDienId.class)
public class SoDien {

    @Id
    private Date ngayNhap;
    public double so;
    public double donGia;

    @Id
    @ManyToOne
    @JoinColumn(name = "maPhongFPK",referencedColumnName = "maPhong")
    private Phong phong;
}
