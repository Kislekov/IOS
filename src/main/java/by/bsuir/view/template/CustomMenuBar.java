/*
 * Copyright 2015: Thomson Reuters. All Rights Reserved. Proprietary
 * and Confidential information of Thomson Reuters. Disclosure, Use or
 * Reproduction without the written authorization of Thomson Reuters is
 * prohibited.
 */

package by.bsuir.view.template;

import java.util.List;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomMenuBar extends MenuBar
{
    @Autowired
    public void init(final List<Menu> menus)
    {
        getMenus().addAll(menus);
    }
}
