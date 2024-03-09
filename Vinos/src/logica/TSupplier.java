package logica;

public class TSupplier {
private String aCountry;
private int aDelivery;


public String getaCountry() {
	return aCountry;
}
public void setaCountry(String aCountry) {
	this.aCountry = aCountry;
}
public int getaDelivery() {
	return aDelivery;
}
public void setaDelivery(int aDelivery) {
	this.aDelivery = aDelivery;
}

public TSupplier(String aCountry,int pDelivery){
	setaCountry(aCountry);
	setaDelivery(pDelivery);
}
public TSupplier(TSupplier pSupplier){
	aCountry=pSupplier.getaCountry();
	aDelivery=pSupplier.getaDelivery();
}
}
