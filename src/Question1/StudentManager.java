//ST10442155
//Peer review by ST10442945 "app works great!!!!"
package Question1;
import Question2.AutoTrader;
import java.util.*;

public class StudentManager {

    public static void main(String[] args) {
        Student st = new Student();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("""
                           What application do you want to run?
                           1)   Question 1
                           2)   Question 2
                           """);
        int question = sc.nextInt();
        
        if(question == 1){
            st.displayStartMenu();
        }else if(question == 2){
            
            AutoTrader ad = new AutoTrader();
            ad.display();
        }else{
            System.out.println("Wrong imput. Application is closing");
        }
        
        
    }
   
    
}
