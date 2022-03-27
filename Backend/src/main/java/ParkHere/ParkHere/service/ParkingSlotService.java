package ParkHere.ParkHere.service;

import ParkHere.ParkHere.model.ParkingSlot;

import java.util.List;
import java.util.Optional;

public interface ParkingSlotService {

    ParkingSlot addParkingSlot(ParkingSlot parkingSlot);
    List<ParkingSlot> getAllParkingSlots();
    ParkingSlot updateParkingSlot(ParkingSlot parkingSlot);
    Optional<ParkingSlot> getParkingSlotById(Long id);
}
