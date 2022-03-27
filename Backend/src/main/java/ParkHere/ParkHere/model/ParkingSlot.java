package ParkHere.ParkHere.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "slots")
public class ParkingSlot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "slotNumber")
    private int slotNumber = 0;

    @Column(name = "vehicleNumber")
    private String vehicleNumber;

    @Column(name = "ownerNic")
    private String ownerNic;

    @Column(name = "arrivalTime")
    private LocalDateTime arrivalTime;

    @Column(name = "departureTime")
    private LocalDateTime departureTime;

    public ParkingSlot() {

    }

    @Autowired
    public ParkingSlot(long id, int slotNumber, String vehicleNumber, String ownerNic, LocalDateTime arrivalTime, LocalDateTime departureTime) {
        this.id = id;
        this.slotNumber = slotNumber;
        this.vehicleNumber = vehicleNumber;
        this.ownerNic = ownerNic;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerNic() {
        return ownerNic;
    }

    public void setOwnerNic(String ownerNic) {
        this.ownerNic = ownerNic;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }
}