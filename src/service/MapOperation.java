package service;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import model.TouristPlace;

public class MapOperation{
	
	
	Map<String,TouristPlace> hash = new HashMap<String,TouristPlace>();
	Map<String,TouristPlace> linkedhash = new LinkedHashMap<String,TouristPlace>();
	Map<String,TouristPlace> treemap = new TreeMap<String,TouristPlace>();
	
	public HashMap<String,TouristPlace> add(TouristPlace places)
	{
		hash.put(places.getRank(),places);
		linkedhash.put(places.getRank(),places);
		treemap.put(places.getRank(),places);
		return  (HashMap<String, TouristPlace>) hash;
		
	}
	public LinkedHashMap<String,TouristPlace> sortInEntryOrder(HashMap<String,TouristPlace> places) throws IOException
	    {
	    	LinkedHashMap<String,TouristPlace> map=new LinkedHashMap<String,TouristPlace>();
	    	for(Entry<String, TouristPlace> pair : places.entrySet())
	    	{
	    		String k = pair.getKey();
	    		TouristPlace value = pair.getValue();
	    		map.put(k, value);
	    }
			return map;
	    }
	public Map<String, TouristPlace> sortRandomly(Map<String, TouristPlace> places)
	{	
		return  (HashMap<String, TouristPlace>) hash;	
	}
	public Object sortInEntryOrder(Map<String,TouristPlace> places)
	{   
        return linkedhash; 
	}
	public Object sortAlphabetically(Map<String,TouristPlace> places)
	{
        return treemap; 
	}
	public Object reset(Map<String, TouristPlace> map2)
	{
		map2.clear();
		return map2;	
	}
	public Object remove(TouristPlace places)
	{
		hash.remove(places.getRank(),places);
		linkedhash.remove(places.getRank(),places);
		treemap.remove(places.getRank(),places);
		return  (HashMap<String, TouristPlace>) hash;
	}
}
	
	
