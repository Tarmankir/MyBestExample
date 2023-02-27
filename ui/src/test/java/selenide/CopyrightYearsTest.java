package selenide;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import selenide.pages.FooterSitePage;
import settings.SelenideDriverSetup;

import static com.codeborne.selenide.Selenide.open;
import static settings.UiConfig.getUiSetting;

public class CopyrightYearsTest extends SelenideDriverSetup {

    @Test
    public void copyrightYearsTest() {
        open(getUiSetting("mainURL"));
        FooterSitePage footerSitePage = Selenide.page(FooterSitePage.class);
        footerSitePage.checkCopyrightYears("© 2006–2023, ");
    }
}