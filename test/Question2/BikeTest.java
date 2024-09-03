package Question2;

import org.junit.Test;
import static org.junit.Assert.*;

public class BikeTest {
    
    public BikeTest() {
    }

    @Test
    public void testCalcPrice() {
        System.out.println("calcPrice");
        double price = 1;
        int iClass = 3;
        Bike instance = null;
        double expResult = 3;
        double result = instance.calcPrice(iClass, price);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testModelCalc() {
        System.out.println("modelCalc");
        String model = "GS";
        double price = 1;
        Bike instance = null;
        double expResult = 4;
        double result = instance.modelCalc(model, price);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testUsedCalc() {
        System.out.println("usedCalc");
        String used = "N";
        double price = 1;
        Bike instance = null;
        double expResult = 1;
        double result = instance.usedCalc(used, price);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testColorCalc() {
        System.out.println("colorCalc");
        int color = 0;
        double price = 0;
        Bike instance = null;
        double expResult = 0.0;
        double result = instance.colorCalc(color, price);
        assertEquals(expResult, result, 0);
    }

    
}
