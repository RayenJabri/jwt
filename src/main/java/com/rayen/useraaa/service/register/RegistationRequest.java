package com.rayen.useraaa.service.register;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistationRequest {
    private String username;
    private String password;

    private String email;
}
