package web.test;

import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import web.pages.Home;

import static com.codeborne.selenide.Condition.text;
@Story("[UI] Home")
public class HomeTest extends BaseTest {

    @Test
    @Tags({@Tag("home"), @Tag("ui")})
    @DisplayName("Checking title text on Home page")
    void checkHomePageTitle() {
        new Home().getPageTitleElement().shouldHave(text("Innovative Casino Games"));
    }

    @Test
    @Tags({@Tag("home"), @Tag("ui")})
    @DisplayName("Checking click to 'Explore Our Games' button")
    void checkExploreOurGamesButton() {
        new Home().clickToExploreOurGames()
                .getPageTitleElement().shouldHave(text("Our Games"));
    }

    @Test
    @Tags({@Tag("home"), @Tag("ui")})
    @DisplayName("Checking click to 'More' button In 'Provably Fair' section")
    void checkContactUsButton() {
        new Home().clickToMoreInProvablyFair().getPageTitleElement().shouldHave(text("Provably Fair"));
    }

    @Test
    @Tags({@Tag("home"), @Tag("ui")})
    @DisplayName("Checking click to 'Discover Virtual Appraisals' button")
    void checkDiscoverVirtualAppraisalsButton() {
        new Home().clickToContactUs()
                .getPageTitleElement().shouldHave(text("Contact Us"));
    }


}
