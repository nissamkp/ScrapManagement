package net.javaguides.inventory.service;


import lombok.RequiredArgsConstructor;
import net.javaguides.inventory.model.Inventory;
import net.javaguides.inventory.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InventoryService {
    @Autowired
    InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode) {
        Optional<Inventory> inventory = inventoryRepository.findBySkuCode(skuCode);
        return inventory.map(i -> i.getQuantity() > 0).orElse(false);
    }

    public Inventory updateStock(String skuCode, int quantity) {
        Inventory inventory = inventoryRepository.findBySkuCode(skuCode)
                .orElse(new Inventory(null, skuCode, 0));
        inventory.setQuantity(inventory.getQuantity() + quantity);
        return inventoryRepository.save(inventory);
    }
}
