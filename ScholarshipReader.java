import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;


public class ScholarshipReader{
    static String n; //1
    static String[] m;//2
    static String[] f, a;//3
    static String g;
    static double gpa;
    static String y;
    static String od;
    static String dd;

    public static void main(String [] args) throws IOException{
        FileInputStream scholarshipData = null;
        Scanner inFs=null;

        //try to open file
        System.out.println("Opening file Scholarships.csv");
        scholarshipData = new FileInputStream("Scholarships.csv");
        inFs= new Scanner(scholarshipData);

       
        System.out.println("Reading and printing scholarships.");
      
        while(inFs.hasNextLine()){
            String line = inFs.nextLine();
            String [] data =line.split(",");

          
                n = data[0];
                m = data[1].split(",");
                f = data[2].split(",");
                g = data[3];
                y = data[4];
                a = data[5].split(",");
                od = data[6];
                dd = data[7];

                gpa= new Double(g).doubleValue();
                

               System.out.println("Scholarship Name: " + n);
                System.out.println("Amount: " + String.join(", ", m));
                System.out.println("Fields: " + String.join(", ", f));
                System.out.println("Attributes: " + String.join(", ", a));
                System.out.println("GPA: " + gpa);
                //System.out.println(gpa);
                System.out.println("Year: " + y);
                System.out.println("Date opened: " + od);
                System.out.println("Due Date: " + dd);
                System.out.println();
            
            

        }

        inFs.close();
        scholarshipData.close();
    }
}     
