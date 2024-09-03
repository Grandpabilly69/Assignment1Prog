//ST10442155
package Question1;
import java.util.*;

public class Student {
    
    
    Scanner sc = new Scanner(System.in);
    String sMenu = "";
    String sPrompt = "";
    
    ArrayList<String> arrID = new ArrayList<>();
    ArrayList<String> arrName = new ArrayList<>();
    ArrayList<Integer> arrAge = new ArrayList<>();
    ArrayList<String> arrEmail = new ArrayList<>();
    ArrayList<String> arrCourse = new ArrayList<>();
    
    public void displayStartMenu(){
        
        sPrompt = "Mr Sam's Student Management System"
                + "\n----------------------------------"
                + "\nEnter (1) to launch menu or any other key to exit";
        
        loopMenuError(sPrompt);
        
        
        if(sMenu.equals("1")){
            
            displayMainMenu();
        }else{
            
            exitStudentApplication();
        }
        

        
    }
    
    private void displayMainMenu(){
        
        char cMenu;
        
        do{
        
            sPrompt = "Please select ONE of the following menu items"
                + "\n(1)\tCapture new student"
                + "\n(2)\tSearch for student"
                + "\n(3)\tDelete Student"
                + "\n(4)\tPrint student report"
                + "\n(5)\tExit App";
        
        
            loopMenuError(sPrompt);
            
            cMenu = sMenu.charAt(0);
            
            if(cMenu < '1' || cMenu > '5'){
                System.out.println("Please enter a valid input");
            }
         
        }while(cMenu < '1' || cMenu > '5');
        
        
        
        switch(cMenu){
            case '1' ->{
                System.out.println("CAPTURE A NEW STUDENT"
                + "\n---------------------");
                System.out.println("Enter the student ID: ");
                System.out.println(newStudent(sc.next()));
                
            }
            
            case '2' ->{
                System.out.println("Enter student number to search: ");
                System.out.println(searchStudent(sc.next()));
            }
            case '3' ->{
                System.out.println("Enter Student number to delete: ");
                String sDelete = sc.next();
                System.out.println(deleteStudent(sDelete));
            
            }
            case '4' -> System.out.println(studentReport(arrID.size()));  
            
            case '5' -> exitStudentApplication();
        }
        
        
        displayMainMenu();
        
    }   

    private void loopMenuError(String pPrompt){
        
        do{
            System.out.println(pPrompt);
        
            sMenu = sc.next();
        
        }while(sMenu.length() > 1);     
        
    }
    
    public String newStudent(String sAdd){
        int iAge = 0;
        
        
            
        if(arrID.contains(sAdd)){
            System.out.println("Student ID already exists,"
            + " please enter a different one");
            newStudent(sc.next());
        }else{
            arrID.add(sAdd);
        }
        
        
        
        System.out.println("Enter the student Name: ");
        arrName.add(sc.next());
        sc.nextLine();
 //while / try catch works gg ez mr sam
        String sAge ;
        do{
            iAge = 0;
            System.out.println("Enter the student Age: ");
            sAge = sc.next();
            try{
                                
                iAge = Integer.parseInt(sAge);
                if(iAge < 16){
                    System.out.println("Please enter an age greater than or equal to 16: ");
            }
                
            }catch(NumberFormatException e){
                
                System.out.println("Please enter a valid input!!!");
            }
            

            
        }while((iAge < 16));
        
        arrAge.add(iAge);
        

        //Do while for email for domain
        String sMail = "";
        
        
        boolean bMail = false;
        
        do{
            
            System.out.println("Enter the student Email: ");
            sMail = (sc.next());
            
            if(sMail.contains("@") && sMail.contains(".")){
                bMail = true;
            }else{
                System.out.println("Please enter a valid email address");
            }
            
            
            
        }while(bMail == false);
        
        arrEmail.add(sMail);
        
        System.out.println("Enter the student Course: ");
        arrCourse.add(sc.next());

        
        
        return ("Student details have been saved");
    }
    
    
    
   

    public String searchStudent(String sSearch){
     
       
        
        if(arrID.contains(sSearch)){
            
            for (int i = 0; i < arrID.size(); i++) {
                
                if(arrID.get(i).equalsIgnoreCase(sSearch)){
                    
                    return ("ID:\t"+arrID.get(i)+
                            "\nName:\t"+arrName.get(i)+
                            "\nAge:\t"+arrAge.get(i)+
                            "\nEmail:\t"+arrEmail.get(i)+
                            "\nCourse:\t"+arrCourse.get(i));
                }
            }
        }else{
            return ("Error:\tStudent not found");
        }
        return "";
    }

    public String deleteStudent(String sDelete){
        
        
        
        if(arrID.contains(sDelete)){
            System.out.println("Are you sure you want to DELETE student " + sDelete + "? Enter (Y) to delete and (n) to cancel");
            String sConfirm = sc.next();
            
            if(sConfirm.equalsIgnoreCase("Y")){
                
                for (int i = 0; i < arrID.size(); i++) {
                    
                    if(arrID.get(i).equalsIgnoreCase(sDelete)){
                        
                        arrAge.remove(i);
                        arrCourse.remove(i);
                        arrEmail.remove(i);
                        arrID.remove(i);
                        arrName.remove(i);
                        
                        
                    }
                }
                return "Student Deleted Successfully";
            }
            else{
                return "Student not Deleted";
            }
        }else{
        return "Student not found";
        }
    }

    public String studentReport(int size){
        
        String sTemp = "";
        
        for (int i = 0; i < size; i++) {
            sTemp = sTemp + "Student " + (i+1) + "\n-----------------------------------\n";
            
            sTemp = sTemp + "ID:\t" + arrID.get(i)+
                    "\nName:\t" + arrName.get(i)+
                    "\nAge:\t" + arrAge.get(i)+
                    "\nEmail:\t" + arrEmail.get(i)+
                    "\nCourse:\t" + arrCourse.get(i)+
                    "\n--------------------------------------------\n";
        }
        
        return sTemp;
    }    
    
    private void exitStudentApplication(){
        System.out.println("Programe Exited");
        System.exit(0);
    }
}


