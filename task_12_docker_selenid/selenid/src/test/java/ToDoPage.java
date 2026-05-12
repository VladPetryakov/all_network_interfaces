import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ToDoPage {
    public void addItem(String text) {
        $(By.tagName("input")).val(text).pressEnter();
    }

    public void doneItem(SelenideElement button) {
        button.click();
    }

    public void removeItem(SelenideElement button) {
        button.click();
    }
}