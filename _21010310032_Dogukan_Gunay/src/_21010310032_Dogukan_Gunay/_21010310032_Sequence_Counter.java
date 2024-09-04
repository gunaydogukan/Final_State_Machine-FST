package _21010310032_Dogukan_Gunay;

public class _21010310032_Sequence_Counter {
	
	public String sc(int index) {
		String sc = "";
        if (index >= 8) {
        	sc += "1";
            index -= 8;
        } else {
        	sc += "0";
        }
        if (index >= 4) {
        	sc += "1";
            index -= 4;
        } else {
        	sc += "0";
        }
        if (index >= 2) {
        	sc += "1";
            index -= 2;
        } else {
        	sc += "0";
        }
        if (index >= 1) {
        	sc += "1";
        } else {
        	sc += "0";
        }
		return sc;
	}
}
