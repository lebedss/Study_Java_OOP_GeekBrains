import java.util.*;

public class Nurse implements Speaker{
    private ArrayList<Student> students;
    private Map<String, Integer> pillows;

    public Nurse(ArrayList<Student> students, Map<String, Integer> pillows) {
        this.students = students;
        this.pillows = pillows;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Map<String, Integer> getPillows() {
        return pillows;
    }

    @Override
    public void speak(ArrayList<Student> students) {
        for (Student student : this.getStudents()) {
            if (student.isIllness()) {
                System.out.println(student.getName() + " беги на медосмотр");
            }
        }
    }
}
