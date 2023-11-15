package fun.suhe.interfaces;

/**
 * 工厂
 * 添加额外间接层的原因：
 * 创建框架
 */
interface Game{
    /**
     *假如Game 中代码足够复杂
     *这意味着可在不同类型游戏中复用这段代码
     */
    boolean move();
}

/**
 * 间接层
 */
interface GameFactory {
    Game getGame();
}
class Checker implements Game {
    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public boolean move() {
        System.out.println("Checker move" + moves);
        return ++moves != MOVES;
    }
}
class CheckerFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Checker();
    }
}

class Chess implements Game{
    private int moves = 0;
    private static final int MOVES = 4;

    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}
class ChessFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Chess();
    }
}
public class Games {
    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while (s.move()) {

        }
    }

    public static void main(String[] args) {
        playGame(new CheckerFactory());
        playGame(new ChessFactory());
    }
}
