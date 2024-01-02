package edu.training.inventoryService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.training.inventoryService.model.Inventory;
import edu.training.inventoryService.model.RequestInventory;
import edu.training.inventoryService.repo.InventoryRepo;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService 
{
  private final InventoryRepo inventoryRepo;
  
  public List<RequestInventory> isInStock(List<String> name)
  {
	 List<Inventory> iList= inventoryRepo.findByNameIn(name);
	 List<RequestInventory> riList=iList.stream().map(product->mapToRequestInventory(product)).toList();
	 
	return null;
  }

public RequestInventory mapToRequestInventory(Inventory inv) {
	
	return RequestInventory.builder()
			.name(inv.getProName())
			.quantity(inv.getProQuantity()>0)
			.build();
}
  

}
