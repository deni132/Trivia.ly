package com.responses.User;

import com.google.gson.annotations.SerializedName;

public class RegisterRequest {

    @SerializedName("Username")
    private String username;
    @SerializedName("Password")
    private String password;
    @SerializedName("FirstName")
    private String firstname;
    @SerializedName("LastName")
    private String lastname;
    @SerializedName("Email")
    private String email;

    public RegisterRequest(String username, String password, String firstname, String lastname, String email) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
