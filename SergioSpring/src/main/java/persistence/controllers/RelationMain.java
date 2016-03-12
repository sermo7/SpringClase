package persistence.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.ControllerConfig;
import persistence.daos.UnRelatedDao;
import persistence.entities.UnRelatedEntity;

public final class RelationMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ControllerConfig.class);
        System.out.println("----------ooo----------");
        context.getBean(UnRelatedController.class).process();
        System.out.println("----------ooo----------");
        UnRelatedEntity prueba = context.getBean(UnRelatedDao.class).findByNick("Mi Nick");
        System.out.println(prueba.getNick());
        System.out.println("----------ooo----------");
        
        ((AbstractApplicationContext) context).close();
    }
}
