package org.tickify.service

import org.springframework.stereotype.Service
import org.tickify.repository.EventRepository

@Service
class EventService(
    val eventRepository: EventRepository
){
}