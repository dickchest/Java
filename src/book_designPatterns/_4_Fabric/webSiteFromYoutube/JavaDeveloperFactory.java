package book_designPatterns._4_Fabric.webSiteFromYoutube;

import book_designPatterns._4_Fabric.webSiteFromYoutube.factoryMethod.Developer;
import book_designPatterns._4_Fabric.webSiteFromYoutube.factoryMethod.DeveloperFactory;
import book_designPatterns._4_Fabric.webSiteFromYoutube.factoryMethod.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
