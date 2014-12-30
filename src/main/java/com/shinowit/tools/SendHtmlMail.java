package com.shinowit.tools;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;

/**
 * Created by SC on 2014/12/25.
 */
public class SendHtmlMail {


    private String stmpService;

    private String sendEmail;

    private String emailPass;


    public  void sendMessage(String to,String subject, String messageText)
            throws MessagingException, java.io.UnsupportedEncodingException {

        // Step 1:  Configure the mail session
        java.util.Properties props = new java.util.Properties();
        props.setProperty("mail.smtp.auth", "true");//指定是否需要SMTP验证
        props.setProperty("mail.smtp.host", stmpService);//指定SMTP服务器
        props.put("mail.transport.protocol", "smtp");
        Session mailSession = Session.getDefaultInstance(props);
        mailSession.setDebug(true);//是否在控制台显示debug信息

        // Step 2:  Construct the message
        InternetAddress fromAddress = new InternetAddress(sendEmail);
        InternetAddress toAddress = new InternetAddress(to);

        MimeMessage testMessage = new MimeMessage(mailSession);
        testMessage.setFrom(fromAddress);
        testMessage.addRecipient(javax.mail.Message.RecipientType.TO, toAddress);
        testMessage.setSentDate(new java.util.Date());
        testMessage.setSubject(MimeUtility.encodeText(subject, "utf-8", "B"));

        testMessage.setContent(messageText, "text/html;charset=utf-8");
        System.out.println("Message constructed");

        // Step 3:  Now send the message
        Transport transport = mailSession.getTransport("smtp");
        transport.connect(stmpService, sendEmail, emailPass);
        transport.sendMessage(testMessage, testMessage.getAllRecipients());
        transport.close();

    }



    public String getStmpService() {
        return stmpService;
    }

    public void setStmpService(String stmpService) {
        this.stmpService = stmpService;
    }

    public String getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(String sendEmail) {
        this.sendEmail = sendEmail;
    }

    public String getEmailPass() {
        return emailPass;
    }

    public void setEmailPass(String emailPass) {
        this.emailPass = emailPass;
    }
}