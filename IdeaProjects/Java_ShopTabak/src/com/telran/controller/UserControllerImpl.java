package com.telran.controller;
import com.telran.data.entity.*;
import com.telran.data.managers.UserManager;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class UserControllerImpl implements UserController{
    private UserManager manager;

    public UserControllerImpl(UserManager manager){ this.manager = manager; }

    @Override
    public boolean changePassword(String email, String oldPassword, String newPassword) {
        return false;
    }

    @Override
    public boolean changePasswordForUser(String adminEmail, String userEmail, String newPassword) {
        return false;
    }

    @Override
    public List<UserEntity> getAllUser(String adminEmail) {
        if(isAdmin(adminEmail)){
            try{
                return manager.getAllUsers();
            }catch (IOException e){
                e.printStackTrace();
                return Collections.emptyList();
            }
        }
        return Collections.emptyList();
    }

    @Override
    public boolean addUser(String adminEmail, UserEntity user) {
        Objects.requireNonNull(user);
        Objects.requireNonNull(adminEmail);
        if(isAdmin(adminEmail)){
            ProfileEntity empty = new ProfileEntity()
        }
        return false;
    }

    @Override
    public UserEntity removeUser(String adminEmail, String userEmail) {
        return null;
    }

    @Override
    public boolean updateProfile(String email, ProfileEntity profile) {
        return false;
    }

    @Override
    public ProfileEntity removeProfileById(String adminEmail, String profileUuid) {
        return null;
    }

    @Override
    public ProfileEntity getProfileById(String adminEmail, String profileUuid) {
        return null;
    }


    private boolean isAdmin(String email){
        Objects.requireNonNull(email);
        try{

        }

    }
}
