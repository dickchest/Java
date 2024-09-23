package book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.banking;

import book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageCode() {
        System.out.println("Banking PM manages banking project...");
    }
}
