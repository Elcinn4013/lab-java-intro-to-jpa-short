package org.example.lab.repository;

import org.example.lab.entity.Customer;
import org.example.lab.entity.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer> {
    List<FlightBooking> findByCustomerId(Integer customerId);

    List<FlightBooking> findByFlightId(Integer flightId);
}
