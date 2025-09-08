package tests;

import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class FirstTests extends BaseUITest {
    public final String BASE_URL = "https://shipnext.com/";

    @Test
    public void firstTest() {
        page.navigate(BASE_URL);
        System.out.println(page.title());
        assertThat(page).hasURL(BASE_URL);
    }//new
}
