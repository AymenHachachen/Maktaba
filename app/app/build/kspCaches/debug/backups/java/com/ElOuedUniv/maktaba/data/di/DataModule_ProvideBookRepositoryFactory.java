package com.ElOuedUniv.maktaba.data.di;

import com.ElOuedUniv.maktaba.data.repository.BookRepository;
import com.ElOuedUniv.maktaba.data.repository.SupabaseBookRepositoryImpl;
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
public final class DataModule_ProvideBookRepositoryFactory implements Factory<BookRepository> {
  private final Provider<SupabaseBookRepositoryImpl> repositoryProvider;

  private DataModule_ProvideBookRepositoryFactory(
      Provider<SupabaseBookRepositoryImpl> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public BookRepository get() {
    return provideBookRepository(repositoryProvider.get());
  }

  public static DataModule_ProvideBookRepositoryFactory create(
      Provider<SupabaseBookRepositoryImpl> repositoryProvider) {
    return new DataModule_ProvideBookRepositoryFactory(repositoryProvider);
  }

  public static BookRepository provideBookRepository(SupabaseBookRepositoryImpl repository) {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideBookRepository(repository));
  }
}
