package com.konylabs.ffi;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;
import com.konylabs.api.TableLib;
import com.konylabs.vm.LuaTable;



import com.Kony.Concat.Concatenation;
import com.konylabs.libintf.Library;
import com.konylabs.libintf.JSLibrary;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;


public class ND_com_training extends JSLibrary {

 
 
	public static final String showToastMessage = "showToastMessage";
 
	String[] methods = { showToastMessage };


 Library libs[] = null;
 public Library[] getClasses() {
 libs = new Library[1];
 libs[0] = new Concatenation();
 return libs;
 }



	public ND_com_training(){
	}

	public Object[] execute(int index, Object[] params) {
		// TODO Auto-generated method stub
		Object[] ret = null;
 
		int paramLen = params.length;
 int inc = 1;
		switch (index) {
 		case 0:
 if (paramLen != 2){ return new Object[] {new Double(100),"Invalid Params"}; }
 java.lang.String message0 = null;
 if(params[0] != null && params[0] != LuaNil.nil) {
 message0 = (java.lang.String)params[0];
 }
 Double duration0 = null;
 if(params[1] != null && params[1] != LuaNil.nil) {
 duration0 = (Double)params[1];
 }
 ret = this.showToastMessage( message0, duration0 );
 
 			break;
 		default:
			break;
		}
 
		return ret;
	}

	public String[] getMethods() {
		// TODO Auto-generated method stub
		return methods;
	}
	public String getNameSpace() {
		// TODO Auto-generated method stub
		return "com.training";
	}


	/*
	 * return should be status(0 and !0),address
	 */
 
 
 	public final Object[] showToastMessage( java.lang.String inputKey0, Double inputKey1 ){
 
		Object[] ret = null;
 com.Kony.Concat.Concatenation.showToastMessage( inputKey0
 , inputKey1.intValue() );
 
 ret = new Object[]{LuaNil.nil, new Double(0)};
 		return ret;
	}
 


class Concatenation extends JSLibrary {

 
 
	public static final String concatStrings = "concatStrings";
 
	String[] methods = { concatStrings };

	public Object createInstance(final Object[] params) {
 return new com.Kony.Concat.Concatenation(
 );
 }


	public Object[] execute(int index, Object[] params) {
		// TODO Auto-generated method stub
		Object[] ret = null;
 
		int paramLen = params.length;
 int inc = 1;
		switch (index) {
 		case 0:
 if (paramLen < 2 || paramLen > 3){ return new Object[] {new Double(100),"Invalid Params"};}
 inc = 1;
 
 java.lang.String string10 = null;
 if(params[0+inc] != null && params[0+inc] != LuaNil.nil) {
 string10 = (java.lang.String)params[0+inc];
 }
 java.lang.String string20 = null;
 if(params[1+inc] != null && params[1+inc] != LuaNil.nil) {
 string20 = (java.lang.String)params[1+inc];
 }
 ret = this.concatStrings(params[0]
 ,string10
 ,string20
 );
 
 			break;
 		default:
			break;
		}
 
		return ret;
	}

	public String[] getMethods() {
		// TODO Auto-generated method stub
		return methods;
	}
	public String getNameSpace() {
		// TODO Auto-generated method stub
		return "Concatenation";
	}

	/*
	 * return should be status(0 and !0),address
	 */
 
 
 	public final Object[] concatStrings( Object self ,java.lang.String inputKey0
 ,java.lang.String inputKey1
 ){
 
		Object[] ret = null;
 java.lang.String val = ((com.Kony.Concat.Concatenation)self).concatStrings( inputKey0
 , inputKey1
 );
 
 			ret = new Object[]{val, new Double(0)};
 		return ret;
	}
 
}

};
