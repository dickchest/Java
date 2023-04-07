package JavaProfessionalCourse.Lesson22_Input_Output;

public class MatchResult {
    String firstTeam;
    String secondTeam;
    int firstTeamCount;
    int secondTeamCount;

    public MatchResult(String input) {
        String[] columns = input.split(" ");
        firstTeam = columns[0];
        secondTeam = columns[1];
        String[] twoIns = columns[2].split("-");
        firstTeamCount = Integer.parseInt(twoIns[0]);
        secondTeamCount = Integer.parseInt(twoIns[1]);
    }

    public String getWinner() {
        if (firstTeamCount > secondTeamCount) {
            return firstTeam;
        } else if (firstTeamCount < secondTeamCount) {
            return secondTeam;
        }
        return "ничья";
    }

    @Override
    public String toString() {
        return "MatchResult{" +
                "firstTeam='" + firstTeam + '\'' +
                ", secondTeam='" + secondTeam + '\'' +
                ", firstTeamCount=" + firstTeamCount +
                ", secondTeamCount=" + secondTeamCount +
                '}';
    }
}
