// the policy holder class represents a person that is associated with an insurance policy 
public class PolicyHolder
{
  // declaring necessary fields that are directly associated with a policy holder
   private String firstName; // the policy holder's first name 
   private String lastName; // the policy holder's last name 
   private int age; // the policy holder's age 
   private double height; // the policy holder's height 
   private double weight; // the policy holder's age 
   private String smokingStatus; // smoking status of the policy holder 
   
   /**
   no-arg constructor 
   */
   public PolicyHolder()
   {
     firstName = ""; 
     lastName = ""; 
     age = 0; 
     height = 0.0; 
     weight = 0.0; 
     smokingStatus = ""; 
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
      this.firstName = firstName; 
      this.lastName = lastName; 
      this.age = age; 
      this.smokingStatus = smokingStatus; 
      this.height = height; 
      this.weight = weight; 
   }
   /**
   Copy constructor. Copies the contents of a PolicyHolder object into the one being created
   @param obj2 A PolicyHolder object to be copied 
   */
   public PolicyHolder(PolicyHolder obj2) 
   {
     this.firstName = obj2.firstName; 
     this.lastName = obj2.lastName; 
     this.age = obj2.age; 
     this.height = obj2.height; 
     this.weight = obj2.weight; 
     this.smokingStatus = obj2.smokingStatus;
   }
   
   // below are the setter methods for each field 
   
   /**
  the setHolderFirstName method sets the policy holder's first name 
   @param firstName The policy holder's first name 
   */
   public void setHolderFirstName(String firstName)
   {
      this.firstName = firstName; 
   }
   /**
   the setHolderLastName sets the policy holder's last name 
   @param lastName The policy holder's last name 
   */
   public void setHolderLastName(String lastName)
   {
      this.lastName = lastName;
   }
   /**
   the setHolderAge method sets the policy holder's age 
   @param age The policy holder's age 
   */
   public void setHolderAge(int age) 
   {  
    this.age = age; 
   }
   /**
   the setHolderHeight sets the height of the policy holder 
   @param height The policy holder's height 
   */
   public void setHolderHeight(double height)
   {
      this.height = height; 
   }
   /**
   the setHolderWeight method sets the weight of the policy holder 
   @param weight The policyHolder's weight 
   */
   public void setHolderWeight(double weight) 
   {
      this.weight = weight;
   }
   /**
   The setHolderSmokingStatus method sets the smoker status 
   @param smokingStatus The smoking status of the holder
   */
    public void setSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus; 
   }
   
   // below are the getter methods for each field 
   
   /**
   the getHolderFirstName method gets the first name of the policy holder 
   @return The policy holder's first name 
   */
   public String getHolderFirstName() 
   {
      return this.firstName;
   }
   /**
   the getHolderLastNameMethod gets the last name of the policy holder
   @return The policy holder's last name 
   */
   public String getHolderLastName()
   {
      return this.lastName; 
   }
   /**
   the getHolderAge method gets the age of the policy holder 
   @return The age of the policy holder 
   */
   public int getHolderAge() 
   {
      return this.age; 
   }
   /**
   the getHeight method gets the height of the policy holder 
   @return the height of the policy holder 
   */
   public double getHeight()
   {
      return this.height; 
   }
   /**
   the getWeight method gets the weight of the policy holder 
   @return the weight of the policy holder 
   */
   public double getWeight()
   {
      return this.weight; 
   }
   /**
   The getSmokingStatus method gets the smoker status 
   @return The smoking status of the holder 
   */
    public String getSmokingStatus()
   {
     return this.smokingStatus; 
   }
    /**
   the calculateBMI method calculates and returns the BMI of the policy holder 
   @return the calculated BMI for the policy holder 
   */
   public double calculateBMI()
   {
      final int CONVERSION_FACTOR = 703;
      return (weight * CONVERSION_FACTOR) / (Math.pow(height, 2));
   }
   /**
   The toString method returns information of the policy holder as a string 
   */
   public String toString()
   {
     return String.format("\nPolicyholder's First Name: " + firstName
     + "\nPolicyholder's Last Name: " + lastName + 
     "\nPolicyholder's Age: " + age + 
     "\nPolicyholder's Smoking Status (Y/N): " + smokingStatus + 
     "\nPolicyholder's Height: %.2f" + " inches" +
     "\nPolicyholder's Weight: %.2f" + " pounds " +
     "\nPolicyholder's BMI: %.2f", height, weight, calculateBMI()); 
     
   }
  
}