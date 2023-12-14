package quanlynhatro.doanchuyennganh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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
