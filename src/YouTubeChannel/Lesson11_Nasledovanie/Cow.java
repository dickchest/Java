package YouTubeChannel.Lesson11_Nasledovanie;

public class Cow extends Animal {

    public Cow(String say, int teeth) {
        setTeeth(teeth);
        setSay(say);
    }

    // переопределение метода
    public String getSay() {
        String say = super.getSay();
        return say + " 1234";
    }


    void mu() {
        System.out.println(getSay() + " во все " + getTeeth() + " зубы");
    }


}
