package com.workdistance.workdistance;



import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TimeDistanceController {

    @GetMapping("/calculateDistance")
    public float calculateDistance(@RequestParam float speed, @RequestParam float time) {
        return speed * time;
    }

    @GetMapping("/calculateSpeed")
    public float calculateSpeed(@RequestParam float distance, @RequestParam float time) {
        return distance / time;
    }

    @GetMapping("/calculateTime")
    public float calculateTime(@RequestParam float distance, @RequestParam float speed) {
        return distance / speed;
    }

    @GetMapping("/kmToMeters")
    public float kmToMeters(@RequestParam float km) {
        return km *5/18;
    }

    @GetMapping("/metersToKm")
    public float metersToKm(@RequestParam float meters) {
        return meters*18/5;
    }
}

