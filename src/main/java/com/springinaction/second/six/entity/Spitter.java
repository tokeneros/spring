package com.springinaction.second.six.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @Auther: eros
 * @Date: 2019/2/15 19:03
 * @Description:
 */
public class Spitter {

    private Long id;

    @NotNull
    @Size(min=2, max=30, message="{firstName.size}")
    private String firstName;

    @NotNull
    @Size(min=2, max=30, message="{lastName.size}")
    private String lastName;

//    @NotNull
//    @Size(min=2, max=30)
    private String email;

    @NotNull
    @Size(min=5, max=16, message="{username.size}")
    private String username;

    @NotNull
    @Size(min=5, max=25, message="{password.size}")
    private String password;

    public Spitter() {
        this.firstName = "J";
        this.lastName = "B";
        this.username = "jack";
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
