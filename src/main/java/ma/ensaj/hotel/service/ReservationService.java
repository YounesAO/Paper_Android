package ma.ensaj.hotel.service;

import ma.ensaj.hotel.entity.Reservation;
import ma.ensaj.hotel.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Optional<Reservation> getReservationById(Long id) {
        return reservationRepository.findById(id);
    }

    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
