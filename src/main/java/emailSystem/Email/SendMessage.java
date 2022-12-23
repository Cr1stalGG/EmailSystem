package emailSystem.Email;

import emailSystem.controllers.LogIn;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMessage {
    private static Account user = new Account(LogIn.userMail.getText(), LogIn.userPassword.getText());

    public static void sendMessage( String to, String subject, String text){

        try {
            // Create a default MimeMessage object.
            Message message = new MimeMessage(HostSettings.getSession(HostSettings.getProperties(), user.getMail(), user.getPassword()));

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(user.getMail()));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));

            // Set Subject: header field
            message.setSubject(subject);

            // Now set the actual message
            message.setText(text);

            // Send message
            Transport.send(message);


            System.out.println("Sent message successfully....");

        } catch (MessagingException e) {
            System.out.println("Error....");
            throw new RuntimeException(e);
        }
    }
}
