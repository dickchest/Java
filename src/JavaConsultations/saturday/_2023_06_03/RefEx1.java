package JavaConsultations.saturday._2023_06_03;
// Reflection
/*
позволяет исследовать, получать информацию о классах, его конструкторах, полях, методах из какого конкретного класса,
несмотря на то, что методы и поля могут быть приватными

Применяется во многих фреймворках, например Спринг.
отвечает класс Class


 */
public class RefEx1 {
    public int a; // любая область программы

    protected int b; // на уровне наследников

    int c; // на уровне пакета

    private int d; // из этого класса


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }


}
