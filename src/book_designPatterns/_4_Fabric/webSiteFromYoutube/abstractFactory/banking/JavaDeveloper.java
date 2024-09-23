package book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.banking;

import book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
