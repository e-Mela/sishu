package org.emela.sushi.controller;

import org.junit.Assert;
import org.junit.Before;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = ItemController.class)
public class ItemControllerTest {

    @Before
    public void setUp(){
        System.out.println("test before");
    }
    @Test
    public void test123(){
        Assert.assertTrue(true);
    }

}