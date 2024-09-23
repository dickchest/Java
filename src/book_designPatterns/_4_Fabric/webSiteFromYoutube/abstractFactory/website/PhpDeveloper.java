package book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.website;

import book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes php code...");
    }
}
