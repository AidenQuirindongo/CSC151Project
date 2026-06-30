import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

/**
This program reads policy information from a file and displays
information about each insurance policy.
*/

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

PolicyHolder holder = new PolicyHolder(firstName, lastName, age,
                                                   smokingStatus, height, weight);

Policy policy = new Policy(policyNumber, providerName, holder);

policies.add(policy);
}
}

inputFile.close();

displayPolicies(policies);
displayPolicyTotals(policies);
}

/**
Gets the next nonblank line from the input file.
@param inputFile The Scanner object used to read the file.
@return The next nonblank line, or an empty string if none is found.
*/

public static String getNextNonBlankLine(Scanner inputFile)
{
String line = "";

while (inputFile.hasNextLine() && line.equals(""))
{
line = inputFile.nextLine().trim();
}

return line;
}

/**
Displays all policy information.
@param policies The ArrayList of Policy objects.
*/

public static void displayPolicies(ArrayList<Policy> policies)
{
for (int index = 0; index < policies.size(); index++)
{
System.out.println(policies.get(index));
System.out.println();
}
}

/**
Displays the number of policies created and smoker totals.
@param policies The ArrayList of Policy objects.
*/

public static void displayPolicyTotals(ArrayList<Policy> policies)
{
int smokers = 0;
int nonSmokers = 0;

for (int index = 0; index < policies.size(); index++)
{
PolicyHolder holder = policies.get(index).getPolicyHolder();

if (holder.isSmoker())
{
smokers++;
}
else
{
nonSmokers++;
}
}

System.out.println("There were " + Policy.getNumberOfPolicies() +
                         " Policy objects created.");
System.out.println();
System.out.println("The number of policies with a smoker is: " + smokers);
System.out.println();
System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
}
}
