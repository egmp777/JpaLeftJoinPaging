package com.cc.example.pagination;

import junit.framework.TestCase;

public class TestGetListsOfPersonsWithAddresses extends TestCase {

	
	public final void testGetListsOfPersonsWithAddresses() {
		
		
		CreateEntity handler = new CreateEntity();
		        
        try {
            createEntity.createPerson("Max Kanov",2, "Peach Road 142, CA");
            createEntity.createPerson("Albert Einstein", 3, "123 Park Ave. New York");
            createEntity.createPerson("Anne Fort",11,"200 Chestnut St., Philadelphia");
            createEntity.createPerson("Don Trump",7,"Park Avenue 1, New York");
            createEntity.createPerson("July Bon",7,"Park Avenue 1, New York");
            createEntity.createPerson("Melanie Griff",20 , "NE Andreson Ln, Los Angeles");
            
	        
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
		assertEquals(2, handler.getListsOfPersonsWithAddresses().size());
	    
	}

}
