package org.springframework.samples.petclinic.JSON;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.Service.InventoryData;

public class InventoryDataService {

	@Autowired
	private JsonParser jsonParser;

	public String processInventoryDataToJson(InventoryData data) throws JsonProcessingException {
		return jsonParser.toJson(data);
	}

	public InventoryData processJsonToInventoryData(String jsonData) throws JsonProcessingException {
		return jsonParser.fromJson(jsonData);
	}

}
