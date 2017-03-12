package fachada;

import java.util.ArrayList;

import beans.Bermudas;
import beans.Calca;
import beans.Camisa;
import beans.Funcionario;
import beans.Oculos;
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
	public void cadastrarCamisa(Camisa camisa) {
		this.cadastroCamisa.cadastrar(camisa);
		
	}

	@Override
	public void cadastrarCliente(Object objeto) {
		// SÓ NO FUTURO
		
	}

	@Override
	public void cadastrarCalca(Calca calca) {
		this.cadastroCalca.cadastrar(calca);
		
	}

	@Override
	public void cadastrarOculos(Oculos oculos) {
		this.cadastroOculos.cadastrar(oculos);
		
	}

	@Override
	public void cadastrarBermuda(Bermudas berm) {
		this.cadastroBermudas.cadastrar(berm);
		
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
	public Bermudas buscaBermuda(Object objeto) {
		Bermudas aux;
		
		aux = this.cadastroBermudas.buscar(objeto);
		
		return aux;
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
	public Funcionario listarFunc() {
		
		
		
		return this.cadastroFuncionario.listar();
	}

	@Override
	public boolean verificaLogin(String login) {
		boolean confirma;
		confirma = this.cadastroFuncionario.verificaLogin(login);
		return confirma;
	}
	@Override
	public ArrayList<Bermudas> listarBermuda() {
		ArrayList<Bermudas> bermuda = new ArrayList<Bermudas>();
		bermuda = this.cadastroBermudas.listar();
		return bermuda;
	}
	@Override
	public ArrayList<Camisa> listarCamisa() {
		ArrayList<Camisa> camisa = new ArrayList<Camisa>();
		camisa = this.cadastroCamisa.listar();
		return camisa;
	}
	@Override
	public ArrayList<Calca> listarCalca() {
		ArrayList<Calca>calca = new ArrayList<Calca>();
		calca = this.cadastroCalca.listar();
		return calca;
	}
	@Override
	public ArrayList<Oculos> listarOculos() {
		ArrayList<Oculos> oculos = new ArrayList<Oculos>();
		oculos = this.cadastroOculos.listar();
		return oculos;
	}
	@Override
	public Bermudas buscaCodBerm(int cod) {
		Bermudas berm;
		berm = this.cadastroBermudas.buscarCod(cod);
		return berm;
	}
	@Override
	public Camisa buscaCodCam(int cod) {
		Camisa camisa;
		camisa = this.cadastroCamisa.buscarCod(cod);
		return camisa;
	}
	@Override
	public Calca buscaCodCal(int cod) {
		Calca calca;
		calca = this.cadastroCalca.buscarCod(cod);
		return calca;
	}
	@Override
	public Oculos buscaCodOculos(int cod) {
		Oculos oculos;
		oculos = this.cadastroOculos.buscarCod(cod);
		return oculos;
	}

}