package com.sha.springbootproject.service;

import java.time.LocalDateTime;
import java.util.List;
import com.sha.springbootproject.model.Device;
import com.sha.springbootproject.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    private DeviceRepository deviceRepository;

    @Override
    public Device saveDevice(Device device){
        device.setCreateTime(LocalDateTime.now());

        return deviceRepository.save(device);
    }

    @Override
    public void deleteDevice(Long id){
        deviceRepository.deleteById(id);
    }

    @Override
    public List<Device> findAllDevices(){
        return deviceRepository.findAll();
    }
}
