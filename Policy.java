
/**
   The Policy class stores insurance policy information.
*/

public class Policy
{
private String policyNumber;
private String providerName;
private String firstName;
private String lastName;
private int age;
private String smokingStatus;
private double height;
private double weight;

/**
No-argument constructor.
Sets all String fields to empty strings and numeric fields to 0.
*/
public Policy()
{
policyNumber = "";
providerName = "";
firstName = "";
lastName = "";
age = 0;
smokingStatus = "";
height = 0.0;
weight = 0.0;
}

/**
Constructor that accepts values for all fields.
 @param policyNum The policy number.
@param provider The provider name.
@param fName The policyholder's first name.
@param lName The policyholder's last name.
@param holderAge The policyholder's age.
@param smokerStatus The policyholder's smoking status.
@param holderHeight The policyholder's height in inches.
@param holderWeight The policyholder's weight in pounds.
*/
public Policy(String policyNum, String provider, String fName,
String lName, int holderAge, String smokerStatus,
double holderHeight, double holderWeight)
{
policyNumber = policyNum;
providerName = provider;
firstName = fName;
lastName = lName;
age = holderAge;
smokingStatus = smokerStatus;
height = holderHeight;
weight = holderWeight;
}

/**
Sets the policy number.
@param policyNum The policy number.
*/
public void setPolicyNumber(String policyNum)
{
policyNumber = policyNum;
}

/**
Sets the provider name.
@param provider The provider name.
*/
public void setProviderName(String provider)
{
providerName = provider;
}

/**
Sets the policyholder's first name.
@param fName The policyholder's first name.
*/
public void setFirstName(String fName)
{
firstName = fName;
}

/**
Sets the policyholder's last name.
@param lName The policyholder's last name.
*/
public void setLastName(String lName)
{
lastName = lName;
}

/**
Sets the policyholder's age.
@param holderAge The policyholder's age.
*/
public void setAge(int holderAge)
{
age = holderAge;
}

/**
Sets the policyholder's smoking status.
@param smokerStatus The policyholder's smoking status.
*/
public void setSmokingStatus(String smokerStatus)
{
smokingStatus = smokerStatus;
}

/**
Sets the policyholder's height.
@param holderHeight The policyholder's height in inches.
*/
public void setHeight(double holderHeight)
{
height = holderHeight;
}

/**
Sets the policyholder's weight.
@param holderWeight The policyholder's weight in pounds.
*/
public void setWeight(double holderWeight)
{
weight = holderWeight;
}

/**
Gets the policy number.
@return The policy number.
*/
public String getPolicyNumber()
{
return policyNumber;
}

/**
Gets the provider name.
@return The provider name.
*/
public String getProviderName()
{
return providerName;
}

/**
Gets the policyholder's first name.
@return The policyholder's first name.
*/
public String getFirstName()
{
return firstName;
}

/**
Gets the policyholder's last name.
@return The policyholder's last name.
*/
public String getLastName()
{
return lastName;
}

/**
Gets the policyholder's age.
@return The policyholder's age.
*/
public int getAge()
{
return age;
}

/**
Gets the policyholder's smoking status.
@return The policyholder's smoking status.
*/
public String getSmokingStatus()
{
return smokingStatus;
}

/**
Gets the policyholder's height.
@return The policyholder's height in inches.
*/
public double getHeight()
{
return height;
}

/**
Gets the policyholder's weight.
@return The policyholder's weight in pounds.
*/
public double getWeight()
{
return weight;
}

/**
Calculates the policyholder's BMI.
@return The policyholder's BMI.
*/
public double getBMI()
{
return (weight * 703) / (height * height);
}

/**
Calculates the price of the insurance policy.
@return The policy price.
*/
public double getPolicyPrice()
{
final double BASE_FEE = 600.0;
final double AGE_FEE = 75.0;
final double SMOKER_FEE = 100.0;
final double BMI_FEE_RATE = 20.0;
final double BMI_LIMIT = 35.0;

double price = BASE_FEE;
double bmi = getBMI();

if (age > 50)
{
price += AGE_FEE;
}

if (smokingStatus.equalsIgnoreCase("smoker"))
{
price += SMOKER_FEE;
}

if (bmi > BMI_LIMIT)
{
price += (bmi - BMI_LIMIT) * BMI_FEE_RATE;
}

return price;
}
}