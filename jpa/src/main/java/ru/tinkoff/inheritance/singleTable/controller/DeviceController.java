package ru.tinkoff.inheritance.singleTable.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ru.tinkoff.inheritance.singleTable.model.Computer;
import ru.tinkoff.inheritance.singleTable.model.Printer;
import ru.tinkoff.inheritance.singleTable.service.DeviceService;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/device")
public class DeviceController {

    private final DeviceService deviceService;


    @GetMapping("/computers")
    public Flux<Computer> getAllComputers() {
        return deviceService.getAllComputers();
    }

    @GetMapping("/printers")
    public Flux<Printer> getAllPrinters() {
        return deviceService.getAllPrinters();
    }
}
