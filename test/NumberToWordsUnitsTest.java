import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class NumberToWordsUnitsTest {


    @Parameters
    public static Collection<Object[]> unitsData(){
        return Arrays.asList(new Object[][] {
                { 0, ""}, { 1, "One"}, { 2, "Two" }, { 3, "Three" }, { 4, "Four" }, { 5, "Five" }, { 6, "Six" },
                { 7, "Seven" }, { 8, "Eight"}, { 9, "Nine"}, { 10, "Ten"}, { 11, "Eleven"},
                { 12, "Twelve"}, { 13, "Thirteen"}, {14, "Fourteen"}, { 15, "Fifteen"},
                { 16, "Sixteen"}, { 17, "Seventeen"}, { 18, "Eighteen"}, { 19, "Nineteen"}
        });
    }

    private int numberInput;
    private String wordOutput;


    public NumberToWordsUnitsTest(int numberInput, String wordOutput){
        this.numberInput = numberInput;
        this.wordOutput = wordOutput;
    }

    @Test
    public void testNumberToWordsUnitsStrings(){
        assertEquals(wordOutput, NumberToWords.units[numberInput]);
    }

}
