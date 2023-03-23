import java.util.Scanner; // needed for the scanner class 
import java.io.*; // needed for files 
import java.util.ArrayList; // needed to use the ArrayList class

public class Project_Cristina_MendozaSalazar 
{
   public static void main(String[] args) throws IOException
   {
      Scanner in = new Scanner(System.in); // needed to read user input 
      
     // declaring variables 
      int policyNumber = 0; // the policy number 
      String providerName = ""; // the name of the provider 
      String firstName = ""; // the first name of the policy holder 
      String lastName = ""; // the last name of the policy holder 
      int age = 0; // the policy holder's age 
      String smokerStatus = ""; 
      double height = 0.0; // to hold the policy holder's height 
      double weight = 0.0; // to hold the policy holder's weight 
      int smoker = 0; // acummulator to hold the number of smokers
      int nonsmoker = 0; // accumulator to hold the number of nonsmokers 
      
         
      // declaring an arrayList that will hold policy objects 
      ArrayList<Policy> policy = new ArrayList<>(); 
      
      // creating a Policy object that will hold information about policy 
      Policy policyInfo = new Policy(); 
      
      // open the file 
      File file = new File("PolicyInformation.txt"); 
      
      // check to make sure that the file exists 
      while(!file.exists())
      {
         System.out.println("Unable to locate file."); 
         System.exit(0); // exiting the program 
      
      }// end of while 1 
      
      // creating scanner object and passing file object as an argument 
      Scanner inputFile = new Scanner(file); 
      

      // use a while loop to process the file 
      while(inputFile.hasNext())
      {
         
         policyNumber = inputFile.nextInt(); 
         
         inputFile.nextLine(); // keyboard buffer
         
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine(); 
         lastName = inputFile.nextLine(); 
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
          
         // creating a policy holder using info from the file 
        PolicyHolder policyHolder  = new PolicyHolder(firstName, lastName, age, smokerStatus, height, weight);
        
        if(policyHolder.getSmokingStatus().equals("smoker"))
        {
         smoker += 1; 
        }
        else {
         nonsmoker += 1; 
        }
        
        // creating a policy object using the info gathered from the file 
        policyInfo = new Policy(policyNumber, providerName, policyHolder); 
        
        // adding to our Policy ArrayList
        policy.add(policyInfo); 
      
  
       
      }// end of while
      
      
      // closing the file 
      inputFile.close(); 
     
        // for each policy, print out the information 
        for(int j = 0; j < policy.size(); j++) 
        {
         System.out.println(policy.get(j)); // implicitly calling the toString method 
         System.out.println(); // printing a blank line 
         
        } // end of for
        
        // display number of policy objects, smokers, and nonsmokers
         System.out.println("There were " + policyInfo.getPolicyCount() + " policy objects created."); 
         System.out.println("The number of policies with a smoker is: " + smoker); 
         System.out.println("The number of policies with a non-smoker is: " + nonsmoker); 

     }
       
       
}