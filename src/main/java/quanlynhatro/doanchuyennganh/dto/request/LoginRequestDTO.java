package quanlynhatro.doanchuyennganh.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequestDTO {
    private String usernameOrEmail;
    private String password;
}