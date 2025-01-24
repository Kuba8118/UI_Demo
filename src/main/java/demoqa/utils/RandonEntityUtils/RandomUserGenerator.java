package demoqa.utils.RandonEntityUtils;

import com.github.javafaker.Faker;
import demoqa.entity.User;

public class RandomUserGenerator {

    Faker faker = new Faker();

    public String randomFirstname() {
        return faker.name().firstName();
    }

    public String randomLastname() {
        return faker.name().lastName();
    }

    public String randomEmail() {
        return faker.internet().emailAddress();
    }

    public String randomPassword() {
        return faker.internet().password();
    }

    public String randomUserName() {
        return faker.name().username();
    }

    public User randomUser() {
        return new User(randomFirstname(),randomLastname(),randomUserName(),randomEmail(),randomPassword());
    }

}
