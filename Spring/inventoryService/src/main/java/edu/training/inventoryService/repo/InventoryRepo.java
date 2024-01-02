package edu.training.inventoryService.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.training.inventoryService.model.Inventory;

public interface InventoryRepo extends JpaRepository<Inventory, Integer> 
{
    List<Inventory> findByNameIn(List<String> name); 
}
