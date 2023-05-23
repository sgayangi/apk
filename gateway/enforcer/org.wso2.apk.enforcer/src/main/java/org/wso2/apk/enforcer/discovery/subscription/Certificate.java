// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/subscription/jwtIssuer.proto

package org.wso2.apk.enforcer.discovery.subscription;

/**
 * Protobuf type {@code wso2.discovery.subscription.Certificate}
 */
public final class Certificate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wso2.discovery.subscription.Certificate)
    CertificateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Certificate.newBuilder() to construct.
  private Certificate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Certificate() {
    certificate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Certificate();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Certificate(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            certificate_ = s;
            break;
          }
          case 18: {
            org.wso2.apk.enforcer.discovery.subscription.JWKS.Builder subBuilder = null;
            if (jwks_ != null) {
              subBuilder = jwks_.toBuilder();
            }
            jwks_ = input.readMessage(org.wso2.apk.enforcer.discovery.subscription.JWKS.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(jwks_);
              jwks_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.wso2.apk.enforcer.discovery.subscription.JWTIssuerProto.internal_static_wso2_discovery_subscription_Certificate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.wso2.apk.enforcer.discovery.subscription.JWTIssuerProto.internal_static_wso2_discovery_subscription_Certificate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.wso2.apk.enforcer.discovery.subscription.Certificate.class, org.wso2.apk.enforcer.discovery.subscription.Certificate.Builder.class);
  }

  public static final int CERTIFICATE_FIELD_NUMBER = 1;
  private volatile java.lang.Object certificate_;
  /**
   * <code>string certificate = 1;</code>
   * @return The certificate.
   */
  @java.lang.Override
  public java.lang.String getCertificate() {
    java.lang.Object ref = certificate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      certificate_ = s;
      return s;
    }
  }
  /**
   * <code>string certificate = 1;</code>
   * @return The bytes for certificate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCertificateBytes() {
    java.lang.Object ref = certificate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      certificate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JWKS_FIELD_NUMBER = 2;
  private org.wso2.apk.enforcer.discovery.subscription.JWKS jwks_;
  /**
   * <code>.wso2.discovery.subscription.JWKS jwks = 2;</code>
   * @return Whether the jwks field is set.
   */
  @java.lang.Override
  public boolean hasJwks() {
    return jwks_ != null;
  }
  /**
   * <code>.wso2.discovery.subscription.JWKS jwks = 2;</code>
   * @return The jwks.
   */
  @java.lang.Override
  public org.wso2.apk.enforcer.discovery.subscription.JWKS getJwks() {
    return jwks_ == null ? org.wso2.apk.enforcer.discovery.subscription.JWKS.getDefaultInstance() : jwks_;
  }
  /**
   * <code>.wso2.discovery.subscription.JWKS jwks = 2;</code>
   */
  @java.lang.Override
  public org.wso2.apk.enforcer.discovery.subscription.JWKSOrBuilder getJwksOrBuilder() {
    return getJwks();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getCertificateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, certificate_);
    }
    if (jwks_ != null) {
      output.writeMessage(2, getJwks());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCertificateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, certificate_);
    }
    if (jwks_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getJwks());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.wso2.apk.enforcer.discovery.subscription.Certificate)) {
      return super.equals(obj);
    }
    org.wso2.apk.enforcer.discovery.subscription.Certificate other = (org.wso2.apk.enforcer.discovery.subscription.Certificate) obj;

    if (!getCertificate()
        .equals(other.getCertificate())) return false;
    if (hasJwks() != other.hasJwks()) return false;
    if (hasJwks()) {
      if (!getJwks()
          .equals(other.getJwks())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CERTIFICATE_FIELD_NUMBER;
    hash = (53 * hash) + getCertificate().hashCode();
    if (hasJwks()) {
      hash = (37 * hash) + JWKS_FIELD_NUMBER;
      hash = (53 * hash) + getJwks().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.wso2.apk.enforcer.discovery.subscription.Certificate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.apk.enforcer.discovery.subscription.Certificate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.subscription.Certificate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.apk.enforcer.discovery.subscription.Certificate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.subscription.Certificate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.apk.enforcer.discovery.subscription.Certificate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.subscription.Certificate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wso2.apk.enforcer.discovery.subscription.Certificate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.subscription.Certificate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.wso2.apk.enforcer.discovery.subscription.Certificate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.subscription.Certificate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wso2.apk.enforcer.discovery.subscription.Certificate parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.wso2.apk.enforcer.discovery.subscription.Certificate prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code wso2.discovery.subscription.Certificate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wso2.discovery.subscription.Certificate)
      org.wso2.apk.enforcer.discovery.subscription.CertificateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.wso2.apk.enforcer.discovery.subscription.JWTIssuerProto.internal_static_wso2_discovery_subscription_Certificate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.wso2.apk.enforcer.discovery.subscription.JWTIssuerProto.internal_static_wso2_discovery_subscription_Certificate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.wso2.apk.enforcer.discovery.subscription.Certificate.class, org.wso2.apk.enforcer.discovery.subscription.Certificate.Builder.class);
    }

    // Construct using org.wso2.apk.enforcer.discovery.subscription.Certificate.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      certificate_ = "";

      if (jwksBuilder_ == null) {
        jwks_ = null;
      } else {
        jwks_ = null;
        jwksBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.wso2.apk.enforcer.discovery.subscription.JWTIssuerProto.internal_static_wso2_discovery_subscription_Certificate_descriptor;
    }

    @java.lang.Override
    public org.wso2.apk.enforcer.discovery.subscription.Certificate getDefaultInstanceForType() {
      return org.wso2.apk.enforcer.discovery.subscription.Certificate.getDefaultInstance();
    }

    @java.lang.Override
    public org.wso2.apk.enforcer.discovery.subscription.Certificate build() {
      org.wso2.apk.enforcer.discovery.subscription.Certificate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.wso2.apk.enforcer.discovery.subscription.Certificate buildPartial() {
      org.wso2.apk.enforcer.discovery.subscription.Certificate result = new org.wso2.apk.enforcer.discovery.subscription.Certificate(this);
      result.certificate_ = certificate_;
      if (jwksBuilder_ == null) {
        result.jwks_ = jwks_;
      } else {
        result.jwks_ = jwksBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.wso2.apk.enforcer.discovery.subscription.Certificate) {
        return mergeFrom((org.wso2.apk.enforcer.discovery.subscription.Certificate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.wso2.apk.enforcer.discovery.subscription.Certificate other) {
      if (other == org.wso2.apk.enforcer.discovery.subscription.Certificate.getDefaultInstance()) return this;
      if (!other.getCertificate().isEmpty()) {
        certificate_ = other.certificate_;
        onChanged();
      }
      if (other.hasJwks()) {
        mergeJwks(other.getJwks());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.wso2.apk.enforcer.discovery.subscription.Certificate parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.wso2.apk.enforcer.discovery.subscription.Certificate) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object certificate_ = "";
    /**
     * <code>string certificate = 1;</code>
     * @return The certificate.
     */
    public java.lang.String getCertificate() {
      java.lang.Object ref = certificate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        certificate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string certificate = 1;</code>
     * @return The bytes for certificate.
     */
    public com.google.protobuf.ByteString
        getCertificateBytes() {
      java.lang.Object ref = certificate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        certificate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string certificate = 1;</code>
     * @param value The certificate to set.
     * @return This builder for chaining.
     */
    public Builder setCertificate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      certificate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string certificate = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCertificate() {
      
      certificate_ = getDefaultInstance().getCertificate();
      onChanged();
      return this;
    }
    /**
     * <code>string certificate = 1;</code>
     * @param value The bytes for certificate to set.
     * @return This builder for chaining.
     */
    public Builder setCertificateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      certificate_ = value;
      onChanged();
      return this;
    }

    private org.wso2.apk.enforcer.discovery.subscription.JWKS jwks_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.wso2.apk.enforcer.discovery.subscription.JWKS, org.wso2.apk.enforcer.discovery.subscription.JWKS.Builder, org.wso2.apk.enforcer.discovery.subscription.JWKSOrBuilder> jwksBuilder_;
    /**
     * <code>.wso2.discovery.subscription.JWKS jwks = 2;</code>
     * @return Whether the jwks field is set.
     */
    public boolean hasJwks() {
      return jwksBuilder_ != null || jwks_ != null;
    }
    /**
     * <code>.wso2.discovery.subscription.JWKS jwks = 2;</code>
     * @return The jwks.
     */
    public org.wso2.apk.enforcer.discovery.subscription.JWKS getJwks() {
      if (jwksBuilder_ == null) {
        return jwks_ == null ? org.wso2.apk.enforcer.discovery.subscription.JWKS.getDefaultInstance() : jwks_;
      } else {
        return jwksBuilder_.getMessage();
      }
    }
    /**
     * <code>.wso2.discovery.subscription.JWKS jwks = 2;</code>
     */
    public Builder setJwks(org.wso2.apk.enforcer.discovery.subscription.JWKS value) {
      if (jwksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        jwks_ = value;
        onChanged();
      } else {
        jwksBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.wso2.discovery.subscription.JWKS jwks = 2;</code>
     */
    public Builder setJwks(
        org.wso2.apk.enforcer.discovery.subscription.JWKS.Builder builderForValue) {
      if (jwksBuilder_ == null) {
        jwks_ = builderForValue.build();
        onChanged();
      } else {
        jwksBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.wso2.discovery.subscription.JWKS jwks = 2;</code>
     */
    public Builder mergeJwks(org.wso2.apk.enforcer.discovery.subscription.JWKS value) {
      if (jwksBuilder_ == null) {
        if (jwks_ != null) {
          jwks_ =
            org.wso2.apk.enforcer.discovery.subscription.JWKS.newBuilder(jwks_).mergeFrom(value).buildPartial();
        } else {
          jwks_ = value;
        }
        onChanged();
      } else {
        jwksBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.wso2.discovery.subscription.JWKS jwks = 2;</code>
     */
    public Builder clearJwks() {
      if (jwksBuilder_ == null) {
        jwks_ = null;
        onChanged();
      } else {
        jwks_ = null;
        jwksBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.wso2.discovery.subscription.JWKS jwks = 2;</code>
     */
    public org.wso2.apk.enforcer.discovery.subscription.JWKS.Builder getJwksBuilder() {
      
      onChanged();
      return getJwksFieldBuilder().getBuilder();
    }
    /**
     * <code>.wso2.discovery.subscription.JWKS jwks = 2;</code>
     */
    public org.wso2.apk.enforcer.discovery.subscription.JWKSOrBuilder getJwksOrBuilder() {
      if (jwksBuilder_ != null) {
        return jwksBuilder_.getMessageOrBuilder();
      } else {
        return jwks_ == null ?
            org.wso2.apk.enforcer.discovery.subscription.JWKS.getDefaultInstance() : jwks_;
      }
    }
    /**
     * <code>.wso2.discovery.subscription.JWKS jwks = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.wso2.apk.enforcer.discovery.subscription.JWKS, org.wso2.apk.enforcer.discovery.subscription.JWKS.Builder, org.wso2.apk.enforcer.discovery.subscription.JWKSOrBuilder> 
        getJwksFieldBuilder() {
      if (jwksBuilder_ == null) {
        jwksBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.wso2.apk.enforcer.discovery.subscription.JWKS, org.wso2.apk.enforcer.discovery.subscription.JWKS.Builder, org.wso2.apk.enforcer.discovery.subscription.JWKSOrBuilder>(
                getJwks(),
                getParentForChildren(),
                isClean());
        jwks_ = null;
      }
      return jwksBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:wso2.discovery.subscription.Certificate)
  }

  // @@protoc_insertion_point(class_scope:wso2.discovery.subscription.Certificate)
  private static final org.wso2.apk.enforcer.discovery.subscription.Certificate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.wso2.apk.enforcer.discovery.subscription.Certificate();
  }

  public static org.wso2.apk.enforcer.discovery.subscription.Certificate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Certificate>
      PARSER = new com.google.protobuf.AbstractParser<Certificate>() {
    @java.lang.Override
    public Certificate parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Certificate(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Certificate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Certificate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.wso2.apk.enforcer.discovery.subscription.Certificate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
