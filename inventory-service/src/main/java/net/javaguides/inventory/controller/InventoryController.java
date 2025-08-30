package net.javaguides.inventory.controller;

import net.javaguides.inventory.model.Inventory;
import net.javaguides.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
    @Autowired
    InventoryService inventoryService;

    @GetMapping("/{skuCode}")
    public ResponseEntity<Boolean> isInStock(@PathVariable String skuCode) {
        boolean inStock = inventoryService.isInStock(skuCode);
        return ResponseEntity.ok(inStock);
    }

    @PostMapping("/{skuCode}")
    public ResponseEntity<Inventory> updateStock(@PathVariable String skuCode,
                                                 @RequestParam int quantity) {
        Inventory updatedInventory = inventoryService.updateStock(skuCode, quantity);
        return ResponseEntity.ok(updatedInventory);
    }
}
