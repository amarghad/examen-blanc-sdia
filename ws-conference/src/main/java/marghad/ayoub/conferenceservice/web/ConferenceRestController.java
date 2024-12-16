package marghad.ayoub.conferenceservice.web;

import org.springframework.web.bind.annotation.*;

import marghad.ayoub.conferenceservice.dtos.ConferenceDTO;
import marghad.ayoub.conferenceservice.services.ConferenceService;
import marghad.ayoub.conferenceservice.services.KeynoteRestClient;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ConferenceRestController {

    private ConferenceService conferenceService;
    private KeynoteRestClient keynoteRestClient;

    public ConferenceRestController(ConferenceService conferenceService, KeynoteRestClient keynoteRestClient) {
        this.conferenceService = conferenceService;
        this.keynoteRestClient = keynoteRestClient;
    }

    @GetMapping("/conferences")
    public List<ConferenceDTO> conferenceList(){
        List<ConferenceDTO> conferences = conferenceService.getAllConferences();
        conferences.forEach(c->{
                c.setKeynotes(keynoteRestClient.getAllKeynotes());
        });
        return conferences;
    }

    @GetMapping("/conferences/{id}")
    public ConferenceDTO conferenceById(@PathVariable Long id){
        return conferenceService.getConferenceById(id).get();
    }

    @PostMapping
    public ConferenceDTO createConference(@RequestBody ConferenceDTO conferenceDTO) {
        ConferenceDTO savedConference = conferenceService.createConference(conferenceDTO);
        return savedConference;
    }

    @PutMapping("/{id}")
    public ConferenceDTO updateConference(@PathVariable Long id, @RequestBody ConferenceDTO conferenceDTO) {
        if (!conferenceService.getConferenceById(id).isPresent()) {
            return null;
        }
        conferenceDTO.setId(id);  // Make sure the ID is set
        ConferenceDTO updatedConference = conferenceService.updateConference(conferenceDTO);
        return updatedConference;
    }

    @DeleteMapping("/{id}")
    public void deleteConference(@PathVariable Long id) {
        conferenceService.deleteConference(id);
    }

}
