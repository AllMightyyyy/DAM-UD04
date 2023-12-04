public class Teacher extends Person {
    private String dispatch;

    public Teacher() {
        this.dispatch = "dispatched";
    }
    public Teacher(String firstName, String lastName, String NIF, String adress, String dispatch) {
        super(firstName, lastName, NIF, adress);
        this.dispatch = dispatch;
    }

    public String getDispatch() {
        return dispatch;
    }

    public void setDispatch(String dispatch) {
        this.dispatch = dispatch;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", NIF='" + getNIF() + '\'' +
                ", adress='" + getAdress() + '\'' +
                "dispatch='" + dispatch + '\'' +
                '}';
    }
}
