package marghad.ayoub.conferenceservice.dtos;

import lombok.Data;
import marghad.ayoub.conferenceservice.model.Keynote;

import java.time.LocalDate;
import java.util.List;

@Data
public class ConferenceDTO {
    private Long id;
    private String titre;
    private String type;
    private LocalDate date;
    private int duree;
    private int nombreInscrits;
    private double score;
    private List<Keynote> keynotes;
}