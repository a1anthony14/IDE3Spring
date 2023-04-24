import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // getting user input for type of employee to make
        System.out.println("What Employee would you like to create? type [1] for a normal employee or type [2] for a IT employee: ");
        int type = input.nextInt();

        //condional logic to determine the output of employee
        if(type == 1){
            Employee normalEmp = new Employee();
            normalEmp.makeEmployee();

            System.out.println("Name: " + normalEmp.getName());
            System.out.println("Age: " + normalEmp.getAge());
            System.out.println("Job Title: " + normalEmp.getJobTitle());

        } else if (type == 2) {
            ITemployee ITEmp = new ITemployee();
            ITEmp.makeEmployee();

            System.out.println("Name: " + ITEmp.getName());
            System.out.println("Age: " + ITEmp.getAge());
            System.out.println("Job Title: " + ITEmp.getJobTitle());
            System.out.println("Operating System Specialty: " + ITEmp.getOSSpecialty());
        }



    }//ends main driver
}//ends main class