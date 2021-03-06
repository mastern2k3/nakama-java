// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * List a channel's message history.
 * </pre>
 *
 * Protobuf type {@code nakama.api.ListChannelMessagesRequest}
 */
public  final class ListChannelMessagesRequest extends
    com.google.protobuf.GeneratedMessageLite<
        ListChannelMessagesRequest, ListChannelMessagesRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.ListChannelMessagesRequest)
    ListChannelMessagesRequestOrBuilder {
  private ListChannelMessagesRequest() {
    channelId_ = "";
    cursor_ = "";
  }
  public static final int CHANNEL_ID_FIELD_NUMBER = 1;
  private java.lang.String channelId_;
  /**
   * <pre>
   * The channel ID to list from.
   * </pre>
   *
   * <code>optional string channel_id = 1;</code>
   */
  public java.lang.String getChannelId() {
    return channelId_;
  }
  /**
   * <pre>
   * The channel ID to list from.
   * </pre>
   *
   * <code>optional string channel_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getChannelIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(channelId_);
  }
  /**
   * <pre>
   * The channel ID to list from.
   * </pre>
   *
   * <code>optional string channel_id = 1;</code>
   */
  private void setChannelId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    channelId_ = value;
  }
  /**
   * <pre>
   * The channel ID to list from.
   * </pre>
   *
   * <code>optional string channel_id = 1;</code>
   */
  private void clearChannelId() {
    
    channelId_ = getDefaultInstance().getChannelId();
  }
  /**
   * <pre>
   * The channel ID to list from.
   * </pre>
   *
   * <code>optional string channel_id = 1;</code>
   */
  private void setChannelIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    channelId_ = value.toStringUtf8();
  }

  public static final int LIMIT_FIELD_NUMBER = 2;
  private com.google.protobuf.Int32Value limit_;
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 2;</code>
   */
  public boolean hasLimit() {
    return limit_ != null;
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 2;</code>
   */
  public com.google.protobuf.Int32Value getLimit() {
    return limit_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : limit_;
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 2;</code>
   */
  private void setLimit(com.google.protobuf.Int32Value value) {
    if (value == null) {
      throw new NullPointerException();
    }
    limit_ = value;
    
    }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 2;</code>
   */
  private void setLimit(
      com.google.protobuf.Int32Value.Builder builderForValue) {
    limit_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 2;</code>
   */
  private void mergeLimit(com.google.protobuf.Int32Value value) {
    if (limit_ != null &&
        limit_ != com.google.protobuf.Int32Value.getDefaultInstance()) {
      limit_ =
        com.google.protobuf.Int32Value.newBuilder(limit_).mergeFrom(value).buildPartial();
    } else {
      limit_ = value;
    }
    
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 2;</code>
   */
  private void clearLimit() {  limit_ = null;
    
  }

  public static final int FORWARD_FIELD_NUMBER = 3;
  private com.google.protobuf.BoolValue forward_;
  /**
   * <pre>
   * True if listing should be older messages to newer, false if reverse.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue forward = 3;</code>
   */
  public boolean hasForward() {
    return forward_ != null;
  }
  /**
   * <pre>
   * True if listing should be older messages to newer, false if reverse.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue forward = 3;</code>
   */
  public com.google.protobuf.BoolValue getForward() {
    return forward_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : forward_;
  }
  /**
   * <pre>
   * True if listing should be older messages to newer, false if reverse.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue forward = 3;</code>
   */
  private void setForward(com.google.protobuf.BoolValue value) {
    if (value == null) {
      throw new NullPointerException();
    }
    forward_ = value;
    
    }
  /**
   * <pre>
   * True if listing should be older messages to newer, false if reverse.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue forward = 3;</code>
   */
  private void setForward(
      com.google.protobuf.BoolValue.Builder builderForValue) {
    forward_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * True if listing should be older messages to newer, false if reverse.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue forward = 3;</code>
   */
  private void mergeForward(com.google.protobuf.BoolValue value) {
    if (forward_ != null &&
        forward_ != com.google.protobuf.BoolValue.getDefaultInstance()) {
      forward_ =
        com.google.protobuf.BoolValue.newBuilder(forward_).mergeFrom(value).buildPartial();
    } else {
      forward_ = value;
    }
    
  }
  /**
   * <pre>
   * True if listing should be older messages to newer, false if reverse.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue forward = 3;</code>
   */
  private void clearForward() {  forward_ = null;
    
  }

  public static final int CURSOR_FIELD_NUMBER = 4;
  private java.lang.String cursor_;
  /**
   * <pre>
   * A pagination cursor, if any.
   * </pre>
   *
   * <code>optional string cursor = 4;</code>
   */
  public java.lang.String getCursor() {
    return cursor_;
  }
  /**
   * <pre>
   * A pagination cursor, if any.
   * </pre>
   *
   * <code>optional string cursor = 4;</code>
   */
  public com.google.protobuf.ByteString
      getCursorBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(cursor_);
  }
  /**
   * <pre>
   * A pagination cursor, if any.
   * </pre>
   *
   * <code>optional string cursor = 4;</code>
   */
  private void setCursor(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    cursor_ = value;
  }
  /**
   * <pre>
   * A pagination cursor, if any.
   * </pre>
   *
   * <code>optional string cursor = 4;</code>
   */
  private void clearCursor() {
    
    cursor_ = getDefaultInstance().getCursor();
  }
  /**
   * <pre>
   * A pagination cursor, if any.
   * </pre>
   *
   * <code>optional string cursor = 4;</code>
   */
  private void setCursorBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    cursor_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!channelId_.isEmpty()) {
      output.writeString(1, getChannelId());
    }
    if (limit_ != null) {
      output.writeMessage(2, getLimit());
    }
    if (forward_ != null) {
      output.writeMessage(3, getForward());
    }
    if (!cursor_.isEmpty()) {
      output.writeString(4, getCursor());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!channelId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getChannelId());
    }
    if (limit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLimit());
    }
    if (forward_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getForward());
    }
    if (!cursor_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(4, getCursor());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.ListChannelMessagesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.ListChannelMessagesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListChannelMessagesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.ListChannelMessagesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListChannelMessagesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ListChannelMessagesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListChannelMessagesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ListChannelMessagesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListChannelMessagesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ListChannelMessagesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.ListChannelMessagesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * List a channel's message history.
   * </pre>
   *
   * Protobuf type {@code nakama.api.ListChannelMessagesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.ListChannelMessagesRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.ListChannelMessagesRequest)
      com.heroiclabs.nakama.api.ListChannelMessagesRequestOrBuilder {
    // Construct using com.heroiclabs.nakama.api.ListChannelMessagesRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The channel ID to list from.
     * </pre>
     *
     * <code>optional string channel_id = 1;</code>
     */
    public java.lang.String getChannelId() {
      return instance.getChannelId();
    }
    /**
     * <pre>
     * The channel ID to list from.
     * </pre>
     *
     * <code>optional string channel_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getChannelIdBytes() {
      return instance.getChannelIdBytes();
    }
    /**
     * <pre>
     * The channel ID to list from.
     * </pre>
     *
     * <code>optional string channel_id = 1;</code>
     */
    public Builder setChannelId(
        java.lang.String value) {
      copyOnWrite();
      instance.setChannelId(value);
      return this;
    }
    /**
     * <pre>
     * The channel ID to list from.
     * </pre>
     *
     * <code>optional string channel_id = 1;</code>
     */
    public Builder clearChannelId() {
      copyOnWrite();
      instance.clearChannelId();
      return this;
    }
    /**
     * <pre>
     * The channel ID to list from.
     * </pre>
     *
     * <code>optional string channel_id = 1;</code>
     */
    public Builder setChannelIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setChannelIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 2;</code>
     */
    public boolean hasLimit() {
      return instance.hasLimit();
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 2;</code>
     */
    public com.google.protobuf.Int32Value getLimit() {
      return instance.getLimit();
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 2;</code>
     */
    public Builder setLimit(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.setLimit(value);
      return this;
      }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 2;</code>
     */
    public Builder setLimit(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      copyOnWrite();
      instance.setLimit(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 2;</code>
     */
    public Builder mergeLimit(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.mergeLimit(value);
      return this;
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 2;</code>
     */
    public Builder clearLimit() {  copyOnWrite();
      instance.clearLimit();
      return this;
    }

    /**
     * <pre>
     * True if listing should be older messages to newer, false if reverse.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue forward = 3;</code>
     */
    public boolean hasForward() {
      return instance.hasForward();
    }
    /**
     * <pre>
     * True if listing should be older messages to newer, false if reverse.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue forward = 3;</code>
     */
    public com.google.protobuf.BoolValue getForward() {
      return instance.getForward();
    }
    /**
     * <pre>
     * True if listing should be older messages to newer, false if reverse.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue forward = 3;</code>
     */
    public Builder setForward(com.google.protobuf.BoolValue value) {
      copyOnWrite();
      instance.setForward(value);
      return this;
      }
    /**
     * <pre>
     * True if listing should be older messages to newer, false if reverse.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue forward = 3;</code>
     */
    public Builder setForward(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      copyOnWrite();
      instance.setForward(builderForValue);
      return this;
    }
    /**
     * <pre>
     * True if listing should be older messages to newer, false if reverse.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue forward = 3;</code>
     */
    public Builder mergeForward(com.google.protobuf.BoolValue value) {
      copyOnWrite();
      instance.mergeForward(value);
      return this;
    }
    /**
     * <pre>
     * True if listing should be older messages to newer, false if reverse.
     * </pre>
     *
     * <code>optional .google.protobuf.BoolValue forward = 3;</code>
     */
    public Builder clearForward() {  copyOnWrite();
      instance.clearForward();
      return this;
    }

    /**
     * <pre>
     * A pagination cursor, if any.
     * </pre>
     *
     * <code>optional string cursor = 4;</code>
     */
    public java.lang.String getCursor() {
      return instance.getCursor();
    }
    /**
     * <pre>
     * A pagination cursor, if any.
     * </pre>
     *
     * <code>optional string cursor = 4;</code>
     */
    public com.google.protobuf.ByteString
        getCursorBytes() {
      return instance.getCursorBytes();
    }
    /**
     * <pre>
     * A pagination cursor, if any.
     * </pre>
     *
     * <code>optional string cursor = 4;</code>
     */
    public Builder setCursor(
        java.lang.String value) {
      copyOnWrite();
      instance.setCursor(value);
      return this;
    }
    /**
     * <pre>
     * A pagination cursor, if any.
     * </pre>
     *
     * <code>optional string cursor = 4;</code>
     */
    public Builder clearCursor() {
      copyOnWrite();
      instance.clearCursor();
      return this;
    }
    /**
     * <pre>
     * A pagination cursor, if any.
     * </pre>
     *
     * <code>optional string cursor = 4;</code>
     */
    public Builder setCursorBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCursorBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.ListChannelMessagesRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.ListChannelMessagesRequest();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.heroiclabs.nakama.api.ListChannelMessagesRequest other = (com.heroiclabs.nakama.api.ListChannelMessagesRequest) arg1;
        channelId_ = visitor.visitString(!channelId_.isEmpty(), channelId_,
            !other.channelId_.isEmpty(), other.channelId_);
        limit_ = visitor.visitMessage(limit_, other.limit_);
        forward_ = visitor.visitMessage(forward_, other.forward_);
        cursor_ = visitor.visitString(!cursor_.isEmpty(), cursor_,
            !other.cursor_.isEmpty(), other.cursor_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readStringRequireUtf8();

                channelId_ = s;
                break;
              }
              case 18: {
                com.google.protobuf.Int32Value.Builder subBuilder = null;
                if (limit_ != null) {
                  subBuilder = limit_.toBuilder();
                }
                limit_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(limit_);
                  limit_ = subBuilder.buildPartial();
                }

                break;
              }
              case 26: {
                com.google.protobuf.BoolValue.Builder subBuilder = null;
                if (forward_ != null) {
                  subBuilder = forward_.toBuilder();
                }
                forward_ = input.readMessage(com.google.protobuf.BoolValue.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(forward_);
                  forward_ = subBuilder.buildPartial();
                }

                break;
              }
              case 34: {
                String s = input.readStringRequireUtf8();

                cursor_ = s;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.ListChannelMessagesRequest.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:nakama.api.ListChannelMessagesRequest)
  private static final com.heroiclabs.nakama.api.ListChannelMessagesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ListChannelMessagesRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.ListChannelMessagesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListChannelMessagesRequest> PARSER;

  public static com.google.protobuf.Parser<ListChannelMessagesRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

