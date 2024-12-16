package marghad.ayoub.conferenceservice.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import marghad.ayoub.conferenceservice.dtos.ConferenceDTO;
import marghad.ayoub.conferenceservice.entities.Conference;

@Mapper
public interface ConferenceMapper {
    ConferenceMapper INSTANCE = Mappers.getMapper(ConferenceMapper.class);
    ConferenceDTO conferenceToConferenceDTO(Conference conference);
    Conference conferenceDTOToConference(ConferenceDTO conferenceDTO);
}
