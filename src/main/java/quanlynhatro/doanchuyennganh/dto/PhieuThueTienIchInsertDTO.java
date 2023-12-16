package quanlynhatro.doanchuyennganh.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Getter
@Setter
public class PhieuThueTienIchInsertDTO {
    public String username;
    public List<Integer> tienIches;
}
