package com.cielo.demo.model;

import java.io.Serializable;

public class TotalControleLancamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int quantidadeLancamentos;
	private int quantidadeRemessas;
	private Double valorLancamentos;
	
	public int getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}
	public void setQuantidadeLancamentos(int quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}
	public int getQuantidadeRemessas() {
		return quantidadeRemessas;
	}
	public void setQuantidadeRemessas(int quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}
	public Double getValorLancamentos() {
		return valorLancamentos;
	}
	public void setValorLancamentos(Double valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + quantidadeLancamentos;
		result = prime * result + quantidadeRemessas;
		result = prime * result + ((valorLancamentos == null) ? 0 : valorLancamentos.hashCode());
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
		TotalControleLancamento other = (TotalControleLancamento) obj;
		if (quantidadeLancamentos != other.quantidadeLancamentos)
			return false;
		if (quantidadeRemessas != other.quantidadeRemessas)
			return false;
		if (valorLancamentos == null) {
			if (other.valorLancamentos != null)
				return false;
		} else if (!valorLancamentos.equals(other.valorLancamentos))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TotalControleLancamento [quantidadeLancamentos=" + quantidadeLancamentos + ", quantidadeRemessas="
				+ quantidadeRemessas + ", valorLancamentos=" + valorLancamentos + "]";
	}	
	
	
	
}
