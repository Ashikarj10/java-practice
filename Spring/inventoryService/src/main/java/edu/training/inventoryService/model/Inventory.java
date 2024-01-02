package edu.training.inventoryService.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Inventory 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
     private Integer invenId;
     private String proName;
     private Integer proQuantity;
}
