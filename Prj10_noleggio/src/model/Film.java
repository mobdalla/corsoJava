package model;

public class Film {
	private int id;
	private String title;
	private String description;
	private int languageId;
	private int release_year;
	private int genreId;
	public String getTitle() {
		return title;
	}
	
	
	public int getRelease_year() {
		return release_year;
	}


	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getLanguageId() {
		return languageId;
	}
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	public int getGenreId() {
		return genreId;
	}
	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Film [id=");
		builder.append(id);
		builder.append(", [title=");
		builder.append(title);
		builder.append(", description=");
		builder.append(description);
		builder.append(", languageId=");
		builder.append(languageId);
		builder.append(", genreId=");
		builder.append(genreId);
		builder.append(", release_year=");
		builder.append(release_year);
		builder.append("]");
		return builder.toString();
	}
	
	

}
