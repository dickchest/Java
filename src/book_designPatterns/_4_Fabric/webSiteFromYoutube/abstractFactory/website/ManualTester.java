package book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.website;

import book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.Tester;

public class ManualTester implements Tester {

    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
