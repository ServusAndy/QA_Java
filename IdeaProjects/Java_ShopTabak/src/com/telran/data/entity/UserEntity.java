package com.telran.data.entity;

import java.util.UUID;
import java.util.Objects;
public class UserEntity {
    private String email;
    private String password;
    private Role role;
    private String profileUuid;

    public UserEntity(String email, String password, Role role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public UserEntity(String email, String password, Role role, String profileUuid) {
        this.email = email;
        this.password = password;
        this.role = role;
        this.profileUuid = profileUuid;
    }

    public String getEmail() {
        return email;
    }



    public String getPassword() {
        return password;
    }



    public Role getRole() {
        return role;
    }



    public String getProfileUuid() {
        return profileUuid;
    }

    @Override
    public String toString() {
        return  email + '\'' +
                "," + password + '\'' +
                "," + role.toString() +
                "," + profileUuid + '\'';
    }

    public static UserEntity of(String email,String password,Role role){
        return new UserEntity(email,password,role);
    }

    public static UserEntity of(String email,String password,Role role,String profileUuid){
        return new UserEntity(email,password,role,profileUuid);
    }

    public static UserEntity fromString(String data){
        Objects.requireNonNull(data);
        String[] arr = data.split(",");
        if(arr.length!=4){
            throw new IllegalArgumentException("Wrong data format!");
        }
        return new UserEntity(arr[0],arr[1],Role.valueOf(arr[2]),arr[3]);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity)) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(getEmail(), that.getEmail()) &&
                Objects.equals(getPassword(), that.getPassword()) &&
                getRole() == that.getRole() &&
                Objects.equals(getProfileUuid(), that.getProfileUuid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
