package org.tickify.service

import org.springframework.stereotype.Service
import org.tickify.repository.ClientRepository
import org.tickify.repository.ReservationRepository

@Service
class ClientService(
    val clientRepository: ClientRepository,
    val reservationRepository: ReservationRepository
) {
}