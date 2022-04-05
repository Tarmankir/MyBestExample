import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
    public static void main(String[]args) {
        Pattern p = Pattern.compile("(\\d+)");
        Matcher m = p.matcher("https://habr.com/ru/all/page8/");
        while(m.find()) {

            System.out.println(m.group());
        }
    }
}