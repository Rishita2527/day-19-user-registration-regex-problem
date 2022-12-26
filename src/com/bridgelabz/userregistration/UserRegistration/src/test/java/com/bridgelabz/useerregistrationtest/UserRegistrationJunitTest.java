package com.bridgelabz.useerregistrationtest;
import com.bridgelabz.userregistration.UserRegistrationJunit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationJunitTest {

     //Performing test cases for first name, last name, Email-id, phoneNumber & Password.
        @Test
        public void givenFirstName_whenProper_ShouldReturnTrue() {
            UserRegistrationJunit userRegistrationJunit = new UserRegistrationJunit();
            boolean result = userRegistrationJunit.firstNameValidate("Rishita");
            Assertions.assertTrue(result);
        }
        @Test
        public void givenFirstName_whenNotProper_ShouldReturnFalse() {
            UserRegistrationJunit userRegistrationJunit = new UserRegistrationJunit();
            boolean result = userRegistrationJunit.firstNameValidate("R");
            Assertions.assertFalse(result);
        }
        @Test
        public void givenLastName_whenProper_ShouldReturnTrue() {
            UserRegistrationJunit userRegistrationJunit = new UserRegistrationJunit();
            boolean result = userRegistrationJunit.lastNameValidate("Prakash");
            Assertions.assertTrue(result);
        }
        @Test
        public void givenLastName_whenNotProper_ShouldReturnFalse() {
            UserRegistrationJunit userRegistrationJunit = new UserRegistrationJunit();
            boolean result = userRegistrationJunit.lastNameValidate("pra");
            Assertions.assertFalse(result);
        }
        @Test
        public void givenEmail_whenProper_ShouldReturnTrue() {
            UserRegistrationJunit userRegistrationJunit = new UserRegistrationJunit();
            boolean result = userRegistrationJunit.emailValidate("abc.def@bl.co.in");
            Assertions.assertTrue(result);
        }
        @Test
        public void givenEmail_whenNotProper_ShouldReturnFalse() {
            UserRegistrationJunit userRegistrationJunit = new UserRegistrationJunit();
            boolean result = userRegistrationJunit.emailValidate("abc.def@bl.in");
            Assertions.assertFalse(result);
        }
        @Test
        public void givenPhone_whenProper_ShouldReturnTrue() {
            UserRegistrationJunit userRegistrationJunit = new UserRegistrationJunit();
            boolean result = userRegistrationJunit.phoneNumberValidate("91 9863632323");
            Assertions.assertTrue(result);
        }
        @Test
        public void givenPhone_whenNotProper_ShouldReturnFalse() {
            UserRegistrationJunit userRegistrationJunit = new UserRegistrationJunit();
            boolean result = userRegistrationJunit.phoneNumberValidate("9197657467");
            Assertions.assertFalse(result);
        }
        @Test
        public void givenPassword_whenProper_ShouldReturnTrue() {
            UserRegistrationJunit userRegistrationJunit = new UserRegistrationJunit();
            boolean result = userRegistrationJunit.passwordValidate("Xyz1234578#");
            Assertions.assertTrue(result);
        }
        @Test
        public void givenPassword_whenNotProper_ShouldReturnFalse() {
            UserRegistrationJunit userRegistrationJunit = new UserRegistrationJunit();
            boolean result = userRegistrationJunit.passwordValidate("hjhj124#%");
            Assertions.assertFalse(result);
        }
}
