package com.ElOuedUniv.maktaba.presentation.book.detail;

import androidx.lifecycle.SavedStateHandle;
import com.ElOuedUniv.maktaba.domain.usecase.DeleteBookUseCase;
import com.ElOuedUniv.maktaba.domain.usecase.GetBookByIsbnUseCase;
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
public final class BookDetailViewModel_Factory implements Factory<BookDetailViewModel> {
  private final Provider<SavedStateHandle> savedStateHandleProvider;

  private final Provider<GetBookByIsbnUseCase> getBookByIsbnUseCaseProvider;

  private final Provider<DeleteBookUseCase> deleteBookUseCaseProvider;

  private BookDetailViewModel_Factory(Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<GetBookByIsbnUseCase> getBookByIsbnUseCaseProvider,
      Provider<DeleteBookUseCase> deleteBookUseCaseProvider) {
    this.savedStateHandleProvider = savedStateHandleProvider;
    this.getBookByIsbnUseCaseProvider = getBookByIsbnUseCaseProvider;
    this.deleteBookUseCaseProvider = deleteBookUseCaseProvider;
  }

  @Override
  public BookDetailViewModel get() {
    return newInstance(savedStateHandleProvider.get(), getBookByIsbnUseCaseProvider.get(), deleteBookUseCaseProvider.get());
  }

  public static BookDetailViewModel_Factory create(
      Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<GetBookByIsbnUseCase> getBookByIsbnUseCaseProvider,
      Provider<DeleteBookUseCase> deleteBookUseCaseProvider) {
    return new BookDetailViewModel_Factory(savedStateHandleProvider, getBookByIsbnUseCaseProvider, deleteBookUseCaseProvider);
  }

  public static BookDetailViewModel newInstance(SavedStateHandle savedStateHandle,
      GetBookByIsbnUseCase getBookByIsbnUseCase, DeleteBookUseCase deleteBookUseCase) {
    return new BookDetailViewModel(savedStateHandle, getBookByIsbnUseCase, deleteBookUseCase);
  }
}
