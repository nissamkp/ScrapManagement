package net.javaguides.shipping.controller;

import net.javaguides.shipping.dto.ShipmentRequest;
import net.javaguides.shipping.dto.ShipmentResponse;
import net.javaguides.shipping.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shipments")
public class ShippingController {
    @Autowired
    ShippingService service;

    public ShippingController(ShippingService service) {
        this.service = service;
    }

    @PostMapping
    public ShipmentResponse createShipment(@RequestBody ShipmentRequest request) {
        return service.createShipment(request);
    }

    @GetMapping("/{orderId}")
    public ShipmentResponse trackShipment(@PathVariable String orderId) {
        return service.trackShipment(orderId);
    }
}