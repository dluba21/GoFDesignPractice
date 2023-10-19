package patterns.structuralPatterns.proxy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WebProxy implements Web {
    final Web web = new WebReal(); //<-- reference to real object (pattern requirement)
    final static Set<String> prohibitedSites = new HashSet<>(
            Arrays.asList(
                    "http://aboba.com",
                    "http://kek.com",
                    "http://lol.com"
            )
    );
    @Override
    public void getWebsiteByQuery(final String link) {
        if (prohibitedSites.contains(link)) {
            System.out.println("Access to website " + link + " is prohibited!"); //<-- protection control real object
            return ;
        }
        web.getWebsiteByQuery(link); //<-- calling method of real object (pattern requirement)
    }
}
