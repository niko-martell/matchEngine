public class scholarship {
    private String name;
    private String[] majors;
    private String[] fields, attributes;
    private float gpa;
    private int year;

    public scholarship(String n, String[] m, String[] f, String[] a, float g, int y){
        name = n;
        majors = m;
        fields = f;
        attributes = a;
        gpa = g;
        year = y;
    }

    public String getName(){
        return name;
    }

    public String[] getMajor(){
        return majors;
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

    public boolean hasMajor(student n){
        String m = n.getMajor();
        for (String maj : majors){
            if (maj.equalsIgnoreCase(m)){
                return true;
            }
        }
        return false;
    }

    public int hasFields(student n){
        String[] f = n.getFields();
        int matches = 0;
        for (String sField : f) {
            for (String field : this.fields){

                //if the matching field is found, break out of the loop and search the next field.
                if (field.equalsIgnoreCase(sField)){
                    matches++;
                    break;
                }
            }
        }
        return matches;
    }

    public int hasAttributes(student n){
        String[] a = n.getAttributes();
        int matches = 0;
        for (String sAtt : a){
            for (String att : this.attributes){

                //if the matching attribute is found, break out of the loop and search the next attribute.
                if (att.equalsIgnoreCase(sAtt)){
                    matches++;
                }
            }
        }
        return matches;
    }

    public boolean hasGPA(student n){
        if (n.getGPA() >= this.gpa){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean hasYear(student n){
        if (n.getYear() >= this.year){
            return true;
        }
        else{
            return false;
        }
    }

}