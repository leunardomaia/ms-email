package com.msemail.consumer;

import com.msemail.dto.EmailDto;
import com.msemail.service.EmailService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmailConsumer {

    private EmailService emailService;

    public void consumeEmailEvent(EmailDto emailDto) {
        emailService.sendEmail(emailDto);
    }

}
