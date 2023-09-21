package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    @Test
    void testFindDecimalFractionByNegativeSignFraction() {
        assertEquals(List.of(-0.2, -0.5, -0.0),
                new Searches().findDecimalFractionByNegativeSignFraction().collect(Collectors.toList()));
    }

    @Test
    void testFindUserNameBySomeImproperFraction() {
        assertEquals(List.of("Oscar", "Ana", "Oscar", "Antonio", "Paula"),
                new Searches().findUserNameBySomeImproperFraction().collect(Collectors.toList()));
    }

    @Test
    void testFindHighestFraction() {
        Fraction fraction = new Searches().findHighestFraction();
        assertEquals(2, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }
}
