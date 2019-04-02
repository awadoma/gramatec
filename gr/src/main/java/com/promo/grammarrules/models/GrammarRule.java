package com.promo.grammarrules.models;


import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class GrammarRule {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID uuid;
    private String title;
    private String content;
    private String css;

}
