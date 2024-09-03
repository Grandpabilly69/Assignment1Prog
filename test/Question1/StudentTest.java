package Question1;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    
    public StudentTest() {
    }


    @Test
    public void testSearchStudent() {
        System.out.println("searchStudent");
        String sSearch = "St10442155";
        Student instance = new Student();
        String expResult = "Error:\tStudent not found";
        String result = instance.searchStudent(sSearch);
        assertEquals(expResult, result);
    }

    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        String sDelete = "St10442155";
        Student instance = new Student();
        String expResult = "Student not found";
        String result = instance.deleteStudent(sDelete);
        assertEquals(expResult, result);
    }

    @Test
    public void testStudentReport() {
        System.out.println("studentReport");
        int size = 0;
        Student instance = new Student();
        String expResult = "";
        String result = instance.studentReport(size);
        assertEquals(expResult, result);
    }



    
}
