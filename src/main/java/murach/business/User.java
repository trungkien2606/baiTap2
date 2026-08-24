package murach.business;

import java.io.Serializable;

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String birthDate;
    private String source;
    private String announcements;
    private String emailUpdates;
    private String contact;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        birthDate = "";
        source = "";
        announcements = "";
        emailUpdates = "";
        contact = "";
    }

    public User(String firstName, String lastName, String email,
                String birthDate, String source,
                String announcements, String emailUpdates,
                String contact) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
        this.source = source;
        this.announcements = announcements;
        this.emailUpdates = emailUpdates;
        this.contact = contact;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(String announcements) {
        this.announcements = announcements;
    }

    public String getEmailUpdates() {
        return emailUpdates;
    }

    public void setEmailUpdates(String emailUpdates) {
        this.emailUpdates = emailUpdates;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}