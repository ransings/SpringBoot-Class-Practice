package com.sr.sbeans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

@Component("replacer")
public class OriginalMethodReplacer implements MethodReplacer {

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		String value="This is Method of "+getClass()+" with parameter value "+args[0].getClass()+" "+
				args[1].getClass();
		String arrayCon=Arrays.toString(method.getParameterTypes());
		value+="\nMethod argumentTypes are::"+arrayCon;
		return value;
		
	}

}
