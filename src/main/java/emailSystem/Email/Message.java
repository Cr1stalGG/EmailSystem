package emailSystem.Email;

import emailSystem.controllers.LogIn;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Message {

    public static javax.mail.Message getMessage(String to, String subject, String text) throws MessagingException {
        Account user = new Account(LogIn.getMail(), LogIn.getPassword());

        // Create a default MimeMessage object.
        javax.mail.Message message = new MimeMessage(HostSettings.getSession(HostSettings.getProperties(), user.getMail(), user.getPassword()));

        // Set From: header field of the header.
        message.setFrom(new InternetAddress(user.getMail()));

        // Set To: header field of the header.
        message.setRecipients(javax.mail.Message.RecipientType.TO, InternetAddress.parse(to));

        // Set Subject: header field
        message.setSubject(subject);

        // Now set the actual message
        message.setText(text);
        return message;
    }
}
