package book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.website;

import book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageCode() {
        System.out.println("Website PM manages website project...");
    }
}
