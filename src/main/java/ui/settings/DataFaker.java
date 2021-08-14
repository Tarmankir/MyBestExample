package ui.settings;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataFaker {

    private Faker faker = new Faker(new Locale("ru"));

    public String generateTitle() {
        return faker.name().title();
    }
}