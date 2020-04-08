package com.javapath.springsecurityjpamysql.service;

import com.javapath.springsecurityjpamysql.models.MyUserDetails;
import com.javapath.springsecurityjpamysql.models.User;
import com.javapath.springsecurityjpamysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(userName);

        user.orElseThrow(()->new UsernameNotFoundException("Not found user : "+userName));

        System.out.println(user.toString());

        return user.map(MyUserDetails::new).get();
    }
}
