import java.util.Date;
import java.util.ArrayList;

public abstract class Staff extends Person {
    protected Date joined;
    public ArrayList<String> education;
    public ArrayList<String> certification;
    public ArrayList<String> languages;

    public Staff(
        String title, String givenName, String middleName, String familyName, 
        Date birthDate, Gender gender, String homeAddress, String phoneNumber,
        Date joined
    ) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phoneNumber);
        this.joined = joined;
    }

    public Date getJoined() { return this.joined; }
    public void setJoined(Date joined) { this.joined = joined; }
}
