import java.util.Date;

public class AdministrativeStaff extends Staff {
    public AdministrativeStaff(
        String title, String givenName, String middleName, String familyName, 
        Date birthDate, Gender gender, String homeAddress, String phoneNumber,
        Date joined
    ) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phoneNumber, joined);
    }
}
