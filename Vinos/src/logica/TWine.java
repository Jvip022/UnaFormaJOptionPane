package logica;

public class TWine {
	
	private int aExistence;
	private String aName;
	private float aSales;
	private TSupplier aSupplier;
	//sets ands gets
	
	public int getaExistence() {
	return aExistence;
	}
	
	public void setaExistence(int aExistence) {
		this.aExistence = aExistence;
	}
	public float getaSales() {
		return aSales;
	}
	public void setaSales(float aSales) {
		this.aSales = aSales;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public TSupplier getaSupplier() {
		return aSupplier;
	}
	public void setaSupplier(TSupplier aSupplier) {
		this.aSupplier = aSupplier;
	}

	public TWine(int PExistence,String pName,float pSales,String pCountry,int pDelevery ){
		setaExistence(PExistence);
		setaSales(pSales);
		setaName(pName);
		aSupplier=new TSupplier(pCountry,pDelevery);
	}
	

	
	public TWine(){
		setaExistence(0);
		setaSales(0);
		setaName(null);
		aSupplier=new TSupplier(null,0);
	}
	
	boolean DoPucharse(){
		boolean res=false;
		if(aExistence<50&&aSupplier.getaDelivery()<30){
			res=true;
	}
	return res;
	}
}