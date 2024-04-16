package quanlynhatro.doanchuyennganh.service;

import quanlynhatro.doanchuyennganh.dto.request.LoginRequestDTO;

public interface AuthService {
    String login(LoginRequestDTO loginDto);
}