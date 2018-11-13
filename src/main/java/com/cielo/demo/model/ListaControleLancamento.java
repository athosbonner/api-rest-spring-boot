package com.cielo.demo.model;

import java.io.Serializable;

public class ListaControleLancamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
	private String dataEfetivaLancamento;
	private String dataLancamentoContaCorrenteCliente;
	private String numeroEvento;
	private String descricaoGrupoPagamento;
	private String codigoIdentificadorUnico;
	private String nomeBanco;
	private String quantidadeLancamentoRemessa;
	private String numeroRaizCNPJ;
	private String numeroSufixoCNPJ;
	private String valorLancamentoRemessa;
	private String dateLancamentoContaCorrenteCliente;
	private String dateEfetivaLancamento;
	
	
	public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}
	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}
	public String getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}
	public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}
	public String getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}
	public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}
	public String getNumeroEvento() {
		return numeroEvento;
	}
	public void setNumeroEvento(String numeroEvento) {
		this.numeroEvento = numeroEvento;
	}
	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}
	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}
	public String getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}
	public void setCodigoIdentificadorUnico(String codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public String getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}
	public void setQuantidadeLancamentoRemessa(String quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}
	public String getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}
	public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}
	public String getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}
	public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}
	public String getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}
	public void setValorLancamentoRemessa(String valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}
	public String getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}
	public void setDateLancamentoContaCorrenteCliente(String dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}
	public String getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}
	public void setDateEfetivaLancamento(String dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoIdentificadorUnico == null) ? 0 : codigoIdentificadorUnico.hashCode());
		result = prime * result + ((dataEfetivaLancamento == null) ? 0 : dataEfetivaLancamento.hashCode());
		result = prime * result
				+ ((dataLancamentoContaCorrenteCliente == null) ? 0 : dataLancamentoContaCorrenteCliente.hashCode());
		result = prime * result + ((dateEfetivaLancamento == null) ? 0 : dateEfetivaLancamento.hashCode());
		result = prime * result
				+ ((dateLancamentoContaCorrenteCliente == null) ? 0 : dateLancamentoContaCorrenteCliente.hashCode());
		result = prime * result + ((descricaoGrupoPagamento == null) ? 0 : descricaoGrupoPagamento.hashCode());
		result = prime * result
				+ ((lancamentoContaCorrenteCliente == null) ? 0 : lancamentoContaCorrenteCliente.hashCode());
		result = prime * result + ((nomeBanco == null) ? 0 : nomeBanco.hashCode());
		result = prime * result + ((numeroEvento == null) ? 0 : numeroEvento.hashCode());
		result = prime * result + ((numeroRaizCNPJ == null) ? 0 : numeroRaizCNPJ.hashCode());
		result = prime * result + ((numeroSufixoCNPJ == null) ? 0 : numeroSufixoCNPJ.hashCode());
		result = prime * result + ((quantidadeLancamentoRemessa == null) ? 0 : quantidadeLancamentoRemessa.hashCode());
		result = prime * result + ((valorLancamentoRemessa == null) ? 0 : valorLancamentoRemessa.hashCode());
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
		ListaControleLancamento other = (ListaControleLancamento) obj;
		if (codigoIdentificadorUnico == null) {
			if (other.codigoIdentificadorUnico != null)
				return false;
		} else if (!codigoIdentificadorUnico.equals(other.codigoIdentificadorUnico))
			return false;
		if (dataEfetivaLancamento == null) {
			if (other.dataEfetivaLancamento != null)
				return false;
		} else if (!dataEfetivaLancamento.equals(other.dataEfetivaLancamento))
			return false;
		if (dataLancamentoContaCorrenteCliente == null) {
			if (other.dataLancamentoContaCorrenteCliente != null)
				return false;
		} else if (!dataLancamentoContaCorrenteCliente.equals(other.dataLancamentoContaCorrenteCliente))
			return false;
		if (dateEfetivaLancamento == null) {
			if (other.dateEfetivaLancamento != null)
				return false;
		} else if (!dateEfetivaLancamento.equals(other.dateEfetivaLancamento))
			return false;
		if (dateLancamentoContaCorrenteCliente == null) {
			if (other.dateLancamentoContaCorrenteCliente != null)
				return false;
		} else if (!dateLancamentoContaCorrenteCliente.equals(other.dateLancamentoContaCorrenteCliente))
			return false;
		if (descricaoGrupoPagamento == null) {
			if (other.descricaoGrupoPagamento != null)
				return false;
		} else if (!descricaoGrupoPagamento.equals(other.descricaoGrupoPagamento))
			return false;
		if (lancamentoContaCorrenteCliente == null) {
			if (other.lancamentoContaCorrenteCliente != null)
				return false;
		} else if (!lancamentoContaCorrenteCliente.equals(other.lancamentoContaCorrenteCliente))
			return false;
		if (nomeBanco == null) {
			if (other.nomeBanco != null)
				return false;
		} else if (!nomeBanco.equals(other.nomeBanco))
			return false;
		if (numeroEvento == null) {
			if (other.numeroEvento != null)
				return false;
		} else if (!numeroEvento.equals(other.numeroEvento))
			return false;
		if (numeroRaizCNPJ == null) {
			if (other.numeroRaizCNPJ != null)
				return false;
		} else if (!numeroRaizCNPJ.equals(other.numeroRaizCNPJ))
			return false;
		if (numeroSufixoCNPJ == null) {
			if (other.numeroSufixoCNPJ != null)
				return false;
		} else if (!numeroSufixoCNPJ.equals(other.numeroSufixoCNPJ))
			return false;
		if (quantidadeLancamentoRemessa == null) {
			if (other.quantidadeLancamentoRemessa != null)
				return false;
		} else if (!quantidadeLancamentoRemessa.equals(other.quantidadeLancamentoRemessa))
			return false;
		if (valorLancamentoRemessa == null) {
			if (other.valorLancamentoRemessa != null)
				return false;
		} else if (!valorLancamentoRemessa.equals(other.valorLancamentoRemessa))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ListaControleLancamento [lancamentoContaCorrenteCliente=" + lancamentoContaCorrenteCliente
				+ ", dataEfetivaLancamento=" + dataEfetivaLancamento + ", dataLancamentoContaCorrenteCliente="
				+ dataLancamentoContaCorrenteCliente + ", numeroEvento=" + numeroEvento + ", descricaoGrupoPagamento="
				+ descricaoGrupoPagamento + ", codigoIdentificadorUnico=" + codigoIdentificadorUnico + ", nomeBanco="
				+ nomeBanco + ", quantidadeLancamentoRemessa=" + quantidadeLancamentoRemessa + ", numeroRaizCNPJ="
				+ numeroRaizCNPJ + ", numeroSufixoCNPJ=" + numeroSufixoCNPJ + ", valorLancamentoRemessa="
				+ valorLancamentoRemessa + ", dateLancamentoContaCorrenteCliente=" + dateLancamentoContaCorrenteCliente
				+ ", dateEfetivaLancamento=" + dateEfetivaLancamento + "]";
	}
	
	
	
	
}
