package com.ElOuedUniv.maktaba.domain.di;

import com.ElOuedUniv.maktaba.data.repository.BookRepository;
import com.ElOuedUniv.maktaba.domain.usecase.DeleteBookUseCase;
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
public final class DomainModule_ProvideDeleteBookUseCaseFactory implements Factory<DeleteBookUseCase> {
  private final Provider<BookRepository> bookRepositoryProvider;

  private DomainModule_ProvideDeleteBookUseCaseFactory(
      Provider<BookRepository> bookRepositoryProvider) {
    this.bookRepositoryProvider = bookRepositoryProvider;
  }

  @Override
  public DeleteBookUseCase get() {
    return provideDeleteBookUseCase(bookRepositoryProvider.get());
  }

  public static DomainModule_ProvideDeleteBookUseCaseFactory create(
      Provider<BookRepository> bookRepositoryProvider) {
    return new DomainModule_ProvideDeleteBookUseCaseFactory(bookRepositoryProvider);
  }

  public static DeleteBookUseCase provideDeleteBookUseCase(BookRepository bookRepository) {
    return Preconditions.checkNotNullFromProvides(DomainModule.INSTANCE.provideDeleteBookUseCase(bookRepository));
  }
}
