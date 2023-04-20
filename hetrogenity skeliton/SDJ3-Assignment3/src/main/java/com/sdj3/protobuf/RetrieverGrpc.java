package com.sdj3.protobuf;

import java.sql.SQLException;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: retriever.proto")
public final class RetrieverGrpc {

  private RetrieverGrpc() {}

  public static final String SERVICE_NAME = "Retriever";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.RetrieverOuterClass.TextInput,
      com.sdj3.protobuf.RetrieverOuterClass.TextOutput> getRegistrationNumbersRetrieverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegistrationNumbersRetriever",
      requestType = com.sdj3.protobuf.RetrieverOuterClass.TextInput.class,
      responseType = com.sdj3.protobuf.RetrieverOuterClass.TextOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.RetrieverOuterClass.TextInput,
      com.sdj3.protobuf.RetrieverOuterClass.TextOutput> getRegistrationNumbersRetrieverMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.RetrieverOuterClass.TextInput, com.sdj3.protobuf.RetrieverOuterClass.TextOutput> getRegistrationNumbersRetrieverMethod;
    if ((getRegistrationNumbersRetrieverMethod = RetrieverGrpc.getRegistrationNumbersRetrieverMethod) == null) {
      synchronized (RetrieverGrpc.class) {
        if ((getRegistrationNumbersRetrieverMethod = RetrieverGrpc.getRegistrationNumbersRetrieverMethod) == null) {
          RetrieverGrpc.getRegistrationNumbersRetrieverMethod = getRegistrationNumbersRetrieverMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.RetrieverOuterClass.TextInput, com.sdj3.protobuf.RetrieverOuterClass.TextOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegistrationNumbersRetriever"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.RetrieverOuterClass.TextInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.RetrieverOuterClass.TextOutput.getDefaultInstance()))
              .setSchemaDescriptor(new RetrieverMethodDescriptorSupplier("RegistrationNumbersRetriever"))
              .build();
        }
      }
    }
    return getRegistrationNumbersRetrieverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.RetrieverOuterClass.TextInput,
      com.sdj3.protobuf.RetrieverOuterClass.TextOutput> getProductsRetrieverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProductsRetriever",
      requestType = com.sdj3.protobuf.RetrieverOuterClass.TextInput.class,
      responseType = com.sdj3.protobuf.RetrieverOuterClass.TextOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.RetrieverOuterClass.TextInput,
      com.sdj3.protobuf.RetrieverOuterClass.TextOutput> getProductsRetrieverMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.RetrieverOuterClass.TextInput, com.sdj3.protobuf.RetrieverOuterClass.TextOutput> getProductsRetrieverMethod;
    if ((getProductsRetrieverMethod = RetrieverGrpc.getProductsRetrieverMethod) == null) {
      synchronized (RetrieverGrpc.class) {
        if ((getProductsRetrieverMethod = RetrieverGrpc.getProductsRetrieverMethod) == null) {
          RetrieverGrpc.getProductsRetrieverMethod = getProductsRetrieverMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.RetrieverOuterClass.TextInput, com.sdj3.protobuf.RetrieverOuterClass.TextOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProductsRetriever"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.RetrieverOuterClass.TextInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.RetrieverOuterClass.TextOutput.getDefaultInstance()))
              .setSchemaDescriptor(new RetrieverMethodDescriptorSupplier("ProductsRetriever"))
              .build();
        }
      }
    }
    return getProductsRetrieverMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RetrieverStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RetrieverStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RetrieverStub>() {
        @java.lang.Override
        public RetrieverStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RetrieverStub(channel, callOptions);
        }
      };
    return RetrieverStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RetrieverBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RetrieverBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RetrieverBlockingStub>() {
        @java.lang.Override
        public RetrieverBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RetrieverBlockingStub(channel, callOptions);
        }
      };
    return RetrieverBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RetrieverFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RetrieverFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RetrieverFutureStub>() {
        @java.lang.Override
        public RetrieverFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RetrieverFutureStub(channel, callOptions);
        }
      };
    return RetrieverFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RetrieverImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *gets all reg# involved in a product
     * </pre>
     */
    public void registrationNumbersRetriever(com.sdj3.protobuf.RetrieverOuterClass.TextInput request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.RetrieverOuterClass.TextOutput> responseObserver) throws SQLException {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegistrationNumbersRetrieverMethod(), responseObserver);
    }

    /**
     * <pre>
     * gets all products a reg# is involved in
     * </pre>
     */
    public void productsRetriever(com.sdj3.protobuf.RetrieverOuterClass.TextInput request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.RetrieverOuterClass.TextOutput> responseObserver) throws SQLException {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProductsRetrieverMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegistrationNumbersRetrieverMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.RetrieverOuterClass.TextInput,
                com.sdj3.protobuf.RetrieverOuterClass.TextOutput>(
                  this, METHODID_REGISTRATION_NUMBERS_RETRIEVER)))
          .addMethod(
            getProductsRetrieverMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.RetrieverOuterClass.TextInput,
                com.sdj3.protobuf.RetrieverOuterClass.TextOutput>(
                  this, METHODID_PRODUCTS_RETRIEVER)))
          .build();
    }
  }

  /**
   */
  public static final class RetrieverStub extends io.grpc.stub.AbstractAsyncStub<RetrieverStub> {
    private RetrieverStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RetrieverStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RetrieverStub(channel, callOptions);
    }

    /**
     * <pre>
     *gets all reg# involved in a product
     * </pre>
     */
    public void registrationNumbersRetriever(com.sdj3.protobuf.RetrieverOuterClass.TextInput request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.RetrieverOuterClass.TextOutput> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegistrationNumbersRetrieverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * gets all products a reg# is involved in
     * </pre>
     */
    public void productsRetriever(com.sdj3.protobuf.RetrieverOuterClass.TextInput request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.RetrieverOuterClass.TextOutput> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProductsRetrieverMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RetrieverBlockingStub extends io.grpc.stub.AbstractBlockingStub<RetrieverBlockingStub> {
    private RetrieverBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RetrieverBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RetrieverBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *gets all reg# involved in a product
     * </pre>
     */
    public com.sdj3.protobuf.RetrieverOuterClass.TextOutput registrationNumbersRetriever(com.sdj3.protobuf.RetrieverOuterClass.TextInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegistrationNumbersRetrieverMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * gets all products a reg# is involved in
     * </pre>
     */
    public com.sdj3.protobuf.RetrieverOuterClass.TextOutput productsRetriever(com.sdj3.protobuf.RetrieverOuterClass.TextInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProductsRetrieverMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RetrieverFutureStub extends io.grpc.stub.AbstractFutureStub<RetrieverFutureStub> {
    private RetrieverFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RetrieverFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RetrieverFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *gets all reg# involved in a product
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.RetrieverOuterClass.TextOutput> registrationNumbersRetriever(
        com.sdj3.protobuf.RetrieverOuterClass.TextInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegistrationNumbersRetrieverMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * gets all products a reg# is involved in
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.RetrieverOuterClass.TextOutput> productsRetriever(
        com.sdj3.protobuf.RetrieverOuterClass.TextInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProductsRetrieverMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTRATION_NUMBERS_RETRIEVER = 0;
  private static final int METHODID_PRODUCTS_RETRIEVER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RetrieverImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RetrieverImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTRATION_NUMBERS_RETRIEVER:
          try {
            serviceImpl.registrationNumbersRetriever((RetrieverOuterClass.TextInput) request,
                (io.grpc.stub.StreamObserver<RetrieverOuterClass.TextOutput>) responseObserver);
          } catch (SQLException e) {
            throw new RuntimeException(e);
          }
          break;
        case METHODID_PRODUCTS_RETRIEVER:
          try {
            serviceImpl.productsRetriever((RetrieverOuterClass.TextInput) request,
                (io.grpc.stub.StreamObserver<RetrieverOuterClass.TextOutput>) responseObserver);
          } catch (SQLException e) {
            throw new RuntimeException(e);
          }
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RetrieverBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RetrieverBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sdj3.protobuf.RetrieverOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Retriever");
    }
  }

  private static final class RetrieverFileDescriptorSupplier
      extends RetrieverBaseDescriptorSupplier {
    RetrieverFileDescriptorSupplier() {}
  }

  private static final class RetrieverMethodDescriptorSupplier
      extends RetrieverBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RetrieverMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RetrieverGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RetrieverFileDescriptorSupplier())
              .addMethod(getRegistrationNumbersRetrieverMethod())
              .addMethod(getProductsRetrieverMethod())
              .build();
        }
      }
    }
    return result;
  }
}
