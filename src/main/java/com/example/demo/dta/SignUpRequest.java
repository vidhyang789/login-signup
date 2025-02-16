package com.example.demo.dta;

public class SignUpRequest {
    private String email;
    private String password;

    // Default Constructor
    public SignUpRequest() {
    }

    // Parameterized Constructor
    public SignUpRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getter for Email
    public String getEmail() {
        return email;
    }

    // Setter for Email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for Password
    public String getPassword() {
        return password;
    }

    // Setter for Password
    public void setPassword(String password) {
        this.password = password;
    }
}
