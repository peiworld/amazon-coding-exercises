package com.amazon.exercise.stream.usecase;

import com.amazon.exercise.stream.provided.Stream;

import java.util.LinkedHashMap;
import java.util.Map;


public class FirstOddPicker {
    public Character identifyFirstOddFromStream(Stream stream) {
        Map<Character, Integer> charsTable = new LinkedHashMap<Character, Integer>();
		Character c = null;

		if(null == stream){
			return null;
		}

		while (stream.hasNext()){
			c = stream.getNext();

			if(charsTable.containsKey(c)){
				charsTable.put(c, charsTable.get(c)+1);
			} else {
				charsTable.put(c, 1);
			}
		}
		
		for(Character n : charsTable.keySet()){
			if(charsTable.get(n)==1)
				return n;
		}
		
		return null;
    }
}
