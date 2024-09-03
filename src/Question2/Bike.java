//St10442155
package Question2;

public class Bike extends Vechicle{

    public Bike(int type, String reg) {
        super(type, reg);
    }

    @Override
    public double calcPrice(int iClass, double price){
        
        double fin;
        switch (iClass){
            case 1 ->  {
                fin = price * 1;
            }
            case 2 -> {
                fin = price * 2;
            }
            case 3 -> {
                fin = price * 3;
            }
            default -> fin = price;
        }
        return fin;
    }



    @Override
    public double modelCalc(String model, double price) {
        
        if(model.contains("GS")){
            return (price * 4);
        }else if(model.contains("RR")){
            return (price * 3);
        }
        return price;
    }

    @Override
    public double usedCalc(String used, double price) {
        if(used.contains("Y")){
            return (price * 0.7);
        }else{
            return price;
        }
    }

    @Override
    public double colorCalc(int color, double price) {
        double fin;
        switch(color){
            case 1 -> fin = price + 10000;
            case 2 -> fin = price + 2000;
            case 3 -> fin = price + 15000;
            case 4 -> fin = price + 20000;
            default -> fin = price;
            
        }
        return fin;
    }

    @Override
    public double setPrice() {

            return 100000;  
             
    }


    
}