package mobile.settings;

import java.net.MalformedURLException;
import java.net.URL;

public class Urls {

    public URL urlAndroid () throws MalformedURLException {
        URL urlForAndroid = new URL("http://127.0.0.1:4723/wd/hub");
        return urlForAndroid;
    }
}