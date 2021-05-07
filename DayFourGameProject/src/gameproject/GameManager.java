package gameproject;

public class GameManager implements GameService {

    @Override
    public void addGame(Game game) {
        System.out.println(game.getGameName() + " adlı oyun mağazaya eklendi");
    }

    @Override
    public void deleteGame(Game game) {
        System.out.println(game.getGameName() + " adlı oyun mağazadan kaldırıldı");
    }

    @Override
    public void updateGame(Game game) {
        System.out.println(game.getGameName() + " adlı oyunun bilgileri güncellendi");
    }
}
