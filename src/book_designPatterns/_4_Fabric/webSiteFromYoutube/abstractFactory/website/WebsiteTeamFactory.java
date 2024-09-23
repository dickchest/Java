package book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.website;

import book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.Developer;
import book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.ProjectManager;
import book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.ProjectTeamFactory;
import book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
