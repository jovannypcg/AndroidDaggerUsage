package com.inssoftmx.daggerusage.ui.main;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.inssoftmx.daggerusage.Application;
import com.inssoftmx.daggerusage.R;
import com.inssoftmx.daggerusage.model.User;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Shows information related to a user generated using dependency injection.
 *
 * @author  OCPJP Jovanny Pablo Cruz Gomez.
 *          Software Engineer.
 *          jovannypcg@yahoo.com
 *
 * @version 1.0.
 */
public class MainActivity extends AppCompatActivity implements MainView {
    /**
     * The injected user.
     */
    @Inject User user;

    /**
     * The text view that will show the user information.
     */
    @Bind(R.id.tv)
    TextView tv;

    /**
     * The presenter of this view.
     */
    private IMainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ((Application) getApplication()).getComponent().inject(this);
        ButterKnife.bind(this);

        presenter = new MainPresenter(this);
        presenter.showInformationFrom(user);
    }

    /**
     * { @inheritDoc }
     */
    @Override
    public TextView getTextView() {
        return tv;
    }
}
