package com.ElOuedUniv.maktaba.domain.di;

import com.ElOuedUniv.maktaba.data.repository.BookRepository;
import com.ElOuedUniv.maktaba.domain.usecase.GetBooksUseCase;
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
public final class DomainModule_ProvideGetBooksUseCaseFactory implements Factory<GetBooksUseCase> {
  private final Provider<BookRepository> bookRepositoryProvider;

  private DomainModule_ProvideGetBooksUseCaseFactory(
      Provider<BookRepository> bookRepositoryProvider) {
    this.bookRepositoryProvider = bookRepositoryProvider;
  }

  @Override
  public GetBooksUseCase get() {
    return provideGetBooksUseCase(bookRepositoryProvider.get());
  }

  public static DomainModule_ProvideGetBooksUseCaseFactory create(
      Provider<BookRepository> bookRepositoryProvider) {
    return new DomainModule_ProvideGetBooksUseCaseFactory(bookRepositoryProvider);
  }

  public static GetBooksUseCase provideGetBooksUseCase(BookRepository bookRepository) {
    return Preconditions.checkNotNullFromProvides(DomainModule.INSTANCE.provideGetBooksUseCase(bookRepository));
  }
}
