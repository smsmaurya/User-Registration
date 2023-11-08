package com.bridgeLabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_ID ="[a-z A-Z 0-9 _/-/.]+[@][a-z]+[/.][a-z]{2,3}";
    private static final String MOBILE_NUMBER ="^[9]+[1]+\\s\\d{10}$";
    private static final String PASSWORD ="[A-Z a-z 0-9 ([!@#$%&])]{8,}";

    public boolean validFirstName(String firstName)  {

        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(firstName);
        try {
            if(matcher.matches()){
                return true;
            }
            else {
                throw new UserRegistrationException("Invalid first name");
            }
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean validLastName(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(lastName);
        try {
            if(matcher.matches()){
                return true;
            }
            else {
                throw new UserRegistrationException("Invalid last name");
            }
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean validEmailID(String emailID) {

        Pattern pattern = Pattern.compile(EMAIL_ID);
        Matcher matcher = pattern.matcher(emailID);
        try {
            if(matcher.matches()){
                return true;
            }
            else {
                throw new UserRegistrationException("Invalid email id");
            }
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean validMobileNumberFormat(String mobileNum) {
        Pattern p = Pattern.compile(MOBILE_NUMBER);
        Matcher m = p.matcher(mobileNum);
        try {
            if(m.matches()){
                return true;
            }
            else {
                throw new UserRegistrationException("Invalid mobile number");
            }
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean passwordShouldHave8Characters(String password){
        Pattern p = Pattern.compile(PASSWORD);
        Matcher m = p.matcher(password);
        try {
            if(m.matches()){
                return true;
            }
            else {
                throw new UserRegistrationException("password should have at least 8 characters");
            }
        } catch (UserRegistrationException u) {
            System.out.println(u.getMessage());
        }
        return false;
    }
}
