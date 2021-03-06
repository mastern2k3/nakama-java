// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

public interface AccountGameCenterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.AccountGameCenter)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Player ID (generated by GameCenter).
   * </pre>
   *
   * <code>optional string player_id = 1;</code>
   */
  java.lang.String getPlayerId();
  /**
   * <pre>
   * Player ID (generated by GameCenter).
   * </pre>
   *
   * <code>optional string player_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getPlayerIdBytes();

  /**
   * <pre>
   * Bundle ID (generated by GameCenter).
   * </pre>
   *
   * <code>optional string bundle_id = 2;</code>
   */
  java.lang.String getBundleId();
  /**
   * <pre>
   * Bundle ID (generated by GameCenter).
   * </pre>
   *
   * <code>optional string bundle_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getBundleIdBytes();

  /**
   * <pre>
   * Time since UNIX epoch when the signature was created.
   * </pre>
   *
   * <code>optional int64 timestamp_seconds = 3;</code>
   */
  long getTimestampSeconds();

  /**
   * <pre>
   * A random "NSString" used to compute the hash and keep it randomized.
   * </pre>
   *
   * <code>optional string salt = 4;</code>
   */
  java.lang.String getSalt();
  /**
   * <pre>
   * A random "NSString" used to compute the hash and keep it randomized.
   * </pre>
   *
   * <code>optional string salt = 4;</code>
   */
  com.google.protobuf.ByteString
      getSaltBytes();

  /**
   * <pre>
   * The verification signature data generated.
   * </pre>
   *
   * <code>optional string signature = 5;</code>
   */
  java.lang.String getSignature();
  /**
   * <pre>
   * The verification signature data generated.
   * </pre>
   *
   * <code>optional string signature = 5;</code>
   */
  com.google.protobuf.ByteString
      getSignatureBytes();

  /**
   * <pre>
   * The URL for the public encryption key.
   * </pre>
   *
   * <code>optional string public_key_url = 6;</code>
   */
  java.lang.String getPublicKeyUrl();
  /**
   * <pre>
   * The URL for the public encryption key.
   * </pre>
   *
   * <code>optional string public_key_url = 6;</code>
   */
  com.google.protobuf.ByteString
      getPublicKeyUrlBytes();
}
