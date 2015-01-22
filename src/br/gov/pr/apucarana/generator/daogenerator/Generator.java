package br.gov.pr.apucarana.generator.daogenerator;

import br.gov.pr.apucarana.generator.Util;
import br.gov.pr.apucarana.generator.daogenerator.bean.Parameros;
import br.gov.pr.apucarana.generator.daogenerator.templates.DaoFactoryTemplate;
import br.gov.pr.apucarana.generator.daogenerator.templates.DaoHibernateImplTemplate;
import br.gov.pr.apucarana.generator.daogenerator.templates.DaoTemplate;

public class Generator {

	private Parameros parametros;
	private String initialPath;

	public Generator(String initialPath, Parameros parametros) {
		this.setInitialPath(initialPath);
		this.setParametros(parametros);
	}

	public Parameros getParametros() {
		return parametros;
	}

	public void setParametros(Parameros parametros) {
		this.parametros = parametros;
	}

	public String getInitialPath() {
		return initialPath;
	}

	public void setInitialPath(String initialPath) {
		this.initialPath = initialPath;
	}

	public void gerarDao() {
		try {
			String code = new DaoTemplate().generate(this.getParametros());
			String path = this.initialPath + "/" + Util.replacePontoPorBarra(this.getParametros().getPacote() + "/dao/");
			Util.escreverEmArquivo(path + this.getParametros().getNomeClasse() + "Dao.java", code);
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void gerarDaoFactory() {
		try {
			String code = new DaoFactoryTemplate().generate(this.getParametros());
			String path = this.initialPath + "/" + Util.replacePontoPorBarra(this.getParametros().getPacote() + "/dao/factory/");
			Util.escreverEmArquivo(path + this.getParametros().getNomeClasse() + "DaoFactory.java", code);
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void gerarDaoHibernateImpl() {
		try {
			String code = new DaoHibernateImplTemplate().generate(this.getParametros());
			String path = this.initialPath + "/" + Util.replacePontoPorBarra(this.getParametros().getPacote() + "/dao/impl/");
			Util.escreverEmArquivo(path + this.getParametros().getNomeClasse() + "DaoHibernateImpl.java", code);
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void gerarTudo(){
		gerarDao();
		gerarDaoFactory();
		gerarDaoHibernateImpl();
	}
}
