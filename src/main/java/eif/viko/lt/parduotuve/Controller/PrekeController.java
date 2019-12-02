package eif.viko.lt.parduotuve.Controller;

import eif.viko.lt.parduotuve.Service.PrekeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PrekeController {
    private PrekeService prekeService;
    @Autowired
    public void setPrekeService(PrekeService prekeService) {
        this.prekeService = prekeService;
    }

    @GetMapping("prekes") // HTTP GET
    public String list(Model model){
        model.addAttribute("prekes", prekeService.atvaizduotiPrekes());
        return "prekes";
    }
    @GetMapping("prekes/{id}")
    public String preke(Model model, @PathVariable Long id){
        model.addAttribute("preke", prekeService.prekePagalId(id));
        return "preke";
    }






}
