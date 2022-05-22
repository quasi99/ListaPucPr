public class Lista {

	private No primeiro = null;
	private No ultimo = null;


	public Lista(){
		primeiro = null;
	}

	public No find(int o){
		No p = this.primeiro;
		while(p != null && p.getInfo() != o){
			p = p.getProx();
		}
		return p;
	}

	public boolean vazia(){
		return primeiro == null;
	}

	public void inserePrimeiro(int info){
		No auxi = new No();
		auxi.setInfo(info);
		auxi.setProx(primeiro);
		primeiro = auxi;
	}

	public void insereDepois(No no, int info){
		if(vazia() == true){
			inserePrimeiro(info);
		}
		else{
			No aux = primeiro;

			while(aux != null && aux.getProx() != null){
				aux = aux.getProx();
				if(aux == no){
					No temp = new No();
					temp.setInfo(info);
					temp.setProx(aux.getProx());
					no.setProx(temp);
				}
			}
			
		}

	}

	public void insereUltimo(int info){
		if(vazia() == true){
			inserePrimeiro(info);
		}
		else{
			No aux = primeiro;

			while(aux != null && aux.getProx() != null){
				aux = aux.getProx();
			}

			if(aux.getProx() == null){
				No novo = new No();
				novo.setInfo(info);
				aux.setProx(novo);
			}
		}
	}

	public No removePrimeiro(){
		if(primeiro == null){
			System.out.println("Lista vazia");
		}
		No del = primeiro;
		primeiro = del.getProx();
		return del;
	}

	public No removeUltimo(){
		No pa = this.primeiro;
		while(pa != null && pa.getInfo() != null){
			
			pa = pa.getProx();
			if (pa.getProx() == null){
				pa.setInfo(null);
			}
		}
		return pa;
	}

	public No remove(No no){
		No pe = this.primeiro;
		while(pe != null && pe.getInfo() != no.getInfo()){
			pe = pe.getProx();
		}
		if(pe == no){
			pe.setProx(pe.getProx());
			pe.setInfo(null);
		}
		return pe;
	}

	public void mostra(){
		No aux = primeiro;

		while(aux != null){
			System.out.print("(" + aux.getInfo() + ") -> ");
			aux = aux.getProx();
			if(aux == null){
				System.out.println(" ");
			}

		}
		if(aux == null){
			System.out.println(" ");
		}
		
	}	
}
