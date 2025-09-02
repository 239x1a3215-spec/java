package day2;

public class product {
	String productName;
	int prize,Quantity;
	double gst,Discount;
	public static void main(String[] args) {
		product p1=new product();
		p1.productName="soap";
		p1.prize=2000;
		p1.Quantity=100;
		p1.gst=12.8;
		p1.Discount=10.0;
		System.out.println("product name :" +p1.productName);
		System.out.println("prize :" +p1.prize);
		System.out.println("Quantity :" +p1.Quantity);
		System.out.println("gst :" +p1.gst);
		System.out.println("Discount :" +p1.Discount);
		product p2=new product();
		p2.productName="oil";
		p2.prize=3000;
		p2.Quantity=200;
		p2.gst=22.0;
		p2.Discount=23.0;
		System.out.println("product name :" +p2.productName);
		System.out.println("prize :" +p2.prize);
		System.out.println("Quantity :" +p2.Quantity);
		System.out.println("gst :" +p2.gst);
		System.out.println("Discount :" +p2.Discount);
		
		
	}
	
	
	

}
