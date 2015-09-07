/*
 * Copyright 2015: Thomson Reuters. All Rights Reserved. Proprietary
 * and Confidential information of Thomson Reuters. Disclosure, Use or
 * Reproduction without the written authorization of Thomson Reuters is
 * prohibited.
 */

package by.bsuir.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldButton extends Button
{
    public HelloWorldButton()
    {
        this.setText("Say 'Hello World'");
        this.setOnAction(new EventHandler<ActionEvent>()
        {

            @Override
            public void handle(final ActionEvent event)
            {
                System.out.println("Hello World!");
            }
        });
    }
}
