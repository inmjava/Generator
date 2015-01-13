package br.gov.pr.apucarana.generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Util {
	
	public static String getNomeClasse(String qualifiedName) {
		int index = qualifiedName.lastIndexOf('.');
		if (index < 0)
			return qualifiedName;
		return qualifiedName.substring(index + 1);
	}
	
	public static String getNomePacote(String qualifiedName){
		int index = qualifiedName.lastIndexOf('.');
		if(index < 0)
			return "";
		return qualifiedName.substring(0, index);
	}
	
	public static String replaceBarraPorPonto(String entrada){
		return entrada.replaceAll("/", "\\.");
	}
	
	public static String replacePontoPorBarra(String entrada){
		return entrada.replaceAll("\\.", "/");
	}
	
	public static String toCamelCase(String nome){
		return (nome.charAt(0)+"").toLowerCase() + nome.substring(1);
	}
	
	public static void escreverEmArquivo(String arquivo, String conteudo){
		try {
			File file = new File(arquivo);
			if(!file.getParentFile().exists()){
				file.getParentFile().mkdirs();
			}
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(arquivo)));
			out.println(conteudo);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
	
	public static void appendEmArquivo(String arquivo, String conteudo){
		try {
			File file = new File(arquivo);
			if(!file.getParentFile().exists()){
				file.getParentFile().mkdirs();
			}
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(arquivo)));
			out.append(conteudo);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
	

	
	public static String eclipse2JavaQualifiedName(String qn){
		qn = qn.substring(qn.indexOf("/src/") + 5);
		qn = qn.substring(0, qn.length() - 5);
		qn = qn.replaceAll("/", ".");
		return qn;
	}
	
	public static void main(String[] args) {
	}
}
