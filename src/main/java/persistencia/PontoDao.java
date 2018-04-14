package persistencia;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import beans.*;

import persistencia.*;
@Entity
@Table(name = "pontoDao")
public class PontoDao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public static void inserir(Ponto ponto) {
		Session sessao = HibernateUtil.getSessionfactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.save(ponto);
		t.commit();
		sessao.close();
	}

	public static void alterar(Ponto ponto) {
		Session sessao = HibernateUtil.getSessionfactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.update(ponto);
		t.commit();
		sessao.close();
	}
	
	public static void excluir(Ponto ponto) {
		Session sessao = HibernateUtil.getSessionfactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.delete(ponto);
		t.commit();
		sessao.close();
	}
	
	public static List<Ponto> listagem(String filtro) {
		Session sessao = HibernateUtil.getSessionfactory().openSession();
		Query consulta;
		if(filtro.trim().length() == 0){
			consulta = sessao.createQuery("from Ponto order by pont_nome");
		} else {
			consulta = sessao.createQuery("from Ponto "
					+ "where pont_nome like :parametro order by pont_nome");
			consulta.setString("parametro", "%" + filtro + "%");
		}
		List<Ponto> lista = consulta.list();
		sessao.close();
		return lista;
	}

}
