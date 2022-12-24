package com.durgasoft.app22.scopes;

public class ThreadScope extends ThreadLocal {
	
	@Override
	protected Object initialValue() {
		return "This thread does not have scope in this method";
	}

}
