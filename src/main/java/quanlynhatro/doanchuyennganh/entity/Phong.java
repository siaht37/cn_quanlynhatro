package quanlynhatro.doanchuyennganh.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Phong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maPhong;

    @ManyToOne
    @JoinColumn(name = "maLoaiPhongF", referencedColumnName = "maLoaiPhong")
    private LoaiPhong loaiPhong;


    private int tang;

    private String tinhTrang;

    private boolean conTrong;

    @OneToMany(mappedBy = "phong")
    Set<HopDongThuePhong> hopDongThuePhongs = new HashSet<>();
}
