package bodies;

import io.qameta.allure.Step;

public class QuickSearchBody {

    @Step("Create request body for search")
    public String quickSearchBody() {
        String quickSearchBody = "{\n" +
                "  \"query\": \"Ромашка\"" +
                "\n}";
        return quickSearchBody;
    }
}