package com.withever.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity //JPA�� ���� �����Ǵ� ��ƼƼ���� �˸��� ����
@Table(name = "member") //�����ϸ� ���ε� ���̺��� ��Ȯ�� �ϴ� ����
public class User {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id", nullable = false)
    private String id;
    
    @Column(name = "name", nullable = false)
    private String name;

}