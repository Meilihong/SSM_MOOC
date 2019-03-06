package com.qfedu.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
public class Operation {
    private Integer id;
    private String name;
    private Date time;
    private Integer type;
    private String username;

}
