import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private String jobTitle;


    //setters and getters for Name, Age, jobTitle
   public void setName(String employeeName){
       name = employeeName;
   }
   public void setAge(int employeeAge){
       age = employeeAge;
   }
   public void setJobTitle(String employeeTitle){
       jobTitle = employeeTitle;
   }
   public String getName(){
       return name;
   }
   public int getAge(){
       return age;
   }
   public String getJobTitle(){
       return jobTitle;
  }

   public void makeEmployee(){
       Scanner input = new Scanner(System.in);

       System.out.println("Enter name: ");
       name = input.nextLine();

       System.out.println("Enter age: ");
       age = input.nextInt();
        input.nextLine();

       System.out.println("Enter job title: ");
       jobTitle = input.nextLine();
   }

}
