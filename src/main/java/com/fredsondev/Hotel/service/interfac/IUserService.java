package com.fredsondev.Hotel.service.interfac;

import com.fredsondev.Hotel.dto.LoginRequest;
import com.fredsondev.Hotel.dto.Response;
import com.fredsondev.Hotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
