/*
 * Copyright 2015: Thomson Reuters. All Rights Reserved. Proprietary
 * and Confidential information of Thomson Reuters. Disclosure, Use or
 * Reproduction without the written authorization of Thomson Reuters is
 * prohibited.
 */

package by.bsuir.eventhandlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import org.springframework.stereotype.Component;

@Component
public class NewRuleAction implements EventHandler<javafx.event.ActionEvent>
{
    @Override
    public void handle(final ActionEvent arg0)
    {
        System.out.println("New Rule");
    }

}
