import controller.UserController;
import models.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;

public class SimpleTestExmpl {

    private UserController userController;

    @Before
    public void setUp(){
        userController = new UserController();
    }

    @Test
    public void testUserInfoResponse(){
        User remoteUser = userController.getUserByUserName("ServusAndy");
        //User localUser = new User();
        //System.out.println(user);
        assertTrue(remoteUser.getHtml_url().contains("https://github.com/ServusAndy"));
        //assertEquals(remoteUser,localUser);
    }

    @Test
    public void testFollowers(){
        User[] followers = userController.getFollowersByUser("ServusAndy");
        assertTrue(followers.length==1);
    }
}
