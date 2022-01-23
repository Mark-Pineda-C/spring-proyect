package com.sha.springbootproject.model;

import java.time.LocalDateTime;
//import java.util.Set;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "devices")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", nullable = false, length = 1000)
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "deviceType", nullable = false)
    private DeviceType deviceType;

    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "device")
    //private Set<Purchase> purchaselist;
}
