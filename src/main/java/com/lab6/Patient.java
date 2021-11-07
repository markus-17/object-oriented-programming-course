import java.util.Date;
import java.util.ArrayList;

public class Patient extends Person {
    protected String id;
    protected Date accepted;
    public ArrayList<String> sickness;
    public ArrayList<String> prescriptions;
    public ArrayList<String> allergies;
    public ArrayList<String> specialReqs;

    public Patient(
        String title, String givenName, String middleName, String familyName, 
        Date birthDate, Gender gender, String homeAddress, String phoneNumber,
        String id, Date accepted
    ) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phoneNumber);
        this.id = id;
        this.accepted = accepted;
    }

    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }

    public Date getAccepted() { return this.accepted; }
    public void setAccepted(Date accepted) { this.accepted = accepted; }
}
