package api.schemes;

import io.qameta.allure.Step;

public class QuickSearchScheme {

    @Step("Check search response body")
    public String CheckQuickSearchBody() {
        String quickSearchScheme = "{\n" +
                "  \"query\": \"Ромашка\"" +
                "\n}";
        return quickSearchScheme;
    }
}