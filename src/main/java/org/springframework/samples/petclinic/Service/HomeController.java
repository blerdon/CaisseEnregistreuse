package org.springframework.samples.petclinic.Service;

import org.springframework.samples.petclinic.JSON.JsonParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	public HomeController() {
		JsonParser js = new JsonParser();
	}

	@GetMapping("/")
	public String homePage(Model model) {
		// Création de l'objet InventoryData
		InventoryData data = new InventoryData("Lightspeed", 150, true);
		// Ajout de l'objet data au modèle
		model.addAttribute("inventoryData", data);
		return "fragments/index";
	}

	@GetMapping("/charts")
	public String chartsPage(Model model) {
		return "fragments/charts";
	}

}
