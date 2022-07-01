package view;

/**
 * Alkalmazás indítása
 * @author Márta Krisztián
 * @since 2022-06-28
 * @version 1.0
 */
public class LoadingApp {

    public static void main(String[] args) {
        SplashScreen s = new SplashScreen();
        s.setVisible(true);
        HomeJFrame h = new HomeJFrame();
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                s.percentLabel.setText(Integer.toString(i)+"%");
                if (i == 50) s.loadTextLabel.setText("Magyar szavak betöltése...");
                if (i == 100) {
                    s.dispose();
                    h.setVisible(true);
                }
            }
        } catch (Exception e) {
            System.out.println("Hiba a splash screen betöltésekor!");
        }
    }
}
