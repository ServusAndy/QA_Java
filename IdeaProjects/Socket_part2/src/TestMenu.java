import com.telran.view.ConsoleInputOutput;
import com.telran.view.Item;
import com.telran.view.Menu;

public class TestMenu {
    public static void main(String[] args) {
        Menu menu = new Menu("Main", Item.exit());
        menu.perform(new ConsoleInputOutput());
    }
}
