package patterns.structuralPatterns.proxy;

public class WebReal implements Web {
    @Override
    public void getWebsiteByQuery(final String link) {
        System.out.println("Query to website " + link + " is completed!");
    }
}
