/*
 * Copyright 2015: Thomson Reuters. All Rights Reserved. Proprietary
 * and Confidential information of Thomson Reuters. Disclosure, Use or
 * Reproduction without the written authorization of Thomson Reuters is
 * prohibited.
 */

package by.bsuir.view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainWindow extends Application
{
    private final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");

    private final MenuBar menuBar = context.getBean(MenuBar.class);

    @Override
    public void start(final Stage primaryStage)
    {
        Scene scene = new Scene(new VBox(), 400, 350);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        final VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(0, 10, 0, 10));
        ((VBox) scene.getRoot()).getChildren().addAll(menuBar, vbox);
    }

    public static void main(final String[] args)
    {
        MainWindow.launch(args);
    }
}
