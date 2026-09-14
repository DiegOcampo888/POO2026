public class Student {
    private static final double MIN_GRADE = 0.0;
    private static final double MAX_GRADE = 5.0;

    private final String studentId;
    private String name;
    private final double[] grades;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.grades = new double[3];
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGrade(int index) {
        return grades[index];
    }

    public double getAverage() {
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.length;
    }

    public boolean setName(String newName) {
        if (newName == null || newName.isEmpty()) {
            return false;
        }
        this.name = newName;
        return true;
    }

    public boolean setGrade(int index, double newGrade) {
        if (index < 0 || index >= grades.length) {
            return false;
        }
        if (newGrade < MIN_GRADE || newGrade > MAX_GRADE) {
            return false;
        }
        grades[index] = newGrade;
        return true;
    }
}