package com.redabensaad.shopicky.dto;

import lombok.Data;
import java.util.Set;

@Data
public class UserDTO {
    private String id;
    private String login;
    private Set<String> roles;
    private Boolean active;
} 