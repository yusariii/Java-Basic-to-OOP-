package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		Cart an0rder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(
				"The Lion King",
				"Animation",
				"Roger Allers",
				87,
				19.95f
			);
//		an0rder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(
				"Star Wars",
				"Science Fiction",
				"George Lucas",
				87,
				24.95f
			);
//		an0rder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(
				"Aladin",
				"Animation",
				18.99f
			);
//		an0rder.addDigitalVideoDisc(dvd3);
		DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3};
		an0rder.addDigitalVideoDisc(dvdList);
		an0rder.listDisc();
		
		System.out.println("Total Cost is: ");
		System.out.println(an0rder.totalCost());
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc(
				"Aladin Part2",
				"Animation",
				20.99f
			);
		an0rder.removeDigitalVideoDisc(dvd4);
		
		an0rder.removeDigitalVideoDisc(dvd3);
		
		an0rder.listDisc();
		
		System.out.println("Total Cost is: ");
		System.out.println(an0rder.totalCost());
	}

}
