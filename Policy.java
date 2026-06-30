/**
The Policy class stores insurance policy information.
*/

public class Policy
{
private String policyNumber;
private String providerName;
private PolicyHolder policyHolder;

private static int numberOfPolicies = 0;

/**
No-argument constructor.
*/

public Policy()
{
policyNumber = "";
providerName = "";
policyHolder = new PolicyHolder();
numberOfPolicies++;
}

/**
Constructor that accepts values for all fields.
@param policyNum The policy number.
@param provider The provider name.
@param holder The PolicyHolder object associated with the policy.
*/

public Policy(String policyNum, String provider, PolicyHolder holder)
{
policyNumber = policyNum;
providerName = provider;

if (holder == null)
{
policyHolder = new PolicyHolder();
}
else
{
policyHolder = new PolicyHolder(holder);
}

numberOfPolicies++;
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
Sets the policyholder.
@param holder The PolicyHolder object associated with the policy.
*/

public void setPolicyHolder(PolicyHolder holder)
{
if (holder == null)
{
policyHolder = new PolicyHolder();
}
else
{
policyHolder = new PolicyHolder(holder);
}
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
Gets a copy of the policyholder.
@return A copy of the PolicyHolder object.
*/

public PolicyHolder getPolicyHolder()
{
return new PolicyHolder(policyHolder);
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
double bmi = policyHolder.getBMI();

if (policyHolder.getAge() > 50)
{
price += AGE_FEE;
}

if (policyHolder.isSmoker())
{
price += SMOKER_FEE;
}

if (bmi > BMI_LIMIT)
{
price += (bmi - BMI_LIMIT) * BMI_FEE_RATE;
}

return price;
}

/**
Gets the number of Policy objects that have been created.
@return The number of Policy objects created.
*/

public static int getNumberOfPolicies()
{
return numberOfPolicies;
}

/**
Returns the policy's information.
@return A string containing the policy's information.
*/

public String toString()
{
return "Policy Number: " + policyNumber + "\n\n" +
"Provider Name: " + providerName + "\n\n" +
policyHolder + "\n\n" +
String.format("Policy Price: $%.2f", getPolicyPrice());
}
}
