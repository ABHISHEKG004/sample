package Design.LineTextEditor.driver;

import Design.LineTextEditor.service.UiService;

/**
 * Created by abhishek.gupt on 08/01/18.
 */
public class Driver {

    public static void main(String[] args) {
        UiService ui = new UiService();
        ui.askUserForInput();
    }
}
