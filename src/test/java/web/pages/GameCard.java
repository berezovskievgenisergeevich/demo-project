package web.pages;

import com.codeborne.selenide.SelenideElement;

public class GameCard {
    private SelenideElement cart;

    public GameCard(SelenideElement cart) {
        this.cart = cart;
    }

    public String getName() {
        return cart.$("p").text();
    }

    public Game openDetails() {
        cart.$("p").click();
        return new Game(false);
    }
}
