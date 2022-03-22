import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
    public static void main(String[]args) {
        Pattern p = Pattern.compile("(\\d+)");
        Matcher m = p.matcher("№ 2022220300073643 (ИВАНОВ АВТОТЕСТ ИВАНОВИЧ)");
        while(m.find()) {

            System.out.println(m.group());
        }
    }
}