package exercicio4;

public enum Controle {
	MAIS {
		@Override
		public int controlaTV() {
			return 1;
		}
	},
	MENOS {
		@Override
		public int controlaTV() {
			return -1;
		}
	};
	
	public abstract int controlaTV();
}
