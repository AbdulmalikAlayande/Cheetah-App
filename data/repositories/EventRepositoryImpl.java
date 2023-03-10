package data.repositories;

import data.models.Event;

import java.util.List;

public class EventRepositoryImpl implements IEventable{
	@Override
	public Event save(Event event) {
		boolean isSavedEvent = event.getEventId() != 0;
		boolean isNotSavedEvent = event.getEventId() == 0;
		
		if(isNotSavedEvent)
			saveNewEvent(event);
		return null;
	}
	
	private void saveNewEvent(Event event) {
		
	}
	
	@Override
	public void delete(Event event) {
	
	}
	
	@Override
	public void delete(int id) {
	
	}
	
	@Override
	public List<Event> findAll() {
		return null;
	}
	
	@Override
	public Event findById(int id) {
		return null;
	}
	
	@Override
	public int count() {
		return 0;
	}
}
