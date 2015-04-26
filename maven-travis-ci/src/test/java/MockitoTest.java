/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java;

import main.java.com.mycompany.maven_travis_ci.MainClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author toka
 */
@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {
    
    public MockitoTest() {
    }

     @Test
     public void mockitoTest() {
         MainClass mockClass = Mockito.mock(MainClass.class);
         
         Mockito.when(mockClass.mockingMethod()).thenReturn(5);
         
         assertEquals(mockClass.mockingMethod(), 5);
     }
}
