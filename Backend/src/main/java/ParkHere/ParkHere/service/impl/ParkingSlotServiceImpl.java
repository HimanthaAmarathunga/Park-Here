package ParkHere.ParkHere.service.impl;

import ParkHere.ParkHere.model.ParkingSlot;
import ParkHere.ParkHere.repository.ParkingSlotRepository;
import ParkHere.ParkHere.service.ParkingSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ParkingSlotServiceImpl implements ParkingSlotService {

    @Autowired
    ParkingSlotRepository parkingSlotRepository;

    public ParkingSlot addParkingSlot(ParkingSlot parkingSlot) {
        return parkingSlotRepository.save(parkingSlot);
    }

    public List<ParkingSlot> getAllParkingSlots() {
        return (List<ParkingSlot>) parkingSlotRepository.findAll();
    }

    public ParkingSlot updateParkingSlot(ParkingSlot parkingSlot) {
        return parkingSlotRepository.save(parkingSlot);
    }

    public Optional<ParkingSlot> getParkingSlotById(String id) {
        return parkingSlotRepository.findById(id);
    }
}
