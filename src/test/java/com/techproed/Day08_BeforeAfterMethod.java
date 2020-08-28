package com.techproed;

import org.junit.*;

public class Day08_BeforeAfterMethod {
    @BeforeClass
    public  static void methoddanOnce(){
        System.out.println("Methoddan once calisti...");
    }

    @AfterClass
    public  static void methoddanSonra(){
        System.out.println("Methoddan sonra calisti...");
    }

    @Before
    public  void setUp(){
        System.out.println("Setup calisti...");
    }
    @Test
    public void test1(){
        System.out.println("Test 1 calisti...");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 calisti...");
    }

    @After
    public  void teatDown(){
        System.out.println("TearDown calisti...");
    }


}
