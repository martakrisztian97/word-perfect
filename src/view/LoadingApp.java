/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 * Splash screen betöltését szolgáló osztály
 * @author Márta Krisztián
 * @since 2022-06-28
 * @version 1.0
 */
public class LoadingApp {

    public static void main(String[] args) {
        SplashScreen s = new SplashScreen();
        s.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                s.jLabel3.setText(Integer.toString(i)+"%");
                if (i == 100) {
                    s.dispose();
                }
            }
        } catch (Exception e) {
            System.out.println("Hiba a splash screen betöltésekor!");
        }
    }
}
