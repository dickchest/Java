package YouTubeChannel.Lesson9_Class;

public class start {
    public static void main(String[] args) {
        Computer apple = new Computer();

        apple.cpu = 2500;
        apple.memory = 1000;
        apple.name = "MacBook 10";
        apple.isCpu();

        Computer deal = apple;
        apple.memory = 1500;
        apple.isMemory();
        deal.isMemory();

        deal.memory = 2500;
        apple.isMemory();

        // --------------
        System.out.println("--------------");

        ComputerIncapsulated apple1 = new ComputerIncapsulated();
//        apple1.setMemory(100);
        apple1.getMemory();

    }
}
