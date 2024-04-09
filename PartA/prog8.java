

class Person{
    private String name;
    private String address;
    Person(String n,String a){
        this.name=n;
        this.address=a;
    }
    String getName(){
        return name;
    }
    String getAddress(){
        return address;
    }
    void setAddress(String a){
        this.address=a;
    }
    public String toString(){
        return name+"("+address+")";
    }
}
class Student extends Person{
    int numcourses=0;
    String courses[]=new String[30];
    int grades[]=new int[30];
    Student(String a,String n){
        super(n,a);
    }
    void addcoursegrade(String course,int grade){
        if(numcourses<=29){
            courses[numcourses]=course;
            grades[numcourses]=grade;
            numcourses++;
        }
        else
        System.out.println("Max limit reached");
    }
    void printGrades(){
        for(int i=0;i<numcourses;i++){
            System.out.println("Coourse : "+courses[i]+"Grade : "+grades[i]);
    
        }
    }
    double getAverageGrade(){
        double d=0;
        for(int i=0;i<numcourses;i++){
            d+=grades[i];
        }
        d/=numcourses;
        return d;
    }
    public String toString(){
        return getName()+"("+getAddress()+")";
    }
}
class Teacher extends Person{
    int numcourses=0;
    String courses[]=new String[5];
    Teacher(String n,String a){
        super(n,a);
    }
    boolean addCourse(String course){
        if(numcourses<5){
            for(int i=0;i<numcourses;i++){
                if(courses[i].equals(course))
                return false;
                courses[numcourses]=course;
                numcourses++;
                return true;
            }
        }
        return false;
    }
    boolean removecourse(String course){
        if(numcourses!=0){
            for(int i=0;i<numcourses;i++){
                if(courses[i].equals(course)){
                    courses[i]="";
                    return true;
                }
                return false;   
            }
        }
        return false;
    }
    public String toString(){
        return getName()+"("+getAddress()+")";
    }
}
public class prog8{
    public static void main(String[] args) {
        Student s1=new Student("Ramesh", "Bangalore");
        System.out.println(s1);
        s1.addcoursegrade("OOPS", 98);
        s1.addcoursegrade("Maths", 85);
        s1.printGrades();
        System.out.println(s1.getAverageGrade());
        Teacher t1=new Teacher("Jasmine","Bengaluru");
        if(t1.addCourse("OOPS"))
        {
            System.out.println("COurse added");
        }
        else
        System.out.println("Course cannot be added");
    
    
    
    
    }
}