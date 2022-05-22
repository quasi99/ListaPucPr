public class App {

	public static void main(String[] args){
		
		
		Lista l = new Lista();

		System.out.println("Adiciona 10, 20 e 30");
		l.insereUltimo(10);
		l.insereUltimo(20);
		l.insereUltimo(30);

		l.mostra();

		System.out.println("Remove o ultimo item");
		l.removeUltimo();

		l.mostra();

		System.out.println("Adiciona 50 ao inicio");
		l.inserePrimeiro(50);

		l.mostra();

		System.out.println("Remove o primeiro valor");
		l.removePrimeiro();

		l.mostra();

		System.out.println("Adiciona 90 ao inicio");
		l.inserePrimeiro(90);

		l.mostra();

		System.out.println("Adiciona 40 apos o 10");
		No no = new No();
		no = l.find(10);
		
		l.insereDepois(no, 40);
		
		l.mostra();

		System.out.println("Adiciona 33 apos o 20");
		No sec = new No();
		sec = l.find(20);

		l.insereDepois(sec, 33);

		l.mostra();

		System.out.println("Remove o primeiro valor");
		l.removePrimeiro();

		l.mostra();

		System.out.println("Remove o 40");
		No ad = new No();
		ad = l.find(40);

		l.remove(ad);

		l.mostra();


	}
}
