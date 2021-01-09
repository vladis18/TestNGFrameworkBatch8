package syntax.class01;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pishi\\Downloads\\chromedriver_win32\\chromedriver.exe");
        Webdriver webdriver = new ChromeDriver();

    }
}
