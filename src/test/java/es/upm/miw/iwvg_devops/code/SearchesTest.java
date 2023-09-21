package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    private Searches search;

    @BeforeEach
    void before() {
        search = new Searches();
    }

    @Test
    void testFindDecimalFractionByNegativeSignFraction() {
        Object[] found = search.findDecimalFractionByNegativeSignFraction().toArray();
        assertEquals(3, found.length);
        assertEquals(-0.2, found[0]);
        assertEquals(-0.5, found[1]);
        assertEquals(-0.0, found[2]);
    }

    @Test
    void testFindUserNameBySomeImproperFraction() {
        Object[] found = search.findUserNameBySomeImproperFraction().toArray();
        assertEquals(5, found.length);
        assertEquals("Oscar", found[0]);
        assertEquals("Ana", found[1]);
        assertEquals("Oscar", found[2]);
        assertEquals("Antonio", found[3]);
        assertEquals("Paula", found[4]);
    }
}
