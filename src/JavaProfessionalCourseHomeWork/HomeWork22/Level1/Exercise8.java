package JavaProfessionalCourseHomeWork.HomeWork22.Level1;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;

/*
8. Напишите программу, которая будет считывать файл (скачайте файл результаты матчей)
- Match(year, month, day, firstTeam, firstTeamCount, secondTeamCount, secondTeam, watchers, stadium)
- Там где значения строки NULL - заведите специальную переменную строку String NULL_VALUE = "NULL";
она должна быть константой
- Там где значения NULL не заполняйте соответствующие поля матчей
- Необходимо создать файл FC Augsburg.txt с результатами матча этой команды
- записать в файл все матчи проходившие на Mercedes-Benz Arena
- записать в файл winners.txt победителя каждого матча, если ничья, то так и писать ничья
9. Задачка со звездочкой - вывести файл table.txt информацию какая команда сколько забила мячей

 */
public class Exercise8 {
    public static void main(String[] args) throws IOException {

        List<MatchResult> matches = Files.lines(Path.of("data","matches.txt"))
                .map(MatchResult::new)
                .collect(Collectors.toList());

        // - Необходимо создать файл FC Augsburg.txt с результатами матча этой команды
        String searchTeamName = "FC Augsburg";
        List<String> augsburgTeam = matches.stream()
                .filter(match -> match.getFirstTeam().equals(searchTeamName) || match.getSecondTeam().equals(searchTeamName))
                .map(v-> v.toStr())
                .collect(Collectors.toList());
        Files.write(Path.of("FC Augsburg.txt"), augsburgTeam, StandardOpenOption.WRITE, StandardOpenOption.CREATE);


        // - записать в файл все матчи проходившие на Mercedes-Benz Arena
        File matchesAtMercedesArena = new File("Mercedes.txt");
        PrintStream mercedesArenaStream = new PrintStream(matchesAtMercedesArena);
        matches.stream()
                .filter(v -> v.getStadium() != null && v.getStadium().equals("Mercedes-Benz Arena"))
                .map(v -> v.toStr())
                .forEach(mercedesArenaStream::println);
        mercedesArenaStream.close();

        // - записать в файл winners.txt победителя каждого матча, если ничья, то так и писать ничья
        List<String> winners = matches.stream()
                .map(MatchResult::getWinner)
                .collect(Collectors.toList());
        Files.write(Path.of("winners.txt"), winners, StandardOpenOption.WRITE, StandardOpenOption.CREATE);

        // вывести файл table.txt информацию какая команда сколько забила мячей
        // метод 1
        Map<String,Integer> teamTableCommon = new HashMap<>();
        teamTableCommon = matches.stream().collect(Collectors.groupingBy(v-> v.getFirstTeam(), Collectors.summingInt(v->v.getFirstTeamCount())));
        Map<String,Integer> teamSecond = matches.stream().collect(Collectors.groupingBy(v-> v.getSecondTeam(), Collectors.summingInt(v->v.getSecondTeamCount())));

        for (Map.Entry<String, Integer> entry : teamTableCommon.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (teamTableCommon.containsKey(key)) {
                value += teamSecond.get(key);
            }
            teamTableCommon.put(key,value);
        }
        System.out.println(teamTableCommon);

        // метод 2.
        Map<String, Integer> map = matches.stream().collect(new MatchCollector());
        System.out.println(map);

        // метод 3
        Map<String, Integer> teamTable = new HashMap<>();

        for (MatchResult result : matches) {
            teamTable.put(result.getFirstTeam(), result.getFirstTeamCount() + teamTable.getOrDefault(result.getFirstTeam(), 0));
//            teamTable.put(result.getSecondTeam(), result.getSecondTeamCount() + teamTable.getOrDefault(result.getSecondTeam(), 0));
            teamTable.put(result.getSecondTeam(), teamTable.computeIfAbsent(result.getSecondTeam(), v-> 0) + result.getSecondTeamCount());

//
//            Map<String, List<Integer>> groupedByName = new HashMap<>();
//            groupedByName.computeIfAbsent(result.getFirstTeam(), v -> new ArrayList<>())
//                    .add(result.getFirstTeamCount());

//            if (teamTable.get(result.getFirstTeam()) == null) {
//                teamTable.put(result.getFirstTeam(), result.getFirstTeamCount());
//            } else {
//                teamTable.put(result.getFirstTeam(), teamTable.get(result.getFirstTeam()) + result.getFirstTeamCount());
//            }
//
//            if (teamTable.get(result.getSecondTeam()) == null) {
//                teamTable.put(result.getSecondTeam(), result.getSecondTeamCount());
//            } else {
//                teamTable.put(result.getSecondTeam(), teamTable.get(result.getSecondTeam()) + result.getSecondTeamCount());
//            }
        }
        System.out.println(teamTable);

        File table = new File("table.txt");
        PrintStream tableStreamOut = new PrintStream(table);
        teamTable.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                .forEach(entry -> tableStreamOut.println(entry.getKey()+" = "+ entry.getValue()));
        tableStreamOut.close();
    }
}
