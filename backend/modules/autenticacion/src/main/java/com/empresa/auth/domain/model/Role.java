package com.empresa.auth.domain.model;

import java.util.Set;

public class Role {
    private Integer id;
    private String name;
    private Set<Permission> permissions;

    public Role() {}

    public Role(Integer id, String name, Set<Permission> permissions) {
        this.id = id;
        this.name = name;
        this.permissions = permissions;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Set<Permission> getPermissions() { return permissions; }
    public void setPermissions(Set<Permission> permissions) { this.permissions = permissions; }
}
