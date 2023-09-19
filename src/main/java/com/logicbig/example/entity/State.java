package com.logicbig.example.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Table(name = "my_state")
@Data @NoArgsConstructor @AllArgsConstructor @ToString(exclude = "cities")
public class State implements Serializable {
	
	@Id @Column(name = "id")
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy = "state", fetch = FetchType.LAZY) @OrderColumn(name = "name")
	@JsonIgnore
	private List<City> cities;
	
}
