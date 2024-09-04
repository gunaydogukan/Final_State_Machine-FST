package _21010310032_Dogukan_Gunay;

import java.io.FileNotFoundException;

public class _21010310032_IRregister {
	
	_21010310032_RAM ramm = new _21010310032_RAM();
	String ir_register="";
	
	public String ir(int index){
		ir_register = ramm.read(index);
		
		return ir_register;
	}

}
