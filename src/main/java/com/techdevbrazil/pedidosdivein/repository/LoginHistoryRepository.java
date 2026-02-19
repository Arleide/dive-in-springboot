package com.techdevbrazil.pedidosdivein.repository;

import com.techdevbrazil.pedidosdivein.entity.LoginHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginHistoryRepository extends JpaRepository<LoginHistory, Long> {

}
