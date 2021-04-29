public class Main {

	public static void main(String[] args) {
		Author gokhan = new Author(1, "Gökhan", "Tanrıverdi");
		Author ghostkozak = new Author(2, "John", "Kozak");
		
		String[] wp1tags = {"draw","landscape","orjinal"};
		String[] wp2tags = {"video game", "witcher 3", "geralt of rivia"};
		
		Wallpaper wallpaper1 = new Wallpaper(1, gokhan, "../../walpaper.jpg", "Bir manzara çizimi", wp1tags );
		Wallpaper wallpaper2 = new Wallpaper(2, ghostkozak, "../../witcher.jpg", "Geralt of Rivia", wp2tags );
		
		WallpaperManager wallpaperManager = new WallpaperManager();
		wallpaperManager.uploadWallpaper(wallpaper1);
		wallpaperManager.uploadWallpaper(wallpaper2);
		wallpaperManager.deleteWallpaper(wallpaper1);
	}

}