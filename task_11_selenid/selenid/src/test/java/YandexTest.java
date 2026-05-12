import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;

public class YandexTest {
    @Test
    public void yandexTest(){
        open("https://yandex.ru");
        //$(By.id("text")).
        new YandexPage().searchFor("ИВТ ЯрГУ");

        SearchResultsPage results = new SearchResultsPage();
        results.getResult(0).shouldHave(text("Факультет информатики и вычислительной техники..."));
    }
}
