/*
 * Copyright 2015: Thomson Reuters. All Rights Reserved. Proprietary
 * and Confidential information of Thomson Reuters. Disclosure, Use or
 * Reproduction without the written authorization of Thomson Reuters is
 * prohibited.
 */

package by.bsuir.view.template;

import java.util.List;

import javafx.scene.control.MenuItem;

public class CustomMenu extends javafx.scene.control.Menu
{
    public CustomMenu(final String text, final List<MenuItem> menuItems)
    {
        setText(text);
        getItems().addAll(menuItems);
    }
}
