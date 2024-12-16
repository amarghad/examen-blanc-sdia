package marghad.ayoub.conferenceservice.entities;


import jakarta.persistence.*;
import lombok.*;
import marghad.ayoub.conferenceservice.model.Keynote;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter @Builder @ToString
public class Conference {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String type;
    private LocalDate date;
    private int duree;
    private int nombreInscrits;
    private double score;

    @Transient
    private List<Keynote> keynotes;
}