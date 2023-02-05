package YouTubeChannel.Lesson9_Class;

public class ComputerIncapsulated {
    private int memory;
    private int cpu;
    private String name;

    // конструктор класса = базового метода, который выполняется при создании экземпляра класса
    ComputerIncapsulated() {};

    ComputerIncapsulated(int memory, int cpu, String name) {
        this.memory = memory;
        this.cpu = cpu;
        this.name = name;

    }

    void setMemory (int m) {
        memory = m;
    }

    void getMemory () {
        System.out.println(memory);
    }

    void getCpu() {
        System.out.println(cpu);
    }
}
