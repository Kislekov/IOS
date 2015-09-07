/*
 * Copyright 2015: Thomson Reuters. All Rights Reserved. Proprietary
 * and Confidential information of Thomson Reuters. Disclosure, Use or
 * Reproduction without the written authorization of Thomson Reuters is
 * prohibited.
 */

package by.bsuir.view.template;

import javafx.event.EventHandler;
import javafx.scene.control.MenuItem;

public class CustomMenuItem extends MenuItem
{
    public CustomMenuItem(final String text, final EventHandler<javafx.event.ActionEvent> actionHandler)
    {
        setOnAction(actionHandler);
        setText(text);
    }
}
