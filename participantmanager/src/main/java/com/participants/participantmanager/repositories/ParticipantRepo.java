package com.participants.participantmanager.repositories;

import org.springframework.data.repository.CrudRepository;

import com.participants.participantmanager.entities.Participants;

public interface ParticipantRepo extends CrudRepository<Participants, Long> {

}
