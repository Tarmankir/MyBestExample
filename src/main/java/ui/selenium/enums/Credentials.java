package ui.selenium.enums;

public enum Credentials {

    TEST1("ivakidov@mail.ru", "School593");

    public String login;
    public String pass;

    Credentials (String login, String pass) {
        this.login = login;
        this.pass = pass;
    }
}