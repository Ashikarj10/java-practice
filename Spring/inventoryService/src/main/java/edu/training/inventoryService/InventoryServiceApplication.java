package edu.training.inventoryService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import edu.training.inventoryService.model.Inventory;
import edu.training.inventoryService.repo.InventoryRepo;

@SpringBootApplication
public class InventoryServiceApplication {
 
	
	@Bean
	public CommandLineRunner loadData(InventoryRepo inventoryRepo) {
		return args->{Inventory phone=Inventory.builder().build();
		phone.setProName("Iphone 15");
		phone.setProQuantity(10);
		inventoryRepo.save(phone);
		
		Inventory lap=Inventory.builder().build();
		lap.setProName("Infinix");
		lap.setProQuantity(8);
		inventoryRepo.save(lap);
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

}
