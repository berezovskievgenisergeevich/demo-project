package web.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class Page {
    @Step("accept cookie")
    public void acceptCookie() {
        $(".cookie button").click();
    }
}
