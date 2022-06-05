package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProjectsPage {

    //locators
    SelenideElement
            projectsTitle = $(".pageHeader-header");


    //actions
    public void projectsPageCheck() {
        projectsTitle.shouldHave(Condition.text("Проекты"));
    }
}
