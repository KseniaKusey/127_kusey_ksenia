public class Student {
    private String name;
    private int age;
    private String group;
    private double mean_score;

    public Student(String name, int age, String group, double mean_score) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.mean_score = mean_score;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getMean_score() {
        return this.mean_score;
    }

    public void setMean_score(double mean_score) {
        this.mean_score = mean_score;
    }

    }

