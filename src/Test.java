import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) throws IOException, AWTException {
       /* Robot r=new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_SHIFT);
        r.keyRelease(KeyEvent.VK_ESCAPE);*/
        List<Integer> l=new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);
        int [] a=new int[]{1,2,5,7,8,1};
//        List<Integer> b=Arrays.asList(a);
        System.out.println(Collections.max(Arrays.stream(a).boxed().collect(Collectors.toList())));

    }

}
