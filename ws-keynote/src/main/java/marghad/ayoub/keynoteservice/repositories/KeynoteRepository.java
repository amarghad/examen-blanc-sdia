package marghad.ayoub.keynoteservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import marghad.ayoub.keynoteservice.entities.Keynote;

public interface KeynoteRepository extends JpaRepository<Keynote, String> {
}