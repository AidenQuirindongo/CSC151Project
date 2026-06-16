
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

 
public void setPolicyNumber(String policyNum)
{
policyNumber = policyNum;
}

  
public void setProviderName(String provider)
{
providerName = provider;
}

 
public void setFirstName(String fName)
{
firstName = fName;
}

   
public void setLastName(String lName)
{
lastName = lName;
}

   
public void setAge(int holderAge)
{
age = holderAge;
}

   
public void setSmokingStatus(String smokerStatus)
{
smokingStatus = smokerStatus;
}

  
public void setHeight(double holderHeight)
{
height = holderHeight;
}

 
public void setWeight(double holderWeight)
{
weight = holderWeight;
}

   
public String getPolicyNumber()
{
return policyNumber;
}

  
public String getProviderName()
{
return providerName;
}

  
public String getFirstName()
{
return firstName;
}

   
public String getLastName()
{
return lastName;
}

   
public int getAge()
{
return age;
}

  
public String getSmokingStatus()
{
return smokingStatus;
}

  
public double getHeight()
{
return height;
}

   
public double getWeight()
{
return weight;
}

  
public double getBMI()
{
return (weight * 703) / (height * height);
}

   
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