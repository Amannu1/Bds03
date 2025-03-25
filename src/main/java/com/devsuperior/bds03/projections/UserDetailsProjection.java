package com.devsuperior.bds03.projections;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public interface UserDetailsProjection {

    String getUsername();
    String getPassword();
    Long getRoleId();
    String getAuthority();
}
