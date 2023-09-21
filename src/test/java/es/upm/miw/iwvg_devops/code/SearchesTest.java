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
}
