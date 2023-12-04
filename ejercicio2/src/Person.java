public class Person implements Human{
    private String firstName, lastName, NIF, adress;
    public Person() {
        this.firstName = "x";
        this.lastName = "y";
        this.NIF = "ZZZZZZZ";
        this.adress = "JackassStreet";
    }
    public Person(String firstName, String lastName, String NIF, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.NIF = NIF;
        this.adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getAdress() {
        return adress;
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
            throw new IllegalArgumentException("First name cannot be empty");
        }
    }
    public void setAdress(String adress) {
        if(!(adress.isEmpty())) {
            this.adress = adress;
        } else {
            throw new IllegalArgumentException("Address cannot be empty");
        }
    }

    public void setLastName(String lastName) {
        if(!(lastName.isEmpty())) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Last name cannot be empty");
        }
    }

    public void setNIF(String NIF) {
        if(!(NIF.isEmpty())) {
            this.NIF = NIF;
        } else {
            throw new IllegalArgumentException("NIF cannot be empty");
        }
    }

    @Override
    public String identify() {
        return String.format("%s %s %s", this.firstName, this.lastName, "is a Person");
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", NIF='" + NIF + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
