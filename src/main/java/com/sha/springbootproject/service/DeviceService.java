package com.sha.springbootproject.service;

import java.util.List;
import com.sha.springbootproject.model.Device;

public interface DeviceService {
    Device saveDevice(Device device);
    void deleteDevice(Long id);
    List<Device> findAllDevices();
}
