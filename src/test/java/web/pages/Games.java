package web.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import helpers.RandomGenerator;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class Games extends Page{

    public Games(boolean flag) {
        if (flag) {
            step("Open page: " + Configuration.baseUrl,
                    () -> open("/games"));
            acceptCookie();
        }

    }


    @Step("get Page Title")
    public SelenideElement getPageTitleElement() {
        return $("h1.display");
    }


    @Step("get all games elements")
    public ElementsCollection getAllGamesElements() {
        return $$("app-game-card");
    }

    public GameCard getRandomGame() {
        int max = getAllGamesElements().size();
        int random = RandomGenerator.getRandomNumber(0, max);
        return new GameCard(getAllGamesElements().get(random));
    }
}
