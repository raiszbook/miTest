package com.culqi.raisz.service.business.rule.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.culqi.raisz.service.business.dto.BinTarjetaResponse;
import com.culqi.raisz.service.business.rule.TarjetaService;
import com.culqi.raisz.service.business.rule.TokenService;

@Service
public class TarjetaServiceImpl implements TarjetaService{
	
	@Autowired
	private TokenService tokenService;

	@Override
	public String generarToken(String pan) {
		
		BinTarjetaResponse response = tokenService.invocarServicioBinTarjeta(pan.substring(0, 6));
		return response.getScheme();
		
	}

	
}
