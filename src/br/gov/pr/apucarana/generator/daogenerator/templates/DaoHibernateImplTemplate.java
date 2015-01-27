package br.gov.pr.apucarana.generator.daogenerator.templates;

import br.gov.pr.apucarana.generator.daogenerator.bean.Parameros;

public class DaoHibernateImplTemplate {
  protected static String nl;
  public static synchronized DaoHibernateImplTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    DaoHibernateImplTemplate result = new DaoHibernateImplTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "import java.util.ArrayList;" + NL + "import java.util.Collection;" + NL + "import java.util.List;" + NL + "" + NL + "import org.hibernate.Criteria;" + NL + "import org.hibernate.HibernateException;" + NL + "import org.hibernate.Query;" + NL + "import org.hibernate.Session;" + NL + "import org.hibernate.Transaction;" + NL + "import org.hibernate.criterion.Example;" + NL + "import org.hibernate.criterion.Projections;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ";" + NL + "import ";
  protected final String TEXT_4 = ";" + NL + "import ";
  protected final String TEXT_5 = "Dao;" + NL + "" + NL + "/**" + NL + " * Implementacao do acesso a dados da classe ";
  protected final String TEXT_6 = " via " + NL + " * Hibernate" + NL + " * " + NL + " * Pattern Data Access Object" + NL + " *" + NL + " * ";
  protected final String TEXT_7 = NL + " *" + NL + " */" + NL + " public class ";
  protected final String TEXT_8 = "DaoHibernateImpl implements ";
  protected final String TEXT_9 = "Dao {" + NL + "\t" + NL + "\tprivate static boolean dev = false;" + NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_10 = "DaoHibernateImpl() {" + NL + "\t\t" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * Salva objeto da classe ";
  protected final String TEXT_11 = "." + NL + "\t * " + NL + "\t * @param ";
  protected final String TEXT_12 = " Objeto da classe ";
  protected final String TEXT_13 = NL + "\t * @throws Exception Caso ocorra erro com hibernate/conexao." + NL + "\t */" + NL + "\tpublic void salvar(";
  protected final String TEXT_14 = " ";
  protected final String TEXT_15 = ") throws Exception {" + NL + "\t\tSession session = ";
  protected final String TEXT_16 = ".getSession();" + NL + "\t\tTransaction tx = session.beginTransaction();" + NL + "\t\ttry {" + NL + "\t\t\tsession.save(";
  protected final String TEXT_17 = ");" + NL + "\t\t\ttx.commit();" + NL + "\t\t} catch (HibernateException e) {" + NL + "\t\t\ttx.rollback();" + NL + "\t\t\tif (dev) {" + NL + "\t\t\t\te.printStackTrace();" + NL + "\t\t\t}" + NL + "\t\t\tthrow e;" + NL + "\t\t} finally {" + NL + "\t\t\t//";
  protected final String TEXT_18 = ".closeSession();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t" + NL + "\t/**" + NL + "\t * Altera objeto da classe ";
  protected final String TEXT_19 = "." + NL + "\t * " + NL + "\t * @param ";
  protected final String TEXT_20 = " Objeto da classe ";
  protected final String TEXT_21 = NL + "\t * @throws Exception Caso ocorra erro com hibernate/conexao." + NL + "\t */" + NL + "\tpublic void alterar(";
  protected final String TEXT_22 = " ";
  protected final String TEXT_23 = ") throws Exception {" + NL + "\t\tSession session = ";
  protected final String TEXT_24 = ".getSession();" + NL + "\t\tTransaction tx = session.beginTransaction();" + NL + "\t\ttry {" + NL + "\t\t\tsession.update(";
  protected final String TEXT_25 = ");" + NL + "\t\t\ttx.commit();" + NL + "\t\t} catch (HibernateException e) {" + NL + "\t\t\ttx.rollback();" + NL + "\t\t\tif (dev) {" + NL + "\t\t\t\te.printStackTrace();" + NL + "\t\t\t}" + NL + "\t\t\tthrow e;" + NL + "\t\t} finally {" + NL + "\t\t\t//";
  protected final String TEXT_26 = ".closeSession();" + NL + "\t\t}" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * Exclui objeto da classe ";
  protected final String TEXT_27 = "." + NL + "\t * " + NL + "\t * @param ";
  protected final String TEXT_28 = " Objeto da classe ";
  protected final String TEXT_29 = NL + "\t * @throws Exception Caso ocorra erro com hibernate/conexao." + NL + "\t */" + NL + "\tpublic void excluir(";
  protected final String TEXT_30 = " ";
  protected final String TEXT_31 = ") throws Exception {" + NL + "\t\tSession session = ";
  protected final String TEXT_32 = ".getSession();" + NL + "\t\tTransaction tx = session.beginTransaction();" + NL + "\t\ttry {" + NL + "\t\t\tsession.delete(";
  protected final String TEXT_33 = ");" + NL + "\t\t\ttx.commit();" + NL + "\t\t} catch (HibernateException e) {" + NL + "\t\t\ttx.rollback();" + NL + "\t\t\tif (dev) {" + NL + "\t\t\t\te.printStackTrace();" + NL + "\t\t\t}" + NL + "\t\t\tthrow e;" + NL + "\t\t} finally {" + NL + "\t\t\t//";
  protected final String TEXT_34 = ".closeSession();" + NL + "\t\t}" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * Conta o n?mero objetos da classe ";
  protected final String TEXT_35 = "." + NL + "\t */" + NL + "\tpublic int contar() throws Exception {" + NL + "\t\tSession session = ";
  protected final String TEXT_36 = ".getSession();" + NL + "\t\ttry {" + NL + "\t\t\tCriteria q = session.createCriteria(";
  protected final String TEXT_37 = ".class).setProjection(Projections.rowCount());" + NL + "\t\t\treturn (Integer) q.list().get(0);" + NL + "\t\t} catch (HibernateException e) {" + NL + "\t\t\tif (dev) {" + NL + "\t\t\t\te.printStackTrace();" + NL + "\t\t\t}" + NL + "\t\t\tthrow e;" + NL + "\t\t}" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * Listagem de objetos da classe ";
  protected final String TEXT_38 = "." + NL + "\t * " + NL + "\t * @param example Objeto com atributos para listagem " + NL + "\t * @param qtdPagina quantidade de itens listados em cada pagina " + NL + "\t * @param numPagina numero da pagina a ser buscada" + NL + "\t * @return Lista de objetos ";
  protected final String TEXT_39 = NL + "\t * @throws Exception Caso ocorra erro com hibernate/conexao." + NL + "\t */" + NL + "\t@SuppressWarnings(\"unchecked\")" + NL + "\tpublic Collection<";
  protected final String TEXT_40 = "> listar(";
  protected final String TEXT_41 = " example, Integer qtdPagina, Integer numPagina) throws Exception {" + NL + "\t\tCollection<";
  protected final String TEXT_42 = "> coll = new ArrayList<";
  protected final String TEXT_43 = ">();" + NL + "\t\tSession session = ";
  protected final String TEXT_44 = ".getSession();" + NL + "\t\ttry {" + NL + "\t\t\tCriteria q = session.createCriteria(";
  protected final String TEXT_45 = ".class);" + NL + "\t\t\tif(example != null){" + NL + "\t\t\t\tExample sample = Example.create(example);" + NL + "\t\t\t\tsample.enableLike();" + NL + "\t\t\t\tsample.excludeZeroes();" + NL + "\t\t\t\tq.add(sample);" + NL + "\t\t\t}" + NL + "\t\t\tif (qtdPagina != null && numPagina != null) {" + NL + "\t\t\t\tq.setMaxResults(qtdPagina.intValue());" + NL + "\t\t\t\tq.setFirstResult( (numPagina.intValue()-1) * qtdPagina.intValue() );" + NL + "\t\t\t}" + NL + "\t\t\tList<";
  protected final String TEXT_46 = "> list = q.list();" + NL + "\t\t\tcoll = list;" + NL + "\t\t} catch (HibernateException e) {" + NL + "\t\t\tif (dev) {" + NL + "\t\t\t\te.printStackTrace();" + NL + "\t\t\t}" + NL + "\t\t\tthrow e;" + NL + "\t\t} " + NL + "\t\treturn coll;" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * Listagem de objetos da classe ";
  protected final String TEXT_47 = "." + NL + "\t * " + NL + "\t * @param example Objeto com atributos para listagem " + NL + "\t * @return Lista de objetos ";
  protected final String TEXT_48 = NL + "\t * @throws Exception Caso ocorra erro com hibernate/conexao." + NL + "\t */" + NL + "\tpublic Collection<";
  protected final String TEXT_49 = "> listar(";
  protected final String TEXT_50 = " example) throws Exception {" + NL + "\t\treturn this.listar(example, null, null);" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * Listagem de objetos da classe ";
  protected final String TEXT_51 = "." + NL + "\t * " + NL + "\t * @param qtdPagina quantidade de itens listados em cada pagina " + NL + "\t * @param numPagina numero da pagina a ser buscada" + NL + "\t * @return Lista de objetos ";
  protected final String TEXT_52 = NL + "\t * @throws Exception Caso ocorra erro com hibernate/conexao." + NL + "\t */" + NL + "\tpublic Collection<";
  protected final String TEXT_53 = "> listar(Integer qtdPagina, Integer numPagina) throws Exception {" + NL + "\t\treturn this.listar(null, qtdPagina, numPagina);" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * Listagem de objetos da classe ";
  protected final String TEXT_54 = "." + NL + "\t * " + NL + "\t * @return Lista de objetos ";
  protected final String TEXT_55 = NL + "\t * @throws Exception Caso ocorra erro com hibernate/conexao." + NL + "\t */" + NL + "\tpublic Collection<";
  protected final String TEXT_56 = "> listar() throws Exception {" + NL + "\t\treturn this.listar(null, null, null);" + NL + "\t}" + NL + "\t\t" + NL + "\t/**" + NL + "\t * Obtem um objeto da classe ";
  protected final String TEXT_57 = "." + NL + "\t * " + NL + "\t * @param id Chave primaria do objeto" + NL + "\t * @throws Exception Caso ocorra erro com hibernate/conexao." + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_58 = " listar(long id) throws Exception {" + NL + "\t\tSession session = ";
  protected final String TEXT_59 = ".getSession();" + NL + "\t\ttry {" + NL + "\t\t\treturn (";
  protected final String TEXT_60 = ")session.get(";
  protected final String TEXT_61 = ".class, id);" + NL + "\t\t} catch (HibernateException e) {" + NL + "\t\t\tif (dev) {" + NL + "\t\t\t\te.printStackTrace();" + NL + "\t\t\t}" + NL + "\t\t\tthrow e;" + NL + "\t\t}" + NL + "\t}";
  protected final String TEXT_62 = NL + "\t" + NL + "\t/**" + NL + "\t * Obtem objetos ";
  protected final String TEXT_63 = " da classe ";
  protected final String TEXT_64 = "." + NL + "\t * " + NL + "\t * @param id Chave primaria do objeto" + NL + "\t * @throws Exception Caso ocorra erro com hibernate/conexao." + NL + "\t */" + NL + "\t@SuppressWarnings(\"unchecked\")" + NL + "\tpublic List listar";
  protected final String TEXT_65 = "(long id) throws Exception {" + NL + "\t\tSession session = HibernateUtil.getSession();" + NL + "\t\ttry {" + NL + "\t\t\tQuery query = session.createQuery(\"select b from ";
  protected final String TEXT_66 = " a join a.";
  protected final String TEXT_67 = " b where a.id = :id\");" + NL + "\t\t\tquery.setParameter(\"id\", id);" + NL + "\t\t\treturn query.list();" + NL + "\t\t} catch (HibernateException e) {" + NL + "\t\t\tif (dev) {" + NL + "\t\t\t\te.printStackTrace();" + NL + "\t\t\t}" + NL + "\t\t\tthrow e;" + NL + "\t\t} " + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * Obtem objetos ";
  protected final String TEXT_68 = " da classe ";
  protected final String TEXT_69 = "." + NL + "\t * " + NL + "\t * @param ";
  protected final String TEXT_70 = " Objeto ";
  protected final String TEXT_71 = NL + "\t * @throws Exception Caso ocorra erro com hibernate/conexao." + NL + "\t */" + NL + "\tpublic List listar";
  protected final String TEXT_72 = "(";
  protected final String TEXT_73 = " ";
  protected final String TEXT_74 = ") throws Exception {" + NL + "\t\treturn this.listar";
  protected final String TEXT_75 = "(";
  protected final String TEXT_76 = ".getId());" + NL + "\t}";
  protected final String TEXT_77 = NL + "}";

	public String generate(Parameros arg)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append( "package " + arg.getPacote() + ".dao.impl;" );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( arg.getHibernateUtilClass());
    stringBuffer.append(TEXT_3);
    stringBuffer.append( arg.getPacote() + "." + arg.getNomeClasse());
    stringBuffer.append(TEXT_4);
    stringBuffer.append( arg.getPacote() + ".dao." + arg.getNomeClasse());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(new java.util.Date());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(arg.getCamelNome());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(arg.getCamelNome());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(arg.getHibernateUtilClassName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(arg.getCamelNome());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(arg.getHibernateUtilClassName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(arg.getCamelNome());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(arg.getCamelNome());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(arg.getHibernateUtilClassName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(arg.getCamelNome());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(arg.getHibernateUtilClassName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(arg.getCamelNome());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(arg.getCamelNome());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(arg.getHibernateUtilClassName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(arg.getCamelNome());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(arg.getHibernateUtilClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(arg.getHibernateUtilClassName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(arg.getHibernateUtilClassName());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_55);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(arg.getHibernateUtilClassName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_61);
    for (int i = 0; i < arg.getListas().length; i++) {
    stringBuffer.append(TEXT_62);
    stringBuffer.append(arg.getListas()[i]);
    stringBuffer.append(TEXT_63);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_64);
    stringBuffer.append((arg.getListas()[i].charAt(0)+"").toUpperCase() + arg.getListas()[i].substring(1));
    stringBuffer.append(TEXT_65);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(arg.getListas()[i]);
    stringBuffer.append(TEXT_67);
    stringBuffer.append(arg.getListas()[i]);
    stringBuffer.append(TEXT_68);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(arg.getListas()[i].charAt(0)+"");
    stringBuffer.append(TEXT_70);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_71);
    stringBuffer.append((arg.getListas()[i].charAt(0)+"").toUpperCase() + arg.getListas()[i].substring(1));
    stringBuffer.append(TEXT_72);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(arg.getListas()[i].charAt(0)+"");
    stringBuffer.append(TEXT_74);
    stringBuffer.append((arg.getListas()[i].charAt(0)+"").toUpperCase() + arg.getListas()[i].substring(1));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(arg.getListas()[i].charAt(0)+"");
    stringBuffer.append(TEXT_76);
    }
    stringBuffer.append(TEXT_77);
    return stringBuffer.toString();
  }
}
