package fachada;

import beans.Funcionario;
import controles.*;


public class Fachada implements IFachada{
	
	private ICadastroBermudas cadastroBermudas;
	private ICadastroCalca cadastroCalca;
	private ICadastroCamisa cadastroCamisa;
	private ICadastroFuncionario cadastroFuncionario;
	private ICadastroOculos cadastroOculos;
	public static Fachada instance;
	
	private Fachada(){
		
		this.cadastroBermudas = new CadastroBermudas();
		this.cadastroCalca = new CadastroCalca();
		this.cadastroCamisa = new CadastroCamisa();
		this.cadastroFuncionario = new CadastroFuncionario();
		this.cadastroOculos = new CadastroOculos();		
		
	}
	public static Fachada getInstance(){
		if(instance==null)
			instance = new Fachada();
		return instance;
	}

	@Override
	public void cadastrarFuncionario(Funcionario func) {
		this.cadastroFuncionario.cadastrar(func);
		
	}

	@Override
	public void cadastrarCamisa(Object objeto) {
		this.cadastroCamisa.cadastrar(objeto);
		
	}

	@Override
	public void cadastrarCliente(Object objeto) {
		// SÓ NO FUTURO
		
	}

	@Override
	public void cadastrarCalca(Object objeto) {
		this.cadastroCalca.cadastrar(objeto);
		
	}

	@Override
	public void cadastrarOculos(Object objeto) {
		this.cadastroOculos.cadastrar(objeto);
		
	}

	@Override
	public void cadastrarBermuda(Object objeto) {
		this.cadastroBermudas.cadastrar(objeto);
		
	}

	@Override
	public void atualizaFuncionario(Object objeto) {
		this.cadastroFuncionario.atualizar(objeto);
		
	}

	@Override
	public void atualizaCamisa(Object objeto) {
		this.cadastroCamisa.atualizar(objeto);
		
	}

	@Override
	public void atualizaCliente(Object objeto) {
		//SÓ NO FUTURO
		
	}

	@Override
	public void atualizaCalca(Object objeto) {
		this.cadastroCalca.atualizar(objeto);
		
	}

	@Override
	public void atualizaOculos(Object objeto) {
		this.cadastroOculos.atualizar(objeto);
		
	}

	@Override
	public void atualizaBermuda(Object objeto) {
		this.cadastroBermudas.atualizar(objeto);
		
	}

	@Override
	public void excluiFuncionario(Object objeto) {
		this.cadastroFuncionario.remover(objeto);
		
	}

	@Override
	public void excluiCamisa(Object objeto) {
		this.cadastroCamisa.remover(objeto);
		
	}

	@Override
	public void excluiCliente(Object objeto) {
		// SÓ NO FUTURO
		
	}

	@Override
	public void excluiCalca(Object objeto) {
		this.cadastroCalca.remover(objeto);
		
	}

	@Override
	public void excluiOculos(Object objeto) {
		this.cadastroOculos.remover(objeto);
		
	}

	@Override
	public void excluiBermuda(Object objeto) {
		this.cadastroBermudas.remover(objeto);
		
	}

	@Override
	public Funcionario buscaFuncionario(Object objeto) {
		this.cadastroFuncionario.buscar(objeto);
		return ((Funcionario)objeto);
	}

	@Override
	public void buscaCamisa(Object objeto) {
		this.cadastroCamisa.buscar(objeto);
		
	}

	@Override
	public void buscaCliente(Object objeto) {
		//SÓ NO FUTURO
		
	}

	@Override
	public void buscaCalca(Object objeto) {
		this.cadastroCalca.buscar(objeto);
		
	}

	@Override
	public void buscaOculos(Object objeto) {
		this.cadastroOculos.buscar(objeto);
		
	}

	@Override
	public void buscaBermuda(Object objeto) {
		this.cadastroBermudas.buscar(objeto);
		
	}

	

	@Override
	public void vender(Object objeto) {
		// AINDA TEM QUE IMPLEMENTAR
		
	}

	public Funcionario logar(String login, String senha) {
		Funcionario aux = null;
		
		aux = this.cadastroFuncionario.login(login,senha);
		
		return aux;
	}

	@Override
	public Funcionario listar(Object objeto) {
		
		
		
		return this.cadastroFuncionario.listar();
	}

	@Override
	public boolean verificaLogin(String login) {
		boolean confirma;
		confirma = this.cadastroFuncionario.verificaLogin(login);
		return confirma;
	}

}
