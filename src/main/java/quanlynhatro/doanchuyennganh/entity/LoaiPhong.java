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
public class LoaiPhong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maLoaiPhong;

    private String tenLoaiPhong;

    private int dienTich;

    private double gia;

    private int soLuong;


    private String hinh;
}
