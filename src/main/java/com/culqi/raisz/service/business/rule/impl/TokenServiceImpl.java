package com.culqi.raisz.service.business.rule.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.culqi.raisz.service.business.dto.BinTarjetaResponse;
import com.culqi.raisz.service.business.rule.TokenService;

@Service
public class TokenServiceImpl implements TokenService{
	
	String url = "https://lookup.binlist.net/";

	@Override
	public BinTarjetaResponse invocarServicioBinTarjeta(String bin) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(url + bin, BinTarjetaResponse.class);
		
	}

}
