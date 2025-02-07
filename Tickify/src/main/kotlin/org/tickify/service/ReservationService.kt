package org.tickify.service

import org.springframework.stereotype.Service
import org.tickify.repository.ReservationRepository

@Service
class ReservationService(
    val reservationRepository: ReservationRepository
) {
}