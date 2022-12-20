public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int height;
    private boolean illness;

    public Student(String name, int age, int height, boolean illness) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.illness = illness;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isIllness() {
        return illness;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setIllness(boolean illness) {
        this.illness = illness;
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();
    }
}
