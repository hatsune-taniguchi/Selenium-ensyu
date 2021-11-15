package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRensyu {
	
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
			WebDriver driver = new ChromeDriver();// ChromeDriver�̍쐬
			driver.get("https://www.yahoo.co.jp/"); // get()�Ńu���E�U�N��
			Thread.sleep(5000);// �������~(����m�F�̈�)
			// �u���E�U�̗v�f���w�� ���\�b�h�����킩��₷���ł���ˁB
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("bump");
			searchBox.submit();
			Thread.sleep(5000);
			driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
//	@Test //junit��gladle�����Ďg����悤�ɂ���
//	void test1() {


}

