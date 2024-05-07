package org.springframework.samples.petclinic.JSON;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.samples.petclinic.Service.InventoryData;

public class JsonParser {

	private ObjectMapper mapper;

	public JsonParser() {
		this.mapper = new ObjectMapper(); // Création de l'instance ObjectMapper
	}

	// Méthode pour désérialiser JSON en InventoryData
	public InventoryData fromJson(String json) throws JsonProcessingException {
		return mapper.readValue(json, InventoryData.class);
	}

	// Méthode pour sérialiser InventoryData en JSON
	public String toJson(InventoryData data) throws JsonProcessingException {
		return mapper.writeValueAsString(data);
	}

}
