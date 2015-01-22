package br.gov.pr.apucarana.generator.daogenerator.templates;

import br.gov.pr.apucarana.generator.daogenerator.bean.Parameros;

public class DaoTemplate {
  protected static String nl;
  public static synchronized DaoTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    DaoTemplate result = new DaoTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".dao;" + NL + "" + NL + "import java.util.Collection;" + NL + "import ";
  protected final String TEXT_3 = ";" + NL + "" + NL + "/**" + NL + " * Interface para controle de objetos persistentes da classe ";
  protected final String TEXT_4 = NL + " * " + NL + " * Pattern Data Access Object" + NL + " * " + NL + " * ";
  protected final String TEXT_5 = NL + " *" + NL + " */" + NL + "public interface ";
  protected final String TEXT_6 = "Dao {" + NL + "\t" + NL + "\t/**" + NL + "\t * Salva objeto da classe ";
  protected final String TEXT_7 = "." + NL + "\t * " + NL + "\t * @param ";
  protected final String TEXT_8 = " Objeto da classe ";
  protected final String TEXT_9 = NL + "\t * @throws Exception Caso ocorra erro com hibernate/conexao." + NL + "\t */" + NL + "\tpublic void salvar(";
  protected final String TEXT_10 = ") throws Exception;" + NL + "" + NL + "\t/**" + NL + "\t * Altera objeto da classe ";
  protected final String TEXT_11 = "." + NL + "\t * " + NL + "\t * @param ";
  protected final String TEXT_12 = " Objeto da classe ";
  protected final String TEXT_13 = NL + "\t * @throws Exception Caso ocorra erro com hibernate/conexao." + NL + "\t */" + NL + "\tpublic void alterar(";
  protected final String TEXT_14 = ") throws Exception;" + NL + "\t" + NL + "\t/**" + NL + "\t * Exclui objeto da classe ";
  protected final String TEXT_15 = "." + NL + "\t * " + NL + "\t * @param ";
  protected final String TEXT_16 = " Objeto da classe ";
  protected final String TEXT_17 = NL + "\t * @throws Exception Caso ocorra erro com hibernate/conexao." + NL + "\t */" + NL + "\tpublic void excluir(";
  protected final String TEXT_18 = ") throws Exception;" + NL + "\t" + NL + "\t/**" + NL + "\t * Conta o n?mero objetos da classe ";
  protected final String TEXT_19 = "." + NL + "\t */" + NL + "\tpublic int contar() throws Exception;" + NL + "\t" + NL + "\t/**" + NL + "\t * Listagem de objetos da classe ";
  protected final String TEXT_20 = "." + NL + "\t * " + NL + "\t * @param example Objeto com atributos para listagem " + NL + "\t * @param qtdPagina quantidade de itens listados em cada pagina " + NL + "\t * @param numPagina numero da pagina a ser buscada" + NL + "\t * @return Lista de objetos ";
  protected final String TEXT_21 = NL + "\t * @throws Exception Caso ocorra erro com hibernate/conexao." + NL + "\t */" + NL + "\tpublic Collection<";
  protected final String TEXT_22 = "> listar(";
  protected final String TEXT_23 = " example, Integer qtdPagina, Integer numPagina) throws Exception;" + NL + "\t" + NL + "\t/**" + NL + "\t * Listagem de objetos da classe ";
  protected final String TEXT_24 = "." + NL + "\t * " + NL + "\t * @param example Objeto com atributos para listagem " + NL + "\t * @return Lista de objetos ";
  protected final String TEXT_25 = NL + "\t * @throws Exception Caso ocorra erro com hibernate/conexao." + NL + "\t */" + NL + "\tpublic Collection<";
  protected final String TEXT_26 = "> listar(";
  protected final String TEXT_27 = " example) throws Exception;" + NL + "\t" + NL + "\t/**" + NL + "\t * Listagem de objetos da classe ";
  protected final String TEXT_28 = "." + NL + "\t * " + NL + "\t * @param qtdPagina quantidade de itens listados em cada pagina " + NL + "\t * @param numPagina numero da pagina a ser buscada" + NL + "\t * @return Lista de objetos ";
  protected final String TEXT_29 = NL + "\t * @throws Exception Caso ocorra erro com hibernate/conexao." + NL + "\t */" + NL + "\tpublic Collection<";
  protected final String TEXT_30 = "> listar(Integer qtdPagina, Integer numPagina) throws Exception;" + NL + "\t" + NL + "\t/**" + NL + "\t * Listagem de objetos da classe ";
  protected final String TEXT_31 = "." + NL + "\t * " + NL + "\t * @return Lista de objetos ";
  protected final String TEXT_32 = NL + "\t * @throws Exception Caso ocorra erro com hibernate/conexao." + NL + "\t */" + NL + "\tpublic Collection<";
  protected final String TEXT_33 = "> listar() throws Exception;" + NL + "\t" + NL + "\t/**" + NL + "\t * Obtem um objeto da classe ";
  protected final String TEXT_34 = "." + NL + "\t * " + NL + "\t * @param id Chave primaria do objeto" + NL + "\t * @throws Exception Caso ocorra erro com hibernate/conexao." + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_35 = " listar(long id) throws Exception;" + NL + "" + NL + "}";

	public String generate(Parameros arg)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append( arg.getPacote());
    stringBuffer.append(TEXT_2);
    stringBuffer.append( arg.getPacote() + "." + arg.getNomeClasse());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(new java.util.Date());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(arg.getCamelNome());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(arg.getNomeClasse() + " " + arg.getCamelNome());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(arg.getCamelNome());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(arg.getNomeClasse() + " " + arg.getCamelNome());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(arg.getCamelNome());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(arg.getNomeClasse() + " " + arg.getCamelNome());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_35);
    return stringBuffer.toString();
  }
}
