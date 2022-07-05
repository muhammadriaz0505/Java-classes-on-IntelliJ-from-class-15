package com.syntax.class25;



public class Homework {
}
interface WebDriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open the browser in  Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close the browser ");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the window");
    }

    @Override
    public void findElement() {
        System.out.println("Find the element");
    }
}
class FireFoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open the programme in Firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close the Firefox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the Firefox browser window");
    }

    @Override
    public void findElement() {
        System.out.println("Find element in Firefox widow");

    }

    public static void main(String[] args) {

    }
}
