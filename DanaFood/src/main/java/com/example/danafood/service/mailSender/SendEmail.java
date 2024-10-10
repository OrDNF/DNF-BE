//package com.example.danafood.service.mailSender;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Component;
//import org.thymeleaf.spring6.SpringTemplateEngine;
//import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
//
//import javax.mail.MessagingException;
//
//import jakarta.mail.internet.MimeMessage;
//@Component
//public class SendEmail {
//    @Autowired
//    private JavaMailSender javaMailSender;
//
//    public void sendEmailRegister(String email) throws MessagingException, jakarta.mail.MessagingException {
//        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, "UTF-8");
//        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
//        templateResolver.setPrefix("/templates/");
//        templateResolver.setSuffix(".html");
//        templateResolver.setTemplateMode("HTML5");
//
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver);
//        mimeMessageHelper.setTo(email);
//        mimeMessageHelper.setSubject("Thống báo đăng ký thành công");
//        this.javaMailSender.send(mimeMessage);
//    }
//
//}
