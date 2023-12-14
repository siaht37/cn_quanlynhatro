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
public class SoDien {

    @Id
    private Date ngayNhap;
    public double so;
    public double donGia;

    @Id
    @ManyToOne
    @JoinColumn(name = "maPhongFPK")
    private Phong phong;
}
