package book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.banking;

import book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.Tester;

public class QATester implements Tester {

    @Override
    public void testCode() {
        System.out.println("QA Tester tests banking code...");
    }
}
