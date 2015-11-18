package com.jovannypcg.daggerusage.ui.main;

import com.jovannypcg.daggerusage.model.User;

/**
 * Provides methods which contain the programming logic to
 * manipulate de MainView.
 *
 * @author  OCPJP Jovanny Pablo Cruz Gomez.
 *          Software Engineer.
 *          jovannypcg@yahoo.com
 *
 * @version 1.0.
 */
public interface IMainPresenter {
    /**
     * Show the information of the user sent as parameter in a
     * text view.
     * @param user The user.
     */
    void showInformationFrom(User user);
}
