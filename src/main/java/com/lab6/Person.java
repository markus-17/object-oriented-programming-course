import java.util.Date;

enum Gender {
    MALE,
    FEMALE
}

public abstract class Person {
    protected String title;
    protected String givenName;
    protected String middleName;
    protected String familyName;
    protected Date birthDate;
    protected Gender gender;
    protected String homeAddress;
    protected String phoneNumber;

    public Person(
        String title, String givenName, String middleName, String familyName, 
        Date birthDate, Gender gender, String homeAddress, String phoneNumber
    ) {
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getTitle() { return this.title; }
    public void setTitle(String title) { this.title = title; }

    public String getGivenName() { return this.givenName; }
    public void setGivenName(String givenName) { this.givenName = givenName; }

    public String getMiddleName() { return this.middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public String getFamilyName() { return this.familyName; }
    public void setFamilyName(String familyName) { this.familyName = familyName; }

    public Date getBirthDate() { return this.birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public Gender getGender() { return this.gender; }
    public void setGender(Gender gender) { this.gender = gender; }

    public String getHomeAddress() { return this.homeAddress; }
    public void setHomeAddress(String homeAddress) { this.homeAddress = homeAddress; }

    public String getPhoneNumber() { return this.phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getFullName() { return this.title + ' ' + this.givenName + ' ' + this.middleName + ' ' + this.familyName; }
}
