import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class NumberToWordsLargeNumberNameTest {


    @Parameters
    public static Collection<Object[]> largeNumberNameData() {
        return Arrays.asList(new Object[][]{
                {0, ""},
                {1, ""},
                {2, "Hundred"},
                {3, "Thousand"},
                {4, ""},
                {5, ""},
                {6, "Million"},
                {7, ""},
                {8, ""},
                {9, "Billion"}
        });
    }

    private int numberInput;
    private String wordOutput;


    public NumberToWordsLargeNumberNameTest(int numberInput, String wordOutput) {
        this.numberInput = numberInput;
        this.wordOutput = wordOutput;
    }

    @Test
    public void testNumberToWordsUnitsStrings() {
        assertEquals(wordOutput, NumberToWords.largeNumberName[numberInput]);
    }

}
