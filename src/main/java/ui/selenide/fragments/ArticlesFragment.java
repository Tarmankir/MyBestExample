package ui.selenide.fragments;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class ArticlesFragment extends ElementsContainer {

    @FindBy(css = ".tm-articles-list__item")
    private ElementsCollection articlesList;

    @FindBy(css = ".tm-icon-counter__value")
    private SelenideElement articlesViewsCount;

//    public void openRandomArticle() {
//        Random random = new Random();
//        articlesList.get(random.nextInt(articlesList.size())).find(By.cssSelector(".tm-icon-counter__value")).click();
//    }

/*    public void openArticle(String articleName) {
        if (articleName == "random") {
            Random random = new Random();
            articlesList.get(random.nextInt(articlesList.size())).find(By.cssSelector(".tm-icon-counter__value")).click();
        } else {
            articlesList.filter(Condition.text(articleName)).get(0).find(By.cssSelector(".tm-icon-counter__value")).click();
        }
    }*/

    public void openArticle(int articleIndex) {
            articlesList.get(articleIndex).find(By.cssSelector(".tm-icon-counter__value")).click();
        }

    public int getArticleCount() {
        return articlesList.size();
    }

    public void checkCommentsCounter(String count) {
        articlesViewsCount.shouldHave(Condition.text(String.valueOf(count)));
        assertEquals(articlesViewsCount.getText(), count, "Counter are not equal");
    }
}