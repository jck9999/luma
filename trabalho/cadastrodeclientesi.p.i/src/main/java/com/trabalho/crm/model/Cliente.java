package com.trabalho.crm.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
public class Cliente {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	
	@Column(nullable = false )
	public String nome;
	
	@Column(nullable = false )
	public String cpf;
	
	@Column(nullable = false )
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	public Date data_nascimento;
	
	@Column(nullable = false )
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	public int fone;
	 
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	public BigDecimal limite_credito;
	
	
	public Long getId() {
		return id;
	}
//
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//
//	public String getNome() {
//		return nome;
//	}
//	 
//	public void setNome(String novoNome) {
//		this.nome = novoNome;
//	}
//	
//	
//	public String getCpf() {
//        return cpf;
//	}
//	
//	public void setCpf(String novoCpf) {
//		this.cpf = novoCpf;
//	}
//	
//	
//	public Date getDatadenascimento() {
//		return this.Datadenascimento;
//	}
//
//
//	public void setDatadenascimento(Date datadenascimento) {
//		this.Datadenascimento = datadenascimento;
//	}
//
//
//	public int getFone() {
//		return this.fone;
//	}
//
//
//	public void setFone(int fone) {
//		this.fone = fone;
//	}
//	
//	
//
//	public BigDecimal getLimiteDeCredito() {
//		 return this.LimiteDeCredito;
//	}
//
//	public void setLimiteDeCredito(BigDecimal novoLimite) {
//		this.LimiteDeCredito = novoLimite;
//	}
//
////	@Override
////	public int hashCode() {
////		final int prime = 31;
////		int result = 1;
////		result = prime * result + ((id == null) ? 0 : id.hashCode());
////		return result;
////	}
////
////
////	@Override
////	public boolean equals(Object obj) {
////		if (this == obj)
////			return true;
////		if (obj == null)
////			return false;
////		if (getClass() != obj.getClass())
////			return false;
////		Cliente other = (Cliente) obj;
////		if (id == null) {
////			if (other.id != null)
////				return false;
////		} else if (!id.equals(other.id))
////			return false;
////		return true;
////	}
//
//
//	
//	
//	
//	
//	
//	
}
