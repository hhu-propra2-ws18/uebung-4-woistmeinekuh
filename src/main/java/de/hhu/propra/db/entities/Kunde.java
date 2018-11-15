package de.hhu.propra.db.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Data // Lombok - Generiert Getter, Setter, toString, ...
@Entity
public class Kunde {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String stadt;
    private Integer plz;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "kunde_id")
    private ArrayList<Auto> autos;
}
