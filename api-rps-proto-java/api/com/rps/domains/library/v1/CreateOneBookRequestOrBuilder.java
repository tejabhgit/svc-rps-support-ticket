// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rps/domains/library/v1/book_api.proto

package com.rps.domains.library.v1;

public interface CreateOneBookRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rps.domains.library.v1.CreateOneBookRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.rps.types.request.v1.Create create_params = 1 [json_name = "createParams"];</code>
   * @return Whether the createParams field is set.
   */
  boolean hasCreateParams();
  /**
   * <code>.rps.types.request.v1.Create create_params = 1 [json_name = "createParams"];</code>
   * @return The createParams.
   */
  com.rps.types.request.v1.Create getCreateParams();
  /**
   * <code>.rps.types.request.v1.Create create_params = 1 [json_name = "createParams"];</code>
   */
  com.rps.types.request.v1.CreateOrBuilder getCreateParamsOrBuilder();

  /**
   * <code>.rps.domains.library.v1.Book new_book = 2 [json_name = "newBook"];</code>
   * @return Whether the newBook field is set.
   */
  boolean hasNewBook();
  /**
   * <code>.rps.domains.library.v1.Book new_book = 2 [json_name = "newBook"];</code>
   * @return The newBook.
   */
  com.rps.domains.library.v1.Book getNewBook();
  /**
   * <code>.rps.domains.library.v1.Book new_book = 2 [json_name = "newBook"];</code>
   */
  com.rps.domains.library.v1.BookOrBuilder getNewBookOrBuilder();
}
