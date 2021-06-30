package com.participants.participantmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.participants.participantmanager.entities.Participants;
import com.participants.participantmanager.model.Course;
import com.participants.participantmanager.repositories.ParticipantRepo;

@Service
public class ParticipantService {
	@Autowired
	ParticipantRepo pr;
	@Autowired
	JavaMailSender jms;
	
	@Autowired
	ParticipantService ps;
	
	public Participants insertdata(Participants p) {
		pr.save(p);
		return p;
	}
	
	public Participants getdata(long id) {
		
		return pr.findById(id).get();
	}

	public String deletedata(long id) {
		// TODO Auto-generated method stub
		if(pr.existsById(id)) {
			pr.deleteById(id);
			return "Data deleted Successfully";
		}
		return "Id is not present in database";
	}
	
	public String updatedata(Participants p) {
		pr.save(p);
		return "data Update Successfully";
	}

	public void notifyparticipants(Course course) {
		SimpleMailMessage smm = new SimpleMailMessage();
		smm.setFrom("onkarbagal921@gmail.com");
		String msg = "Hello ";
		for(Participants user : pr.findAll()) {
			msg += user.getName() + "\n";
			msg += "\t We have added new Course check it out\n";
			msg += "Description : " + course.getDescription() + "\n";
			msg += "Prerequisites : " + course.getPrerequesite() + "\n";
			msg += "Creators : ";
			for(int i = 0; i < course.getCreator().size(); i++) {
				msg += course.getCreator().get(i).getName() + ", ";
			}
			
			msg += "\n Skills: ";
			for(int i = 0; i < course.getSkills().size(); i++) {
				msg += course.getSkills().get(i).getName() + ", ";
			}
			
			msg += "\n Thanks and Regards";
			
		
			smm.setTo(user.getEmail_id());
			smm.setSubject("New Course");
			smm.setText(msg);
			jms.send(smm);
		}
		
	}

}
