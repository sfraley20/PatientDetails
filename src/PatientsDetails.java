import java.util.Scanner;

public class PatientsDetails {

    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);

        String patientName= "Stacey Manson";

        boolean hasInsurance= false;

        double temp = 102.2;

        int numVisits= 5;

        System.out.println("Patient Details: ");

        System.out.println("Name: " +patientName);

        System.out.println("Does the patient have insurance: " + hasInsurance);

        System.out.println("Body temprature: " + temp);

        System.out.println("Number of visits:" + numVisits);




    }

}
//I coudln't figure out how to make a boolean that said that the patient didnt have insurance