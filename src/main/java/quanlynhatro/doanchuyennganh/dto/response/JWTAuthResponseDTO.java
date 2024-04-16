package quanlynhatro.doanchuyennganh.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class JWTAuthResponseDTO {
    private String accessToken;
    private String tokenType = "Bearer";
    private int maRole;
    private String username;
}
