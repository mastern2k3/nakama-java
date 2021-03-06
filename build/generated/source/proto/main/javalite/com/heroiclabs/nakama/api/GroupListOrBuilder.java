// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

public interface GroupListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.GroupList)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * One or more groups.
   * </pre>
   *
   * <code>repeated .nakama.api.Group groups = 1;</code>
   */
  java.util.List<com.heroiclabs.nakama.api.Group> 
      getGroupsList();
  /**
   * <pre>
   * One or more groups.
   * </pre>
   *
   * <code>repeated .nakama.api.Group groups = 1;</code>
   */
  com.heroiclabs.nakama.api.Group getGroups(int index);
  /**
   * <pre>
   * One or more groups.
   * </pre>
   *
   * <code>repeated .nakama.api.Group groups = 1;</code>
   */
  int getGroupsCount();

  /**
   * <pre>
   * A cursor used to get the next page.
   * </pre>
   *
   * <code>optional string cursor = 2;</code>
   */
  java.lang.String getCursor();
  /**
   * <pre>
   * A cursor used to get the next page.
   * </pre>
   *
   * <code>optional string cursor = 2;</code>
   */
  com.google.protobuf.ByteString
      getCursorBytes();
}
