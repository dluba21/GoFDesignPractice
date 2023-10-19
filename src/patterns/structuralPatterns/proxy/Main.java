package patterns.structuralPatterns.proxy;

public class Main {
    public static void main(String[] args) {
        Web web = new WebProxy();

        final String prohibitedLink1 = "http://aboba.com";
        final String prohibitedLink2 = "http://kek.com";
        final String allowedLink1 = "https://wiki.ru";
        final String allowedLink2 = "https://geeksforgeeks.ru";

        web.getWebsiteByQuery(prohibitedLink1);
        web.getWebsiteByQuery(prohibitedLink2);
        web.getWebsiteByQuery(allowedLink1);
        web.getWebsiteByQuery(allowedLink2);
    }
}
