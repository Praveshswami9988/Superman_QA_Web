package Supermanpages;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailReport {
	
	public static void main(String[] args) throws IOException, jakarta.mail.MessagingException {
		sendEmail("smtp.outlook.com", "587", "pravesh.swami1@mankindpharma.com", "SWAMIsoeasy@1144",
				"pravesh.swami1@mankindpharma.com", "SUPERMAN Automation Sanity testing", "This is a simple test email.");
	}

	public static void sendEmail(String host, String port, final String user, final String password, String toAddress,
			String subject, String message) throws IOException, jakarta.mail.MessagingException {

		// Set SMTP properties
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", port);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true"); // For TLS
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");

		// Create a new session with authentication
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});

		try {
			String ExtentReportPath = "C:\\Users\\pravesh.swami1\\eclipse-workspace\\SupermanQA\\test-output\\emailable-report.html";

			message="abc";
			// Create the message
			//MimeMultipart multipart = new MimeMultipart("related");
			Message msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(user));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toAddress));
			msg.setSubject(subject);
			msg.setText(message);
		
			
			
            // Create the message part for the inline text
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("SUPERMAN Automation Test case Status");

            // Create a new MimeBodyPart for the attachment
            MimeBodyPart attachmentBodyPart = new MimeBodyPart();
            attachmentBodyPart.attachFile(ExtentReportPath); // Path to your file

            // Create a multipart message
            Multipart multipart1 = new MimeMultipart();
            multipart1.addBodyPart(messageBodyPart);
            multipart1.addBodyPart(attachmentBodyPart);

            // Set the complete message parts
            msg.setContent(multipart1);
	
			

			// Send the message
			Transport.send(msg);
			System.out.println("Test email sent successfully!");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
	
	
	
	

}
