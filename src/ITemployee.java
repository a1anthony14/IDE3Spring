import java.util.Scanner;

public class ITemployee extends Employee {
    private String OSSpecialty;

    //setter for osspecialty
    public void setOSSpecialty(String OS){
       OSSpecialty = OS;
    }

    //getter for osspecialty
    public String getOSSpecialty(){
        return OSSpecialty;
    }

    @Override
    public void makeEmployee() {
        Scanner input = new Scanner(System.in);
        super.makeEmployee();
        System.out.println("Enter Operating System Specialty: ");
        OSSpecialty = input.nextLine();
    }
}