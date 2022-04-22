package ru.study.tacocloud;

import org.junit.jupiter.api.Test;
import ru.study.tacocloud.controllers.HomeController;
import static org.junit.jupiter.api.Assertions.*;

public class HomeControllerTest {

    @Test
    public void testHomePage() {
       HomeController hm = new HomeController();
       String result = hm.home();
       assertEquals(result, "Home");
    }
}
