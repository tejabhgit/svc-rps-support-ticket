// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rps/domains/library/v1/book_api.proto

package com.rps.domains.library.v1;

public interface DeleteOneBookByIDRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rps.domains.library.v1.DeleteOneBookByIDRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.rps.types.request.v1.Delete delete_params = 1 [json_name = "deleteParams"];</code>
   * @return Whether the deleteParams field is set.
   */
  boolean hasDeleteParams();
  /**
   * <code>.rps.types.request.v1.Delete delete_params = 1 [json_name = "deleteParams"];</code>
   * @return The deleteParams.
   */
  com.rps.types.request.v1.Delete getDeleteParams();
  /**
   * <code>.rps.types.request.v1.Delete delete_params = 1 [json_name = "deleteParams"];</code>
   */
  com.rps.types.request.v1.DeleteOrBuilder getDeleteParamsOrBuilder();
}