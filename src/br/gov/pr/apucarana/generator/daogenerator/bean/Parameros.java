package br.gov.pr.apucarana.generator.daogenerator.bean;

import br.gov.pr.apucarana.generator.Util;

public class Parameros {

	private String pacote;
	private String nomeClasse;
	private String hibernateUtilClass;
	private String hibernateUtilClassName;
	private String applicationExceptionClass;

	public Parameros(String qualifiedName, String hibernateUtilClass, String applicationExceptionClass) {
		this.setPacote(Util.getNomePacote(qualifiedName));
		this.setNomeClasse(Util.getNomeClasse(qualifiedName));
		this.setHibernateUtilClass(hibernateUtilClass);
		this.setHibernateUtilClassName(Util.getNomeClasse(hibernateUtilClass));
		this.setApplicationExceptionClass(applicationExceptionClass);
	}

	public String getHibernateUtilClass() {
		return hibernateUtilClass;
	}

	public void setHibernateUtilClass(String hibernateUtilClass) {
		this.hibernateUtilClass = hibernateUtilClass;
	}
	
	public String getHibernateUtilClassName() {
		return hibernateUtilClassName;
	}

	public void setHibernateUtilClassName(String hibernateUtilClassName) {
		this.hibernateUtilClassName = hibernateUtilClassName;
	}

	public String getPacote() {
		return pacote;
	}

	public void setPacote(String pacote) {
		this.pacote = pacote;
	}

	public String getNomeClasse() {
		return nomeClasse;
	}

	public void setNomeClasse(String nome) {
		this.nomeClasse = nome;
	}

	public String getCamelNome() {
		return Util.toCamelCase(getNomeClasse());
	}

	public Object getNomeClasseLower() {
		return getNomeClasse().toLowerCase();
	}

	public String getApplicationExceptionClass() {
		return applicationExceptionClass;
	}

	public void setApplicationExceptionClass(String applicationExceptionClass) {
		this.applicationExceptionClass = applicationExceptionClass;
	}

}
