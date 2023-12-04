public class Person {
    private String firstName, lastName, NIF;
    public Person() {
        this.firstName = "x";
        this.lastName = "y";
        this.NIF = "ZZZZZZZ";
    }
    public Person(String firstName, String lastName, String NIF) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.NIF = NIF;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNIF() {
        return NIF;
    }

    public void setFirstName(String firstName) {
        if(!(firstName.isEmpty())) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("Empty Name");
        }
    }

    public void setLastName(String lastName) {
        if(!(lastName.isEmpty())) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Empty Last Name");
        }
    }

    public void setNIF(String NIF) {
        if(!(NIF.isEmpty())) {
            this.NIF = NIF;
        } else {
            throw new IllegalArgumentException("NIF is empty");
        }
    }
}
