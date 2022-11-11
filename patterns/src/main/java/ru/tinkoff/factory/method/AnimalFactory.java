package ru.tinkoff.factory.method;

import org.springframework.stereotype.Component;
import ru.tinkoff.factory.method.model.Animal;
import ru.tinkoff.factory.method.model.AnimalType;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class AnimalFactory {
    private final Map<AnimalType, Animal> enumMap;

    public AnimalFactory(List<Animal> animals) {
        this.enumMap = animals.stream()
                .collect(Collectors.toMap(Animal::getType, Function.identity()));
    }

    public Animal getAnimal(AnimalType animalType) {
        return this.enumMap.get(animalType);
    }
}

