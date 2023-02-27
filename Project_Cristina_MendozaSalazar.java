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
      int smoker = 0; // acummulator to hold the number of smokers
      int nonsmoker = 0; // accumulator to hold the number of nonsmokers 

         
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
          
        // adding a new Policy object to policy ArrayList
        policy.add(new Policy(policyNum, pName, holderFirstName, holderLastName, age, smokerStatus, height, weight)); 
         
       
      }
      
      
      // closing the file 
      inputFile.close(); 
      
         
        

       
    
     System.out.println("\nThe number of policies with a smoker is: " + smoker); 
     System.out.println("The number of policies with a non-smoker is: " + nonsmoker); 
   }
}