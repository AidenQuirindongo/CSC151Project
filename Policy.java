
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
smokingStatus = "non-smoker";
height = 0.0;
weight = 0.0;
}

public Policy(String pNumber, String provider, String fName, String lName, int holderAge, String smokerStatus, double holderHeight, double holderWeight)

{

policyNumber = pNumber;
providerName = provider;
firstName = fName;
lastName = lName;
age = holderAge;
smokingStatus = smokerStatus;
height = holderHeight;
weight = holderWeight;
}

public void setPolicyNumber(String pNumber)
{
policyNumber = pNumber;
}

public String getPolicyNumber()
{
return policyNumber;
}
public void setProviderName(String provider)
{
providerName = provider;
}
public String getProviderName()
{
return providerName;
}
public void setFirstName(String fName)
{
firstName = fName;
}
public String getFirstName()
{
return firstName;
}
public void setLastName(String lName)
{
lastName = lName;
}
public String getLastName()
{
return lastName;
}
public void setAge(int holderAge)
{
age = holderAge;
}
public int getAge()
{
return age;
}
public void setSmokingStatus(String smokerStatus)
{
smokingStatus = smokerStatus;
}
public String getSmokingStatus()
{
return smokingStatus;
}
public void setHeight(double holderHeight)
{
height = holderHeight;
}
public double getHeight()
{
return height;
}
public void setWeight(double holderWeight)
{
weight = holderWeight;
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
double price = 600.0;
double bmi = getBMI();

if (age > 50)
{
price = price + 75.0;
}
if (smokingStatus.equalsIgnoreCase("smoker"))
{
price = price + 100.0;
}

if (bmi > 35)
{
price = price + ((bmi - 35) * 20);
}

return price;

}

}
