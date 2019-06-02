package controller;

import models.User;
import org.springframework.web.client.RestTemplate;

public class UserController {
    private RestTemplate restTemplate;
    private final String API_BASE= "https://api.github.com";

    public UserController(){
        restTemplate = new RestTemplate();
    }

    public User getUserByUserName(String userName){
        try{
            return restTemplate.getForObject(API_BASE + "/users/" + userName, User.class);
        }catch (Exception ex){
            throw  new RuntimeException();
        }
    }

    public User[] getFollowersByUser(String userName){
        try {
            return restTemplate.getForObject(API_BASE + "/users/" + userName + "/followers",User[].class);
        }catch (Exception ex){
            throw new RuntimeException();
        }
    }
}
