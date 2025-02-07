package org.tickify.service

import org.springframework.stereotype.Service
import org.tickify.repository.SeatRepository
import org.tickify.repository.TicketRepository

@Service
class TicketService(
    val ticketRepository: TicketRepository,
    val seatRepository: SeatRepository
) {
}