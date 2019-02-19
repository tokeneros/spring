package com.springinaction.second.five_one_two.entity;

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
    @Size(min=5)
    private String FirstName;

    private String LashName;

    private String username;

    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLashName() {
        return LashName;
    }

    public void setLashName(String lashName) {
        LashName = lashName;
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
