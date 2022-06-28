package com.example.buggy.Buggy.Code;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class OrderDTO {
    private Long id;
    private CustomerDTO customer;
    private LocalDateTime scheduledDate;
    private double cost;
    private String description;
}
