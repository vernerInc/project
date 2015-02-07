package ua.com.verner.client.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
public class MainPageControllerTest {

    @Test
    public void testHome() throws Exception {
        MainPageController controller = new MainPageController();
        String viewName = controller.home();
        assertEquals("index", viewName);
    }
}