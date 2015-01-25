package br.gov.pr.apucarana.generator;

import br.gov.pr.apucarana.generator.daogenerator.Generator;
import br.gov.pr.apucarana.generator.daogenerator.bean.Parameros;

public class Run {

	public static void main(String[] args) {
//		Generator generator = new Generator("C:/eclipseg/workspace/DOEIfaces/src",new Parameros("" +
//											"br.gov.pr.apucarana.application.doeifaces.model.entity.Arquivo",
//											"br.gov.pr.apucarana.application.doeifaces.util.HibernateUtil",
//											"br.gov.pr.apucarana.application.doeifaces.exception.ApplicationException"));
		
		
//		Generator generator = new Generator("C:/eclipseg/workspace/Admin/src",new Parameros("" + Util.eclipse2JavaQualifiedName(
//											"/Admin/src/br/gov/pr/apucarana/admin/pojo/Arquivo.java"),Util.eclipse2JavaQualifiedName(
//											"/Admin/src/br/gov/pr/apucarana/admin/util/HibernateUtil.java"), Util.eclipse2JavaQualifiedName(
//											"br.gov.pr.apucarana.siteadmin.pojo.exception.ApplicationException")));
		
//		Generator generator = new Generator("C:/eclipseg/workspace/HibernateTest/src",new Parameros("" + Util.eclipse2JavaQualifiedName(
//		"/HibernateTest/src/br/gov/pr/apucarana/application/apucarana/bean/Arquivo.java"),Util.eclipse2JavaQualifiedName(
//		"/HibernateTest/src/br/gov/pr/apucarana/application/hibernatetest/util/HibernateUtil.java"), Util.eclipse2JavaQualifiedName(
//		"br.gov.pr.apucarana.siteadmin.pojo.exception.ApplicationException")));

//		Generator generator = new Generator("C:/eclipseg/workspace/DOE/src",new Parameros("" + Util.eclipse2JavaQualifiedName(
//		"/DOE/src/br/gov/pr/apucarana/doe/model/entidades/LicitacaoAnexo.java"),Util.eclipse2JavaQualifiedName(
//		"/DOE/src/br/gov/pr/apucarana/doe/util/HibernateUtil.java"), Util.eclipse2JavaQualifiedName(
//		"br.gov.pr.apucarana.siteadmin.pojo.exception.ApplicationException")));

		Generator generator = new Generator("C:/Users/Ivan/git/MissaGenerator-Gui/src",new Parameros("" + Util.eclipse2JavaQualifiedName(
		"/MissaGenerator-Gui/src/model/Momento.java"),Util.eclipse2JavaQualifiedName(
		"/MissaGenerator-Gui/src/model/HibernateUtil.java"), Util.eclipse2JavaQualifiedName(
		"br.gov.pr.apucarana.siteadmin.pojo.exception.ApplicationException"), new String[]{"musicas"}));

		generator.gerarTudo();

		generator = new Generator("C:/Users/Ivan/git/MissaGenerator-Gui/src",new Parameros("" + Util.eclipse2JavaQualifiedName(
		"/MissaGenerator-Gui/src/model/Musica.java"),Util.eclipse2JavaQualifiedName(
		"/MissaGenerator-Gui/src/model/HibernateUtil.java"), Util.eclipse2JavaQualifiedName(
		"br.gov.pr.apucarana.siteadmin.pojo.exception.ApplicationException"), new String[]{"momentos"}));

		generator.gerarTudo();

		generator = new Generator("C:/Users/Ivan/git/MissaGenerator-Gui/src",new Parameros("" + Util.eclipse2JavaQualifiedName(
		"/MissaGenerator-Gui/src/model/Missa.java"),Util.eclipse2JavaQualifiedName(
		"/MissaGenerator-Gui/src/model/HibernateUtil.java"), Util.eclipse2JavaQualifiedName(
		"br.gov.pr.apucarana.siteadmin.pojo.exception.ApplicationException"), null));

		generator.gerarTudo();
	}
}
