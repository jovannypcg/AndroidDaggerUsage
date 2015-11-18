package com.jovannypcg.daggerusage.ui.main;

import android.widget.TextView;

/**
 * Provides methods to handle the MainActivity as view.
 *
 * @author  OCPJP Jovanny Pablo Cruz Gomez.
 *          Software Engineer.
 *          jovannypcg@yahoo.com
 *
 * @version 1.0.
 */
public interface MainView {
    /**
     * Gets the text view in which will be shown information
     * related to the user generated using dependency injection.
     *
     * @return The text view in which will be shown information
     * related to the user.
     */
    TextView getTextView();
}
