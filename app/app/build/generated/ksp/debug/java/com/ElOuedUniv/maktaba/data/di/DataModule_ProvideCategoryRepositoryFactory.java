package com.ElOuedUniv.maktaba.data.di;

import com.ElOuedUniv.maktaba.data.repository.CategoryRepository;
import com.ElOuedUniv.maktaba.data.repository.SupabaseCategoryRepositoryImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class DataModule_ProvideCategoryRepositoryFactory implements Factory<CategoryRepository> {
  private final Provider<SupabaseCategoryRepositoryImpl> repositoryProvider;

  private DataModule_ProvideCategoryRepositoryFactory(
      Provider<SupabaseCategoryRepositoryImpl> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public CategoryRepository get() {
    return provideCategoryRepository(repositoryProvider.get());
  }

  public static DataModule_ProvideCategoryRepositoryFactory create(
      Provider<SupabaseCategoryRepositoryImpl> repositoryProvider) {
    return new DataModule_ProvideCategoryRepositoryFactory(repositoryProvider);
  }

  public static CategoryRepository provideCategoryRepository(
      SupabaseCategoryRepositoryImpl repository) {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideCategoryRepository(repository));
  }
}
