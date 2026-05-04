package com.ElOuedUniv.maktaba.domain.usecase;

import com.ElOuedUniv.maktaba.data.repository.BookRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
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
public final class DeleteBookUseCase_Factory implements Factory<DeleteBookUseCase> {
  private final Provider<BookRepository> bookRepositoryProvider;

  private DeleteBookUseCase_Factory(Provider<BookRepository> bookRepositoryProvider) {
    this.bookRepositoryProvider = bookRepositoryProvider;
  }

  @Override
  public DeleteBookUseCase get() {
    return newInstance(bookRepositoryProvider.get());
  }

  public static DeleteBookUseCase_Factory create(Provider<BookRepository> bookRepositoryProvider) {
    return new DeleteBookUseCase_Factory(bookRepositoryProvider);
  }

  public static DeleteBookUseCase newInstance(BookRepository bookRepository) {
    return new DeleteBookUseCase(bookRepository);
  }
}
