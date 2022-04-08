package common;

import io.qameta.allure.Step;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataConverter {

    @Step("Separate number in string")
    public static String separateNumberInString(String string) {
        String pageNumber = "";
        Pattern p = Pattern.compile("(\\d+)");
        Matcher m = p.matcher(string);
        while(m.find()) {
            pageNumber = m.group();
        }
        return pageNumber;
    }
}