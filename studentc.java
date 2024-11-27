import java.io.*;
class student{
    private String name;
    private int age;
    //default constructor
    student()
    {
        name=null;
        age=0;
    }
    //parameterised constructor
    student(String n,int a)
    {
        name=n;
        age=a;
    }
    String getName()
    {
        return name;
    }
    int getAge()
    {
        return age;
    }
}
    class studentdemo
    {
        public static void main(String [] args)
        {
           student student1=new student("ASHWIKA",18);
           student student2=new student("ASHWINI",21);
           student student3=new student();
           student3=student1;
           
           System.out.println(student1.getName()+" "+student1.getAge());
           System.out.println(student3.get.Nmae()+" " +student3.getAge());
        }
    }
