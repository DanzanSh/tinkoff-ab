package ru.tinkoff.factory.method.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import ru.tinkoff.factory.method.AnimalFactory;
import ru.tinkoff.factory.method.model.Animal;
import ru.tinkoff.factory.method.model.AnimalType;

@Component
public class ApplicationEventListener implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private AnimalFactory animalFactory;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Animal cat = animalFactory.getAnimal(AnimalType.CAT);
        System.out.println(cat.makeNoise());

        Animal dog = animalFactory.getAnimal(AnimalType.DOG);
        System.out.println(dog.makeNoise());
    }

}
