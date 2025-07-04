package web.test;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Story;
import lombok.val;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import web.pages.Games;

import static com.codeborne.selenide.Condition.text;
import static org.assertj.core.api.Assertions.assertThat;

@Story("[UI] Games")
public class GamesTest extends Second {
/*    @Test
    @Tags({@Tag("games"), @Tag("ui")})
    @DisplayName("Сhecking the number of games on the page")
    void checkNumberOfGames() {
        assertThat(new Games(true).getAllGamesElements().size() == testData.ALL_GAMES_COUNT);
    }*/

    @Test
    @Tags({@Tag("games"), @Tag("ui")})
    @DisplayName("Сhecking open random game")
    void checkRandomGameGames() {
        val randomGame = new Games(true).getRandomGame();
        val name = randomGame.getName();
        randomGame.openDetails().getPageTitleElement().shouldHave(text(name));
    }


}
