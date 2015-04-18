package com.geecat.steps.polymorphisim;

public class TestBikes {
	  public static void main(String[] args){
	    Bicycle bike01, bike02, bike03;
	    MountainBike mb;
	    RoadBike rb;
	    bike01 = new Bicycle("20", "10", "1");
	    bike02 = new MountainBike("20", "10", "5", "Dual");
	    bike03 = new RoadBike("40", "20", "8", 23);

	   // mb = new MountainBike("20", "10", "5", "Dual");
	    rb = new RoadBike("40", "20", "8", 23);
	    //bike01 = mb;
	   mb=(MountainBike) bike01;
	   mb.printDescription();
	    //mb=rb;
	   // bike01.printDescription();
	   // bike02.printDescription();
	   // bike03.printDescription();
	  }
	}