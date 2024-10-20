package Solutions;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UserInfoTest 
{
    private UserInfo userInfo;

    @Before
    public void setUp() 
    {
        userInfo = new UserInfo();
    }

    @Test
    public void testSetFirstName() 
    {
        userInfo.setFirstName("John");
        assertEquals("John", userInfo.getFirstName());
    }

    @Test
    public void testSetLastName() 
    {
        userInfo.setLastName("Doe");
        assertEquals("Doe", userInfo.getLastName());
    }

    @Test
    public void testSetPhoneNumberValid() 
    {
        userInfo.setPhoneNumber("1234567890");
        assertEquals("1234567890", userInfo.getPhoneNumber());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPhoneNumberInvalid() 
    {
        userInfo.setPhoneNumber("123ABC");
    }

    @Test
    public void testNameString() 
    {
        userInfo.setFirstName("John");
        userInfo.setLastName("Doe");
        userInfo.setPhoneNumber("1234567890");
        
        String expected = "First Name: John\nLast Name: Doe\nMobile Phone: 1234567890";
        assertEquals(expected, userInfo.nameString());
    }
}
