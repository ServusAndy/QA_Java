package com;

import com.telran.controller.UserController;
import com.telran.controller.UserControllerImpl;
import com.telran.data.entity.CityEntity;
import com.telran.data.managers.CatalogManager;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
      //  UserController uc = new UserControllerImpl();


        CatalogManager manager = new CatalogManager("db","cat.csv","cities.csv");
        manager.addCity(CityEntity.of("Ashdot"));
        manager.addCity(CityEntity.of("Haifa"));
    }

}
