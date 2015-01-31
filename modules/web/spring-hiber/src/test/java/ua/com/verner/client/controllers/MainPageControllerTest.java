package ua.com.verner.client.controllers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainPageControllerTest {

    @Test
    public void testHome() throws Exception {
        MainPageController controller = new MainPageController();
        String viewName = controller.home();
        assertEquals("index", viewName);
    }
}