package tn.esprit.twin3.endpoints;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.twin3.entities.Reservation;
import tn.esprit.twin3.services.IReservationService;

import java.util.List;

@RequestMapping("reservation/")
@RestController
@AllArgsConstructor
public class ReservationEndpoint {

    IReservationService service;

    @GetMapping("")
    public List<Reservation> findAllReservation(){
        return service.retrieveAllReservation();
    }

    @GetMapping("/byId/{id}")
    public Reservation findReservationById(@PathVariable String id) {
        return service.retrieveReservation(id);
    }
    @PostMapping("")
    public Reservation addReservation(@RequestBody Reservation r) {
        return service.addReservation(r);
    }

    @PutMapping("")
    public Reservation updateReservation(@RequestBody Reservation r) {
        return service.updateReservation(r);
    }
}
