import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest {

@Test
public void deletePlaylist() throws InterruptedException {
login("guyvanalex4@gmail.com", "teststudent!1");
playlist();
verifyPlaylistDeleted();
Thread.sleep(2000);
}

public void playlist() throws InterruptedException {
    WebElement myPlaylist = driver.findElement(By.cssSelector("#playlists > ul > li:nth-child(3) > a"));
    myPlaylist.click();
    Thread.sleep(2000);
    WebElement delete = driver.findElement(By.xpath("//*[@id=\"playlistWrapper\"]/header/div[3]/span/button"));
    delete.click();
}
public void verifyPlaylistDeleted() {
    WebElement imageDisplayed = driver.findElement(By.cssSelector("div[class='success show"));
    Assert.assertTrue(imageDisplayed.isDisplayed());
}
}