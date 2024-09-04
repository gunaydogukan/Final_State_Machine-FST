package _21010310032_Dogukan_Gunay;

public class _21010310032_BinaryToDecimal {
	
	public String binarytodecimal(String opr_sc) {
		String arr[] = new String[opr_sc.length()];
		int deger;
		int sonuc = 0;
		for (int i = 0; i < opr_sc.length(); i++) {
			arr[i] = String.valueOf(opr_sc.charAt(i));
		}
		int sayac = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			deger = Integer.parseInt(arr[i]);
			deger = (int) (Math.pow(2, sayac) * deger);
			sonuc += deger;
			sayac++;
		}
		String result;
		result = String.valueOf(sonuc);
		return result;
	}
}


