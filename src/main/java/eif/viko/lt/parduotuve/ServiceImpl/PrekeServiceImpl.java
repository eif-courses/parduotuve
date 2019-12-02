package eif.viko.lt.parduotuve.ServiceImpl;

import eif.viko.lt.parduotuve.Model.Preke;
import eif.viko.lt.parduotuve.Repository.PrekeRepository;
import eif.viko.lt.parduotuve.Service.PrekeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PrekeServiceImpl implements PrekeService {

    private PrekeRepository prekeRepository;

    @Override
    public Iterable<Preke> atvaizduotiPrekes() {
        return prekeRepository.findAll();
        // Select * from Parduotuve
    }

    @Override
    public Optional<Preke> prekePagalId(Long id) {
        return prekeRepository.findById(id);
    }

    @Override
    public Preke issaugotiPreke(Preke preke) {
        return prekeRepository.save(preke);
    }

    @Override
    public void panaikintiPreke(Long id) {
        prekeRepository.deleteById(id);
    }

    public PrekeRepository getPrekeRepository() {
        return prekeRepository;
    }

    @Autowired
    public void setPrekeRepository(PrekeRepository prekeRepository) {
        this.prekeRepository = prekeRepository;
    }
}
