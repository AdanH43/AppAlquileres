package com.politecnicomalaga.appalquileres.Control;

public class MainController {
    private static MainController mySingleController;

    public static MainController getSingleton() {
        if (MainController.mySingleController == null) {
            mySingleController = new MainController();
        }
        return mySingleController;
    }
}
