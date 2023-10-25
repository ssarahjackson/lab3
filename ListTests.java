import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


public class ListTests  {

    @Test
    public void testFilter() {
        StringChecker sc = new ListExampleSC();
        List<String> input = new ArrayList<>();
        input.add("hi");
        input.add("hello");
        input.add("hilltop");
        input.add("yipee");
        List<String> check = ListExamples.filter(input, sc);
        assertArrayEquals(new String[]{"hello", "yipee"}, ListExamples.filter(input, sc).toArray());
    }
    @Test
    public void testFilter2() {
        StringChecker sc = new ListExampleSC();
        List<String> input = new ArrayList<>();
        assertArrayEquals(new String[]{}, ListExamples.filter(input, sc).toArray());
    }
}