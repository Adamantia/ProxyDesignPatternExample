package main;

import java.util.Scanner;

public class ProxyExampleLauncher {

    public static void main(String[] args) {
        WebBrowserProxy webProxy = new WebBrowserProxy();
        Scanner userInput = new Scanner(System.in);
        String url;
        do {
            System.out.println("Welke website url wilt u bezoeken? Typ 'exit' om te stoppen");
            url = userInput.next();
            try {
                webProxy.goToWebsite(url);
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        } while (!url.equals("exit"));
    }
}
