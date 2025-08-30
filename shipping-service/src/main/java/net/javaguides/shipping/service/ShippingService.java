package net.javaguides.shipping.service;

import net.javaguides.shipping.dto.ShipmentRequest;
import net.javaguides.shipping.dto.ShipmentResponse;
import net.javaguides.shipping.model.Shipment;
import net.javaguides.shipping.repository.ShipmentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ShippingService {

    private final ShipmentRepository repository;

    public ShippingService(ShipmentRepository repository) {
        this.repository = repository;
    }

    public ShipmentResponse createShipment(ShipmentRequest request) {
        Shipment shipment = new Shipment();
        shipment.setOrderId(request.getOrderId());
        shipment.setStatus("CREATED");
        shipment.setShippedAt(LocalDateTime.now());

        Shipment saved = repository.save(shipment);

        ShipmentResponse response = new ShipmentResponse();
        response.setId(saved.getId());
        response.setOrderId(saved.getOrderId());
        response.setStatus(saved.getStatus());
        response.setShippedAt(saved.getShippedAt());

        return response;
    }

    public ShipmentResponse trackShipment(String orderId) {
        Shipment shipment = repository.findByOrderId(orderId)
                .orElseThrow(() -> new RuntimeException("Shipment not found"));

        ShipmentResponse response = new ShipmentResponse();
        response.setId(shipment.getId());
        response.setOrderId(shipment.getOrderId());
        response.setStatus(shipment.getStatus());
        response.setShippedAt(shipment.getShippedAt());

        return response;
    }
}
