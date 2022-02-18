
import static org.junit.Assert.assertEquals;

import challenge1.Challenge1;
import challenge2.Challenge2;
import challenge3.Challenge3;
import org.junit.Test;

public class ChallengeTestUnitario {

    Challenge1 challenge1 = new Challenge1();
    Challenge2 challenge2 = new Challenge2();
    Challenge3 challenge3 = new Challenge3();

    String string = "ifailuhkqq";
    String password = "Dark.das@23";



    @Test
    public void testSuccessCreateLadder() {
        String resultExpected = challenge1.createTestUnitario(6);
        String result = challenge1.createLadder(6);
        assertEquals(resultExpected, result);
    }

    @Test
    public void testSuccessGetAnagram() {
        Integer resultExpected = 3;
        Integer result = challenge3.anagrams(string);
        assertEquals(resultExpected, result);
    }

    @Test
    public void testSuccessPassword() {
        String resultExpected = "successfully registered";
        challenge2.ValidatePassword(password);
        assertEquals(resultExpected, challenge2.msgSucess);
    }


}
