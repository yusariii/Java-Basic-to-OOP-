package Package;

public class TestPassingParameter {

    public static void main(String[] args) {
       
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());


        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

//    public static void swap(Object o1, Object o2) {
//        Object tmp = o1;
//        o1 = o2;
//        o2 = tmp;
//    }
    
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    	String tmpTitle = dvd1.getTitle();
	    dvd1.setTitle(dvd2.getTitle());
	    dvd2.setTitle(tmpTitle);

	    String tmpCategory = dvd1.getcategory();
	    dvd1.setcategory(dvd2.getcategory());
	    dvd2.setcategory(tmpCategory);

	    String tmpDirector = dvd1.getDirector();
	    dvd1.setDirector(dvd2.getDirector());
	    dvd2.setDirector(tmpDirector);

	    int tmpLength = dvd1.getLength();
	    dvd1.setLength(dvd2.getLength());
	    dvd2.setLength(tmpLength);

	    float tmpCost = dvd1.getCost();
	    dvd1.setCost(dvd2.getCost());
	    dvd2.setCost(tmpCost);
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
