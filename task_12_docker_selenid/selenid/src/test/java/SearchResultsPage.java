import org.junit.Test;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
    public ElementsCollection getResults() {
        return $$(".name");
    }
    public SelenideElement getResult(int index) {
        return $(".name", index);
    }

    public ElementsCollection getButtons() {
        return $$(".name");//.find(byAttribute("aria-label", "Mark item as complete"));;
    }
    public SelenideElement getButton(int index) {
        return $(".name", index).parent().find(byAttribute("aria-label", "Mark item as complete"));
    }
}