package com.inetsolv.constants;

public enum MRConstants {
	
	EMPTY(" "), GREP_SEARCH_STR("GREP_SEARCH_STR");
	
	private String value;
	private MRConstants(String value){
		this.value=value;
	}
	
	public String getValue(){
		return this.value;
	}

}
