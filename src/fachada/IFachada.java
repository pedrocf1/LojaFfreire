package fachada;

import controles.*;

import java.util.ArrayList;

import beans.*;

public interface IFachada {
	
	void cadastrarFuncionario( Funcionario func);
	void cadastrarCamisa(Camisa camisa);
	void cadastrarCliente(Object objeto);
	void cadastrarCalca(Calca calca);
	void cadastrarOculos(Oculos oculos);
	void cadastrarBermuda(Bermudas berm);
	
	ArrayList<Bermudas> listarBermuda();
	ArrayList<Camisa> listarCamisa();
	ArrayList<Calca> listarCalca();
	ArrayList<Oculos> listarOculos();
	Funcionario listarFunc();
	
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