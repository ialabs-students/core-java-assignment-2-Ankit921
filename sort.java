
    
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Sort list in reverse order in Java
public class sort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 4, 2, 6, 5, 8);

        Collections.sort(list);
        Collections.reverse(list);

        System.out.println(list);
    }
}

