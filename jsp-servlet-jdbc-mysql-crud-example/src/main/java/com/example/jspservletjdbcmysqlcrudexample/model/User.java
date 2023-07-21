package com.example.jspservletjdbcmysqlcrudexample.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private long id;
    private String name;
    private String email;
    private String country;
}
