package com.participants.participantmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.participants.participantmanager.entities.Participants;
import com.participants.participantmanager.model.Course;
import com.participants.participantmanager.repositories.ParticipantRepo;
import com.participants.participantmanager.service.ParticipantService;

@RestController
public class ParticipantsController {

	@Autowired
	ParticipantRepo pr;
	
	@Autowired
	ParticipantService ps;
	
	@GetMapping("/home")
	public String home() {
		return "Wel-come to home";
	}
	
	@GetMapping(path = "/getdata/{id}")
	public Participants getdata(@PathVariable("id") Long id) {
		return ps.getdata((long) id);
		
	}
	
	@PostMapping("/save")
	public Participants insertdata(@RequestBody Participants p) {
		return ps.insertdata(p);
		
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public String deletedata(@PathVariable("id") Long id) {
		
		return ps.deletedata(id);
	}
	
	@PutMapping("/update")
	public String updatedata(@RequestBody Participants p) {
		return ps.updatedata(p);
	}
	
	@PostMapping("/notify")
	public String notifyparticipant(@RequestBody Course course ) {
		
		ps.notifyparticipants(course);
		return "Notify Successfully";
		
	}
}
