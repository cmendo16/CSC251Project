// The following class models an insurance policy for one person 
public class Policy 
{
   // declaring all private fields 
   private int policyNumber; 
   private String providerName; 
   private String policyHolderFirstName; 
   private String policyHolderLastName; 
   private int policyHolderAge; 
   private String holderSmokingStatus; 
   private double holderHeight; 
   private double holderWeight; 
   /**
   Default constructor 
   Setting all the default values 
   */
   public Policy()
   {
     policyNumber = 0; 
     providerName = ""; 
     policyHolderFirstName = ""; 
     policyHolderLastName = ""; 
     policyHolderAge = 0; 
     holderSmokingStatus = ""; 
     holderHeight = 0.0; 
     holderWeight = 0.0; 
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
   public Policy(int policyNum, String provName, String firstName, String lastName, int age, String smokingStatus, double height, double weight)
   {
     policyNumber = policyNum; 
     providerName = provName; 
     policyHolderFirstName = firstName; 
     policyHolderLastName = lastName; 
     policyHolderAge = age; 
     holderSmokingStatus = smokingStatus; 
     holderHeight = height; 
     holderWeight = weight; 
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
  the setHolderFirstName method sets the policy holder's first name 
   @param firstName The policy holder's first name 
   */
   public void setHolderFirstName(String firstName)
   {
      policyHolderFirstName = firstName; 
   }
   /**
   the setHolderLastName sets the policy holder's last name 
   @param lastName The policy holder's last name 
   */
   public void setHolderLastName(String lastName)
   {
      policyHolderLastName = lastName;
   }
   /**
  the setHolderAge method sets the policy holder's age 
   @param age The policy holder's age 
   */
   public void setHolderAge(int age) 
   {  
    policyHolderAge = age; 
   }
   /**
   the setSmokingStatus method sets the smoking status 
   @param smokingStatus The smoking status of the policy holder 
   */
   public void setSmokingStatus(String smokingStatus)
   {
      holderSmokingStatus = smokingStatus; 
   }
   /**
  the setHolderHeight sets the height of the policy holder 
   @param height The policy holder's height 
   */
   public void setHolderHeight(double height)
   {
      holderHeight = height; 
   }
   /**
   the setHolderWeight method sets the weight of the policy holder 
   @param weight The policyHolder's weight 
   */
   public void setHolderWeight(double weight) 
   {
      holderWeight = weight;
   }
   
   // Below are the accessor (getter) methods for each field 
   
    /**
    The getPolicyNumber method gets the policy number 
    @return the policy number 
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
   the getHolderFirstName method gets the first name of the policy holder 
   @return The policy holder's first name 
   */
   public String getHolderFirstName() 
   {
      return policyHolderFirstName;
   }
   /**
   the getHolderLastNameMethod gets the last name of the policy holder
   @return The policy holder's last name 
   */
   public String getHolderLastName()
   {
      return policyHolderLastName; 
   }
   /**
   the getHolderAge method gets the age of the policy holder 
   @return The age of the policy holder 
   */
   public int getHolderAge() 
   {
      return policyHolderAge; 
   }
   /**
   the getSmokingStatus method gets the smoking status 
   @return the smoking status of the policy holder 
   */
   public String getSmokingStatus()
   {
      return holderSmokingStatus; 
   }
   /**
   the getHeight method gets the height of the policy holder 
   @return the height of the policy holder 
   */
   public double getHeight()
   {
      return holderHeight; 
   }
   /**
   the getWeight method gets the weight of the policy holder 
   @return the weight of the policy holder 
   */
   public double getWeight()
   {
      return holderWeight; 
   }
   /**
   the calculateBMI method calculates and returns the BMI of the policy holder 
   @return the calculated BMI for the policy holder 
   */
   public double calculateBMI()
   {
      final int CONVERSION_FACTOR = 703;
      return (holderWeight * CONVERSION_FACTOR) / (Math.pow(holderHeight, 2));
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
   
}


   