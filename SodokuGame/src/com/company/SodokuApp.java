package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SodokuApp extends Application{
    private IUserInterfaceContract.view uiImpl;

    @Override
    public void start(Stage primaryStage) throws Exception{
        uiImpl = new UserInterfaceImpl(primaryStage);
        try {
            SodokuBuildingLogic.buil(uiImpl);
        }catch (IOException er){
            er.printStackTrace();
            throw er;
        }

    }
}
