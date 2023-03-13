public class Employee {
    private String firstName;
    private String lastName;
    private String SSN;

    Employee() {
        this.firstName = "";
        this.lastName = "";
        this.SSN = "";
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getSSN() {
        return this.SSN;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setSSN(String SSN) {
        this.SSN = SSN;
    }
}
