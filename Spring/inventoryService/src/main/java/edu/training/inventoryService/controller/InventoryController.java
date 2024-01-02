package edu.training.inventoryService.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.training.inventoryService.model.RequestInventory;
import edu.training.inventoryService.service.InventoryService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/inventory")
@RequiredArgsConstructor
public class InventoryController 
{
	private final InventoryService inventoryServ;
	
	@GetMapping
   public List<RequestInventory> isInStock(@RequestBody List<String> name)
   {
	return null;
	   
   }
}
