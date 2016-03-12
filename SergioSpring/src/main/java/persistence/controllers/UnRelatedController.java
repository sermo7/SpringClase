package persistence.controllers;

import java.util.Arrays;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;

import persistence.daos.UnRelatedDao;
import persistence.entities.Gender;
import persistence.entities.UnRelatedEntity;

@Controller
public class UnRelatedController {

    @Autowired
    private UnRelatedDao unRelatedDao;

    public void process() {
        String[] list = {"0", "1", "2", "3", "4"};
        UnRelatedEntity entity = new UnRelatedEntity("Mi Nick", Gender.MALE, new GregorianCalendar(1964, 11, 31), "...", list,
                Arrays.asList(list), "no persistence");
        unRelatedDao.save(entity);
        System.out.println(">>>> UnRelatedEntity:  " + unRelatedDao.findOne(entity.getId()) + "Prueba:"+ unRelatedDao.findByNick("Mi Nick")+unRelatedDao.findByIdGreaterThan(0, new PageRequest(1, 5))+"NumeroTotal: "+unRelatedDao.count());
        System.out.println("Nueva búsqueda de prueba por género: " +unRelatedDao.findByGender("MALE"));
    }
}
