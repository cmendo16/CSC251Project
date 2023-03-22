// the policy holder class represents a person that is associated with an insurance policy 
public class PolicyHolder
{
  // declaring necessary fields that are directly associated with a policy holder
   private String policyHolderFirstName; 
   private String policyHolderLastName; 
   private int policyHolderAge; 
   private double holderHeight; 
   private double holderWeight; 
   private String holderSmokingStatus; 
   
   /**
   no-arg constructor 
   */
   public PolicyHolder()
   {
     policyHolderFirstName = ""; 
     policyHolderLastName = ""; 
     holderSmokingStatus = "";
     policyHolderAge = 0; 
     holderHeight = 0.0; 
     holderWeight = 0.0; 
   }  
   /**
   Constructor that accepts arguments
   @param firstName - The first name of the policy holder 
   @param lastName - The last name of the policy holder
   @param age - The age of the policy holder
   @param smokingStatus - The smoking status of the smoker 
   @param height - The height of the policy holder
   @param weight - The weight of the policy holder
   */
   public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight)
   {
     policyHolderFirstName = firstName; 
     policyHolderLastName = lastName; 
     policyHolderAge = age; 
     holderHeight = height; 
     holderWeight = weight; 
     holderSmokingStatus = smokingStatus;
   }
   
   // below are the setter methods for each field 
   
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
   /**
   The setHolderSmokingStatus method sets the smoker status 
   @param smokingStatus The smoking status of the holder
   */
    public void setHolderSmokingStatus(String smokingStatus)
   {
      holderSmokingStatus = smokingStatus; 
   }
   
   // below are the getter methods for each field 
   
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
   The setHolderSmokingStatus method sets the smoker status 
   @return The smoking status of the holder 
   */
    public String getHolderSmokingStatus()
   {
     return holderSmokingStatus; 
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
   The toString method returns information of the policy holder as a string 
   */
   public String toString()
   {
     return String.format("Policyholder's First Name: " + policyHolderFirstName
     + "\nPolicyholder's Last Name: " + policyHolderLastName + 
     "\nPolicyholder's Age: " + policyHolderAge + 
     "\nPolicyholder's Smoking Status: " + holderSmokingStatus + 
     "\nPolicyholder's Height: %.2f" + holderHeight + 
     "\nPolicyholder's Weight: %.2f" + holderWeight + 
     "\nPolicyholder's BMI: %.2f" + calculateBMI()); 
     
   }
  
}