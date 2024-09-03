/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Question2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mfair
 */
public class CarTest {
    
    public CarTest() {
    }

    @Test
    public void testCalcPrice() {
        System.out.println("calcPrice");
        double price = 1;
        int iClass = 2;
        Car instance = null;
        double expResult = 3;
        double result = instance.calcPrice(iClass, price);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testModelCalc() {
        System.out.println("modelCalc");
        String model = "340";
        double price = 1;
        Car instance = null;
        double expResult = 1.3;
        double result = instance.modelCalc(model, price);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testUsedCalc() {
        System.out.println("usedCalc");
        String used = "Yes";
        double price = 1;
        Car instance = null;
        double expResult = 0.5;
        double result = instance.usedCalc(used, price);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testColorCalc() {
        System.out.println("colorCalc");
        int color = 0;
        double price = 0;
        Car instance = null;
        double expResult = 0.0;
        double result = instance.colorCalc(color, price);
        assertEquals(expResult, result, 0);
    }
    
}
