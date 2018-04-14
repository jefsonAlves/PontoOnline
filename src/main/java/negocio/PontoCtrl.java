package negocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import beans.*;
import persistencia.*;
import negocio.*;

@ManagedBean
@SessionScoped
public class PontoCtrl implements Serializable {

	private static final long serialVersionUID = 1L;

	private Ponto ponto;

	private List<Ponto> pontos = new ArrayList<Ponto>();
	private List<Ponto> lista;

	public Ponto getPonto() {
		if (ponto == null) {
			ponto = new Ponto();
		}
		return ponto;
	}

	public void setPonto(Ponto ponto) {
		this.ponto = ponto;
	}

	public List<Ponto> getListagem() {
		return PontoDao.listagem("");
	}


	public String actionGravar() {
		if (ponto.getPont_id() == 0) {
			PontoDao.inserir(ponto);
			return actionInserir();
		} else {
			PontoDao.alterar(ponto);
			return "lista_pessoa";
		}
	}

	public String actionInserir() {
		ponto = new Ponto();
		return "form_cadusuario";
	}

	public String actionExcluir(Ponto p) {
		PontoDao.excluir(p);
		return "lista_pessoa";
	}


	public String actionAlterar(Ponto p) {
		this.ponto = p;
		return "form_cadusuario";
	}

	public List<Ponto> getPontos() {
		return pontos;
	}

	public void setPontos(List<Ponto> pontos) {
		this.pontos = pontos;
	}

	public List<Ponto> getLista() {
		return lista;
	}

	public void setLista(List<Ponto> lista) {
		this.lista = lista;
	}

}
