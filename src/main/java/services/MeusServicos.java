package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.MeusProcessos;
import dao.RepositorioLivros;
import model.Livro;


@Service
public class MeusServicos implements GenericosServicos<Livro, Integer> {
//Servicos tem a logica e Repositorio a execução, 
	//encapsula  repositorio dentro de servicos

	/*@Autowired
private MeusProcessos processar;*/
	
	@Autowired
	private RepositorioLivros repositar;//IGORAR NOMES , PRO SEU CASO
	
	
	@Override
	public void cadastrar(Livro l) {
		
		  repositar.save(l);// TODO Auto-generated method stub		
	}
	
	
	public Livro findThings(Integer id) {
		Optional<Livro> p = repositar.findById((long) id);
		return p.isPresent() ? p.get() : null;
	}
	
	
	public Livro salvar(Livro livro) {
		return repositar.save(livro);// TODO Auto-generated method stub		
	}

	@Override
	public List<Livro> listar() {
		//return repositar.findAll(Sort.by("registration").descending());
		return repositar.findAll();
	}

	@Override
	public void excluir(Livro livro, int i) {
		repositar.delete(livro);	
	}
	
	
	@Override
	public void delete(long id) {
		repositar.deleteById(id);
	}

	@Override
	public void excluir(Livro e) {
		repositar.delete(e);	
	}

	public void EscolherPorId(Long id) {
		 repositar.findById( id);		 
	}
	
	
	
	
	
	
	public Optional<Livro> EscolherPorId2(long id) {
		 return repositar.findById((long) id);
	}
	
	@Override
	public void EscolherPorId(int id) {
		// TODO Auto-generated method stub
		
	}

	

	
	@Override
	public Livro alterar(Livro livro) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	

	@Override
	public Livro detalhar(Livro livro) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public Optional<Livro> cadastrar(Optional<Livro> l) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}



	
	
	
	
	

}
