package com.ElOuedUniv.maktaba.presentation.category;

import com.ElOuedUniv.maktaba.domain.usecase.GetCategoriesUseCase;
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
public final class CategoryViewModel_Factory implements Factory<CategoryViewModel> {
  private final Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider;

  private CategoryViewModel_Factory(Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider) {
    this.getCategoriesUseCaseProvider = getCategoriesUseCaseProvider;
  }

  @Override
  public CategoryViewModel get() {
    return newInstance(getCategoriesUseCaseProvider.get());
  }

  public static CategoryViewModel_Factory create(
      Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider) {
    return new CategoryViewModel_Factory(getCategoriesUseCaseProvider);
  }

  public static CategoryViewModel newInstance(GetCategoriesUseCase getCategoriesUseCase) {
    return new CategoryViewModel(getCategoriesUseCase);
  }
}
