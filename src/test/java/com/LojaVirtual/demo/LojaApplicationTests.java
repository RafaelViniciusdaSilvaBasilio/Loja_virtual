package com.LojaVirtual.demo;

import com.LojaVirtual.demo.controller.AcessoController;
import com.LojaVirtual.demo.model.Acesso;
import com.LojaVirtual.demo.repository.AcessoRepository;
import com.LojaVirtual.demo.service.AcessoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = LojaApplication.class)
public class LojaApplicationTests {

	@Autowired
	private AcessoService acessoService;

//	@Autowired
//	private AcessoRepository acessoRepository;

	@Autowired
	private AcessoController acessoController;

	@Test
	public void testCadastraAcesso() {
		Acesso acesso = new Acesso();

		acesso.setDescricao("ROLE_ADMIN");

		acessoController.salvarAcesso(acesso);
	}

}
