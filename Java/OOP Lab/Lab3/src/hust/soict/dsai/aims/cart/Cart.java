package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc items0rdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < 20) {
			items0rdered[qtyOrdered] = disc;
			qtyOrdered += 1;
			System.out.println("This disc has been added!");
		} else {
			System.out.println("This cart is almost full!");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		if (dvdList == null || dvdList.length == 0) {
	        System.out.println("No disc has been added because the list is null or empty!");
	        return;
	    }
		int n = dvdList.length;
		int d = 0;
		for (int i = 0; i < n; i++) {
			if (dvdList[i] != null && qtyOrdered < 20) {
				items0rdered[qtyOrdered] = dvdList[i];
				qtyOrdered += 1;
				d += 1;
			}
		}
		if (d == 0) {
	        System.out.println("No disc has been added!");
	    } else {
	        System.out.println(d + (d == 1 ? " disc has been added!" : " discs have been added!"));
	    }
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (items0rdered[i] != null && items0rdered[i].equals(disc)) {
				found = true;
				for (int j = i; j < qtyOrdered - 1; j++) {
					items0rdered[j] = items0rdered[j + 1];
				}
				items0rdered[qtyOrdered - 1] = null;
				qtyOrdered -= 1;
				System.out.println("This disc has been removed!");
				break;
			}
		}
		if (!found) {
			System.out.println("This disc hasn't ever existed in this cart!");
		}
	}
	
	public void findID(int id) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (items0rdered[i].getId() == id) {
				System.out.println(items0rdered[i].toString());
				return;
			} 
		}
		System.out.println(String.format("Disc with id %d does not exist!", id));
	}
	
	public void findTitle(String title) {
        boolean found = false;

        for (int i = 0; i < qtyOrdered; i++) {
            if (items0rdered[i].isMatch(title)) {
                System.out.println(items0rdered[i].toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No match found for the title: " + title);
        }
    }
	
	public void listDisc() {
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(items0rdered[i].toString());
		}
	}
	
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			total += items0rdered[i].getCost();
		}
		return total;
	}
	
}
