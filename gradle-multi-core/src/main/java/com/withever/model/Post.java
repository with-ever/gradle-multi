package com.withever.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity 
@Table(name = "post") 
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "post_seq", nullable = false)
    private int  postSeq;
    
    @Column(name = "board_id", nullable = false)
    private String boardId;

    @Column(name = "title", nullable = false)
    private String title;
    
    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "reg_id", nullable = false)
    private String regId;
    
    
    
    
}