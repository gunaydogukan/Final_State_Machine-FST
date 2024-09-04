package _21010310032_Dogukan_Gunay;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _21010310032_RAM {
	
	private static String ram[] = new String[16];
	
	public void write() throws FileNotFoundException {
		
		Scanner dosya = new Scanner(new File("RAM.txt"));
		int adr=0;
		
		while(dosya.hasNext()&& adr<16) {
			this.ram[adr]=dosya.nextLine();
			adr++;
		}
		System.out.println("RAM.txt dosyası okundu.");
		dosya.close();
	}
	
	public  String read(int adres ) {
		return this.ram[adres];
	}
	
}
