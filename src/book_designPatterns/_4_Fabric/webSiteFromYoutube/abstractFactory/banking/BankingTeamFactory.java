package book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.banking;

import book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.Developer;
import book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.ProjectManager;
import book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.ProjectTeamFactory;
import book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
