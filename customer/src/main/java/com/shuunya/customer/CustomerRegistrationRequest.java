package com.shuunya.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
