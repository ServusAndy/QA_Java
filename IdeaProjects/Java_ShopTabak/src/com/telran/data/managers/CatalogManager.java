package com.telran.data.managers;

import com.telran.data.entity.CityEntity;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CatalogManager {
    private Path rootDirectory;
    private Path catFile;
    private Path cityFile;

    public CatalogManager(String rootDirectory, String catFileName,String cityFileName) throws IOException {
        this.rootDirectory = Path.of(rootDirectory);
        if(!Files.exists(this.rootDirectory)){
            Files.createDirectories(this.rootDirectory);
        }else if(Files.isRegularFile(this.rootDirectory)){
            throw new IOException(rootDirectory + "is a File!");
        }

        catFile = Path.of(this.rootDirectory.toString(),catFileName);

        if(Files.exists(catFile)){
            if(Files.isDirectory(catFile)){
                throw new IOException(catFileName+ "is a directory");
            }
        }else{
            Files.createFile(catFile);
        }

        cityFile = Path.of(this.rootDirectory.toString(),cityFileName);

        if(Files.exists(cityFile)){
            if(Files.isDirectory(cityFile)){
                throw new IOException(cityFileName + "is a Directory");
            }
        }else{
            Files.createFile(cityFile);
        }

    }

    public boolean addCity(CityEntity city) throws IOException {
        Objects.requireNonNull(city);

        try(BufferedWriter bw =
                Files.newBufferedWriter(cityFile,StandardOpenOption.APPEND)){
            if(Files.size(cityFile)>0){
                bw.newLine();
            }
            bw.write(city.toString());
        }
        return true;
    }

    private boolean saveAll(Path path,List<CityEntity> list)throws IOException{
        try(BufferedWriter bw = Files.newBufferedWriter(path)){
            for(int i =0; i<list.size();i++){
                bw.write(list.get(i).toString());
                if(i != list.size()-1){
                    bw.newLine();
                }
            }
        }
    return true;
    }

    public  List<CityEntity> getAllCities() throws IOException{
        return Files.lines(cityFile)
                .map(CityEntity::fromString)
                .collect(Collectors.toList());
    }

    public List<CityEntity> getAllCities(String uuidFilter)throws IOException{
        return Files.lines(cityFile)
                .map(CityEntity::fromString)
                .filter(v-> !uuidFilter.equals(v.getUuid()))
                .collect(Collectors.toList());
    }

    public boolean removeCity(String uuid)throws IOException{
        try {
            saveAll(cityFile,getAllCities(uuid));
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean updateCity(String uuid,String cityName)throws IOException{
         List<CityEntity> cities = getAllCities(uuid);
         cities.add(CityEntity.fromString(uuid+","+cityName));
         saveAll(cityFile,cities);
        return true;
    }


}
