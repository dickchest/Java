package book_designPatterns._4_Fabric.webSiteFromYoutube.factoryMethod;

import book_designPatterns._4_Fabric.webSiteFromYoutube.JavaDeveloperFactory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

        developerFactory = createDeveloperFactoryBySpeciality("c++");
        developer = developerFactory.createDeveloper();
        developer.writeCode();

        developerFactory = createDeveloperFactoryBySpeciality("php");
        developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactoryBySpeciality(String speciality) {
        if (speciality.equals("java"))
            return new JavaDeveloperFactory();
        else if (speciality.equals("c++"))
            return new CppDeveloperFactory();
        else if (speciality.equals("php"))
            return new PhpDeveloperFactory();
        else
            throw new RuntimeException(speciality + " is unknown speciality.");

    }
}
