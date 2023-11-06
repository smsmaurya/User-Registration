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
    @ParameterizedTest
    @CsvSource({
            "Sumesh, true",
            "sms, false",
            "Rakesh, true"
    })
    public void testInvalidFirstName(String firstName,boolean expected){
        UserRegistration userRegistration = new UserRegistration();
        //Assertions.assertFalse(userRegistration.validFirstName("sume@"));
        boolean result = userRegistration.validFirstName(firstName);
        Assertions.assertEquals(expected,result);
    }
}
