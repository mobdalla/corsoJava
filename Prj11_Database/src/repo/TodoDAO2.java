package repo;

import java.time.LocalDate;
import java.util.List;

import model.Todo;

public interface TodoDAO2 {
		String FIND_ALL ="SELECT * from todo";
		String ADD = "INSERT INTO todo (descrizione, data, done) values (?,?,?)";
	void addTodo(String desc, LocalDate data, boolean done);
	List<Todo> getALL();
}
