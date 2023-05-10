package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
    @NotBlank
    @Size(min = 5, max = 15)
    private String username;
    @Email
    private String email;
    @NotBlank
    @Size(min = 6)
    private String password1;
    @NotBlank
    private String password2;

    public User(String username, String email, String password1, String password2) {
        this.username = username;
        this.email = email;
        this.password1 = password1;
        this.password2 = password2;
    }

    public User() {
        this.username = username;
        this.email = email;
        this.password1 = password1;
        this.password2 = password2;
    }

    //GETTERS AND SETTERS

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }
}
