public class WallpaperManager {
	public void uploadWallpaper(Wallpaper wallpaper) {
		System.out.println(wallpaper.author.firstName + " " + wallpaper.author.lastName + " adlı kullanıcı " + wallpaper.id + " ID'li bir wallpaper yükledi");
	}
	public void deleteWallpaper(Wallpaper wallpaper) {
		System.out.println(wallpaper.author.firstName + " " + wallpaper.author.lastName + " adlı kullanıcı " + wallpaper.id + " ID'li wallpaperı sildi");
	}
}