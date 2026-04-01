package org.example.lab.repository;

import org.example.lab.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
    public List<Flight> findByflightId(Flight flightId);
}
