package book_designPatterns._4_Fabric.webSiteFromYoutube.abstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
