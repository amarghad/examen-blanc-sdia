package marghad.ayoub.keynoteservice.services;

import java.util.List;
import java.util.Optional;

import marghad.ayoub.keynoteservice.dtos.KeynoteDTO;

public interface KeynoteService {
    List<KeynoteDTO> getAllKeynotes();
    Optional<KeynoteDTO> getKeynoteById(String id);
    KeynoteDTO createKeynote(KeynoteDTO keynoteDTO);
    void deleteKeynote(String id);
    KeynoteDTO updateKeynote(KeynoteDTO keynoteDTO);
}
