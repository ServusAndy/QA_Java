package com.telran.controller;
import com.telran.data.entity.*;
import java.util.List;

public interface UserController {
    boolean changePassword(String email,String oldPassword,String newPassword);
    boolean changePasswordForUser(String adminEmail,String userEmail,String newPassword);
    List<UserEntity> getAllUser(String adminEmail);
    boolean addUser(String adminEmail,UserEntity user);
    UserEntity removeUser(String adminEmail,String userEmail);
    boolean updateProfile(String email, ProfileEntity profile);
    ProfileEntity removeProfileById(String adminEmail, String profileUuid);
    ProfileEntity getProfileById(String adminEmail,String profileUuid);
}
