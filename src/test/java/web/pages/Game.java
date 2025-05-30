package web.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Game {

    public Game(boolean flag) {
        if (flag) {
            step("Open page: " + Configuration.baseUrl,
                    () -> open("/games"));
        }
    }

    @Step("get Page Title")
    public SelenideElement getPageTitleElement() {
        return $("h1.display");
    }
}
