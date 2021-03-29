package level1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Zone zone = Zone.OTHERS;
		String result="";
		
		System.out.println("Enter the number of packages");
		Scanner sc = new Scanner(System.in);
		int nb = sc.nextInt();
		
		for (int i = 0; i <nb; i ++) {
			System.out.println("Enter the name");
			String na = sc.next();
			System.out.println("Enter the weight");
			int w = sc.nextInt();
			System.out.println("Enter the zone");
			String zn = sc.next();
			Ups u = new Ups(w,na);
			//System.out.println(na+ " - "+w+"pounds"+ " - "+u.getRate());
			
			UsMail um= new UsMail(w,na);
			//System.out.println(na+ " - "+w+"pounds"+ " - "+um.getRate());
			
			switch(zn.toUpperCase()) {
			case "IA":
				zone = zone.IA;
				break;
				
			case "MT":
				zone = zone.MT;
				break;
				
			case "OR":
				zone = zone.OR;
				break;
				
			case "CA":
				zone = zone.CA;
				break;
				
			case "TX":
				zone = zone.TX;
				break;
				
			case "UT":
				zone = zone.UT;
				break;
				
			case "FL":
				zone = zone.FL;
				break;
				
			case "MA":
				zone = zone.MA;
				break;
				
			case "OH":
				zone = zone.OH;
				break;
				
			default:
				zone = Zone.OTHERS;
				break;
				
				
			}
		Fedex fd = new Fedex(zone,w,na);	
		List<Carrier> carriers = new ArrayList<Carrier>();	
		
		carriers.add(u);
		carriers.add(um);
		carriers.add(fd);
		
		double tempRate = carriers.get(0).getRate();
		String tempCarrier = carriers.get(0).getClass().getSimpleName();
		
		for(Carrier c : carriers) {
			
			if(c.getRate() < tempRate) {
				tempRate = c.getRate();
				tempCarrier = c.getClass().getSimpleName();
			}
			System.out.println(tempRate);
			
		}
		result += na+ "  "+"$"+tempRate+" "+tempCarrier+"\n";
		
			
			
			}
		
		System.out.println(result);
	}
	
	
	
}
