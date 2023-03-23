// The following class models an insurance policy for one person 
public class Policy 
{
   // declaring all necessary fields 
   private int policyNumber; // field to hold the policy number 
   private String providerName; // field to hold the name of the provider 
   private static int policyCount; // field to hold the number of policy objects 
   private PolicyHolder policyHolder; 
   /**
   Default constructor 
   Setting all the default values 
   */
   public Policy()
   {
     policyNumber = 0; 
     providerName = "";  
     policyCount = 0; 
     policyHolder = new PolicyHolder(); 
     
   }
   /**
   Constructor that accepts arguments 
   @param policyNumber The policy number 
   @param provName The name of the provider 
   */
   public Policy(int policyNum, String provName, PolicyHolder holder)
   {
     policyNumber = policyNum; 
     providerName = provName;  
     policyCount++; 
     // creating a new policyHolder object, and passing the parameter "holder" as an argument 
     policyHolder = new PolicyHolder(holder); 
   }
   // The following methods are the class's mutator (setter) methods 
   
   /**
   the setPolicyNumber method sets the policy number 
   @param policyNum The policy number 
   */
   public void setPolicyNumber(int policyNum) 
   {
     policyNumber = policyNum; 
   }
   /**
   the setProviderName method sets the name of the provider 
   @param provName The name of the provider 
   */
   public void setProviderName(String provName) 
   {
    providerName = provName; 
   }
   /**
   The setPolicyHolder method sets the policy holder 
   @param holder The policy holder 
   */
   public void setPolicyHolder(PolicyHolder holder) 
   {
     policyHolder = new PolicyHolder(holder); 
   }
  
   // below are the getter methods for each field 
   
   /**
   The getPolicyNumber returns the policy number for a specific holder
   @return The policy number 
   */
   public int getPolicyNumber()
   {
      return policyNumber; 
   }
    /**
    Method to get the provider name 
    @return The name of the provider 
   */
   public String getProviderName()
   {
      return providerName; 
   }
   /**
   Method that returns the number of policy objects
   @return The number of policy object 
   */
   public int getPolicyCount()
   {  
      return policyCount; 
   }
    /**
   The getPolicyHolder method gets the policy holder 
   @return holder The policy holder 
   */
   public PolicyHolder getPolicyHolder() 
   {
      return new PolicyHolder(policyHolder); // returning a copy of the instructor object 
   }

   /**
   the getPolicyPrice method calculates and returns the price of the insurance policy
   @return the price of the insurance policy 
   */
   public double getPolicyPrice()
   {
     double insurancePrice = 0; 
     final int BASE_FEE = 600; // insurance policy has a base fee of $600 
     final int AGE_THRESHOLD = 50; 
     final int AGE_FEE = 75; // if the policy holder is older than 50, there is an additional fee
     final int SMOKER_FEE = 100; // if the policy holder is a smoker, there is an additional fee 
     final int BMI_THRESHOLD = 35; // if the policy holder has a BMI over 35, there is an additional fee
     final int BMI_ADDITIONAL_FEE = 20; 
     
     insurancePrice += BASE_FEE; 
     
     // using if-else structures in order to determine if any additional fees need to be added to the insurance policy 
     
     // if the policyholder is over 50 years old, there is an additonal fee
      if (policyHolder.getHolderAge() > AGE_THRESHOLD)
      {
         insurancePrice += AGE_FEE;
         
      }
     
     // if the policyholder is a smoker, there is an addtional fee
     if (policyHolder.getSmokingStatus().equalsIgnoreCase("Smoker"))
     {
      insurancePrice += SMOKER_FEE;
     }
     
     // if the policyHolder has a BMI of over 35, there is an additonal fee
     if (policyHolder.calculateBMI() > BMI_THRESHOLD)
     {
         double fee = 0; 
         fee = (policyHolder.calculateBMI() - BMI_THRESHOLD) * BMI_ADDITIONAL_FEE;
         insurancePrice += fee;
      }
    
     return insurancePrice;
   }
   
   /**
   The toString method returns a string representation of information in the policy class 
   */
   public String toString()
   {
      return String.format("Policy Number " + policyNumber + 
      "\nProvider Name: " +  providerName + 
      policyHolder.toString() + 
      "\nPolicy Price: $%.2f", getPolicyPrice()); 
      
      
   }
   
}


   