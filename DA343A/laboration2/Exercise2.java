package laboration2;
import java.util.*;
import java.io.*;

public class Exercise2 {
    private ArrayList<Person> list = new ArrayList<Person>();
    
    public Exercise2(String filename) {
    	list = Exercise1.readPersons(filename);
    }

    public String toString() {
        return "Lagrade Person-objekt: " + list.toString();
    }
    
    public void printPersons() {
       for(Person p : list) {
    	   System.out.println(p.getId() + ", " + p.getFirstName() +" "+ p.getLastName());
       }
    }
    
    public int position( String id ) {
    	for(int i = 0; i < list.size(); i++) {
    		if(list.get(i).getId().equals(id)) {    			
    			return i;
    		}
    	}
        return -1; // Ta bort och skriv kod
    }
    
    public void printName( String id ) {
    	if(position(id) >= 0) {
    		  System.out.println(list.get(position(id)).getFirstName());
    	}else {
    		System.out.println("Okänd");
    	    		
    	}
    }
    
    public boolean existsFirstName( String firstName ) {
    	for(int i = 0; i < list.size(); i++) {
    		if(list.get(i).getFirstName().equals(firstName)) {
    			return true;
    		}
    	}
        return false; // Ta bort och skriv kod
    }
    
    public boolean changeLastName( String id, String lastName ) {
    	if(position(id)>= 0) {
    		list.get(position(id)).setLastName(lastName);
    		return true;
    	}
        return false; // Ta bort och skriv kod
    }
  
    // Uppgift 3
    public int position2(String id) {
    	Person p = new Person(id,"","");
    	return list.indexOf(p);
    }
    
    
    
    
    // Uppgift 4
    public void sort() {
    	Collections.sort(list);
    }
   //  Uppgift 4    
    public int position3(String id) {
    	Person p = new Person(id,"","");
    	return Collections.binarySearch(list, p);
    }
    
    public static void main( String[] args ) {
        Exercise2 ex2 = new Exercise2( "files/personer.txt" );
        System.out.println( ex2.toString() );
        ex2.printPersons();
        System.out.println( ex2.position( "840102-4567" ) );
        System.out.println( ex2.position( "111111-2222" ) );
        ex2.printName( "840102-4567" );
        ex2.printName( "111111-2222" );
        System.out.println( ex2.existsFirstName( "Edit" ) );
        System.out.println( ex2.existsFirstName( "Anna" ) );
        ex2.changeLastName( "660503-8901", "Trädrot" );
        System.out.println( ex2.toString() );
        System.out.println( ex2.position2("840102-4567") ); // Uppgift 3
        
        ex2.sort(); // Uppgift 4

       System.out.println( ex2.toString() );
        System.out.println( ex2.position3("840102-4567") ); // Uppgift 4
    }
}
