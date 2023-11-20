package br.com.jojo.bancosimples.dtos;

import br.com.jojo.bancosimples.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO (String firstName,
                       String lastName,
                       String document,
                       BigDecimal balance,
                       String email,
                       String password,
                       UserType userType) {
}
