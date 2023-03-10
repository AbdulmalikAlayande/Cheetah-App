package data.repositories;

import data.models.Event;

import java.util.List;

public interface IEventable {
	Event save(Event event);
	void delete(Event event);
	void delete(int id);
	List<Event> findAll();
	Event findById(int id);

	int count();
}
