package com.promo.grammarrules.models;


import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class Excercise {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID uuid;
    private String content;
    private String css;
    private String sulotionContent;
    private String sulotionCss;

}
