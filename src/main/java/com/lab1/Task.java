import java.util.ArrayList;
import java.util.List;

class Task {
    public static void main(String[] args) {
        // Basic Level Task
        // Create a Display object
        Display firstDisplay = new Display("black", "28inch", "1080x1920");
        System.out.println(firstDisplay);

        // Update the properties of the Display object
        firstDisplay.color = "white";
        firstDisplay.diagonal = "35inch";
        firstDisplay.resolution = "3440x1440";
        System.out.println(firstDisplay);

        // Create a second display object
        Display secondDisplay = new Display("red", "27inch", "4096×2160");
        // Comparing the properties of these 2 Display Objects
        System.out.println("firstDisplay " + firstDisplay);
        System.out.println("secondDisplay " + secondDisplay);



        // Advanced Level Task 1
        System.out.println("\n+--- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---+\n");
        University university = new University("UTM", 1964);
        university.students.add(new Student("Cauș Ion", 21, 9.75));
        university.students.add(new Student("Roșu Alexandru", 20, 9.5));
        university.students.add(new Student("Popa Cătălin", 19, 10.0));
        System.out.println(university.name + " has the following students " + university.students);



        // Advanced Level Task 2
        System.out.println("\n+--- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---- ---+\n");
        List<University> universities = new ArrayList<University>();
        for(int i = 0; i < 3; ++i) {
            universities.add(new University("Random University " + i, 1900 + i));
        }

        // adding some new random students to these universities
        int[][] age = {
            { 21, 22, 23 },
            { 25, 19, 20 },
            { 30, 24, 26 }
        };

        double[][] finalMarks = {
            { 5.0, 5.55, 9 },
            { 10,  9.75, 6 },
            { 8, 9.20, 7.40}
        };

        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                universities.get(i).students.add(new Student("Random Student " + i + j, age[i][j], finalMarks[i][j]));
            }
        }

        // Computing the average grade for the students from each university
        for(int i = 0; i < 3; ++i) {
            double average_grade = 0;
            for(int j = 0; j < 3; ++j) {
                average_grade += universities.get(i).students.get(j).finalMark;
            }
            average_grade /= universities.get(i).students.size();
            System.out.println(universities.get(i).name + " has students with average grade = " + average_grade);
        }
    }
}
