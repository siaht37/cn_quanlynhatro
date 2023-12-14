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
public class Phong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maPhong;

    @ManyToOne
    @JoinColumn(name = "maLoaiPhongF")
    private LoaiPhong loaiPhong;

    private int tang;
    private String tinhTrang;

    private boolean conTrong;

    @OneToMany(mappedBy = "phong")
    List<HopDongThuePhong> hopDongThuePhongs;
}
