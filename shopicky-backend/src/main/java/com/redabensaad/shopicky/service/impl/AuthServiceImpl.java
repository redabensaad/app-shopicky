package com.redabensaad.shopicky.service.impl;

import com.redabensaad.shopicky.dto.AuthRequestDTO;
import com.redabensaad.shopicky.dto.AuthResponseDTO;
import com.redabensaad.shopicky.dto.UserDTO;
import com.redabensaad.shopicky.exception.AuthenticationException;
import com.redabensaad.shopicky.mapper.UserMapper;
import com.redabensaad.shopicky.model.Role;
import com.redabensaad.shopicky.model.User;
import com.redabensaad.shopicky.repository.UserRepository;
import com.redabensaad.shopicky.security.JwtUtil;
import com.redabensaad.shopicky.service.AuthService;
import com.redabensaad.shopicky.service.TokenBlacklistService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;
    private final AuthenticationManager authenticationManager;
    private final UserMapper userMapper;
    private final TokenBlacklistService tokenBlacklistService;

    @Override
    public AuthResponseDTO login(AuthRequestDTO request) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getLogin(), request.getPassword())
            );
            
            User user = userRepository.findByLogin(request.getLogin())
                    .orElseThrow(() -> new AuthenticationException("User not found"));
            
            String token = jwtUtil.generateToken(user);
            return AuthResponseDTO.builder()
                    .token(token)
                    .build();
        } catch (Exception e) {
            throw new AuthenticationException("Invalid username or password");
        }
    }

    @Override
    public UserDTO register(AuthRequestDTO request) {
        if (userRepository.existsByLogin(request.getLogin())) {
            throw new AuthenticationException("Username already exists");
        }

        User user = new User();
        user.setLogin(request.getLogin());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setActive(true);
        
        Set<Role> roles = new HashSet<>();
        Role userRole = new Role();
        userRole.setName("USER");
        roles.add(userRole);
        user.setRoles(roles);

        User savedUser = userRepository.save(user);
        return userMapper.toDTO(savedUser);
    }

    @Override
    public boolean validateToken(String token) {
        try {
            return !jwtUtil.isTokenExpired(token) && !tokenBlacklistService.isBlacklisted(token);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void refreshToken(String token) {
        // Implement token refresh logic if needed
        throw new UnsupportedOperationException("Token refresh not implemented");
    }
} 