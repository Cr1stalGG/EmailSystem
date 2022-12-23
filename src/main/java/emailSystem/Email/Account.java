package emailSystem.Email;

public class Account {
    private String mail;
    private String password;

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public Account(String mail, String password) {
        this.mail = mail;
        this.password = password;

    }
}
