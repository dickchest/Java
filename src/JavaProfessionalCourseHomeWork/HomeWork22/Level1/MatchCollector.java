package JavaProfessionalCourseHomeWork.HomeWork22.Level1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MatchCollector implements Collector<MatchResult, Map<String, Integer>, Map<String, Integer>> {
    @Override
    public Supplier<Map<String, Integer>> supplier() {
        return HashMap::new;
    }

    @Override
    public BiConsumer<Map<String, Integer>, MatchResult> accumulator() {
       return (team, result) -> {
            if (team.get(result.getFirstTeam()) == null) {
                team.put(result.getFirstTeam(), result.getFirstTeamCount());
            } else {
                team.put(result.getFirstTeam(), team.get(result.getFirstTeam()) + result.getFirstTeamCount());
            }

           if (team.get(result.getSecondTeam()) == null) {
               team.put(result.getSecondTeam(), result.getSecondTeamCount());
           } else {
               team.put(result.getSecondTeam(), team.get(result.getSecondTeam()) + result.getSecondTeamCount());
           }

        };
    }

    @Override
    public BinaryOperator<Map<String, Integer>> combiner() {
        return (map1, map2) -> {
            map1.putAll(map2);
            return map1;
        };
    }

    @Override
    public Function<Map<String, Integer>, Map<String, Integer>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.UNORDERED);
    }
}
