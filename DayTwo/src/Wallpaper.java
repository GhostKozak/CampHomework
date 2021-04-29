public class Wallpaper {
	int id;
	Author author;
	String path;
	String desc;
	String[] tags;
	
	public Wallpaper(int id, Author author, String path, String desc, String[] tags) {
		this.id = id;
		this.author = author;
		this.path = path;
		this.desc = desc;
		this.tags = tags;
	}
}