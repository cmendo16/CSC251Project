// The following class models an insurance policy for one person 
public class Policy 
{
   // declaring all necessary fields 
   private int policyNumber; 
   private String providerName; 
 
   /**
   Default constructor 
   Setting all the default values 
   */
   public Policy()
   {
     policyNumber = 0; 
     providerName = ""; 
   }
   /**
   Constructor that accepts arguments 
   @param policyNum The policy number 
   @param provName The name of the provider 
   @param firstName The first name of the policy holder 
   @param lastName The last name of the policy holder 
   @param age The policy holder's age 
   @param smokingStatus The policy holder's smoking status 
   @param height The policy holder's body weight 
   @param weight The policy holder's height 
   */
   public Policy(int policyNum, String provName)
   {
     policyNumber = policyNum; 
     providerName = provName;  
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
      if (policyHolderAge > AGE_THRESHOLD)
      {
         insurancePrice += AGE_FEE;
         
      }
     
     // if the policyholder is a smoker, there is an addtional fee
     if (holderSmokingStatus.equalsIgnoreCase("Smoker"))
     {
      insurancePrice += SMOKER_FEE;
     }
     
     // if the policyHolder has a BMI of over 35, there is an additonal fee
     if (calculateBMI() > BMI_THRESHOLD)
     {
         double fee = 0; 
         fee = (calculateBMI() - BMI_THRESHOLD) * BMI_ADDITIONAL_FEE;
         insurancePrice += fee;
      }
    
     return insurancePrice;
   }
   /**
   The toString method returns a string representation of information in the policy class 
   */
   public String toString()
   {
      return String.format("Policy Number: " + policyNumber + 
      "\nProvider Name: " + providerName + 
      "\nPolicy Price: %.2f" + getPolicyPrice); 
   
   }
   
}


   