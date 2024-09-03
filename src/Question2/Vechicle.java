//St10442155
package Question2;
import java.util.Scanner;

public abstract class Vechicle {
    protected int type;
    protected String reg;
    protected int color;
    protected String model;
    protected int iClass;
    protected double price;
    protected int num;
    protected String sType, sColor, sClass;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
    Scanner sc = new Scanner(System.in);
    
    public abstract double modelCalc(String model, double price);
    public abstract double calcPrice(int iClass, double price);
    public abstract double usedCalc(String used, double price);
    public abstract double colorCalc(int color, double price);
    public abstract double setPrice();


    public Vechicle(int type, String reg) {
        
        this.reg = reg;
        this.type = type;
        switch (type){
            case 1 -> sType = "Bike";
            case 2 -> sType = "Car";
            case 3 -> sType = "Truck";
        }
        
        
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
        switch(color){
            case 1 -> sColor = "Red";
            case 2 -> sColor = "Blue";
            case 3 -> sColor = "White";
            case 4 -> sColor = "Black";
        }
        this.price = setPrice();
        
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
        setPrice();
        
        modelCalc(model, this.price);
        
        calcPrice(iClass, price);
        
        System.out.println("IS the car used?");
        usedCalc(sc.next().toUpperCase(), this.price);
        
        this.price = colorCalc(color, price);
    }

    public int getiClass() {
        return iClass;
    }

    public void setiClass(int iClass) {
        this.iClass = iClass;
        
        switch(iClass){
            case 1 -> sClass = "Standard Class";
            case 2 -> sClass = "Upper Class";
            case 3 -> sClass = "Luxury Class";
        }
        
    }
    
   
    @Override
    public String toString(){
       
        return String.format("""
                             \nVehichle number:\t%d
                             Type:\t\t\t%s
                             Registration number:\t%s
                             Color:\t\t\t%s
                             Model:\t\t\t%s
                             Class:\t\t\t%s
                             Price:\t\t\tR%.2f\n2
                             
                             """, num , sType, reg, sColor, model, sClass, price);
    }
    
}
