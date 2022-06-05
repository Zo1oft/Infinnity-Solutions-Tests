package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    //locators
    SelenideElement
            feedbackButton = $$("button[type=button]").findBy(Condition.text("Обратитесь к нам")),
            feedBackHeader = $(".modal-feedback-header"),
            projectsPageButton = $$(".menu-item-a").findBy(Condition.text("Проекты")),
            productsPageButton = $$(".menu-item-a").findBy(Condition.text("Продукты и услуги")),
            infinniPageButton = $$(".menu-dropdown-item").findBy(Condition.text("InfinniPlatform"));

    //actions
    public MainPage openPage() {
        open("https://www.infinnity.ru/");
        return this;
    }

    public void feedBackFormTransfer() {
        feedbackButton.click();
    }

    public void feedbackFormCheck() {
       feedBackHeader.shouldHave(Condition.text("Оставьте Ваши координаты для связи"));
    }

    public void projectsPageTransfer() {
       projectsPageButton.click();
    }
    public void infinniPageTransfer() {
       productsPageButton.click();
       infinniPageButton.click();
    }
}
