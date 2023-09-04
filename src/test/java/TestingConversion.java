import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingConversion {
    @Test
    void romanNumeralTest (){
        RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();
        assertEquals(romanNumeralConverter.IntToNumeral(4), "IV");
        assertEquals(romanNumeralConverter.IntToNumeral(252), "CCLII");
        assertEquals(romanNumeralConverter.IntToNumeral(873), "DCCCLXXIII");
        assertEquals(romanNumeralConverter.IntToNumeral(6), "VI");

        assertEquals(romanNumeralConverter.romanToInt("IX"), 9);
        assertEquals(romanNumeralConverter.romanToInt("CCLII"), 252);
        assertEquals(romanNumeralConverter.romanToInt("XII"), 12);
        assertEquals(romanNumeralConverter.romanToInt("DCCCLXXIII"), 873);
    }
}
