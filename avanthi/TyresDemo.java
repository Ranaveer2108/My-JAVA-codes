package com.avanthi;

public class TyresDemo {

	public static void main(String[] args) {
		Mrf mrf=new Mrf();
		mrf.setBrand("MRF");
		mrf.setPrice(2400);
		mrf.avgLifetime();
		System.out.println("Brand="+mrf.getBrand()+"  Price:"+mrf.getPrice());
		Ceat ceat=new Ceat();
		ceat.setBrand("CEAT");
		ceat.setPrice(1800);
		ceat.avgLifetime();
		System.out.println("Brand="+ceat.getBrand()+"  Price:"+ceat.getPrice());
		
		/*Tyres tyre1=new Mrf();
		tyre1.avgLifetime();
		Tyres tyre2=new Ceat();
		tyre2.avgLifetime();  */
	
	}

}
