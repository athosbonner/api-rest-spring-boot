package com.cielo.demo.controller;

import java.io.File;
import java.io.IOException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cielo.demo.model.Conta;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ExtratoResouce {

	private Conta conta;

	public ExtratoResouce() throws Exception {

		String json = "C:\\Users\\athos.da.c.marinho\\Documents\\Desafio\\lancamento-conta-legado.json";
		ObjectMapper mapper = new ObjectMapper();

		try {
			conta = mapper.readValue(new File(json), Conta.class);

		} catch (IOException e) {
			throw new Exception(e.getMessage());
		}

	}

	@RequestMapping(value = "/extrato", method = RequestMethod.GET)
	public ResponseEntity<Conta> listar() {
		return new ResponseEntity<Conta>(conta, HttpStatus.OK);
	}

}
