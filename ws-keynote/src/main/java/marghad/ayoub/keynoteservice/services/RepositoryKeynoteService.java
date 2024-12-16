package marghad.ayoub.keynoteservice.services;

import jakarta.transaction.Transactional;
import marghad.ayoub.keynoteservice.dtos.KeynoteDTO;
import marghad.ayoub.keynoteservice.entities.Keynote;
import marghad.ayoub.keynoteservice.mappers.KeynoteMapper;
import marghad.ayoub.keynoteservice.repositories.KeynoteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RepositoryKeynoteService implements KeynoteService{

    @Autowired
    private KeynoteRepository keynoteRepository;
    @Override
    public List<KeynoteDTO> getAllKeynotes() {
        List<Keynote> keynotes = keynoteRepository.findAll();
        return keynotes.stream()
                .map(KeynoteMapper.INSTANCE::keynoteToKeynoteDTO)
                .toList();
    }

    @Override
    public Optional<KeynoteDTO> getKeynoteById(String id) {
        return keynoteRepository.findById(id)
                .map(KeynoteMapper.INSTANCE::keynoteToKeynoteDTO);
    }

    @Override
    public KeynoteDTO createKeynote(KeynoteDTO keynoteDTO) {
        Keynote keynote = KeynoteMapper.INSTANCE.keynoteDTOToKeynote(keynoteDTO);
        Keynote savedKeynote = keynoteRepository.save(keynote);
        return KeynoteMapper.INSTANCE.keynoteToKeynoteDTO(savedKeynote);
    }

    @Override
    public void deleteKeynote(String id) {
        keynoteRepository.deleteById(id);
    }

    @Override
    public KeynoteDTO updateKeynote(KeynoteDTO keynoteDTO) {
        return null;
    }
}
