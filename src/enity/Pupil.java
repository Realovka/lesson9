package enity;

import java.util.Objects;

public class Pupil {
    private String firstName;
    private String lastName;
    private Sex sex;
    private double averageMark;

    public Pupil(String firstName, String lastName, Sex sex, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.averageMark = averageMark;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", averageMark=" + averageMark +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pupil pupil = (Pupil) o;
        return Double.compare(pupil.averageMark, averageMark) == 0 &&
                firstName.equals(pupil.firstName) &&
                lastName.equals(pupil.lastName) &&
                sex == pupil.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, sex, averageMark);
    }
}
