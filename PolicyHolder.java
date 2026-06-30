/**
The PolicyHolder class stores information about a person
associated with an insurance policy.
*/

public class PolicyHolder
{
private String firstName;
private String lastName;
private int age;
private String smokingStatus;
private double height;
private double weight;

/**
No-argument constructor.
*/

public PolicyHolder()
{
firstName = "";
lastName = "";
age = 0;
smokingStatus = "";
height = 0.0;
weight = 0.0;
}

/**
Constructor that accepts values for all fields.
@param fName The policyholder's first name.
@param lName The policyholder's last name.
@param holderAge The policyholder's age.
@param smokerStatus The policyholder's smoking status.
@param holderHeight The policyholder's height in inches.
@param holderWeight The policyholder's weight in pounds.
*/

public PolicyHolder(String fName, String lName, int holderAge,
                       String smokerStatus, double holderHeight,
                       double holderWeight)
{
firstName = fName;
lastName = lName;
age = holderAge;
smokingStatus = smokerStatus;
height = holderHeight;
weight = holderWeight;
}

/**
Copy constructor.
@param object2 The PolicyHolder object to copy.
*/

public PolicyHolder(PolicyHolder object2)
{
firstName = object2.firstName;
lastName = object2.lastName;
age = object2.age;
smokingStatus = object2.smokingStatus;
height = object2.height;
weight = object2.weight;
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
Determines whether the policyholder is a smoker.
@return true if the policyholder is a smoker, false otherwise.
*/

public boolean isSmoker()
{
return smokingStatus.equalsIgnoreCase("smoker");
}

/**
Returns the policyholder's information.
@return A string containing the policyholder's information.
*/

public String toString()
{
return "Policyholder's First Name: " + firstName + "\n\n" +
"Policyholder's Last Name: " + lastName + "\n\n" +
"Policyholder's Age: " + age + "\n\n" +
"Policyholder's Smoking Status (Y/N): " + smokingStatus + "\n\n" +
String.format("Policyholder's Height: %.1f inches\n\n", height) +
String.format("Policyholder's Weight: %.1f pounds\n\n", weight) +
String.format("Policyholder's BMI: %.2f", getBMI());
}
}
