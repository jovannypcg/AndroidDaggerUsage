package com.inssoftmx.daggerusage.ui.main;

import com.inssoftmx.daggerusage.model.User;

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
public class MainPresenter implements IMainPresenter {
    /**
     * The view of this presenter.
     */
    private MainView view;

    /**
     * Constructor.
     * @param view The view of this presenter.
     */
    public MainPresenter(MainView view) {
        this.view = view;
    }

    /**
     * { @inheritDoc }
     */
    @Override
    public void showInformationFrom(User user) {
        view.getTextView().setText(String.format("Name: %s\nAge: %d\nemail: %s\n",
                user.getName(), user.getAge(), user.getEmail()));
    }
}
