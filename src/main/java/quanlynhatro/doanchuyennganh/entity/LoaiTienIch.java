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
public class LoaiTienIch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maLoaiTienIch;

    private String tenLoaiTienIch;

    @OneToMany(mappedBy = "loaiTienIch")
    List<TienIch> tienIches;
}
