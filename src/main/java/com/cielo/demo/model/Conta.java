package com.cielo.demo.model;

import java.io.Serializable;
import java.util.List;

public class Conta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private TotalControleLancamento totalControleLancamento;
	private List<ListaControleLancamento> listaControleLancamento;
	private String indice;
	private String tamanhoPagina;
	private String totalElements;
	
	public TotalControleLancamento getTotalControleLancamento() {
		return totalControleLancamento;
	}
	public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}
	public List<ListaControleLancamento> getListaControleLancamento() {
		return listaControleLancamento;
	}
	public void setListaControleLancamento(List<ListaControleLancamento> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}
	public String getIndice() {
		return indice;
	}
	public void setIndice(String indice) {
		this.indice = indice;
	}
	public String getTamanhoPagina() {
		return tamanhoPagina;
	}
	public void setTamanhoPagina(String tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}
	public String getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(String totalElements) {
		this.totalElements = totalElements;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((indice == null) ? 0 : indice.hashCode());
		result = prime * result + ((listaControleLancamento == null) ? 0 : listaControleLancamento.hashCode());
		result = prime * result + ((tamanhoPagina == null) ? 0 : tamanhoPagina.hashCode());
		result = prime * result + ((totalControleLancamento == null) ? 0 : totalControleLancamento.hashCode());
		result = prime * result + ((totalElements == null) ? 0 : totalElements.hashCode());
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
		Conta other = (Conta) obj;
		if (indice == null) {
			if (other.indice != null)
				return false;
		} else if (!indice.equals(other.indice))
			return false;
		if (listaControleLancamento == null) {
			if (other.listaControleLancamento != null)
				return false;
		} else if (!listaControleLancamento.equals(other.listaControleLancamento))
			return false;
		if (tamanhoPagina == null) {
			if (other.tamanhoPagina != null)
				return false;
		} else if (!tamanhoPagina.equals(other.tamanhoPagina))
			return false;
		if (totalControleLancamento == null) {
			if (other.totalControleLancamento != null)
				return false;
		} else if (!totalControleLancamento.equals(other.totalControleLancamento))
			return false;
		if (totalElements == null) {
			if (other.totalElements != null)
				return false;
		} else if (!totalElements.equals(other.totalElements))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Conta [totalControleLancamento=" + totalControleLancamento + ", listaControleLancamento="
				+ listaControleLancamento + ", indice=" + indice + ", tamanhoPagina=" + tamanhoPagina
				+ ", totalElements=" + totalElements + "]";
	}
	
	
}
