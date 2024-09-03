package Question2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TruckTest {
    
    public TruckTest() {
    }

    @Test
    public void testCalcPrice() {
        System.out.println("calcPrice");
        double price = 1;
        int iClass = 1;
        Truck instance = null;
        double expResult = 1;
        double result = instance.calcPrice(iClass, price);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testModelCalc() {
        System.out.println("modelCalc");
        String model = "X7";
        double price = 1;
        Truck instance = null;
        double expResult = 1.8;
        double result = instance.modelCalc(model, price);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testUsedCalc() {
        System.out.println("usedCalc");
        String used = "Yes";
        double price = 1;
        Truck instance = null;
        double expResult = 0.85;
        double result = instance.usedCalc(used, price);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testColorCalc() {
        System.out.println("colorCalc");
        int color = 0;
        double price = 0;
        Truck instance = null;
        double expResult = 0.0;
        double result = instance.colorCalc(color, price);
        assertEquals(expResult, result, 0);
    }

    
}
