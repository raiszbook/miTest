package com.culqi.raisz.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.culqi.raisz.rest.dto.TokenDTORequest;
import com.culqi.raisz.rest.dto.TokenDTOResponse;
import com.culqi.raisz.rest.utils.DateUtil;
import com.culqi.raisz.service.business.rule.TarjetaService;

@RestController
public class TarjetaRestController {
	
	@Autowired
	private TarjetaService tarjetaService;	
	
	@PostMapping(value = "/card/tokens", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, 
			consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public TokenDTOResponse generarToken(@RequestBody TokenDTORequest tokenDTORequest) {	
		
		String brand = tarjetaService.generarToken(tokenDTORequest.getPan());  
		StringBuilder newToken = new StringBuilder()
								.append("tkn_live_")
								.append(tokenDTORequest.getPan())
								.append("2020-10");
	
		return new TokenDTOResponse(newToken.toString(), brand, DateUtil.convertirFechaActualAString());		
		
	}	
	
}