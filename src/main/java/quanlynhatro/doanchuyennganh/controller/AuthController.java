package quanlynhatro.doanchuyennganh.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import quanlynhatro.doanchuyennganh.dto.request.LoginDto;
import quanlynhatro.doanchuyennganh.dto.response.JWTAuthResponse;
import quanlynhatro.doanchuyennganh.entity.TaiKhoan;
import quanlynhatro.doanchuyennganh.repository.ITaiKhoanRepository;
import quanlynhatro.doanchuyennganh.security.JwtTokenProvider;
import quanlynhatro.doanchuyennganh.service.AuthService;

import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"})
public class AuthController {

    private AuthService authService;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;
    @Autowired
    private ITaiKhoanRepository taiKhoanRepository;

    // Build Login REST API
    @PostMapping("/login")
    public ResponseEntity<JWTAuthResponse> authenticate(@RequestBody LoginDto loginDto) {
        String token = authService.login(loginDto);
        String username = jwtTokenProvider.getUsername(token);
        Optional<TaiKhoan> taiKhoan = taiKhoanRepository.findByUserName(username);
        int maRole = taiKhoan.get().getRole().getMaRole();


        JWTAuthResponse jwtAuthResponse = new JWTAuthResponse();
        jwtAuthResponse.setAccessToken(token);
        jwtAuthResponse.setMaRole(maRole);

        return ResponseEntity.ok(jwtAuthResponse);
    }
}
