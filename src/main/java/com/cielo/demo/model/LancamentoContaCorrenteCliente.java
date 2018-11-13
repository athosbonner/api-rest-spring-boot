package com.cielo.demo.model;

import java.io.Serializable;
import java.util.List;

public class LancamentoContaCorrenteCliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String numeroRemessaBanco;
	private List<DadosAnaliticoLancamentoFinanceiroCliente> dadosAnaliticoLancamentoFinanceiroCliente;
	private String nomeSituacaoRemessa;
	private DadosDomicilioBancario dadosDomicilioBancario;
	private String nomeTipoOperacao;
	
	public String getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}
	public void setNumeroRemessaBanco(String numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}
	public List<DadosAnaliticoLancamentoFinanceiroCliente> getDadosAnaliticoLancamentoFinanceiroCliente() {
		return dadosAnaliticoLancamentoFinanceiroCliente;
	}
	public void setDadosAnaliticoLancamentoFinanceiroCliente(
			List<DadosAnaliticoLancamentoFinanceiroCliente> dadosAnaliticoLancamentoFinanceiroCliente) {
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}
	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}
	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}
	public DadosDomicilioBancario getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}
	public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}
	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}
	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dadosAnaliticoLancamentoFinanceiroCliente == null) ? 0
				: dadosAnaliticoLancamentoFinanceiroCliente.hashCode());
		result = prime * result + ((dadosDomicilioBancario == null) ? 0 : dadosDomicilioBancario.hashCode());
		result = prime * result + ((nomeSituacaoRemessa == null) ? 0 : nomeSituacaoRemessa.hashCode());
		result = prime * result + ((nomeTipoOperacao == null) ? 0 : nomeTipoOperacao.hashCode());
		result = prime * result + ((numeroRemessaBanco == null) ? 0 : numeroRemessaBanco.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LancamentoContaCorrenteCliente other = (LancamentoContaCorrenteCliente) obj;
		if (dadosAnaliticoLancamentoFinanceiroCliente == null) {
			if (other.dadosAnaliticoLancamentoFinanceiroCliente != null)
				return false;
		} else if (!dadosAnaliticoLancamentoFinanceiroCliente.equals(other.dadosAnaliticoLancamentoFinanceiroCliente))
			return false;
		if (dadosDomicilioBancario == null) {
			if (other.dadosDomicilioBancario != null)
				return false;
		} else if (!dadosDomicilioBancario.equals(other.dadosDomicilioBancario))
			return false;
		if (nomeSituacaoRemessa == null) {
			if (other.nomeSituacaoRemessa != null)
				return false;
		} else if (!nomeSituacaoRemessa.equals(other.nomeSituacaoRemessa))
			return false;
		if (nomeTipoOperacao == null) {
			if (other.nomeTipoOperacao != null)
				return false;
		} else if (!nomeTipoOperacao.equals(other.nomeTipoOperacao))
			return false;
		if (numeroRemessaBanco == null) {
			if (other.numeroRemessaBanco != null)
				return false;
		} else if (!numeroRemessaBanco.equals(other.numeroRemessaBanco))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LancamentoContaCorrenteCliente [numeroRemessaBanco=" + numeroRemessaBanco
				+ ", dadosAnaliticoLancamentoFinanceiroCliente=" + dadosAnaliticoLancamentoFinanceiroCliente
				+ ", nomeSituacaoRemessa=" + nomeSituacaoRemessa + ", dadosDomicilioBancario=" + dadosDomicilioBancario
				+ ", nomeTipoOperacao=" + nomeTipoOperacao + "]";
	}
	
	
}
