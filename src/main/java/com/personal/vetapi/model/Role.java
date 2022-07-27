package com.personal.vetapi.model;

public enum Role {
    CLIENT("CLIENT"),
    ADMIN("ADMIN"),
    DOCTOR("DOCTOR");

    private final String roleValue;
    Role(String roleValue) {
        this.roleValue = roleValue;
    };
};
