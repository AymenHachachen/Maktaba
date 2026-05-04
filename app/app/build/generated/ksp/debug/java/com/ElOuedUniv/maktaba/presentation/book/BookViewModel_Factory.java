package com.ElOuedUniv.maktaba.presentation.book;

import com.ElOuedUniv.maktaba.domain.usecase.AddBookUseCase;
import com.ElOuedUniv.maktaba.domain.usecase.GetBooksUseCase;
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
public final class BookViewModel_Factory implements Factory<BookViewModel> {
  private final Provider<GetBooksUseCase> getBooksUseCaseProvider;

  private final Provider<AddBookUseCase> addBookUseCaseProvider;

  private BookViewModel_Factory(Provider<GetBooksUseCase> getBooksUseCaseProvider,
      Provider<AddBookUseCase> addBookUseCaseProvider) {
    this.getBooksUseCaseProvider = getBooksUseCaseProvider;
    this.addBookUseCaseProvider = addBookUseCaseProvider;
  }

  @Override
  public BookViewModel get() {
    return newInstance(getBooksUseCaseProvider.get(), addBookUseCaseProvider.get());
  }

  public static BookViewModel_Factory create(Provider<GetBooksUseCase> getBooksUseCaseProvider,
      Provider<AddBookUseCase> addBookUseCaseProvider) {
    return new BookViewModel_Factory(getBooksUseCaseProvider, addBookUseCaseProvider);
  }

  public static BookViewModel newInstance(GetBooksUseCase getBooksUseCase,
      AddBookUseCase addBookUseCase) {
    return new BookViewModel(getBooksUseCase, addBookUseCase);
  }
}
