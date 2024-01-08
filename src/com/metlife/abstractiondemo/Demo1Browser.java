package com.metlife.abstractiondemo;

interface WebDriver1
{
    public abstract void get(String url);
    String getTitle();
    void quit();
}
class ChromeDriver1 implements WebDriver1
{
    public ChromeDriver1()
    {
        System.out.println("launch chrome browser");
    }
    @Override
    public void get(String url) {
        System.out.println("navigate to url using chrome");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void quit() {
        System.out.println("close chrome browser");
    }
}
class EdgeDriver1 implements WebDriver1
{
public EdgeDriver1()
{
    System.out.println("Launch Edge Browser");
}
    @Override
    public void get(String url) {
        System.out.println("navigate to url using edge");
    }

    @Override
    public String getTitle() {
        return null;
    }


    @Override
    public void quit() {
        System.out.println("close edge browser");
    }
}

class XBrowser implements WebDriver1
{

    @Override
    public void get(String url) {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void quit() {

    }
}
public class Demo1Browser {
    public static void main(String[] args) {

        String browser="ch";
        WebDriver1 driver1=null;

        if(browser.equalsIgnoreCase("edge"))
        {
            driver1=new EdgeDriver1();
        }
        else
        {
            driver1=new ChromeDriver1();
        }


        driver1.get("");
        driver1.quit();
        driver1.getTitle();
    }
}
