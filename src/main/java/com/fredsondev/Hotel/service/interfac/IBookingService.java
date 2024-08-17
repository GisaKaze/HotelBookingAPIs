package com.fredsondev.Hotel.service.interfac;

import com.fredsondev.Hotel.dto.Response;
import com.fredsondev.Hotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
