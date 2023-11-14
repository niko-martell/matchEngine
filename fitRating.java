class FitRating{
    String[] majors = new String[30];
    String[] attributes = new String[30];
    String[] fields = new String[30];
    float gpa = 0;
    int year = 0;
     

    student niko = new student("niko", "Software Engineering", fields, attributes, gpa, year);
    Scholarship test = new Scholarship("test", majors, fields, attributes, gpa, year);

    public static float getFitRating(student std, Scholarship schol){
        float fitR = 0;

        // Major = 50%
        //fields of interest = 5% each match
        //attributes = 5% each match
        //GPA = 20%
        //year = 10%

        if (schol.hasMajor(std)){
            fitR = fitR + 50;
        }

        if (schol.hasFields(std) > 0){
            int num = schol.hasFields(std);
            if(num >= 2){
                fitR = fitR + 10;
            }
            else{
                fitR = fitR + 5*num;
            }
            
        }

        if (schol.hasAttributes(std) > 0){
            int num = schol.hasAttributes(std);
            if(num >= 2){
                fitR = fitR + 10;
            }
            else{
                fitR = fitR + 5*num;
            }
        }

        if (schol.hasGPA(std)){
            fitR += 20;
        }

        if (schol.hasYear(std)){
            fitR += 10;
        }

        return fitR;
    }
}