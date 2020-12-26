package services;

import java.util.List;
import java.util.Optional;

import model.Livro;

public interface GenericosServicos<E, I> {

public void cadastrar(E e);	
	
public E alterar(E e);	

public E detalhar(E e);	

public List<E> listar();	

public void excluir(E e);

void excluir(Livro livro, int i);
void EscolherPorId(int id);

Optional<Livro> cadastrar(Optional<Livro> l);


void delete(int id);

void delete(Integer id);

void delete(long id);

	
}
