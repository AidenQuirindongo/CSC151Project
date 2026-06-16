import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Project_Aiden_Quirindongo
{
public static void main(String[] args) throws IOException
{
ArrayList<Policy> policies = new ArrayList<Policy>();

File file = new File("PolicyInformation.txt");
Scanner inputFile = new Scanner(file);

while (inputFile.hasNextLine())
{
String policyNumber = getNextNonBlankLine(inputFile);

if (!policyNumber.equals(""))
{
String providerName = getNextNonBlankLine(inputFile);
String firstName = getNextNonBlankLine(inputFile);
String lastName = getNextNonBlankLine(inputFile);
int age = Integer.parseInt(getNextNonBlankLine(inputFile));
String smokingStatus = getNextNonBlankLine(inputFile);
double height = Double.parseDouble(getNextNonBlankLine(inputFile));
double weight = Double.parseDouble(getNextNonBlankLine(inputFile));

Policy policy = new Policy(policyNumber, providerName, firstName,
lastName, age, smokingStatus,
height, weight);

policies.add(policy);
}
}

inputFile.close();

      displayPolicies(policies);
      displaySmokerTotals(policies);
}

public static String getNextNonBlankLine(Scanner inputFile)
{
String line = "";

while (inputFile.hasNextLine() && line.equals(""))
{
line = inputFile.nextLine();

if (line.trim().equals(""))
{
line = "";
}
}

return line;
}

public static void displayPolicies(ArrayList<Policy> policies)
{
for (int index = 0; index < policies.size(); index++)
{
Policy policy = policies.get(index);

System.out.println("Policy Number: " + policy.getPolicyNumber());
System.out.println();
System.out.println("Provider Name: " + policy.getProviderName());
System.out.println();
System.out.println("Policyholder's First Name: " + policy.getFirstName());
System.out.println();
System.out.println("Policyholder's Last Name: " + policy.getLastName());
System.out.println();
System.out.println("Policyholder's Age: " + policy.getAge());
System.out.println();
System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " +
policy.getSmokingStatus());
System.out.println();
System.out.printf("Policyholder's Height: %.1f inches\n", policy.getHeight());
System.out.println();
System.out.printf("Policyholder's Weight: %.1f pounds\n", policy.getWeight());
System.out.println();
System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
System.out.println();
System.out.printf("Policy Price: $%.2f\n", policy.getPolicyPrice());
System.out.println();
System.out.println();
}
}

public static void displaySmokerTotals(ArrayList<Policy> policies)
{
int smokers = 0;
int nonSmokers = 0;

for (int index = 0; index < policies.size(); index++)
{
Policy policy = policies.get(index);

if (policy.getSmokingStatus().equalsIgnoreCase("smoker"))
{
smokers++;
}
else if (policy.getSmokingStatus().equalsIgnoreCase("non-smoker"))
{
nonSmokers++;
}
}

System.out.println("The number of policies with a smoker is: " + smokers);
System.out.println();
System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
}
}