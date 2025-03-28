// Application code
import com.shared.utils.StringUtil;

public class MyApp {
    public static void main(String[] args) {
        String str = "Hello, world!";
        if (StringUtil.isEmpty(str)) {
            System.out.println("String is empty.");
        } else {
            System.out.println("String is not empty.");
        }
    }
}

