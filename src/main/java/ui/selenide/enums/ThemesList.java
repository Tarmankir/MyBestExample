package ui.selenide.enums;

public enum ThemesList {

    GENERAL_QUESTIONS (0, "Общие вопросы"),
    SITE_ERRORS (1, "Ошибка в работе сайта"),
    VULNERABILITY_ON_THE_SITE (2, "Уязвимость на сайте"),
    VIOLATION_OF_SITE_RULES (3, "Нарушение правил сайта"),
    ACCOUNT_BLOCKING (4, "Блокировка аккаунта"),
    CHANGE_OF_DATA (5, "Смена данных (имя пользователя или email)"),
    ACCOUNT_DELETING (6, "Удаление аккаунта"),
    GREAT_IDEA (7, "Гениальная идея"),
    COOPERATION_OFFER (8, "Предложение сотрудничества");

    public int index;
    public String themeName;

    ThemesList(int index, String themeName) {
        this.index = index;
        this.themeName = themeName;
    }

    public String getTheme() {
        return themeName;
    }

    public static ThemesList getThemeByIndex(String themeName) {
        for (ThemesList env : values()) {
            if (env.getTheme().equals(themeName)) {
                return env;
            }
        }
        throw new IllegalArgumentException("No enum found with: [" + themeName + "]");
    }

    public static ThemesList getThemeByName(String themeName) {
        for (ThemesList env : values()) {
            if (env.getTheme().equals(themeName)) {
                return env;
            }
        }
        throw new IllegalArgumentException("No enum found with: [" + themeName + "]");
    }
}