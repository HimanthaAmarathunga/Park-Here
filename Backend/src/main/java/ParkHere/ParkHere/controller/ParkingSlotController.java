package ParkHere.ParkHere.controller;

import ParkHere.ParkHere.model.ParkingSlot;
import ParkHere.ParkHere.service.ParkingSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/slot")
public class ParkingSlotController {

    @Autowired
    ParkingSlotService parkingSlotService;

    @PostMapping("/addSlot")
    public ParkingSlot addParkingSlot(@RequestBody ParkingSlot parkingSlot) {
//        try {
            return parkingSlotService.addParkingSlot(parkingSlot);
//        }catch (NullPointerException e) {
//            e.printStackTrace();
//        }
//        return parkingSlot;
    }

    @GetMapping("/getAllParkingSlots")
    public List<ParkingSlot> getAllParkingSlots() {
            return parkingSlotService.getAllParkingSlots();
    }

    @PutMapping("/updateParkingSlot")
    public ParkingSlot updateParkingSlot(@RequestBody ParkingSlot parkingSlot) {
        return parkingSlotService.updateParkingSlot(parkingSlot);
    }

    @GetMapping("/getParkingSlotById/{id}")
    public Optional<ParkingSlot> getParkingSlotById(@PathVariable String id) {
        return parkingSlotService.getParkingSlotById(id);
    }
}
