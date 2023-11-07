package com.bridgeLabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_ID ="[a-z A-Z 0-9 _/-/.]+[@][a-z]+[/.][a-z]{2,3}";


    public boolean validFirstName(String firstName){

        if (firstName != null){
            Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
            Matcher matcher = pattern.matcher(firstName);
            return matcher.matches();
        }
        return false;
    }

    public boolean validLastName(String lastName) {
        if (lastName != null){
            Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
            Matcher matcher = pattern.matcher(lastName);
            return matcher.matches();
        }
        return false;
    }

    public boolean validEmailID(String emailID) {
        if (emailID != null){
            Pattern pattern = Pattern.compile(EMAIL_ID);
            Matcher matcher = pattern.matcher(emailID);
            return matcher.matches();
        }
        return false;
    }

}
