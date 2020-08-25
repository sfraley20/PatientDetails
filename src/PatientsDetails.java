import java.util.Scanner;

public class PatientsDetails {

    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);

        String patientName= "Stacey Manson";

        String appDate = "5/10/22";

        String contactNumber = "5558003456";

        boolean hasInsurance= false;

        double temp = 102.2;

        double copay = 20.00;

        int numVisits= 5;

        System.out.println("Patient Details: ");

        System.out.println("Name: " +patientName);

        System.out.println("Does the patient have insurance: " + hasInsurance);

        System.out.println("Body temprature: " + temp);

        System.out.println("Number of visits:" + numVisits);

        System.out.println("Copay amount: 0" + (copay + "0"));




    }

}
//I coudln't figure out how to make a boolean that said that the patient didnt have insurance