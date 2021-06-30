package com.participants.participantmanager.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Skillentity {
	@Id
	private long id;
	private String name;


	public Skillentity() {

	}
   

	public Skillentity(long id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}




	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Skill [skillId=" + id + ", name=" + name + "]";
	}

}
