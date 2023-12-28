package com.xparadize.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
