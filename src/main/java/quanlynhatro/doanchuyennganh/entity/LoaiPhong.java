package quanlynhatro.doanchuyennganh.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    @JsonBackReference
    private Set<Phong> phongs;
}
