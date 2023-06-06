package test.test5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EnterEmailTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("Positive test: Valid email addresses")
    void testValidateEmail_ValidEmail() {
        String[] validExample = {
                "test@example.com",
                "john.doe@gmail.com",
                "jane123@hotmail.com",
                "info@domain.co.uk",
                "admin@123.net"
        };

        for (String email : validExample) {
            assertDoesNotThrow(() -> {
                EnterEmail.validateEmail(email);
                String message = String.format("[PASS] Email is valid: %s - %s", email, LocalDateTime.now());
                System.out.println(message);
            });
        }
    }

    @Test
    @DisplayName("Negative test: Invalid email addresses")
    void testValidateEmail_InvalidEmail() {
        String[] invalidEmails = {
                "test",  // Missing @ symbol
                "john.doe@gmail",  // Missing domain
                "jane123@.com",  // Missing domain
                "info@domain", // Missing top-level domain
                "admin@123.456"  // Invalid top-level domain
        };

        for (String email : invalidEmails) {
            assertThrows(EmailValidationException.class, () -> {
                EnterEmail.validateEmail(email);
                String message = String.format("[FAIL] Invalid email passed validation: %s - %s", email, LocalDateTime.now());
                System.out.println(message);
            });
        }
    }
}