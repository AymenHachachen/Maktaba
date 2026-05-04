package com.ElOuedUniv.maktaba.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class BookRepositoryImpl_Factory implements Factory<BookRepositoryImpl> {
  @Override
  public BookRepositoryImpl get() {
    return newInstance();
  }

  public static BookRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static BookRepositoryImpl newInstance() {
    return new BookRepositoryImpl();
  }

  private static final class InstanceHolder {
    static final BookRepositoryImpl_Factory INSTANCE = new BookRepositoryImpl_Factory();
  }
}
