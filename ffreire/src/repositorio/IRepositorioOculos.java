package repositorio;

import java.util.ArrayList;

import beans.Oculos;

public interface IRepositorioOculos {
	
	void cadastrar(Oculos oculos);
	void remover(Object objeto);
	Oculos buscar(Object objeto);
	Oculos buscarCod(int cod);
	void atualizar(Object objeto);
	ArrayList<Oculos> listar();
}
