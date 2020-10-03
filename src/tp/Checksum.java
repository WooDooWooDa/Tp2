package tp;

public class Checksum {

    private final int ENCODE = 1;
    private final int DECODE = 2;

    private final Menu menu;
    private Encoder encoder;

    private String stringToEncode;

    public Checksum() {
         menu = new Menu();
    }

    public void start() {
        while(menu.isNotQuit()) {
            do {
                menu.display();
                menu.chooseMode();
            } while (Keyboard.modeIsNotValid(menu.getMode()));
            executeMode();
        }
    }

    private void executeMode() {
        if (menu.getMode() == ENCODE) {
            encoder = new Encoder(menu.getStringToEncode());
            //encoder.show();
        }
        if (menu.getMode() == DECODE) {
            new Decoder();
        }
    }

}