package com.service.test4yu.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTest4yu {

        Test4yuDelegate test4yuDelegate = new Test4yuDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = test4yuDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}