package inheritance;

public class Human {

    private String firstName;
    private String lastName;
    private int year;


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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printInfo() {
        System.out.printf("Full Name: %s %s\n", firstName, lastName);
        System.out.print("Year: " + year);
    }
}
