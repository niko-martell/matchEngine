import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;


public class Reader{
    public static void main(String [] args) throws IOException{
        FileInputStream scholarshipData = null;
        Scanner inFs=null;

        //try to open file
        System.out.println("Opening file Scholarships.csv");
        scholarshipData = new FileInputStream("Scholarships.csv");
        inFs= new Scanner(scholarshipData);

       
        System.out.println("Reading and printing scholarships.");
        Scholarship [] sch = new Scholarship[7];
        int i = 0;
    
        While( )

        //closing scanner and file for scholarship
        inFs.close();
        scholarshipData.close();
   



    }
} 
   
