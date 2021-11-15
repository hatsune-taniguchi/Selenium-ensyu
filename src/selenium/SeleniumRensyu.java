package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRensyu {
	
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
			WebDriver driver = new ChromeDriver();// ChromeDriverの作成
			driver.get("https://www.yahoo.co.jp/"); // get()でブラウザ起動
			Thread.sleep(5000);// 処理を停止(動作確認の為)
			// ブラウザの要素を指定 メソッド名がわかりやすいですよね。
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("bump");
			searchBox.submit();
			Thread.sleep(5000);
			driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
//	@Test //junitかgladleを入れて使えるようにする
//	void test1() {


}

