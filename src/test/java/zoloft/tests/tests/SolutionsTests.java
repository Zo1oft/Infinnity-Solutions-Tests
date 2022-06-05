package zoloft.tests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import zoloft.tests.helpers.DriverUtils;

import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class SolutionsTests extends TestBase {

    @Test
    @Description("Проверка работы формы обратной связи")
    @DisplayName("Обратная связь")
    void feedbackTest() {
        step("Открываем сайт Infinity Solutions", () -> {
           mainPage.openPage();
        });

        step("Нажимаем на кнопку 'Обратитесь к нам'", () -> {
            mainPage.feedBackFormTransfer();
        });

        step("Проверяем, что форма обратной связи появилась", () -> {
           mainPage.feedbackFormCheck();
        });
    }

    @Test
    @Description("Проверка работы станицы 'Проекты'")
    @DisplayName("Покупателю")
    void projectsPageTest() {
        step("Открываем сайт Infinity Solutions", () -> {
            mainPage.openPage();
        });

        step("Переходим на страницу 'Проекты'", () -> {
            mainPage.projectsPageTransfer();
        });

        step("Проверяем, что мы на верной странице", () -> {
            projectsPage.projectsPageCheck();
        });
    }

    @Test
    @Description("Проверка работы станицы 'InfinniPlatform'")
    @DisplayName("InfinniPlatform")
    void infinniPageTest() {
        step("Открываем сайт Infinity Solutions", () -> {
            mainPage.openPage();
        });

        step("Переходим на страницу 'Проекты' --> InfinniPlatform", () -> {
            mainPage.infinniPageTransfer();
        });

        step("Проверяем, что мы на верной странице", () -> {
            infinniPage.infinniPageCheck();
        });
    }

    @Test
    @Description("Проверка наличия Title на странице")
    @DisplayName("Работоспособность сайта")
    void titleTest() {
        step("Открываем сайт Infinity Solutions", () -> {
            mainPage.openPage();
        });
        step("Проверяем наличие Title", () -> {
            String expectedTitle = "Infinnity Solutions - ideas and technologies";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Проверка наличия ошибок в консоли")
    @DisplayName("Логи консоли страницы не должны содержать ошибок")
    void consoleShouldNotHaveErrorsTest() {
        step("Открываем сайт Infinity Solutions", () -> {
            mainPage.openPage();
        });

        step("Логи в консоле не должны иметь 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}