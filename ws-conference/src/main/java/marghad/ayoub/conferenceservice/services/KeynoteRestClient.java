package marghad.ayoub.conferenceservice.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import marghad.ayoub.conferenceservice.model.Keynote;

import java.util.List;

@FeignClient(url = "http://localhost:8081", name = "keynote-service")

public interface KeynoteRestClient {
    @GetMapping("/api/keynotes")
    List<Keynote> getAllKeynotes();
    
    @GetMapping("/api/keynotes/{id}")
    Keynote findKeynoteById(@PathVariable String id);
}
