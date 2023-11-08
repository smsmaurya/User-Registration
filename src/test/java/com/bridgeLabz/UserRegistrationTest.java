package com.bridgeLabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UserRegistrationTest {

    UserRegistration userRegistration;

    @BeforeEach
    public void setUp(){
        userRegistration = new UserRegistration();

    }


    // test cases for FIRST_NAME
    @Test
    public void testValidFirstName() {
        Assertions.assertEquals(true, userRegistration.validFirstName("Sumesh"));
    }

    @Test
    public void testInvalidFirstName()  {
        Assertions.assertFalse(userRegistration.validFirstName("sms"));
    }

    // test cases for LAST_NAME
    @Test
    public void testValidLastName(){
        Assertions.assertTrue(userRegistration.validLastName("Maurya"));
    }

    @Test
    public void testInvalidLastName(){
        Assertions.assertFalse(userRegistration.validLastName("mry"));
    }

    @ParameterizedTest
    @CsvSource({
            "Maurya, true",
            "mry, false",
            "Kushwaha, true"
    })
    public void testValidationOfLastName(String lastName,boolean expected){
        boolean result = userRegistration.validLastName(lastName);
        Assertions.assertEquals(expected,result);
    }

    // Test cases for MAIL-ID
    @Test
    public void testValidEmailID(){
        Assertions.assertTrue(userRegistration.validEmailID("abc100@yahoo.com"));
    }

    @Test
    public void testInvalidEmailID(){
        Assertions.assertFalse(userRegistration.validEmailID("abcyahoo.com"));
    }

    // test cases for MOBILE_NUMBER
    @Test
    public void testValidMobileNumberFormat(){
        Assertions.assertTrue(userRegistration.validMobileNumberFormat("91 9918558132"));
    }

    @Test
    public void testInvalidMobileNumberFormat(){
        Assertions.assertFalse(userRegistration.validMobileNumberFormat("919918558132"));

    }

}
