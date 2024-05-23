package _02_structural_patterns._10_facade._02_after;


public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailSender emailSender = new EmailSender(emailSettings);

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("kyounghak");
        emailMessage.setTo("revi1337");
        emailMessage.setSubject("오징어게임");
        emailMessage.setText("아무런 대사 한개");

        emailSender.sendEmail(emailMessage);
    }
}
