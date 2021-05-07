package com.iosoft.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recommended {

    private String imgSrc;
    private String title;
    private Integer views;
    private Integer comments;
}
