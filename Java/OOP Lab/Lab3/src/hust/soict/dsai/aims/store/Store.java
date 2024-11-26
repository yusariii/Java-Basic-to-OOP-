package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	public static final int MAX_NUMBERS_INSTORE = 100;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_INSTORE];
    private int qtyInStore = 0; 

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyInStore < MAX_NUMBERS_INSTORE) {
			itemsInStore[qtyInStore] = disc;
			qtyInStore += 1;
			System.out.println("This disc has been added!");
		} else {
			System.out.println("This store is almost full!");
		}
	}

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean found = false;
		for (int i = 0; i < qtyInStore; i++) {
			if (itemsInStore[i] != null && itemsInStore[i].equals(disc)) {
				found = true;
				for (int j = i; j < qtyInStore - 1; j++) {
					itemsInStore[j] = itemsInStore[j + 1];
				}
				itemsInStore[qtyInStore - 1] = null;
				qtyInStore -= 1;
				System.out.println("This disc has been removed!");
				break;
			}
		}
		if (!found) {
			System.out.println("This disc hasn't ever existed in store!");
		}
	}

    public void printStore() {
        System.out.println("Current DVDs in the store:");
        for (int i = 0; i < qtyInStore; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i].toString());
        }
        if (qtyInStore == 0) {
            System.out.println("The store is empty.");
        }
    }
}

