package com.inssoftmx.daggerusage.di;

import com.inssoftmx.daggerusage.ui.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Provides the method to inject the specified object in the modules
 * written in the @Component annotation.
 *
 * @author  OCPJP Jovanny Pablo Cruz Gomez.
 *          Software Engineer.
 *          jovannypcg@yahoo.com
 *
 * @version 1.0.
 */
@Singleton
@Component(modules = {AppModule.class, UserModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
