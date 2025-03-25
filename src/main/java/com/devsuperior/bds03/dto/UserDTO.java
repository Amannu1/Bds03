package com.devsuperior.bds03.dto;


import com.devsuperior.bds03.entities.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    @NotBlank(message = "Required field.")
    private String name;

    @Email(message = "Insert a valid email.")
    private String email;

    Set<RoleDTO> roles = new HashSet<>();

    public UserDTO(){

    }

    public UserDTO(Long id, String password, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public UserDTO(User entity){
        id = entity.getId();
        email = entity.getEmail();
        name = getName();
        entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstName) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }
}
