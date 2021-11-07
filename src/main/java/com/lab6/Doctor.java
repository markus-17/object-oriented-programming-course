import java.util.Date;
import java.util.ArrayList;

public class Doctor extends OperationsStaff {
    public ArrayList<String> specialty;
    public ArrayList<String> locations;

    public Doctor(
        String title, String givenName, String middleName, String familyName, 
        Date birthDate, Gender gender, String homeAddress, String phoneNumber,
        Date joined
    ) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phoneNumber, joined);
    }
}
