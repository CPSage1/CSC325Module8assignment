public class Student{
    private double GPA;  // GPA field for Student
    private int credits; // tracks credits

    // Constructor for the name, age, and credits of a Student
    public Student(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [Name=" + getName() + ", Age=" + getAge() + ", GPA=" + GPA + ", Credits=" + credits + "]";
    }
}

// Freshman Student class extension
class Freshman extends Student {
    public Freshman(String name, short age, int credits) {
        super(name, age, credits);
    }

    @Override
    public String toString() {
        return "Freshman [Name=" + getName() + ", Age=" + getAge() + ", GPA=" + getGPA() + "]";
    }
}

// Senior Student class extension with only minimum credits
class Senior extends Student {
    private static final int MIN_CREDITS = 85;

    public Senior(String name, short age, int credits) {
        super(name, age, credits);
        if (credits < MIN_CREDITS) {
            throw new IllegalArgumentException("Senior must have at least " + MIN_CREDITS + " credits.");
        }
    }

    @Override
    public String toString() {
        return "Senior [Name=" + getName() + ", Age=" + getAge() + ", GPA=" + getGPA() + "]";
    }
}
//complete