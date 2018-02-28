package co.nano.nanowallet.di.application;


import javax.inject.Named;

import co.nano.nanowallet.di.persistence.PersistenceModule;
import co.nano.nanowallet.util.SharedPreferencesUtil;
import dagger.Component;
import io.realm.Realm;

@Component(modules = {ApplicationModule.class, PersistenceModule.class})
@ApplicationScope
public interface ApplicationComponent {
    // persistence module
    SharedPreferencesUtil provideSharedPreferencesUtil();

    // database
    Realm provideRealm();

    // encryption key
    @Named("encryption_key")
    byte[] providesEncryptionKey();
}
