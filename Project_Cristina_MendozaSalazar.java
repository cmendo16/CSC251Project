import java.util.Scanner; // needed for the scanner class 
import java.io.*; // needed for files 
import java.util.ArrayList; // needed to use the ArrayList class

public class Project_Cristina_MendozaSalazar 
{
   public static void main(String[] args) throws IOException
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
      
            
     //  // creating an object of the Policy class 
//       Policy policy = new Policy(policyNum, pName, holderFirstName, holderLastName, age, smokerStatus, height, weight); 
//       System.out.println(); 


         
      // declaring an arrayList that will hold policy objects 
      ArrayList<Policy> policy = new ArrayList<>(); 
      
      // declaring policy object 
      Policy p; 
      
      // open the file 
      File file = new File("PolicyInformation.txt"); 
      
      // check to make sure that the file exists 
      while(!file.exists())
      {
         System.out.println("Unable to locate file."); 
         System.exit(0); // exiting the program 
      
      }
      
      // creating scanner object and passing file object as an argument 
      Scanner inputFile = new Scanner(file); 
      
      // use a while loop to process the file 
      while(inputFile.hasNext())
      {
         // interact with the file here 
         policyNum = inputFile.nextInt();   
         pName = inputFile.nextLine();  
         holderFirstName = inputFile.nextLine(); 
         holderLastName = inputFile.nextLine();  
         age = inputFile.nextInt(); 
         smokerStatus = inputFile.nextLine();  
         height = inputFile.nextDouble(); 
         weight = inputFile.nextDouble(); 
         
         if(inputFile.hasNext())
         {
            inputFile.nextLine(); // clearing the newline 
         }
         if(inputFile.hasNext())
         {
            inputFile.nextLine(); // skip the blankline 
         }
         
         // adding a new policy object to policy ArrayList for each iteration 
         policy.add(new Policy(policyNum, pName, holderFirstName, holderLastName, age, smokerStatus, height, weight)); 
         
        
      }
      
      
      // closing the file 
      inputFile.close(); 
      
      
      // outputting necessary information 
     
     //  System.out.println("Policy Number: " + policy.getPolicyNumber()); 
//       System.out.println("Provider Name: " + policy.getProviderName()); 
//       System.out.println("Policyholder's First Name: " + policy.getHolderFirstName()); 
//       System.out.println("Policyholder's Last Name: "+ policy.getHolderLastName()); 
//       System.out.println("Policyholder's Age: " + policy.getHolderAge()); 
//       System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus() );
//       System.out.println("Policyholder's Height: " + policy.getHeight() + " inches"); 
//       System.out.println("Policyholder's Weight: " +policy.getWeight() + " pounds"); 
//       System.out.printf("Policyholder's BMI: %,.2f", policy.calculateBMI());
//       System.out.println(); 
//       System.out.printf("Policy Price: $%,.2f", policy.getPolicyPrice());
//      
      
   }
}