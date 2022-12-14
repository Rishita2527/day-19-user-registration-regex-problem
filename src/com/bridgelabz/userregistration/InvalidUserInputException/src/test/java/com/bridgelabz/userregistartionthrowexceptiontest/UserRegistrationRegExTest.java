package com.bridgelabz.userregistartionthrowexceptiontest;

import com.bridgelabz.userregistrationthrowexception.InvalidUserInputException;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationRegExTest {
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        try {
            boolean result = userRegistrationRegEx.firstNameValidate("Rishita");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        try {
            boolean result = userRegistrationRegEx.firstNameValidate("R");
            Assert.assertFalse(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        try {
            boolean result = userRegistrationRegEx.lastNameValidate("Prakash");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        try {
            boolean result = userRegistrationRegEx.lastNameValidate("cns");
            Assert.assertFalse(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }


    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        try {
            boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        try {
            boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
            Assert.assertFalse(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        try {
            boolean result = userRegistrationRegEx.phoneNumberValidate("91 9863632323");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        try {
            boolean result = userRegistrationRegEx.phoneNumberValidate("9198323723");
            Assert.assertFalse(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        try {
            boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        try {
            boolean result = userRegistrationRegEx.passwordValidate("Jhjsh23#%");
            Assert.assertFalse(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }
}