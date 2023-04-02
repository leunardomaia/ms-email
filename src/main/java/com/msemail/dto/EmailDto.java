package com.msemail.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmailDto {
    private String subject;
    private String text;
    private String to;
}
