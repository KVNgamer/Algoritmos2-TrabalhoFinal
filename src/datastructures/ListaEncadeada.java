package datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;

import comparators.SearchByName;
import model.Aluno;

public class ListaEncadeada<T> {
	
	private no<T> head=null; 
	private no<T> tail=null; 
	private static int tamanho = 0;
	
	
	public static int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}


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
	public void printObjects(){
		no<T> i = head;
		while (i != null) {
			System.out.println(i.dado);
			i = i.proximo;
		}
	}
	
	
		public T search(T key, Comparator<T> cmp){
			no<T> i = head;
				while (i != null) {
				
				if (cmp.compare(key,i.getDado()) == 0){
					return i.getDado();
				}
				
				i = i.getProximo();
			}
		return null;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	//==========================================================================
	  public static ListaEncadeada<model.Aluno> loadFromFile(FileReader arquivo){
		 
	  BufferedReader ler = new BufferedReader(arquivo);
		
		ListaEncadeada<Aluno> infoAluno = new ListaEncadeada<Aluno>();
		
		try {
			
			String linha = ler.readLine();
			
			while(linha != null) {
				//separa os campos entre as virgulas de cada linha
				String[] atributos = linha.split(",");
				
				Aluno Aluno = new Aluno();
				Aluno.setMatricula(atributos[0]);
				Aluno.setNome(atributos[1]);
				Aluno.setEmail(atributos[2]);				
				//coloca a String em int.
				Aluno.setIdade(Integer.valueOf(atributos[3]));
				Aluno.setSexo(atributos[4]);
				Aluno.setEmpresa(atributos[5]);
				Aluno.setCidade(atributos[6]);
				
				infoAluno.append((Aluno) Aluno);
				
				
				//System.out.println(getTamanho()+"  "+Aluno.getNome());
				
				linha = ler.readLine();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return infoAluno;
	}
	  
	  
	  public boolean vazio() {
			return head == null;
		}
	  public void mostra(){
		  	no<T> x = head;
			while (x != null) {
				System.out.println(((Aluno) x.dado).getCidade()+"  "+((Aluno) x.dado).getIdade());
				x = x.proximo;
			}
		}
		  
}
