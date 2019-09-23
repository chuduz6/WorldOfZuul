// EXERCISE 5.25
public class MapTester
{
	private HashMap<String, String> phoneBook = new HashMap<String, String>();

	public MapTester()
	{
		phoneBook.put("Homer Jay Simpson", "(531) 9392 4587");
		phoneBook.put("Charles Montgomery Burns", "(531) 5432 1945");
		phoneBook.put("Apu Nahasapeemapetilon", "(531) 4234 4418"); 
	}
	public void enterNumber(String name, String number)
	{
		phoneBook.put(name, number);
	}
	
	public String lookupNumber(String name)
	{
		return phoneBook.get(name);
	}
}

// EXERCISE 5.26
It overwrites the existing one.


// EXERCISE 5.27
Both values stay in the map. HashMaps only uses the key to distinguish entries - not the
values.


// EXERCISE 5.28
phoneBook.containsKey("Homer Jay Simpson");


// EXERCISE 5.29
It returns null.


// EXERCISE 5.30
phoneBook.size()


//EXERCISE 5.61
public class NameGenerator
{
	public String generatorStarWarsName(String firstName, String lastName,	String mothersMaidenName,	String cityOfBirth)
	{
	String swFirstName = lastName.substring(0,3) +
	firstName.substring(0,2);
	String swLastName = mothersMaidenName.substring(0,2) +
	cityOfBirth.substring(0,3);
	return swFirstName + " " + swLastName;
	}
}


// EXERCISE 5.62
Strings are immutable and therefore can not be changed. The method that is called does
not change the instance 's' but returns a new object with the string in upper case. The
correct way to do it is:
String upperCaseS = s.toUpperCase();
System.out.println(upperCaseS);


// EXERCISE 5.63
The variable a and b contains values. When these values are passed as arguments to the
method, the values get copied into the variables i1 and i2. So we now have two copies of
the values in a and b. In the method, we then swap the values stored in the variables i1 and
i2. This has no effect outside the method as i1 and i2 are local variables in the method.
After calling the method the variables a and b will still contain the same values as before
the method call.

