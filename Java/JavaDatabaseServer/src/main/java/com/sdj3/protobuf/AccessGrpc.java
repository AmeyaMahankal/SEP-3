package com.sdj3.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: dataAccess.proto")
public final class AccessGrpc {

  private AccessGrpc() {}

  public static final String SERVICE_NAME = "Access";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.UserCreate,
      com.sdj3.protobuf.DataAccess.UserCreateResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = com.sdj3.protobuf.DataAccess.UserCreate.class,
      responseType = com.sdj3.protobuf.DataAccess.UserCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.UserCreate,
      com.sdj3.protobuf.DataAccess.UserCreateResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.UserCreate, com.sdj3.protobuf.DataAccess.UserCreateResponse> getCreateUserMethod;
    if ((getCreateUserMethod = AccessGrpc.getCreateUserMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getCreateUserMethod = AccessGrpc.getCreateUserMethod) == null) {
          AccessGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.UserCreate, com.sdj3.protobuf.DataAccess.UserCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.UserCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.UserCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.UserGetUsername,
      com.sdj3.protobuf.DataAccess.User> getGetByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByUsername",
      requestType = com.sdj3.protobuf.DataAccess.UserGetUsername.class,
      responseType = com.sdj3.protobuf.DataAccess.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.UserGetUsername,
      com.sdj3.protobuf.DataAccess.User> getGetByUsernameMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.UserGetUsername, com.sdj3.protobuf.DataAccess.User> getGetByUsernameMethod;
    if ((getGetByUsernameMethod = AccessGrpc.getGetByUsernameMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetByUsernameMethod = AccessGrpc.getGetByUsernameMethod) == null) {
          AccessGrpc.getGetByUsernameMethod = getGetByUsernameMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.UserGetUsername, com.sdj3.protobuf.DataAccess.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.UserGetUsername.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.User.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetByUsername"))
              .build();
        }
      }
    }
    return getGetByUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.UserGetId,
      com.sdj3.protobuf.DataAccess.User> getGetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetById",
      requestType = com.sdj3.protobuf.DataAccess.UserGetId.class,
      responseType = com.sdj3.protobuf.DataAccess.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.UserGetId,
      com.sdj3.protobuf.DataAccess.User> getGetByIdMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.UserGetId, com.sdj3.protobuf.DataAccess.User> getGetByIdMethod;
    if ((getGetByIdMethod = AccessGrpc.getGetByIdMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetByIdMethod = AccessGrpc.getGetByIdMethod) == null) {
          AccessGrpc.getGetByIdMethod = getGetByIdMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.UserGetId, com.sdj3.protobuf.DataAccess.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.UserGetId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.User.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetById"))
              .build();
        }
      }
    }
    return getGetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.SearchUserParameters,
      com.sdj3.protobuf.DataAccess.listOfUsers> getGetUsersContainingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsersContaining",
      requestType = com.sdj3.protobuf.DataAccess.SearchUserParameters.class,
      responseType = com.sdj3.protobuf.DataAccess.listOfUsers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.SearchUserParameters,
      com.sdj3.protobuf.DataAccess.listOfUsers> getGetUsersContainingMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.SearchUserParameters, com.sdj3.protobuf.DataAccess.listOfUsers> getGetUsersContainingMethod;
    if ((getGetUsersContainingMethod = AccessGrpc.getGetUsersContainingMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetUsersContainingMethod = AccessGrpc.getGetUsersContainingMethod) == null) {
          AccessGrpc.getGetUsersContainingMethod = getGetUsersContainingMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.SearchUserParameters, com.sdj3.protobuf.DataAccess.listOfUsers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUsersContaining"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.SearchUserParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.listOfUsers.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetUsersContaining"))
              .build();
        }
      }
    }
    return getGetUsersContainingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessStub>() {
        @java.lang.Override
        public AccessStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessStub(channel, callOptions);
        }
      };
    return AccessStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessBlockingStub>() {
        @java.lang.Override
        public AccessBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessBlockingStub(channel, callOptions);
        }
      };
    return AccessBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessFutureStub>() {
        @java.lang.Override
        public AccessFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessFutureStub(channel, callOptions);
        }
      };
    return AccessFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AccessImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(com.sdj3.protobuf.DataAccess.UserCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.UserCreateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void getByUsername(com.sdj3.protobuf.DataAccess.UserGetUsername request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByUsernameMethod(), responseObserver);
    }

    /**
     */
    public void getById(com.sdj3.protobuf.DataAccess.UserGetId request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByIdMethod(), responseObserver);
    }

    /**
     */
    public void getUsersContaining(com.sdj3.protobuf.DataAccess.SearchUserParameters request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.listOfUsers> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUsersContainingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.UserCreate,
                com.sdj3.protobuf.DataAccess.UserCreateResponse>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getGetByUsernameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.UserGetUsername,
                com.sdj3.protobuf.DataAccess.User>(
                  this, METHODID_GET_BY_USERNAME)))
          .addMethod(
            getGetByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.UserGetId,
                com.sdj3.protobuf.DataAccess.User>(
                  this, METHODID_GET_BY_ID)))
          .addMethod(
            getGetUsersContainingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.SearchUserParameters,
                com.sdj3.protobuf.DataAccess.listOfUsers>(
                  this, METHODID_GET_USERS_CONTAINING)))
          .build();
    }
  }

  /**
   */
  public static final class AccessStub extends io.grpc.stub.AbstractAsyncStub<AccessStub> {
    private AccessStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessStub(channel, callOptions);
    }

    /**
     */
    public void createUser(com.sdj3.protobuf.DataAccess.UserCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.UserCreateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByUsername(com.sdj3.protobuf.DataAccess.UserGetUsername request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getById(com.sdj3.protobuf.DataAccess.UserGetId request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsersContaining(com.sdj3.protobuf.DataAccess.SearchUserParameters request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.listOfUsers> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUsersContainingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccessBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccessBlockingStub> {
    private AccessBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.UserCreateResponse createUser(com.sdj3.protobuf.DataAccess.UserCreate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.User getByUsername(com.sdj3.protobuf.DataAccess.UserGetUsername request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.User getById(com.sdj3.protobuf.DataAccess.UserGetId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.listOfUsers getUsersContaining(com.sdj3.protobuf.DataAccess.SearchUserParameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUsersContainingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccessFutureStub extends io.grpc.stub.AbstractFutureStub<AccessFutureStub> {
    private AccessFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.UserCreateResponse> createUser(
        com.sdj3.protobuf.DataAccess.UserCreate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.User> getByUsername(
        com.sdj3.protobuf.DataAccess.UserGetUsername request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByUsernameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.User> getById(
        com.sdj3.protobuf.DataAccess.UserGetId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.listOfUsers> getUsersContaining(
        com.sdj3.protobuf.DataAccess.SearchUserParameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUsersContainingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_GET_BY_USERNAME = 1;
  private static final int METHODID_GET_BY_ID = 2;
  private static final int METHODID_GET_USERS_CONTAINING = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccessImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccessImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.sdj3.protobuf.DataAccess.UserCreate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.UserCreateResponse>) responseObserver);
          break;
        case METHODID_GET_BY_USERNAME:
          serviceImpl.getByUsername((com.sdj3.protobuf.DataAccess.UserGetUsername) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.User>) responseObserver);
          break;
        case METHODID_GET_BY_ID:
          serviceImpl.getById((com.sdj3.protobuf.DataAccess.UserGetId) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.User>) responseObserver);
          break;
        case METHODID_GET_USERS_CONTAINING:
          serviceImpl.getUsersContaining((com.sdj3.protobuf.DataAccess.SearchUserParameters) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.listOfUsers>) responseObserver);
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

  private static abstract class AccessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sdj3.protobuf.DataAccess.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Access");
    }
  }

  private static final class AccessFileDescriptorSupplier
      extends AccessBaseDescriptorSupplier {
    AccessFileDescriptorSupplier() {}
  }

  private static final class AccessMethodDescriptorSupplier
      extends AccessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccessMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccessGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccessFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getGetByUsernameMethod())
              .addMethod(getGetByIdMethod())
              .addMethod(getGetUsersContainingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
