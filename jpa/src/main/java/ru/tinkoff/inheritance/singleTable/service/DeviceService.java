package ru.tinkoff.inheritance.singleTable.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.tinkoff.inheritance.singleTable.model.Computer;
import ru.tinkoff.inheritance.singleTable.model.Printer;
import ru.tinkoff.inheritance.singleTable.repository.ComputerRepository;
import ru.tinkoff.inheritance.singleTable.repository.PrinterRepository;

@Service
@RequiredArgsConstructor
public class DeviceService {

    private final ComputerRepository computerRepository;
    private final PrinterRepository printerRepository;

    public Flux<Computer> getAllComputers() {
        return Mono.just(computerRepository.findAll())
                .flatMapMany(Flux::fromIterable);
    }

    public Flux<Printer> getAllPrinters() {
        return Mono.just(printerRepository.findAll())
                .flatMapMany(Flux::fromIterable);
    }
}
