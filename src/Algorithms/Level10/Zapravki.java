package Algorithms.Level10;

public class Zapravki {
    public static void main(String[] args) {
        int[] stations = {0, 200, 375, 550, 750, 950, 1350};
        System.out.println(minStops(stations, 400));
    }

    public static int minStops(int[] stations, int capacity) {
        int result = 0; // оптимальное количество остановок
        int currentStop = 0; // текущая остановка

        // пока текущая остановка не является последней
        while (currentStop < stations.length - 1) {
            int nextStop = currentStop;
            // ищем следующую остановку, на которую можно проехать от текущей
            while (nextStop < stations.length - 1 && stations[nextStop + 1] - stations[currentStop] <= capacity)
                nextStop++;

            // если не удалось найти следующую остановку, вернем -1
            if (currentStop == nextStop)
                return -1;

            // если следующая остановка не является последней, увеличим количество остановок на 1
            if (nextStop < stations.length -1)
                result++;

            currentStop = nextStop; // обновим текущую остановку
            System.out.println(currentStop);
        }

        return result; // вернем оптимальное количество остановок
    }

}
