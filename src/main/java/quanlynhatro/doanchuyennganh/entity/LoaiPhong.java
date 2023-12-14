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
public class LoaiPhong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maLoaiPhong;

    private String tenLoaiPhong;

    private int dienTich;

    private double gia;
    private int soLuong;

    private String hinh;

    @OneToMany(mappedBy = "loaiPhong")
    private List<Phong> phongs;
}
