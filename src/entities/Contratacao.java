package entities;

import java.util.Date;

import entities.enums.Cargo;
import entities.enums.Status;

public class Contratacao {
	private Date dataI;
	private Cargo cargo;
	private Status status;
	private Projeto projeto;
	private Funcionario funcionario;

	public Contratacao(Date date, Cargo cargo, Funcionario funcionario, Projeto projeto) {
		this.dataI = new Date();
		this.status = Status.PENDENTE;
		projeto.adicionarContratacao(this);
		this.projeto = projeto;
		this.funcionario = funcionario;
	}

	public void pendente() {
		this.status = Status.PENDENTE;
	}

	public void contratar() {
		this.status = Status.CONTRATADO;
	}

	public void demitir() {
		this.status = Status.DEMITIDO;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public Date getDataI() {
		return dataI;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public Status getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Contratacao [dataI=" + dataI + ", cargo=" + cargo + ", status=" + status + ", projeto=" + projeto
				+ ", funcionario=" + funcionario + "]";
	}
}
