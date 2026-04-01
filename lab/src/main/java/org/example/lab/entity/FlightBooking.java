package org.example.lab.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "booking")
public class FlightBooking {
    @Id
    @Column(name = "booking_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;

    @Column(name = "flight_id")
    private Integer flightId;

    @Column(name = "customer_id")
    private Integer customerId;

    public FlightBooking() {
    }

    public FlightBooking(Integer flightId, Integer customerId) {
        this.flightId = flightId;
        this.customerId = customerId;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
