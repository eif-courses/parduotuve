package eif.viko.lt.parduotuve.Service;

import eif.viko.lt.parduotuve.Model.Preke;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface PrekeService {
    Iterable<Preke> atvaizduotiPrekes();
    Optional<Preke> prekePagalId(Long id);
    Preke issaugotiPreke(Preke preke);
    void panaikintiPreke(Long id);
}
