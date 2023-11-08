public class student {
    private String name;
    private String major;
    private String[] fields, attributes;
    private float gpa;
    private int year;

    public student(String name, String m, String[] f, String[] a, float g, int y){
        major = m;
        fields = f;
        attributes = a;
        gpa = g;
        year = y;
    }


    //funny
    
    public String getName(){
        return name;
    }

    public String getMajor(){
        return major;
    }

    public String[] getFields(){
        return fields;
    }

    public String[] getAttributes(){
        return attributes;
    }

    public float getGPA(){
        return gpa;
    }

    public int getYear(){
        return year;
    }
}
