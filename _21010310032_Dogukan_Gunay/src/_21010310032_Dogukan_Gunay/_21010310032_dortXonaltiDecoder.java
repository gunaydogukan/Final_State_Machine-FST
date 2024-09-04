package _21010310032_Dogukan_Gunay;

public class _21010310032_dortXonaltiDecoder {
	
	public static String dort_onalti(String sc) {
		String arr[]= new String[sc.length()];
		
		String x = "",y="",z="",t="";
		String x_degil="",y_degil="",z_degil="",t_degil="";
		
		String genel="";
		String kontrol="";
		
		for (int i = 0; i < sc.length(); i++) {
			if(x.equals("")) {
				x=String.valueOf(sc.charAt(i));
				arr[i]=x;
				
				if(x.equals("0")) {
					x_degil="1";
				}
				
				genel = x;
			}else if(y.equals("")) {
				y=String.valueOf(sc.charAt(i));
				arr[i]=y;
				
				if(y.equals("0")) {
					y_degil="1";
				}
				
				genel+=y;
			}else if(z.equals("")) {
				z=String.valueOf(sc.charAt(i));
				arr[i]=z;
				
				if(z.equals("0")) {
					z_degil="1";
				}
				
				genel+=z;
			}else if(t.equals("")) {
				t=String.valueOf(sc.charAt(i));
				arr[i]=t;
				
				if(t.equals("0")) {
					t_degil="1";
				}
				genel+=t;
			}
		}
		
		boolean t0= (x_degil.equals("1")&& y_degil.equals("1")) && (z_degil.equals("1") && t_degil.equals("1"));
		boolean t1= (x_degil.equals("1") && y_degil.equals("1")) && ( z_degil.equals("1") && t.equals("1") );
		boolean t2 = (x_degil.equals("1") && y_degil.equals("1")) && ( z.equals("1") && t_degil.equals("1"));
		boolean t3= (x_degil.equals("1")&& y_degil.equals("1")) && ( z.equals("1") && t.equals("1") );
		boolean t4= (x_degil.equals("1")&& y.equals("1")) && (z_degil.equals("1") &&  t_degil.equals("1"));;
		boolean t5= (x_degil.equals("1")&& y.equals("1")) && (z_degil.equals("1") && t.equals("1") );
		boolean t6= (x_degil.equals("1")&& y.equals("1")) && (z.equals("1") && t_degil.equals("1"));;
		boolean t7= (x_degil.equals("1")&& y.equals("1")) && (z.equals("1") && t.equals("1"));
		boolean t8 = (x.equals("1") && y_degil.equals("1")) && (z_degil.equals("1") && t_degil.equals("1"));
		boolean t9 = (x.equals("1") && y_degil.equals("1")) && (z_degil.equals("1") && t.equals("1"));
		boolean t10 = (x.equals("1") && y_degil.equals("1")) && (z.equals("1") && t_degil.equals("1"));
		boolean t11 = (x.equals("1") && y_degil.equals("1")) && (z.equals("1") && t.equals("1"));
		boolean t12 = (x.equals("1") && y.equals("1")) && (z_degil.equals("1") && t_degil.equals("1"));
		boolean t13 = (x.equals("1") && y.equals("1")) && (z_degil.equals("1") && t.equals("1"));
		boolean t14 = (x.equals("1") && y.equals("1")) && (z.equals("1") && t_degil.equals("1"));
		boolean t15 = (x.equals("1") && y.equals("1")) && (z.equals("1") && t.equals("1"));
		
		for (int j = 0; j < 16; j++) {
			if(t0) {
				return "0";
			}else if(t1) {
				return "1";
			}else if(t2) {
				return "2";
			}else if(t3) {
				return "3";
			}else if(t4) {
				return "4";
			}else if(t5) {
				return "5";
			}else if(t6) {
				return "6";
			}else if(t7) {
				return "7";
			}else if(t8) {
				return "8";
			}else if(t9) {
				return "9";
			}else if(t10) {
				return "10";
			}else if(t11) {
				return "11";
			}else if(t12) {
				return "12";
			}else if(t13) {
				return "13";
			}else if(t14) {
				return "14";
			}else if(t15) {
				return "15";
			}
		}
		return "değer yok";
	}

}
