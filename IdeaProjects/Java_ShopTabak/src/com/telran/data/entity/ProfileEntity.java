package com.telran.data.entity;

import java.awt.color.ProfileDataException;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

public class ProfileEntity {
    private UUID uuid;
    private String name;
    private String lastName;
    private String phone;

    public ProfileEntity(String name, String lastName, String phone) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
    }

    public ProfileEntity(String uuid,String name, String lastName, String phone) {
        this.uuid = UUID.fromString(uuid);
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getUuid() {
        return uuid.toString();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String toString(){
        return uuid.toString() + "," + name + "," + lastName +"," + phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProfileEntity)) return false;
        ProfileEntity that = (ProfileEntity) o;
        return getUuid().equals(that.getUuid()) &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getLastName(), that.getLastName()) &&
                Objects.equals(getPhone(), that.getPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }

    public static ProfileEntity fromString(String data){
        Objects.requireNonNull(data);
        String[] arr = data.split(",");
        if(arr.length!=4){
            throw new ProfileDataException("Wrong data exception!");
        }
        return new ProfileEntity(arr[0],arr[1],arr[2],arr[3]);
    }


    public static class Builder{
        private String name;
        private String lastName;
        private String phone;

        private Builder(){
            name = "NoName";
            lastName = "NoLastName";
            phone = "NoPhone";
        }


    }
}
