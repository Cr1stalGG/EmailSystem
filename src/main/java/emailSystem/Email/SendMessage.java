package emailSystem.Email;

import javax.mail.MessagingException;
import javax.mail.Transport;

public class SendMessage {

    public static void sendMessage( String to, String subject, String text){
        try {
            // Send message
            Transport.send(Message.getMessage(to, subject, text));

            System.out.println("Sent message successfully....");

        } catch (MessagingException e) {
            System.out.println("Error....");
            e.printStackTrace();
        }
    }
}
