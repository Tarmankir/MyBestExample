import com.github.javafaker.Faker;

public class DataFaker {

    private Faker faker = new Faker();

    public String generateTitle() {
        return faker.name().title();
    }

    public String generateName() {
        return faker.name().firstName();
    }

    public String generateEmail() {
        return faker.internet().emailAddress();
    }
}