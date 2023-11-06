package com.bridgeLabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UserRegistrationTest {
    @Test
    public void testValidFirstName(){
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validFirstName("Sumesh"));
    }

    @Test
    public void testInvalidFirstName(){
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validFirstName("sms"));
    }

    @Test
    public void testValidLastName(){
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validLastName("Maurya"));
    }

    @Test
    public void testInvalidLastName(){
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validLastName("mry"));
    }

    @ParameterizedTest
    @CsvSource({
            "Maurya, true",
            "mry, false",
            "Kushwaha, true"
    })
    public void testValidationOfLastName(String lastName,boolean expected){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validLastName(lastName);
        Assertions.assertEquals(expected,result);
    }
}
