package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Livro")
@Getter
@Setter
public class Livro implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "titulo")
	private String titulo;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "referencia")
	private String referencia;

	@Column(name = "datacadastro")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date datacadastro;

	public Livro() {
	}

	public Livro(String titulo, String descricao, String referencia, Date datacadastro) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.referencia = referencia;
		this.datacadastro = datacadastro;
	}

	public Livro(String titulo, String descricao, String referencia) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.referencia = referencia;

	}

	public Date getDatacadastro() {
		return datacadastro;
	}

	public void setDatacadastro(Date datacadastro) {
		this.datacadastro = datacadastro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", referencia=" + referencia
				+ ", datacadastro=" + datacadastro + "]";
	}

}
