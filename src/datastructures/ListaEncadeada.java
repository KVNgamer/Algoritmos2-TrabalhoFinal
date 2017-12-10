package datastructures;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Comparator;
import java.util.Scanner;
import model.Aluno;

public class ListaEncadeada<T> {
	
	public static void main(String[] args) {
		ListaEncadeada<String> lista = new ListaEncadeada<>();
		
		lista.append("Cerveja");
		lista.append("Amendoim");
		lista.append("Pão de Queijo");
		lista.append("Mais Cerveja");
		lista.append("Coca-Cola");
		lista.addFirst("Pão");
		lista.addFirst("Queijo");
		lista.append("Presunto");
		
		lista.printObjects();
	}
	
	//====================================================================
	private no<T> head=null; 
	private no<T> tail=null; 
	private int tamanho = 0;
	
	
	private static class no<T> {
		private T dado;
		private no<T> anterior;
		private no<T> proximo;
		public no<T> getAnterior() {
			return anterior;
		}
		public void setAnterior(no<T> anterior) {
			this.anterior = anterior;
		}
		public T getDado() {
			return dado;
		}
		public void setDado(T dado) {
			this.dado = dado;
		}
		public no<T> getProximo() {
			return proximo;
		}
		public void setProximo(no<T> proximo) {
			this.proximo = proximo;
		}
		public no(T dado) {
			this.dado = dado;
			this.proximo = null;
			this.anterior = null;
		}
	}
	
	
	
	public void append(T dado) {
		no<T> novo = new no<>(dado);
		if (vazio()) {
			head = novo;
			tail = novo;
		} else {
			novo.setAnterior(tail);
			tail.setProximo(novo);
			tail=novo;
		}
		
		tamanho++;
	}		
	public void addFirst(T dado){
		no<T> novo = new no<>(dado);
		if (vazio()) {
			//caso esteja vazio apontamos para as duas pontas ao msm tempo
			head=novo;
			tail=novo;
		}else {
			head.setAnterior(novo);//head<---novo
			novo.setProximo(head);//novo---->head
			head=novo;//head--->proximo--->tail
		}
		tamanho++;
	}
	
	
	
	public T search(T key, Comparator<T> cmp){
		return null;
	}
	
	
	public void printObjects(){
		no<T> i = head;
		while (i != null) {
			System.out.println(i.dado);
			i = i.proximo;
		}
	}
	
	public static ListaEncadeada<model.Aluno> loadFromFile(FileReader arquivo){
        try{
        	Aluno aluno =new Aluno();
        	//cria um scanner para ler o arquivo
			Scanner ler = new Scanner(arquivo);
            //variavel que armazenara as linhas do arquivo
            String linhasDoArquivo = new String();
            //percorre todo o arquivo
            int contador=0;
            while(ler.hasNext()){
            	//recebe cada linha do arquivo
                linhasDoArquivo = ler.nextLine();
                //separa os campos entre as virgulas de cada linha
                String[] valoresEntreVirgulas = linhasDoArquivo.split(",");
                
                aluno.setMatricula(valoresEntreVirgulas[0]);
                aluno.setNome(valoresEntreVirgulas[1]);
                aluno.setEmail(valoresEntreVirgulas[2]);
                setIdade(valoresEntreVirgulas[3]);
                setSexo(valoresEntreVirgulas[4]);
                setCidade(valoresEntreVirgulas[5]);
                setEmpresa(valoresEntreVirgulas[6]);
            	}
        
        	}catch(FileNotFoundException e){
            
        	}
	}
	
	//===========================================
	public boolean vazio() {
		return head == null;
	}
	
}
