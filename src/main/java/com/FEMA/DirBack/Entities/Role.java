/*package com.FEMA.DirBack.Entities;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

import javax.annotation.processing.Generated;
@Entity
@Table(name="role")
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column
    private Integer roleId;

    @Column
    private String authority;

    public Role(){
        super();
    }
    public Role(Integer roleId,String authority){
        this.roleId=roleId;
        this.authority = authority;
    }


    @Override
    public String getAuthority() {
        return this.authority;
    }
    public void setAuthority(String authority){
        this.authority=authority;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
*/