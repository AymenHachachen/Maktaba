package com.ElOuedUniv.maktaba.domain.di;

import com.ElOuedUniv.maktaba.data.repository.BookRepository;
import com.ElOuedUniv.maktaba.domain.usecase.GetBookByIsbnUseCase;
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
public final class DomainModule_ProvideGetBookByIsbnUseCaseFactory implements Factory<GetBookByIsbnUseCase> {
  private final Provider<BookRepository> bookRepositoryProvider;

  private DomainModule_ProvideGetBookByIsbnUseCaseFactory(
      Provider<BookRepository> bookRepositoryProvider) {
    this.bookRepositoryProvider = bookRepositoryProvider;
  }

  @Override
  public GetBookByIsbnUseCase get() {
    return provideGetBookByIsbnUseCase(bookRepositoryProvider.get());
  }

  public static DomainModule_ProvideGetBookByIsbnUseCaseFactory create(
      Provider<BookRepository> bookRepositoryProvider) {
    return new DomainModule_ProvideGetBookByIsbnUseCaseFactory(bookRepositoryProvider);
  }

  public static GetBookByIsbnUseCase provideGetBookByIsbnUseCase(BookRepository bookRepository) {
    return Preconditions.checkNotNullFromProvides(DomainModule.INSTANCE.provideGetBookByIsbnUseCase(bookRepository));
  }
}
