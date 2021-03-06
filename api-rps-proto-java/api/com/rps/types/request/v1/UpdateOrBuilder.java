// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rps/types/request/v1/update.proto

package com.rps.types.request.v1;

public interface UpdateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rps.types.request.v1.Update)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of fields to update.
   * If empty all fields will be updated.
   * ID is Read-Only and cannot be updated.
   * Meta is managed by the server and will always be auto-updated.
   * </pre>
   *
   * <code>repeated string update_mask = 1 [json_name = "updateMask"];</code>
   * @return A list containing the updateMask.
   */
  java.util.List<java.lang.String>
      getUpdateMaskList();
  /**
   * <pre>
   * List of fields to update.
   * If empty all fields will be updated.
   * ID is Read-Only and cannot be updated.
   * Meta is managed by the server and will always be auto-updated.
   * </pre>
   *
   * <code>repeated string update_mask = 1 [json_name = "updateMask"];</code>
   * @return The count of updateMask.
   */
  int getUpdateMaskCount();
  /**
   * <pre>
   * List of fields to update.
   * If empty all fields will be updated.
   * ID is Read-Only and cannot be updated.
   * Meta is managed by the server and will always be auto-updated.
   * </pre>
   *
   * <code>repeated string update_mask = 1 [json_name = "updateMask"];</code>
   * @param index The index of the element to return.
   * @return The updateMask at the given index.
   */
  java.lang.String getUpdateMask(int index);
  /**
   * <pre>
   * List of fields to update.
   * If empty all fields will be updated.
   * ID is Read-Only and cannot be updated.
   * Meta is managed by the server and will always be auto-updated.
   * </pre>
   *
   * <code>repeated string update_mask = 1 [json_name = "updateMask"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the updateMask at the given index.
   */
  com.google.protobuf.ByteString
      getUpdateMaskBytes(int index);

  /**
   * <pre>
   * Dry run, validate the request but skip updating the resource.
   * Defaults to false
   * </pre>
   *
   * <code>bool validate_only = 2 [json_name = "validateOnly"];</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   * <pre>
   * Unique id for the server to track duplicate requests.
   * Required format is UUIDv4
   * </pre>
   *
   * <code>string request_id = 3 [json_name = "requestId", (.gogoproto.customname) = "RequestID"];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Unique id for the server to track duplicate requests.
   * Required format is UUIDv4
   * </pre>
   *
   * <code>string request_id = 3 [json_name = "requestId", (.gogoproto.customname) = "RequestID"];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * Do not return the updated resource in the RPC response.
   * Defaults to false
   * </pre>
   *
   * <code>bool skip_result = 4 [json_name = "skipResult"];</code>
   * @return The skipResult.
   */
  boolean getSkipResult();
}
