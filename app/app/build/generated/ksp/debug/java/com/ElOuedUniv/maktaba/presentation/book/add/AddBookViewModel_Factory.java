package com.ElOuedUniv.maktaba.presentation.book.add;

import com.ElOuedUniv.maktaba.domain.usecase.AddBookUseCase;
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
public final class AddBookViewModel_Factory implements Factory<AddBookViewModel> {
  private final Provider<AddBookUseCase> addBookUseCaseProvider;

  private AddBookViewModel_Factory(Provider<AddBookUseCase> addBookUseCaseProvider) {
    this.addBookUseCaseProvider = addBookUseCaseProvider;
  }

  @Override
  public AddBookViewModel get() {
    return newInstance(addBookUseCaseProvider.get());
  }

  public static AddBookViewModel_Factory create(Provider<AddBookUseCase> addBookUseCaseProvider) {
    return new AddBookViewModel_Factory(addBookUseCaseProvider);
  }

  public static AddBookViewModel newInstance(AddBookUseCase addBookUseCase) {
    return new AddBookViewModel(addBookUseCase);
  }
}
