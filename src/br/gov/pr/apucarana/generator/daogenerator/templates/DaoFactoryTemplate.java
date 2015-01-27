package br.gov.pr.apucarana.generator.daogenerator.templates;

import br.gov.pr.apucarana.generator.daogenerator.bean.Parameros;

public class DaoFactoryTemplate {
  protected static String nl;
  public static synchronized DaoFactoryTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    DaoFactoryTemplate result = new DaoFactoryTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".dao.factory;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".dao.";
  protected final String TEXT_4 = "Dao;" + NL + "import ";
  protected final String TEXT_5 = ".dao.impl.";
  protected final String TEXT_6 = "DaoHibernateImpl;" + NL + "" + NL + "/**" + NL + " * Factory de instancias da classe ";
  protected final String TEXT_7 = NL + " * " + NL + " * Pattern Data Access Object" + NL + " *" + NL + " * ";
  protected final String TEXT_8 = NL + " *" + NL + " */" + NL + "public class ";
  protected final String TEXT_9 = "DaoFactory {" + NL + "\t" + NL + "\tpublic static final int HIBERNATE = 0;" + NL + "\t" + NL + "\tpublic static ";
  protected final String TEXT_10 = "Dao create";
  protected final String TEXT_11 = "Dao(int whichFactory) {" + NL + "\t\tswitch (whichFactory) {" + NL + "\t    \tcase HIBERNATE: " + NL + "\t    \t\treturn new ";
  protected final String TEXT_12 = "DaoHibernateImpl();" + NL + "\t    \tdefault:" + NL + "\t\t\treturn null;" + NL + "\t\t}" + NL + "\t}" + NL + "\t" + NL + "\tpublic static ";
  protected final String TEXT_13 = "Dao create";
  protected final String TEXT_14 = "Dao() {" + NL + "\t\treturn ";
  protected final String TEXT_15 = "DaoFactory.create";
  protected final String TEXT_16 = "Dao(";
  protected final String TEXT_17 = "DaoFactory.HIBERNATE);" + NL + "\t}" + NL + "\t" + NL + "}";

	public String generate(Parameros arg)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append( arg.getPacote());
    stringBuffer.append(TEXT_2);
    stringBuffer.append( arg.getPacote() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_4);
    stringBuffer.append( arg.getPacote() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(new java.util.Date());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(arg.getNomeClasse());
    stringBuffer.append(TEXT_17);
    return stringBuffer.toString();
  }
}
