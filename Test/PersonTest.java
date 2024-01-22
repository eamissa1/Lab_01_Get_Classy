import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @org.junit.Test
    public void testSetters()
    {
        Person person = new Person("000000", "Elisa", "Amissah", "Ms.", 2000);

        //Test setters
        person.setID("000006");
        person.setFirstName("Daniel");
        person.setLastName("Ampem-Darko");
        person.setTitle("Mr.");
        person.setYOB(1977);

        //Test setters
        person.setID("000007");
        person.setFirstName("Mercy");
        person.setLastName("Nkansah");
        person.setTitle("Mrs.");
        person.setYOB(1982);

    }

    @Test
    public void testFullName() {
        // Create a Person object for testing
        Person person = new Person("000001", "Bilbo", "Baggins", "Esq.", 1991);

        // Test the fullName() method
        assertEquals("Bilbo Baggins", person.fullName());
    }

    @Test
    public void testFormalName() {
        // Create a Person object for testing
        Person person = new Person("000002", "Frodo", "Baggins", "Esq.", 1985);

        // Test the formalName() method
        assertEquals("Esq. Frodo Baggins", person.formalName());
    }

    @Test
    public void testGetAge() {
        // Create a Person object for testing
        Person person = new Person("000003", "Samwise", "Gamgee", "Esq.", 2000);

        // Test the getAge() method
        // Assuming the current year is 2024
        assertEquals("24", person.getAge());
    }

    @Test
    public void testGetAgeForSpecificYear() {
        // Create a Person object for testing
        Person person = new Person("000004", "Peredic", "Took", "Esq.", 1978);

        // Test the getAge(int year) method
        assertEquals("42", person.getAge(2020));
    }

    @Test
    public void testToCSVDataRecord() {
        // Create a Person object for testing
        Person person = new Person("000005", "Meridoc", "Brandybuck", "Esq.", 1982);

        // Test the toCSVDataRecord() method
        assertEquals("000005, Meridoc, Brandybuck, Esq., 1982", person.toCSVDataRecord());
    }

    // Add more test cases for other methods as needed
}