package guru.springframework.sfgpetclinic.model;

public class Person extends BaseEntity{
    private String firsName;

    private String lastName;

    public String getFirsName() {
        return firsName;
    }

    public void setFirstName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

