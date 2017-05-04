package gitproba1;

public class Producto {
	public final static double IVA=0.21;
	public double prezoSenIva;
	public double prezoConIva;
	
	public Producto(double PrezoSenIVAArg){
		this.prezoSenIva=PrezoSenIVAArg;
		this.prezoConIva=prezoSenIva+prezoSenIva*IVA;
	}
	public double getPrezoSenIva(){
		return prezoSenIva;
	}
	public void setPrezoSenIva(double prezoSenIva){
		this.prezoSenIva=prezoSenIva;
		this.prezoConIva=prezoSenIva+prezoSenIva*IVA;
	}
	public double getPrezoConIva(){
		return prezoConIva;
	}
	public void setPrezoConIva(double prezoConIva){
		this.prezoConIva=prezoConIva;
		this.prezoSenIva=prezoConIva/(IVA+1);
	}
}
