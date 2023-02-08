import java.util.Scanner; // needed for the scanner class 
public class Project_Cristina_MendozaSalazar
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in); // needed to read user input 
      
      // declaring variables 
      int policyNum = 0; // the policy number 
      String pName = ""; // the name of the provider 
      String holderFirstName = ""; // the first name of the policy holder 
      String holderLastName = ""; // the last name of the policy holder 
      int age = 0; // the policy holder's age 
      String smokerStatus = ""; 
      double height = 0.0; // to hold the policy holder's height 
      double weight = 0.0; // to hold the policy holder's weight 
      
      // asking user to input required information 
      System.out.print("Please enter the Policy Number: " ); 
      policyNum = in.nextInt(); 
      
      in.nextLine(); 
      
      System.out.print("\nPlease enter the Provider Name: "); 
      pName = in.nextLine(); 
      
      System.out.print("\nPlease enter the Policyholder's First Name: "); 
      holderFirstName = in.nextLine(); 
      
      System.out.print("\nPlease enter the Policyholder's Last Name: "); 
      holderLastName = in.nextLine(); 
      
      System.out.print("\nPlease enter the Policyholder's Age: "); 
      age = in.nextInt(); 
      
      in.nextLine(); 
        
      System.out.print("\nPlease enter the PolicyHolder's Smoking Status (smoker/non-smoker): "); 
      smokerStatus = in.nextLine(); 
      
      System.out.print("\nPlease enter the Policyholder's Height (in inches): ");
      height = in.nextDouble(); 
      
      System.out.print("\nPlease enter the Policyholder's Weight (in pounds): "); 
      weight = in.nextDouble(); 
      
      
      // creating an object of the Policy class 
      Policy policy = new Policy(policyNum, pName, holderFirstName, holderLastName, age, smokerStatus, height, weight); 
      System.out.println(); 
      
      // outputting necessary information 
      System.out.println("Policy Number: " + policy.getPolicyNumber()); 
      System.out.println("Provider Name: " + policy.getProviderName()); 
      System.out.println("Policyholder's First Name: " + policy.getHolderFirstName()); 
      System.out.println("Policyholder's Last Name: "+ policy.getHolderLastName()); 
      System.out.println("Policyholder's Age: " + policy.getHolderAge()); 
      System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus() );
      System.out.println("Policyholder's Height: " + policy.getHeight() + " inches"); 
      System.out.println("Policyholder's Weight: " +policy.getWeight() + " pounds"); 
      System.out.printf("Policyholder's BMI: %,.2f", policy.calculateBMI());
      System.out.println(); 
      System.out.printf("Policy Price: $%,.2f", policy.getPolicyPrice());
     
      
   }
}