package org.brandao.brutos.annotation.helper.keycollection.app1;

import java.util.HashMap;

import org.brandao.brutos.annotation.KeyCollection;
import org.brandao.brutos.annotation.Transient;

@SuppressWarnings("serial")
@KeyCollection(bean="subKey")
public class CustomMap
	extends HashMap<Integer,String>{

	@Transient
	public boolean isEmpty(){
		return super.isEmpty();
	}
	
	@Override
	public boolean equals(Object arg0){
		return super.equals(arg0);
	}
	
	@Override
	public int hashCode(){
		return super.hashCode();
	}
	
}
