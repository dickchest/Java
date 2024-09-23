package book_designPatterns._4_Fabric.webSiteFromYoutube.factoryMethod;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
