package com.ElOuedUniv.maktaba;

import com.ElOuedUniv.maktaba.data.local.UserPreferences;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;

@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<UserPreferences> userPreferencesProvider;

  private MainActivity_MembersInjector(Provider<UserPreferences> userPreferencesProvider) {
    this.userPreferencesProvider = userPreferencesProvider;
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectUserPreferences(instance, userPreferencesProvider.get());
  }

  public static MembersInjector<MainActivity> create(
      Provider<UserPreferences> userPreferencesProvider) {
    return new MainActivity_MembersInjector(userPreferencesProvider);
  }

  @InjectedFieldSignature("com.ElOuedUniv.maktaba.MainActivity.userPreferences")
  public static void injectUserPreferences(MainActivity instance, UserPreferences userPreferences) {
    instance.userPreferences = userPreferences;
  }
}
