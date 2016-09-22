package fachada;

import controles.*;
import beans.*;

public interface IFachada {
	
	void cadastrarFuncionario( Funcionario func);
	void cadastrarCamisa(Object objeto);
	void cadastrarCliente(Object objeto);
	void cadastrarCalca(Object objeto);
	void cadastrarOculos(Object objeto);
	void cadastrarBermuda(Bermudas berm);
	
	Bermudas listar(Bermudas berm);
	Camisa listar(Camisa camisa);
	Calca listar(Calca calca);
	Oculos listar(Oculos oculos);
	Funcionario listar(Object objeto);
	
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
	Bermudas buscaBermuda(Object objeto);
	
	Bermudas buscaCodBerm(int cod);
	Camisa buscaCodCam (int cod);
	Calca buscaCodCal(int cod);
	Oculos buscaCodOculos(int cod);
	
	
	
	boolean verificaLogin(String login);
	Funcionario logar(String login, String senha);
	
	void vender(Object objeto);
	

}