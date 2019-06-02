package com.telran.data.managers;

import com.telran.data.entity.CityEntity;
import com.telran.data.entity.ProfileEntity;
import com.telran.data.entity.UserEntity;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserManager {
    private Path rootDir;
    private Path userFile;
    private Path profileFile;

        public UserManager(String rootDir,String userFile,String profileFile) throws IOException{
        this.rootDir = Path.of(rootDir);
        if(!Files.exists(this.rootDir)){
            Files.createDirectories(this.rootDir);
            }else if(Files.isRegularFile(this.rootDir)){
                throw new IOException(rootDir + "is a File!");
        }

        this.userFile = Path.of(this.rootDir.toString(),userFile);

        if(Files.exists(this.userFile)){
            if(Files.isDirectory(this.userFile)){
                throw new IOException(this.userFile + "is a directory");
            }
        }else{
            Files.createFile(this.userFile);
        }

        this.profileFile = Path.of(this.rootDir.toString(),profileFile);

        if(Files.exists(this.profileFile)){
            if(Files.isDirectory(this.profileFile)){
                throw new IOException(this.profileFile + "is a Directory");
            }
        }else{
            Files.createFile(this.profileFile);
            }

        }

        public boolean addUser(UserEntity user) throws IOException {
        Objects.requireNonNull(user);

        try(BufferedWriter bw =
                    Files.newBufferedWriter(userFile, StandardOpenOption.APPEND)){
            if(Files.size(userFile)>0){
                bw.newLine();
            }
            bw.write(user.toString());
        }
            return true;
        }


        public UserEntity getUserEntityByEmail(String email)throws  IOException{
        Objects.requireNonNull(email);
        try(Stream<String> stream = Files.lines(userFile)){
            return stream.map(UserEntity::fromString)
                    .filter(user->user.getEmail().equals(email))
                    .findFirst().orElse(null);
            }
        }


        public List<UserEntity> getAllUsers()throws  IOException{

        try(Stream<String> stream = Files.lines(userFile)){
            return stream.map(UserEntity::fromString)
                    .collect(Collectors.toList());
            }
        }

        private List<UserEntity> getUserWithoutNext(String email)throws IOException{
            try(Stream<String> stream = Files.lines(userFile)){
                return stream.map(UserEntity::fromString)
                        .filter(user->user.getEmail().equals(email))
                        .collect(Collectors.toList());
            }
        }

        public boolean updateUser(UserEntity userEntity)throws IOException{
            Objects.requireNonNull(userEntity);
            List<UserEntity> list =  getUserWithoutNext(userEntity.getEmail());
            list.add(userEntity);
            saveAll(userFile,list);
            return true;
        }

        public ProfileEntity getProfileById(String uuid)throws IOException{
            Objects.requireNonNull(uuid);
            try(Stream<String> stream = Files.lines(profileFile)){
                return stream.map(ProfileEntity::fromString)
                        .filter(profile->profile.getUuid().equals(uuid))
                        .findFirst().orElse(null);
            }
        }

        public List<ProfileEntity> getProfileWithUotNext(String uuid)throws IOException{
            Objects.requireNonNull(uuid);
            try(Stream<String> stream = Files.lines(profileFile)){
                return stream.map(ProfileEntity::fromString)
                        .filter(profile->profile.getUuid().equals(uuid))
                        .collect(Collectors.toList());
            }
        }

        public boolean removeProfile(String uuid){
            return true;
        }




        public void saveAll(Path path, List<?> list)throws IOException{
            try(BufferedWriter bw = Files.newBufferedWriter(path)){
                for(int i =0;i<list.size();i++){
                    bw.write(list.get(i).toString());
                    if(i!=list.size()){
                        bw.newLine();
                    }
                }
            }
        }


    }


