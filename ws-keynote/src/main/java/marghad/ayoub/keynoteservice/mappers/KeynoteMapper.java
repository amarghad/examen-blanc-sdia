package marghad.ayoub.keynoteservice.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import marghad.ayoub.keynoteservice.dtos.KeynoteDTO;
import marghad.ayoub.keynoteservice.entities.Keynote;

@Mapper
public interface KeynoteMapper {
    KeynoteMapper INSTANCE = Mappers.getMapper(KeynoteMapper.class);
    KeynoteDTO keynoteToKeynoteDTO(Keynote keynote);
    Keynote keynoteDTOToKeynote(KeynoteDTO keynoteDTO);
}
