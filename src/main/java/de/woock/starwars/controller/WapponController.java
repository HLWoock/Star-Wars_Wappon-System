package de.woock.starwars.controller;

import static org.springframework.http.HttpStatus.OK;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import de.woock.starwars.service.WapponService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class WapponController {
	
	private WapponService wapponService;

	@GetMapping("/active")
	@ResponseStatus(OK)
	public Boolean active() {
		return wapponService.active();
	}
}
