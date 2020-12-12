import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException, AWTException {
       /* Robot r=new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_SHIFT);
        r.keyRelease(KeyEvent.VK_ESCAPE);*/

        List<Integer> res=new ArrayList<>();
        res.add(5);
        res.add(10);
        //res.set(0,8);
        res.set(res.indexOf(5),res.get(res.indexOf(5))+1);
        System.out.println(res.toString());
    }
}
