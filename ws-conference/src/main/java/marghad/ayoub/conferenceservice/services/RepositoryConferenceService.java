package marghad.ayoub.conferenceservice.services;

import jakarta.transaction.Transactional;
import marghad.ayoub.conferenceservice.dtos.ConferenceDTO;
import marghad.ayoub.conferenceservice.entities.Conference;
import marghad.ayoub.conferenceservice.mappers.ConferenceMapper;
import marghad.ayoub.conferenceservice.repositories.ConferenceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RepositoryConferenceService implements ConferenceService {

    @Autowired
    private ConferenceRepository conferenceRepository;
    
    @Override
    public List<ConferenceDTO> getAllConferences() {
        List<Conference> conferences = conferenceRepository.findAll();
        return conferences.stream()
                .map(ConferenceMapper.INSTANCE::conferenceToConferenceDTO)
                .toList();
    }

    @Override
    public Optional<ConferenceDTO> getConferenceById(Long id) {
        return conferenceRepository.findById(String.valueOf(id))
                .map(ConferenceMapper.INSTANCE::conferenceToConferenceDTO);
    }

    @Override
    public ConferenceDTO createConference(ConferenceDTO conferenceDTO) {
        Conference conference = ConferenceMapper.INSTANCE.conferenceDTOToConference(conferenceDTO);
        Conference savedConference = conferenceRepository.save(conference);
        return ConferenceMapper.INSTANCE.conferenceToConferenceDTO(savedConference);
    }

    @Override
    public void deleteConference(Long id) {
        conferenceRepository.deleteById(String.valueOf(id));
    }

    @Override
    public ConferenceDTO updateConference(ConferenceDTO conferenceDTO) {
        return null;
    }
}
