package Optionallclasses;

import java.util.Optional;

public class User {
	public Optional<String>getCityNameById(Integer id) {
		String name = null;
		if(id==100) {
			name= "Banglore code";
		}
		else if(id==200) {
			name= "Hyderabad code";
		}
		else if(id==300) {
			name="Delhi code";
		}
		
		
		return Optional.ofNullable(name);
	}
//public String getCityNameById(Integer id) {
//	
//	if(id==100) {
//	return "Banglore code";
//	}
//	else if(id==200) {
//		return "Hyderabad code";
//	}
//	else if(id==300) {
//		return "Delhi code";
//	}
//	else {
//	return null;
//	}
//}
}
