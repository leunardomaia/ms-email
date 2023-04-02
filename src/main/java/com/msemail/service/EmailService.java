package com.msemail.service;

import com.msemail.dto.EmailDto;

public interface EmailService {
    void sendEmail(EmailDto emailDto);
}
