package com.telran;

import com.telran.view.ConsoleInputOutput;
import com.telran.view.InputOutput;
import com.telran.view.Item;
import com.telran.view.Menu;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TestInputOutput {
    public static void main(String[] args){
        InputOutput cio = new ConsoleInputOutput();
        List<String> users = new ArrayList<>();
        //=================================
        Item addUser = Item.of("Add user",inputOutput->{
            String name = inputOutput.readString("Type name");
            int age = inputOutput.readInt("Type age");
            users.add(name + ";" + age);
        });

        Item removeUser = Item.of("Remove user",inputOutput->{
           int i = 1;
           for(String user:users){
               inputOutput.writeLn((i++) + "," + user);
           }
           int id = inputOutput.readInt("Type number",1,users.size());
           users.remove(id-1);
        });


        Item displayUsers = Item.of("Display users",io->{
            for (String user:users){
                io.writeLn(user);
            }
        });
        Item exit = Item.exit();

        Menu editMenu = new Menu("Edit users",addUser,removeUser,exit);
        Menu main = new Menu("Main",editMenu,displayUsers,exit);
        main.perform(cio);

    }
}
