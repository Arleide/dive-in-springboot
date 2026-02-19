package com.techdevbrazil.pedidosdivein.service;

import com.techdevbrazil.pedidosdivein.entity.LoginHistory;
import com.techdevbrazil.pedidosdivein.repository.LoginHistoryRepository;
import com.techdevbrazil.pedidosdivein.security.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LoginHistoryService {

    private final LoginHistoryRepository loginHistoryRepository;


    public void save(CustomUserDetails user, String token) {
        LoginHistory history = new LoginHistory();
        history.setUserId(user.getId());
        history.setEmail(user.getEmail());
        history.setAccessToken(token);
        loginHistoryRepository.save(history);
    }
}
