import java.util.ArrayList;

import java.util.Collections;

public class Y {
	
public static void createX() {
	
	X x = new X(5);
	X xx = new X(7);
	X xxx = new X(5);
	X xxxx = new X(4);
	
	
	ArrayList<X> xSarasas = new ArrayList<X>();
	
	xSarasas.add(x);
	xSarasas.add(xx);
	xSarasas.add(xxx);
	xSarasas.add(xxxx);
	
	for(int i=0; i<xSarasas.size(); i++) {
		System.out.println(xSarasas.get(i).getxArrayList());
		System.out.println(xSarasas.get(i).getxArrayListNumberSum());
	}
	
	System.out.println("########################");
	Collections.sort(xSarasas);
	
	for(int i=0; i<xSarasas.size(); i++) {
		System.out.println(xSarasas.get(i).getxArrayList());
		System.out.println(xSarasas.get(i).getxArrayListNumberSum());
	}
	
}



}
