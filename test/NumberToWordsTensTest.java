import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class NumberToWordsTensTest {


    @Parameters
    public static Collection<Object[]> tensData() {
        return Arrays.asList(new Object[][]{
                {0, ""},
                {1, ""},
                {2, "Twenty"},
                {3, "Thirty"},
                {4, "Forty"},
                {5, "Fifty"},
                {6, "Sixty"},
                {7, "Seventy"},
                {8, "Eighty"},
                {9, "Ninety"}
        });
    }

    private int numberInput;
    private String wordOutput;


    public NumberToWordsTensTest(int numberInput, String wordOutput) {
        this.numberInput = numberInput;
        this.wordOutput = wordOutput;
    }

    @Test
    public void testNumberToWordsUnitsStrings() {
        assertEquals(wordOutput, NumberToWords.tens[numberInput]);
    }

}
