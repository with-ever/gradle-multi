package com.withever.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity 
@Table(name = "member") 
public class Post {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id", nullable = false)
    private String id;
    
    @Column(name = "name", nullable = false)
    private String name;

}