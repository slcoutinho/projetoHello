package br.com.coutinhocorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Produto;

//Anotações - sao comentarios uteis
@RestController
public class HelloController {

	@GetMapping("/hello")
	public String digaOla() {
		// return "Ola mundo! Bem-vindos ao primeiro exemplo SpringBoot";
		return "<html><body><h1>Ola mundo! Bem-vindos ao primeiro exemplo SpringBoot<hr></h1></body></html>";
	}

	@GetMapping("/produto")
	public Produto mostraProduto() {
		Produto p = new Produto();
		p.setId(987600);
		p.setDescricao("Computador Core i5, RAM: 16 GB, HD: 1TB, Placa grafica: GTX 1080");
		p.setPreco(4000.0f);
		p.setEstoque(134);
		return p;
	}
}