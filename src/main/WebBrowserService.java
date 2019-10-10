package main;

public class WebBrowserService implements WebBrowser {

    @Override
    public void goToWebsite(String url) throws Exception {
        System.out.println("Access granted");
    }
}
