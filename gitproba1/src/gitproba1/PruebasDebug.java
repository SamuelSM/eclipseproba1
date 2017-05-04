package gitproba1;

public class PruebasDebug {
	private int a;
	private Integer Z;
	
	public PruebasDebug(){
		super();

	}
	
	public PruebasDebug(int b){
		super();
		this.a=b;
	}
	
	public int metodo1(int b){
		int n=1;
		while(b>1){
			n=n*b;
			b--;
		}
		return n ;
	}

	public int recursiva(int arg1){
		if(arg1==1) return 1;
		else return arg1*recursiva(arg1-1);
	}
	public void setA(int a){
		if (a>6) return;
		this.a=a;
	}
	
	public Integer getZ (Integer z){
		return z;
		
	}
	
	@Override
	public String toString(){
		String aux = super.toString();
		return "Metodo cambiado " + aux;
	}
}
