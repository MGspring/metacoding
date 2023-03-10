package com.example.cos.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false,length = 100)
	private String title;

	@Lob
	private String content; //섬머노트 라이브러리 <html>태그가 섞여서 디자인 됨 용량이 커짐

	@ColumnDefault("0") //조회수
	private int count;

	@ManyToOne // Many = Board, Users = One
	@JoinColumn(name = "userId")
	private Users users; // 누가적었는지 알기 위함, DB는 오브젝트 저장불가, FK를 사용, 자바는 오브젝트 저장가능

	@CreationTimestamp
	private Timestamp createDate;


}
