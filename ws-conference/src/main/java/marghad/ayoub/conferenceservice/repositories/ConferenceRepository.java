package marghad.ayoub.conferenceservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import marghad.ayoub.conferenceservice.entities.Conference;

public interface ConferenceRepository extends JpaRepository<Conference, String> {
}