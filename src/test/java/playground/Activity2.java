package playground;

import org.testng.annotations.Test;

public class Activity2 {
    //Write a method that takes firstName and Last Name as parameters
    //and return full name is Format LASTNAME, Firstname;

    //Step 2) Write a test in TestNG to test above method functionality
    @Test
    public String getFullName(String firstName, String lastName){
        if (firstName == null || lastName == null)
            throw new RuntimeException("First or last Name can not be null");
        if(firstName.isEmpty() || lastName.isEmpty())
            throw new RuntimeException("First name and Last Name can NOT be Empty");

        lastName = lastName.trim();
        firstName = firstName.trim();

        return lastName.toUpperCase()+"," +
                firstName.substring(0,1).toUpperCase()+
                firstName.substring(1).toLowerCase();
    }

}
