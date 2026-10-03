package com.redabensaad.shopicky.dto;

import lombok.Builder;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@Builder
public class AuthResponseDTO {
    private String token;
    private String type = "Bearer";
    private UserDTO user;
    private List<String> roles;
    private Date expiresAt;
} 