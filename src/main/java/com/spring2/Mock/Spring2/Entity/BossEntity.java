package com.spring2.Mock.Spring2.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BossEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer boss_id;

    private String name;

}
