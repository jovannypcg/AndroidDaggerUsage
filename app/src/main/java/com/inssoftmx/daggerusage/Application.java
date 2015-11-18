package com.inssoftmx.daggerusage;

import com.inssoftmx.daggerusage.di.AppComponent;
import com.inssoftmx.daggerusage.di.AppModule;
import com.inssoftmx.daggerusage.di.DaggerAppComponent;
import com.inssoftmx.daggerusage.di.UserModule;
import com.inssoftmx.daggerusage.model.User;

/**
 * The application class.
 * Inside the onCreate method, the dependency injection
 * with Dagger 2 is configured.
 *
 * @author  OCPJP Jovanny Pablo Cruz Gomez.
 *          Software Engineer.
 *
 * @version 1.0.
 */
public class Application extends android.app.Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .userModule(new UserModule(new User("Jovanny", 23, "jovannypcg@yahoo.com")))
                .build();
    }

    /**
     * Gets the dependency component of the app.
     *
     * @return The dependency component.
     */
    public AppComponent getComponent() {
        return component;
    }
}
