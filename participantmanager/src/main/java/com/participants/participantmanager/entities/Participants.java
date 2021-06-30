package com.participants.participantmanager.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Participants {
	
	@Id
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String email_id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public Participants() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Participants(Long id, String name, String email_id) {
		super();
		this.id = id;
		this.name = name;
		this.email_id = email_id;
	}
	@Override
	public String toString() {
		return "Participants [id=" + id + ", name=" + name + ", email_id=" + email_id + "]";
	}
}
