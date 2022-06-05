package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class InfinniPage {

    //locators
    SelenideElement
            InfinniTitle = $(".pageHeader-header");


    //actions
    public void infinniPageCheck() {
        InfinniTitle.shouldHave(Condition.text("InfinniPlatform"));
    }
}
