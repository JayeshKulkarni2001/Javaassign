public class Gradecalc {
        public static void main(String[] args) {
            int totalStudents = 90;
            @SuppressWarnings("unused")
            int boys = 45;
            int gradeAStudents = totalStudents / 2;
            int gradeABoys = 20;
            int gradeAGirls = gradeAStudents - gradeABoys;
            System.out.println("Total number of girls getting grade 'A': " + gradeAGirls);
        }
    }
