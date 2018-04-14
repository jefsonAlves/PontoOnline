package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Ponto")
public class Ponto implements Serializable {

	private static final long serialVersionUID = -8023482526632579452L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pont_id")
	private int pont_id;

	@Column(name = "pont_nome")
	private String pont_nome;

	@Column(name = "pont_cpf")
	private String pont_cpf;
	
	@Column(name = "pont_data_atual")
	@Temporal(value = TemporalType.DATE)
	private Date pont_data_atual;
	
	@Column(name = "pont_hora_ent")
	private String pont_hora_ent;
	
	@Column(name = "pont_hora_sai")
	private String pont_hora_sai;

	public int getPont_id() {
		return pont_id;
	}

	public void setPont_id(int pont_id) {
		this.pont_id = pont_id;
	}

	public String getPont_nome() {
		return pont_nome;
	}

	public void setPont_nome(String pont_nome) {
		this.pont_nome = pont_nome;
	}

	public String getPont_cpf() {
		return pont_cpf;
	}

	public void setPont_cpf(String pont_cpf) {
		this.pont_cpf = pont_cpf;
	}

	public Date getPont_data_atual() {
		return pont_data_atual;
	}

	public void setPont_data_atual(Date pont_data_atual) {
		this.pont_data_atual = pont_data_atual;
	}

	public String getPont_hora_ent() {
		return pont_hora_ent;
	}

	public void setPont_hora_ent(String pont_hora_ent) {
		this.pont_hora_ent = pont_hora_ent;
	}

	public String getPont_hora_sai() {
		return pont_hora_sai;
	}

	public void setPont_hora_sai(String pont_hora_sai) {
		this.pont_hora_sai = pont_hora_sai;
	}



	
	
}
