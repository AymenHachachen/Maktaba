package com.ElOuedUniv.maktaba.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.github.jan.supabase.SupabaseClient;
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
public final class SupabaseCategoryRepositoryImpl_Factory implements Factory<SupabaseCategoryRepositoryImpl> {
  private final Provider<SupabaseClient> supabaseClientProvider;

  private SupabaseCategoryRepositoryImpl_Factory(Provider<SupabaseClient> supabaseClientProvider) {
    this.supabaseClientProvider = supabaseClientProvider;
  }

  @Override
  public SupabaseCategoryRepositoryImpl get() {
    return newInstance(supabaseClientProvider.get());
  }

  public static SupabaseCategoryRepositoryImpl_Factory create(
      Provider<SupabaseClient> supabaseClientProvider) {
    return new SupabaseCategoryRepositoryImpl_Factory(supabaseClientProvider);
  }

  public static SupabaseCategoryRepositoryImpl newInstance(SupabaseClient supabaseClient) {
    return new SupabaseCategoryRepositoryImpl(supabaseClient);
  }
}
