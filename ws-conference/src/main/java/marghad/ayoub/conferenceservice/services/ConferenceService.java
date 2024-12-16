package marghad.ayoub.conferenceservice.services;

import java.util.List;
import java.util.Optional;

import marghad.ayoub.conferenceservice.dtos.ConferenceDTO;

public interface ConferenceService {
    List<ConferenceDTO> getAllConferences();
    Optional<ConferenceDTO> getConferenceById(Long id);
    ConferenceDTO createConference(ConferenceDTO conferenceDTO);
    void deleteConference(Long id);
    ConferenceDTO updateConference(ConferenceDTO conferenceDTO);
}
