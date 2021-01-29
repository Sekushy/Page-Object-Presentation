import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Search a product")
    public static void searchForProduct() {
        driver.get(Utils.BASE_URL);
        SearchPage webForm = new SearchPage(driver);
        webForm.populateSearchField();
        webForm.searchItemUsingButton();
    }

    @Test(testName = "Click on a product")
    public static void testClickOnGame() {
        driver.get(Utils.BASE_URL);
        SearchPage webForm = new SearchPage(driver);
        webForm.populateSearchField();
        webForm.searchItemUsingButton();
        SecondPage secondPage = new SecondPage(driver);
        secondPage.clickOnGame();
    }
    @Test(testName = "Search imporper product")
    public static void searchImproperProduct() {
        driver.get(Utils.BASE_URL);
        SearchPage webForm = new SearchPage(driver);
        webForm.searchItemUsingButton();
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
