//St10442155
package Question2;

import java.util.Scanner;
import java.util.ArrayList;

public class AutoTrader {

    public void display() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vechicle> vh = new ArrayList<>();
        String sCon;
        int num = 1;
        do {
            
            System.out.println("""
                           Is your BMW a:
                           1)   Bike
                           2)   Car
                           3)   Truck""");

            int iType = sc.nextInt();

            System.out.println("What is your BMW's registration?");

            String sReg = sc.next();

            System.out.println("""
                           What color is your BMW?
                           1)   Red
                           2)   Blue
                           3)   White
                           4)   Black
                           """);
            int iColor = sc.nextInt();

            System.out.println("What model is your BMW?");
            String model = sc.next();

            System.out.println("""
                           Is your BMW a:
                           1)   Standard Class
                           2)   Upper Class
                           3)   Luxury Class
                           """);
            int iClass = sc.nextInt();

            switch (iType) {
                case 1 -> {
                    Vechicle bk = new Bike(iType, sReg);
                    vh.add(bk);
                    
                    bk.setColor(iColor);
                    bk.setModel(model);
                    bk.setiClass(iClass);
                    bk.setNum(num);
                    
                    

                }
                case 2 -> {
                    Vechicle cr = new Car(iType, sReg);
                    vh.add(cr);
                    
                    cr.setColor(iColor);
                    cr.setModel(model);
                    cr.setiClass(iClass);
                    cr.setNum(num);
                    
                    
                }
                case 3 -> {
                    
                    Vechicle tk = new Truck(iType, sReg);
                    vh.add(tk);
                    
                    tk.setColor(iColor);
                    tk.setModel(model);
                    tk.setiClass(iClass);
                    tk.setNum(num);
                    
                    
                }

            }
            System.out.println("Do you want to add another vehichle?");
            sCon = sc.next().toUpperCase();

            num++;
        } while (sCon.contains("Y"));
        
        System.out.println(vh.toString());
        
    }

}
