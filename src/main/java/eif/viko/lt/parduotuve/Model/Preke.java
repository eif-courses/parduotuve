package eif.viko.lt.parduotuve.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Preke {
    @Id
    @GeneratedValue
    private Long id;
    private String pavadinimas;
    private double kaina;

    public Preke() { }

    public Preke(String pav, double kaina) {
        this.pavadinimas = pav;
        this.kaina = kaina;
    }

}
