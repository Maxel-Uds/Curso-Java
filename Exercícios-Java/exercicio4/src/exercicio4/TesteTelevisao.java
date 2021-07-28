package exercicio4;

public class TesteTelevisao {

	public static void main(String[] args) throws Exception {

		Televisao tv = new Televisao();
		
//		tv.canalMais(20);
//		tv.irPara(7);
//		tv.canalMenos(1);
//		tv.volumeMenos(1);
		tv.volumeMais(30);
		tv.volumeMenos(40);
		tv.canalMenos(30);
		
		System.out.println(tv);

	}

}
