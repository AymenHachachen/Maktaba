package com.ElOuedUniv.maktaba.domain.di;

import com.ElOuedUniv.maktaba.data.repository.CategoryRepository;
import com.ElOuedUniv.maktaba.domain.usecase.GetCategoriesUseCase;
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
public final class DomainModule_ProvideGetCategoriesUseCaseFactory implements Factory<GetCategoriesUseCase> {
  private final Provider<CategoryRepository> categoryRepositoryProvider;

  private DomainModule_ProvideGetCategoriesUseCaseFactory(
      Provider<CategoryRepository> categoryRepositoryProvider) {
    this.categoryRepositoryProvider = categoryRepositoryProvider;
  }

  @Override
  public GetCategoriesUseCase get() {
    return provideGetCategoriesUseCase(categoryRepositoryProvider.get());
  }

  public static DomainModule_ProvideGetCategoriesUseCaseFactory create(
      Provider<CategoryRepository> categoryRepositoryProvider) {
    return new DomainModule_ProvideGetCategoriesUseCaseFactory(categoryRepositoryProvider);
  }

  public static GetCategoriesUseCase provideGetCategoriesUseCase(
      CategoryRepository categoryRepository) {
    return Preconditions.checkNotNullFromProvides(DomainModule.INSTANCE.provideGetCategoriesUseCase(categoryRepository));
  }
}
