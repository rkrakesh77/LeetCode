package techrakesh.easyproblem;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWordInStringTest {
    LengthOfLastWordInString l = new LengthOfLastWordInString();

    @Test
    public void test() {
        Assert.assertEquals(5, l.lengthOfLastWord("hello world"));
    }
    @Test
    public void test1() {
        Assert.assertEquals(2, l.lengthOfLastWord("hello wo"));
    }
}
