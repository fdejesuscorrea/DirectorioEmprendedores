/*package com.FEMA.DirBack.Services;

import com.FEMA.DirBack.Entities.ApplicationUser;
import com.FEMA.DirBack.Entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private PasswordEncoder encoder;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("inside tin");
        if(!username.equals("lineth")) throw new UsernameNotFoundException("not lineth");
        Set<Role> roles = new HashSet<>();
        roles.add(new Role(1,"admin"));
        return new ApplicationUser(1,"user",encoder.encode("password"),roles);

    }
}
*/