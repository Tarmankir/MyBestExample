package selenium.enums;

public enum Credentials {

    TEST("ivakidov@ro.ru", "School593");

    public String login;
    public String pass;

    Credentials (String login, String pass) {
        this.login = login;
        this.pass = pass;
    }
}