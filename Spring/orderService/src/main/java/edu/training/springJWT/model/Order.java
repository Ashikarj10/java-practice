package edu.training.springJWT.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="t_table")
public class Order {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer orderId;
	private String orderNo;
	@OneToMany(cascade=CascadeType.ALL)
	private List<OrderLineItems> orderLineItems;
}
