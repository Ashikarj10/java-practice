package edu.training.springJWT.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Builder

@AllArgsConstructor

@NoArgsConstructor
public class OrderReq {

	public List<orderLineItemsDto> orderLineItemsDtoList;
}
