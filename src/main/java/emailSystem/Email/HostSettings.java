package emailSystem.Email;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.Properties;

public class HostSettings {
    private static final String host = "smtp.gmail.com"; //smtp.gmail.com - 74.125.71.108
    private static final String tmpHost="74.125.71.108";

    public static Properties getProperties(){
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "25");
        return props;
    }
    public static Session getSession(Properties properties, String mail, String password){
        Session session = Session.getInstance(properties,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(mail, password);
                    }
                });
        return session;
    }
}
