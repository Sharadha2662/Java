public class Student
{
    int rollNo;
    
    String name;
    
    int marks;
    
    void study()
    {
        System.out.println("Studying");
    }
    
    void practice()
    {
        System.out.println("Practicing");
    }
    public static void main(String [] args)
    {
        Student s1 = new Student();
        s1.rollNo = 67;
        s1.name = "sharadha";
        s1.marks = 89;
        
        System.out.println(s1.rollNo);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        
        s1.study();
        s1.practice();
    }
}