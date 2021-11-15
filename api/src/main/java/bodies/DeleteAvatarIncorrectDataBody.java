package bodies;

import io.qameta.allure.Step;
import utils.DataFaker;

public class DeleteAvatarIncorrectDataBody {

    @Step("Create request body with incorrect data for user delete avatar")
    public String deleteAvatarIncorrectDataBody() {

        DataFaker dataFaker = new DataFaker();
        String email = dataFaker.generateEmail();

        String deleteAvatarIncorrectDataBody = "{\n" +
                "  \"email\": " + "\"" + email + "\"" +
                "\n}";
        return deleteAvatarIncorrectDataBody;
    }
}