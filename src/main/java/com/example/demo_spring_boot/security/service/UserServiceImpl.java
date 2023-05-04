package com.example.demo_spring_boot.security.service;

import com.example.demo_spring_boot.entities.User;
import com.example.demo_spring_boot.security.UserPrinciple;
import com.example.demo_spring_boot.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public User save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public void remove(Integer id) {
        userRepository.deleteById(id);

    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }


    //tìm kiếm và trả về thông tin của một người dùng dựa trên tên đăng nhập của họ
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userOptional= userRepository.findByUsername(username);
        if (!userOptional.isPresent()){
            throw  new UsernameNotFoundException(username);
        }
        return UserPrinciple.build(userOptional.get());
    }
}
