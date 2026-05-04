package com.ElOuedUniv.maktaba.data.repository;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.github.jan.supabase.SupabaseClient;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class SupabaseBookRepositoryImpl_Factory implements Factory<SupabaseBookRepositoryImpl> {
  private final Provider<SupabaseClient> supabaseClientProvider;

  private final Provider<Context> contextProvider;

  private SupabaseBookRepositoryImpl_Factory(Provider<SupabaseClient> supabaseClientProvider,
      Provider<Context> contextProvider) {
    this.supabaseClientProvider = supabaseClientProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public SupabaseBookRepositoryImpl get() {
    return newInstance(supabaseClientProvider.get(), contextProvider.get());
  }

  public static SupabaseBookRepositoryImpl_Factory create(
      Provider<SupabaseClient> supabaseClientProvider, Provider<Context> contextProvider) {
    return new SupabaseBookRepositoryImpl_Factory(supabaseClientProvider, contextProvider);
  }

  public static SupabaseBookRepositoryImpl newInstance(SupabaseClient supabaseClient,
      Context context) {
    return new SupabaseBookRepositoryImpl(supabaseClient, context);
  }
}
