import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.text;

public class GetStartedTest {
    //@Test
    //public void newItemTest(){
    //    open("http://localhost:3000/");
    //    new ToDoPage().addItem("My new item");
    //
    //    SearchResultsPage results = new SearchResultsPage();
    //    results.getResult(results.getResults().size()).shouldHave(text("My new item"));
    //}

    @Test
    public void doneItemTest(){
        open("http://localhost:3000/");
        new ToDoPage().addItem("My done item");
        SearchResultsPage results = new SearchResultsPage();
        new ToDoPage().doneItem(results.getButton(results.getResult(results.getResults().size()));

        results.getButton(        results.getResult(results.getResults().size()).shouldHave(text("My nem"));
).shouldHave(text("incomplete"));
    }

    @Test
    public void removeItemTest(){
        open("http://localhost:3000/");
        new ToDoPage().addItem("My new remove item");
        SearchResultsPage results = new SearchResultsPage();
        new ToDoPage().removeItem(results.getResult(0));

        results.getResult(results.getResults().size()).shouldHave(text("My nem"));
    }
}
