package id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test


class EmailValidationTest {

    @Test fun `gmail domain returns true`() {
        assertTrue(EmailValidation.isValidEmail("name@email.com"))
    }

    @Test fun `ui domain returns true`() {
        assertTrue(EmailValidation.isValidEmail("name@ui.ac.id"))
    }

    @Test fun `no input returns false`() {
        assertFalse(EmailValidation.isValidEmail(""))
    }

    @Test fun `null input returns false`() {
        assertFalse(EmailValidation.isValidEmail(null))
    }

    @Test fun `no domain returns false`() {
        assertFalse(EmailValidation.isValidEmail("email@"))
    }

}
