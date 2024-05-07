package org.springframework.samples.petclinic.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.JSON.JsonParser;

public class InventoryData {

	private String system;

	private int itemsInStock;

	private boolean isOperating;

	public InventoryData(String system, int itemsInStock, boolean isOperating) {
		this.system = system;
		this.itemsInStock = itemsInStock;
		this.isOperating = isOperating;
	}

	// Getters et setters
	public String getSystem() {
		return system;
	}

	public int getItemsInStock() {
		return itemsInStock;
	}

	public boolean isOperating() {
		return isOperating;
	}

}
