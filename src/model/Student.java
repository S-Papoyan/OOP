package model;
public class Student {

    private String name;
    private int year;
    private double mark;
    private char gender;
    private boolean isPhd;

    public Student(String name, int year, double mark, char gender, boolean isPhd) {
        this.name = name;
        this.year = year;
        this.mark = mark;
        this.gender = gender;
        this.isPhd = isPhd;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isPhd() {
        return isPhd;
    }

    public void setPhd(boolean phd) {
        isPhd = phd;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Mark: " + mark);
        System.out.println("Gender: " + (gender == 'f' ? "female" : "male"));
        System.out.println("Is PHD: " + (isPhd ? "Yes" : "N"));
    }
}
