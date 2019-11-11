package com.codeinvestigator.springbootrestserver.space;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/spaceship")
public class SpaceShipRestController {

    @GetMapping("/")
    public List<SpaceShip> spaceships(){
        return List.of(
                new SpaceShip("Falcon", 10),
                new SpaceShip("Hawk", 20),
                new SpaceShip("Swan", 80),
                new SpaceShip("Condor", 30),
                new SpaceShip("Pingvin", 90),
                new SpaceShip("Austridge", 40),
                new SpaceShip("Pelican", 50),
                new SpaceShip("Blackbird", 15)
        );
    }
}
