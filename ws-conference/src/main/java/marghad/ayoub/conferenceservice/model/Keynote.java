package marghad.ayoub.conferenceservice.model;

import jakarta.persistence.ManyToOne;
import lombok.*;
import marghad.ayoub.conferenceservice.entities.Conference;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Keynote {
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String fonction;
}
