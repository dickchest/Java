package JavaProfessionalCourseHomeWork.HomeWork22.Level1;

public class MatchResult {
    private int year;
    private int month;
    private int day;
    private String firstTeam;
    private int firstTeamCount;
    private int secondTeamCount;
    private String secondTeam;
    private int watchers;
    private String stadium;
    private static final String NULL_VALLUE = "NULL";

    public MatchResult(String s) {
        String[] columns = s.split(", ");
        year = Integer.parseInt(columns[0]);
        month = Integer.parseInt(columns[1]);
        day = Integer.parseInt(columns[2]);
        firstTeam = columns[3];
        secondTeam = columns[5];
        String[] score = columns[4].split(":");
        firstTeamCount = Integer.parseInt(score[0]);
        secondTeamCount = Integer.parseInt(score[1]);
        if (!columns[6].equals(NULL_VALLUE)) {
            watchers = Integer.parseInt(columns[6]);
        }
        if (!columns[7].equals(NULL_VALLUE)) {
            stadium = columns[7];
        }
    }

    public String isNull(String s) {
        return !s.equals(NULL_VALLUE) ? s : "";
    }

    public String getWinner() {
        if (firstTeamCount > secondTeamCount) {
            return firstTeam;
        } else if (firstTeamCount < secondTeamCount) {
            return secondTeam;
        }
        return "ничья";
    }

   public String getFirstTeam() {
      return firstTeam;
   }

   public int getSecondTeamCount() {
      return secondTeamCount;
   }

   public int getFirstTeamCount() {
        return firstTeamCount;
    }

    public String getSecondTeam() {
        return secondTeam;
    }

    public String getStadium() {
        return stadium;
    }

    @Override
    public String toString() {
        return "MatchResult{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", firstTeam='" + firstTeam + '\'' +
                ", firstTeamCount=" + firstTeamCount +
                ", secondTeamCount=" + secondTeamCount +
                ", secondTeam='" + secondTeam + '\'' +
                ", watchers=" + watchers +
                ", stadium='" + stadium + '\'' +
                '}';
    }

    public String toStr() {
        return year +
                ", " + month +
                ", " + day +
                ", " + firstTeam +
                ", " + firstTeamCount +
                ", " + secondTeamCount +
                ", " + secondTeam +
                ", " + watchers +
                ", " + stadium;
    }
}
