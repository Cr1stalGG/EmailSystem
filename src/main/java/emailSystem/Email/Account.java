package emailSystem.Email;

public class Account {
    private String userMail;
    private String userPassword;

    public Account(String userMail, String userPassword) {
        this.userMail = userMail;
        this.userPassword = userPassword;
    }

    public String getUserMail() {
        return userMail;
    }

    public String getUserPassword() {
        return userPassword;
    }
}
