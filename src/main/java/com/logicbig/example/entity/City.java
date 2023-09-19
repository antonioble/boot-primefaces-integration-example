package com.logicbig.example.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Table( name = "my_city")
@Data @NoArgsConstructor @AllArgsConstructor
public class City implements Serializable {

    @Id @Column(name = "id")
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne @JoinColumn(name = "state_id")
    private State state;

}
