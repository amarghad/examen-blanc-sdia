package marghad.ayoub.keynoteservice.dtos;

import lombok.Data;

@Data
public class KeynoteDTO {
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String fonction;
}