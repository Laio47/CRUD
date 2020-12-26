package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import model.Livro;
import services.MeusServicos;

@Controller
public class Controlador {

	@Autowired
	private MeusServicos servico;

	@GetMapping("/") // o endereco depois da barra"localhost:XXXX/AllafterAtGetmapping
	public String iniciar() {
		// but here are in whute label
		ModelAndView exibir = new ModelAndView();
		// exibir.setViewName("general.html");
		return "general.html";
	}

	/* * PRO MODEL RETURN STRING */
	/*
	 * POST ++ > arregar java ==> Bc.D GET == > carragr html pro java
	 */

	@GetMapping("/cadastro")
	public String carregarCadastrar(@PathVariable(required = false) Integer id, Model m) {
		// esse carrega
		/*
		 * ModelAndView exibir = new ModelAndView(); exibir.setViewName("cadastro");
		 */
		// exibir.addObject("umlivro", umlivro);*/
		/*
		 * problema == > ele se choca com o id um já exististente solução==> fazer com
		 * que faca registro no proximo id null que tiver
		 */

		String mode;
		Livro l;
		if (id == null) {
			mode = "create";
			l = new Livro();
		} else {
			mode = "update";
			l = servico.findThings(id);
		}

		m.addAttribute("cadastro", l);
		m.addAttribute("mode", mode);

		return "/cadastro";
	}

	@PostMapping("/cadastro")
	public String cadastrarLivros(@ModelAttribute Livro umlivro) {
		// esse salva
		// try {
		servico.cadastrar(umlivro);
		/*
		 * }catch(Exception e) { System.err.println("ERRO DE LEITURA" +
		 * e.getLocalizedMessage());}
		 */

		return "/cadastro";
	}

	@GetMapping("/edicao")
	public String CarregarEdicao(Model m) {

		Livro l = new Livro();
		m.addAttribute("cadastro", l);

		return "/edicao";
	}

	@PostMapping("/edicao")
	public String Editarlivros(@PathVariable(required = false) Integer id, Livro umlivro) {

		// try{
		servico.EscolherPorId(umlivro.getId());
		/* o erro é quando atualiza gera um novo registro nullo */
		servico.cadastrar(umlivro);
		/*
		 * }catch(Exception e) { System.err.println("ERRO DE eedicao" +
		 * e.getLocalizedMessage()); }
		 */

		return "/edicao";
	}

	@GetMapping("/detalhes")
	public String detalharLivros(Model model) {

		/*
		 * ModelAndView exibir = new ModelAndView();
		 * exibir.setViewName("detalhes.html");
		 */

		// try {// exibir.addObject("lista", servico.listar());
		List<Livro> biblix = servico.listar();
		model.addAttribute("lista", biblix);
		/*
		 * * for(Livro l: biblix) System.out.println("HERE==>" + biblix.toString());
		 */
		/*
		 * } catch (Exception e) { System.err.println("ERRO ao EXIBIR LOL" +
		 * e.getMessage()); }
		 */

		return "/detalhes";
	}

	//@GetMapping("/exclusao")
	@GetMapping({"/exclusao/{id}", "/exclusao"})
	public String CadastrarExclusao(Model m) {

		Livro l = new Livro();
		m.addAttribute("excluir", l);

		/* metodo pra receber o metodo pra carregar e apagar */
		return "/exclusao";
	}

	@PostMapping("/exclusao")
	public String delete(Livro umlivro) {
		// @PathVariable(required = false, name = "id") Integer id umlivro.getId()
		// try {
		// if (umlivro.getId() != (null) )
		servico.delete(umlivro.getId());
		// else {
		// System.out.println("nao excluido"); }
		/*
		 * }catch (Exception e) { System.err.println("ERRO DE exclusao" +
		 * e.getLocalizedMessage()); }
		 */
		return "/exclusao";
	}

	/* ATTENCION: ==>> NOTHING MORE AT IMPORTANT AT HERE DOWN !!!!!!!! */

	@GetMapping("/paginaAlpha")
	public String paginaAlfa(Model model) {
		model.addAttribute("");
		/*
		 * //Model model02 = null ; model.addAttribute("general.html");
		 **
		 * //return "redirect:/general.html";
		 */// exibir.setViewName("redirect:/general");
		return "/pagina";
	}

	/*
	 * /*ModelAndView exibir = new ModelAndView();
	 * exibir.setViewName("exclusao.html"); try { List<Livro> todos =
	 * servico.listar(); for(int i=0;i<todos.size();i++) { if(umlivro.getId() ==
	 * todos.get(i).getId()) { servico.excluir(umlivro);
	 * System.out.println("excluido");
	 * 
	 * 
	 * } } } catch (Exception e) { System.err.println("ERRO DE exclusao"); }
	 */
	// try {
	/// long idio = umlivro.getId();
	// System.out.println("o idio eh ==> " + idio);

	/*
	 * }catch (Exception e) { System.err.println("ERRO DE exclusao" +
	 * e.getLocalizedMessage());
	 */

	/*
	 * @GetMapping("/editar02") public ModelAndView editar(@PathVariable("id") Long
	 * id, Livro umlivro) {
	 * 
	 * depois ataulizar melhor esse codigo ModelAndView exibir = new ModelAndView();
	 * exibir.setViewName("edicao.html"); Optional<Livro> l =
	 * servico.EscolherPorId2(1); // System.out.println("eis o esolhido" +
	 * l.toString() ); //Optional<Livro> l; try { // l =
	 * servico.EscolherPorId2(umlivro.getId()); servico.cadastrar(umlivro);
	 * System.out.println("alterado"); } catch (Exception e) {
	 * System.err.println("ERRO DE edicao" + e.getLocalizedMessage()); }
	 * 
	 * return exibir; }
	 */

}
