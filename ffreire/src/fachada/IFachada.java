package fachada;

import controles.*;
import beans.*;

public interface IFachada {
	
	void cadastrarFuncionario( Funcionario func);
	void cadastrarCamisa(Object objeto);
	void cadastrarCliente(Object objeto);
	void cadastrarCalca(Object objeto);
	void cadastrarOculos(Object objeto);
	void cadastrarBermuda(Object objeto);
	
	void atualizaFuncionario( Object objeto);
	void atualizaCamisa(Object objeto);
	void atualizaCliente(Object objeto);
	void atualizaCalca(Object objeto);
	void atualizaOculos(Object objeto);
	void atualizaBermuda(Object objeto);
	
	void excluiFuncionario( Object objeto);
	void excluiCamisa(Object objeto);
	void excluiCliente(Object objeto);
	void excluiCalca(Object objeto);
	void excluiOculos(Object objeto);
	void excluiBermuda(Object objeto);
	
	Funcionario buscaFuncionario( Object objeto);
	void buscaCamisa(Object objeto);
	void buscaCliente(Object objeto);
	void buscaCalca(Object objeto);
	void buscaOculos(Object objeto);
	void buscaBermuda(Object objeto);
	
	Funcionario listar(Object objeto);
	
	boolean verificaLogin(String login);
	Funcionario logar(String login, String senha);
	
	void vender(Object objeto);
	

}