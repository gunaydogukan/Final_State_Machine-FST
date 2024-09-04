package _21010310032_Dogukan_Gunay;

public class _21010310032_ucXsekizDecoder {
	
	
	
	public String uc_sekiz(String opr) {
		String arr[]= new String[opr.length()];
		
		String x = "",y="",z="";
		String x_degil="",y_degil="",z_degil="";
		
		String genel="";
		String kontrol="";
		
		for (int i = 0; i < opr.length(); i++) {
			if(x.equals("")) {
				x=String.valueOf(opr.charAt(i));
				arr[i]=x;
				
				if(x.equals("0")) {
					x_degil="1";
				}
				
				genel = x;
			}else if(y.equals("")) {
				y=String.valueOf(opr.charAt(i));
				arr[i]=y;
				
				if(y.equals("0")) {
					y_degil="1";
				}
				
				genel+=y;
			}else if(z.equals("")) {
				z=String.valueOf(opr.charAt(i));
				arr[i]=z;
				
				if(z.equals("0")) {
					z_degil="1";
				}
				
				genel+=z;
			}
		}
		
		boolean d0= (x_degil.equals("1")&& y_degil.equals("1")) && z_degil.equals("1");
		boolean d1= (x_degil.equals("1") && y_degil.equals("1")) && z.equals("1");
		boolean d2= (x_degil.equals("1") && y.equals("1")) && z_degil.equals("1");
		boolean d3= x_degil.equals("1") && (y.equals("1") && z.equals("1"));
		boolean d4= (x.equals("1") && y_degil.equals("1")) && z_degil.equals("1");
		boolean d5= (x.equals("1") && y_degil.equals("1")) && z.equals("1");
		boolean d6= (x.equals("1") && y.equals("1")) && z_degil.equals("1");
		boolean d7= (x.equals("1") && y.equals("1")) && z.equals("1");
		
		for (int i = 0; i < arr.length; i++) {
			if(d0) {
				return "0";
			}else if(d1) {
				return "1";
			}else if(d2) {
				return "2";
			}
			else if(d3) {
				return "3";
			}
			else if(d4) {
				return "4";
			}
			else if(d5) {
				return "5";
			}else if(d6) {
				return "6";
			}else if(d7) {
				return "7";
			}
		}
		return "DEĞER BULUNAMADI.";
	}

}
