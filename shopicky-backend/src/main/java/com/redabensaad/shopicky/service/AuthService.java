package com.redabensaad.shopicky.service;

import com.redabensaad.shopicky.dto.AuthRequestDTO;
import com.redabensaad.shopicky.dto.AuthResponseDTO;
import com.redabensaad.shopicky.dto.UserDTO;

public interface AuthService {
    AuthResponseDTO login(AuthRequestDTO request);
    UserDTO register(AuthRequestDTO request);
    boolean validateToken(String token);
    void refreshToken(String token);
} 