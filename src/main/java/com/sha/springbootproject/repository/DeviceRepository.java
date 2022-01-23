package com.sha.springbootproject.repository;

import com.sha.springbootproject.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long>{
    
}
