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
      
           

         
      // declaring an arrayList that will hold policy objects 
      ArrayList<Policy> policy = new ArrayList<>(); 
      
      
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
         
         inputFile.nextLine(); // keyboard buffer
         
         pName = inputFile.nextLine();
         holderFirstName = inputFile.nextLine(); 
         holderLastName = inputFile.nextLine(); 
         
         age = inputFile.nextInt(); 
         inputFile.nextLine(); // keyboard buffer
         
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
         // creating an object of the Policy class 
        Policy p = new Policy(policyNum, pName, holderFirstName, holderLastName, age, smokerStatus, height, weight); 
        
        policy.add(p);
        
        // outputting necessary information 
        
         for(int i = 0; i < policy.size(); i++)
         System.out.println();
         System.out.println("Policy Number: " + p.getPolicyNumber()); 
         System.out.println("Provider Name: " + p.getProviderName()); 
         System.out.println("Policyholder's First Name: " + p.getHolderFirstName()); 
         System.out.println("Policyholder's Last Name: "+ p.getHolderLastName()); 
         System.out.println("Policyholder's Age: " + p.getHolderAge()); 
         System.out.println("Policyholder's Smoking Status: " + p.getSmokingStatus());
         System.out.println("Policyholder's Height: " + p.getHeight() + " inches"); 
         System.out.println("Policyholder's Weight: " +p.getWeight() + " pounds"); 
         System.out.printf("Policyholder's BMI: %,.2f", p.calculateBMI());
         System.out.println(); 
         System.out.printf("Policy Price: $%,.2f", p.getPolicyPrice());
         System.out.println();
          
        
      }
      
      
      // closing the file 
      inputFile.close(); 
     
     System.out.println("The number of policies with smoker is: "); 
     System.out.println("The number of policies with non-smoker is: "); 
   }
}