package com.masai;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class EmployeeBonus {
	public double calculateBonus(String joinDate) throws InvalidAgeException{
		
            try {
        		LocalDate today = LocalDate.now();
        		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    			LocalDate join = LocalDate.parse(joinDate,format);
    			Period experience = Period.between(join, today);
                if(today.isBefore(join)) {
                	InvalidAgeException ie = new InvalidAgeException("Joining Date should not be in future");
                	throw ie;
        			
                }
    			else if(experience.getYears() < 1) {
    				return 5000;
    			}
    			else if(experience.getYears() < 2){
    				
    				return 8000;
    			}
    			else {
    				
    				return 10000;
    			}
    			
            }catch(InvalidAgeException ie) {
    			throw ie;
            }
            catch(DateTimeParseException dtpe){{
            	InvalidAgeException ie = new InvalidAgeException("Please pass the date in the correct format");
            	throw ie;
            }
            	
            }

	}

}
