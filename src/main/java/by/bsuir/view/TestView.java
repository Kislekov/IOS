/*
 * Copyright 2015: Thomson Reuters. All Rights Reserved. Proprietary
 * and Confidential information of Thomson Reuters. Disclosure, Use or
 * Reproduction without the written authorization of Thomson Reuters is
 * prohibited.
 */

package by.bsuir.view;

import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class TestView extends VBox
{
    public TestView()
    {
        ScrollPane scrollPane = new ScrollPane();
        Scene scene = new Scene(this, 180, 180);
    }
}
