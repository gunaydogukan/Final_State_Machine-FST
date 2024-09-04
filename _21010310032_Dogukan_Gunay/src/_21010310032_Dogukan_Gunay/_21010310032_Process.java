package _21010310032_Dogukan_Gunay;

import java.io.FileNotFoundException;

public class _21010310032_Process {
	private String ir_register;
	private String T;
	private String D;
	private String I;
	_21010310032_Sequence_Counter counter = new _21010310032_Sequence_Counter();
	_21010310032_BinaryToDecimal decoder = new _21010310032_BinaryToDecimal();
	_21010310032_RAM ramm = new _21010310032_RAM();
	_21010310032_IRregister ir = new _21010310032_IRregister();
	_21010310032_ucXsekizDecoder ucsekiz = new _21010310032_ucXsekizDecoder();
	_21010310032_dortXonaltiDecoder dortonalti = new _21010310032_dortXonaltiDecoder();

	public void clock() throws FileNotFoundException {
		ramm.write();

		String opr = "";
		for (int index = 0; index < 16; index++) {
			ir_register = ir.ir(index);
			opr = ir_register.substring(1, 4);
			I = "I" + " = " + ir_register.substring(0, 1);

			try {
				T = "T" + dortonalti.dort_onalti(counter.sc(index));
				D = "D" + ucsekiz.uc_sekiz(opr);
				System.out.println(T + " zamanında " + I + " " + D + " aktif IR(11-0) = " + register());
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public String register() {
		String bir = ir_register.substring(0, 4);
		String iki = ir_register.substring(4, 8);
		String uc = ir_register.substring(8, 12);
		String dort = ir_register.substring(12, 16);
		String on_iki = iki + uc + dort;
		bir = decoder.binarytodecimal(bir);

		if (bir.equals("10")) {
			bir = "A";
		} else if (bir.equals("11")) {
			bir = "B";
		} else if (bir.equals("12")) {
			bir = "C";
		} else if (bir.equals("13")) {
			bir = "D";
		} else if (bir.equals("14")) {
			bir = "E";
		} else if (bir.equals("15")) {
			bir = "F";
		}

		if (bir.equals("0") || bir.equals("8")) {
			return on_iki + " = " + "AND";
		} else if (bir.equals("1") || bir.equals("9")) {
			return on_iki + " = " + "ADD";
		} else if (bir.equals("2") || bir.equals("")) {
			return on_iki + " = " + "LDA";
		} else if (bir.equals("3") || bir.equals("B")) {
			return on_iki + " = " + "STA";
		} else if (bir.equals("4") || bir.equals("C")) {
			return on_iki + " = " + "BUN";
		} else if (bir.equals("5") || bir.equals("D")) {
			return on_iki + " = " + "BSA";
		} else if (bir.equals("6") || bir.equals("E")) {
			return on_iki + " = " + "ISZ";
		}

		if (bir.equals("7")) {
			iki = decoder.binarytodecimal(iki);

			if (iki.equals("8")) {
				return on_iki + " = " + "CLA";
			} else if (iki.equals("4")) {
				return on_iki + " = " + "CLE";
			} else if (iki.equals("2")) {
				return on_iki + " = " + "CMA";
			} else if (iki.equals("1")) {
				return on_iki + " = " + "CME";
			}

			uc = decoder.binarytodecimal(uc);
			if (uc.equals("8")) {
				return on_iki + " = " + "CIR";
			} else if (uc.equals("4")) {
				return on_iki + " = " + "CIL";
			} else if (uc.equals("2")) {
				return on_iki + " = " + "INC";
			} else if (uc.equals("1")) {
				return on_iki + " = " + "SPA";
			}

			dort = decoder.binarytodecimal(dort);
			if (dort.equals("8")) {
				return on_iki + " = " + "SNA";
			} else if (dort.equals("4")) {
				return on_iki + " = " + "SZA";
			} else if (dort.equals("2")) {
				return on_iki + " = " + "SZE";
			} else if (dort.equals("1")) {
				return on_iki + " = " + "HLT";
			}
		} else if (bir.equals("F")) {
			iki = decoder.binarytodecimal(iki);
			if (iki.equals("8")) {
				return on_iki + " = " + "INP";
			} else if (iki.equals("4")) {
				return on_iki + " = " + "OUT";
			} else if (iki.equals("2")) {
				return on_iki + " = " + "SKI";
			} else if (iki.equals("1")) {
				return on_iki + " = " + "SKO";
			}

			uc = decoder.binarytodecimal(uc);
			if (uc.equals("8")) {
				return on_iki + " = " + "ION";
			} else if (uc.equals("4")) {
				return on_iki + " = " + "IOF";
			}
		} else if (bir.equals("0") || bir.equals("8")) {
			return on_iki + " = " +"AND";
		} else if (bir.equals("1") || bir.equals("9")) {
			return on_iki + " = " +"ADD";
		} else if (bir.equals("2") || bir.equals("A")) {
			return on_iki + " = " +"LDA";
		} else if (bir.equals("3") || bir.equals("B")) {
			return on_iki + " = " +"STA";
		} else if (bir.equals("4") || bir.equals("C")) {
			return on_iki + " = " +"BUN";
		} else if (bir.equals("5") || bir.equals("D")) {
			return on_iki + " = " +"BSA";
		} else if (bir.equals("6") || bir.equals("E")) {
			return on_iki + " = " +"ISZ";
		}

		return null;
	}

}
