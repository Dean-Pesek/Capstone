package pesek.dean.deploytest.exceptions;

public class NoEntityFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public NoEntityFoundException() {}
	
	public NoEntityFoundException(Class<?> type, int id) {
		super("No such entity of type " + type.getName() + " with id " + id);
		this.setId(id);
		this.setType(type);
	}
	
	private int id;
	private Class<?> type;
	public Class<?> getType() {
		return type;
	}
	public void setType(Class<?> type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}