package lb7;
public class Main {
    public static void main(String[] args) {
        School mySchool = new School((5555), Season.AUTUMN);
        System.out.println("Number of students: " + mySchool.getNumberOfStudents());
        System.out.println("Current season: " + mySchool.getCurrentSeason());
    }
    enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }
    public static class School {
        private int numberOfStudents;
        private Season currentSeason;

        public School(int numberOfStudents, Season currentSeason) {
            this.numberOfStudents = numberOfStudents;
            this.currentSeason = currentSeason;
        }

        public int getNumberOfStudents() {
            return numberOfStudents;
        }

        public Season getCurrentSeason() {
            return currentSeason;
        }

        public void setNumberOfStudents(int numberOfStudents) {
            this.numberOfStudents = numberOfStudents;
        }

        public void setCurrentSeason(Season currentSeason) {
            this.currentSeason = currentSeason;
        }



    }
}
