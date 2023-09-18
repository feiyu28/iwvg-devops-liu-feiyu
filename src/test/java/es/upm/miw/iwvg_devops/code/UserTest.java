package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserTest {

    private User user;

    @BeforeEach
    void before() {
        user = new User("1",
                "Juan",
                "Moreno",
                new ArrayList<>());
    }

    @Test
    void testUserCredentials() {
        assertEquals("1", user.getId());
        assertEquals("Juan", user.getName());
        assertEquals("Moreno", user.getFamilyName());
        assertTrue(user.getFractions().isEmpty());
    }

    @Test
    void testInitials() {
        assertEquals("J.", user.initials());
    }

    @Test
    void testUserFullName() {
        user.setName("Carlos");
        user.setFamilyName("Martin");
        assertEquals("Carlos Martin", user.fullName());
    }

    @Test
    void testFractions() {
        List<Fraction> fractions = new ArrayList<>();
        Fraction half = new Fraction(1, 2);
        Fraction one = new Fraction(3, 3);
        fractions.add(half);
        user.setFractions(fractions);
        user.addFraction(one);
        assertEquals(List.of(half, one), user.getFractions());
    }

}
