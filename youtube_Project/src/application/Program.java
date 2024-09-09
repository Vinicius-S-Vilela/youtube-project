package application;

import entities.Inscrito;
import entities.Video;
import entities.Visualizacao;

public class Program {

	public static void main(String[] args) {

		Video v[] = new Video[5];
		v[0] = new Video("Primeiro Vídeo");
		v[1] = new Video("Segundo Vídeo");
		v[2] = new Video("Terceiro Vídeo");

		Inscrito i[] = new Inscrito[2];
		i[0] = new Inscrito("Vinicius", 21, "M", "vini");
		i[1] = new Inscrito("Fabiana", 24, "F", "fabi");

		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(i[0], v[2]);
		vis[0].avaliar();
		System.out.println((vis[0].toString()));
		System.out.println();

		vis[1] = new Visualizacao(i[1], v[1]);
		vis[1].avaliar(90f);
		System.out.println((vis[1].toString()));
		System.out.println();

	}

}
