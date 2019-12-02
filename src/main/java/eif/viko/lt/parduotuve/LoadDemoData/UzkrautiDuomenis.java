package eif.viko.lt.parduotuve.LoadDemoData;

import eif.viko.lt.parduotuve.Model.Preke;
import eif.viko.lt.parduotuve.Repository.PrekeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class UzkrautiDuomenis implements ApplicationListener<ContextRefreshedEvent> {

    private PrekeRepository prekeRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        String pav[] = {"Kompiuteris", "Stalas", "Lempa", "Monitorius", "TV"};

        for (int i = 0; i < 15; i++) {
            prekeRepository.save(new Preke(pav[new Random().nextInt(pav.length)], new Random().nextInt(5000)));
        }
    }


    public PrekeRepository getPrekeRepository() {
        return prekeRepository;
    }
    @Autowired
    public void setPrekeRepository(PrekeRepository prekeRepository) {
        this.prekeRepository = prekeRepository;
    }
}
