package service;

import java.util.ArrayList;
import java.util.List;

import model.TouristPlace;

public class ListOperations{
	
	List<TouristPlace> list = new ArrayList<TouristPlace>();

    public List<TouristPlace> add(TouristPlace places) {
    	list.add(places);
    	return list;
    }
    public List<TouristPlace> remove(TouristPlace places) {
    	list.remove(places);
    	return list;
    	
    }
    public Object sortByDestination(List<TouristPlace> places) {

		 places.sort((TouristPlace p,TouristPlace q)-> p.getDestination().compareTo(q.getDestination()));
	     return places;	
    	
    }
    public Object sortByRank(List<TouristPlace> places) {
    	
    	 places.sort((TouristPlace tp1,TouristPlace tp2)->tp1.getRank().compareTo(tp2.getRank()));
 		return places;
 		
    	
    }
    public Object reset(List<TouristPlace> places) {
    	
    	list.clear();
		return list;
    	
    }

	
}