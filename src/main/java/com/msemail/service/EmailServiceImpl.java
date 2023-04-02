package com.msemail.service;

import com.msemail.dto.EmailDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String from;

    @Override
    public void sendEmail(EmailDto emailDto) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setSubject(emailDto.getSubject());
        message.setText(emailDto.getText());
        message.setFrom(from);
        message.setTo(emailDto.getTo());

        try {
            mailSender.send(message);
            log.info("Email sent: {}", message);
        } catch (MailException e) {
            log.error("Problem sending email: {}", message, e);
        }
    }
}
