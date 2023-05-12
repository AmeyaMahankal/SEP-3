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

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CityToCreate,
      com.sdj3.protobuf.DataAccess.CityCreated> getCreateCityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCity",
      requestType = com.sdj3.protobuf.DataAccess.CityToCreate.class,
      responseType = com.sdj3.protobuf.DataAccess.CityCreated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CityToCreate,
      com.sdj3.protobuf.DataAccess.CityCreated> getCreateCityMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CityToCreate, com.sdj3.protobuf.DataAccess.CityCreated> getCreateCityMethod;
    if ((getCreateCityMethod = AccessGrpc.getCreateCityMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getCreateCityMethod = AccessGrpc.getCreateCityMethod) == null) {
          AccessGrpc.getCreateCityMethod = getCreateCityMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CityToCreate, com.sdj3.protobuf.DataAccess.CityCreated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CityToCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CityCreated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("CreateCity"))
              .build();
        }
      }
    }
    return getCreateCityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CityByName,
      com.sdj3.protobuf.DataAccess.City> getGetCitByynameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCitByyname",
      requestType = com.sdj3.protobuf.DataAccess.CityByName.class,
      responseType = com.sdj3.protobuf.DataAccess.City.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CityByName,
      com.sdj3.protobuf.DataAccess.City> getGetCitByynameMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CityByName, com.sdj3.protobuf.DataAccess.City> getGetCitByynameMethod;
    if ((getGetCitByynameMethod = AccessGrpc.getGetCitByynameMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetCitByynameMethod = AccessGrpc.getGetCitByynameMethod) == null) {
          AccessGrpc.getGetCitByynameMethod = getGetCitByynameMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CityByName, com.sdj3.protobuf.DataAccess.City>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCitByyname"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CityByName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.City.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetCitByyname"))
              .build();
        }
      }
    }
    return getGetCitByynameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CityById,
      com.sdj3.protobuf.DataAccess.City> getGetCityByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCityById",
      requestType = com.sdj3.protobuf.DataAccess.CityById.class,
      responseType = com.sdj3.protobuf.DataAccess.City.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CityById,
      com.sdj3.protobuf.DataAccess.City> getGetCityByIdMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CityById, com.sdj3.protobuf.DataAccess.City> getGetCityByIdMethod;
    if ((getGetCityByIdMethod = AccessGrpc.getGetCityByIdMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetCityByIdMethod = AccessGrpc.getGetCityByIdMethod) == null) {
          AccessGrpc.getGetCityByIdMethod = getGetCityByIdMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CityById, com.sdj3.protobuf.DataAccess.City>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCityById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CityById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.City.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetCityById"))
              .build();
        }
      }
    }
    return getGetCityByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.HotelToCreate,
      com.sdj3.protobuf.DataAccess.HotelCreated> getCreateHotelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateHotel",
      requestType = com.sdj3.protobuf.DataAccess.HotelToCreate.class,
      responseType = com.sdj3.protobuf.DataAccess.HotelCreated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.HotelToCreate,
      com.sdj3.protobuf.DataAccess.HotelCreated> getCreateHotelMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.HotelToCreate, com.sdj3.protobuf.DataAccess.HotelCreated> getCreateHotelMethod;
    if ((getCreateHotelMethod = AccessGrpc.getCreateHotelMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getCreateHotelMethod = AccessGrpc.getCreateHotelMethod) == null) {
          AccessGrpc.getCreateHotelMethod = getCreateHotelMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.HotelToCreate, com.sdj3.protobuf.DataAccess.HotelCreated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateHotel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.HotelToCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.HotelCreated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("CreateHotel"))
              .build();
        }
      }
    }
    return getCreateHotelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.HotelByName,
      com.sdj3.protobuf.DataAccess.Hotel> getGetHotelByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHotelByName",
      requestType = com.sdj3.protobuf.DataAccess.HotelByName.class,
      responseType = com.sdj3.protobuf.DataAccess.Hotel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.HotelByName,
      com.sdj3.protobuf.DataAccess.Hotel> getGetHotelByNameMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.HotelByName, com.sdj3.protobuf.DataAccess.Hotel> getGetHotelByNameMethod;
    if ((getGetHotelByNameMethod = AccessGrpc.getGetHotelByNameMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetHotelByNameMethod = AccessGrpc.getGetHotelByNameMethod) == null) {
          AccessGrpc.getGetHotelByNameMethod = getGetHotelByNameMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.HotelByName, com.sdj3.protobuf.DataAccess.Hotel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHotelByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.HotelByName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Hotel.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetHotelByName"))
              .build();
        }
      }
    }
    return getGetHotelByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.HotelById,
      com.sdj3.protobuf.DataAccess.Hotel> getGetHotelByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHotelById",
      requestType = com.sdj3.protobuf.DataAccess.HotelById.class,
      responseType = com.sdj3.protobuf.DataAccess.Hotel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.HotelById,
      com.sdj3.protobuf.DataAccess.Hotel> getGetHotelByIdMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.HotelById, com.sdj3.protobuf.DataAccess.Hotel> getGetHotelByIdMethod;
    if ((getGetHotelByIdMethod = AccessGrpc.getGetHotelByIdMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetHotelByIdMethod = AccessGrpc.getGetHotelByIdMethod) == null) {
          AccessGrpc.getGetHotelByIdMethod = getGetHotelByIdMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.HotelById, com.sdj3.protobuf.DataAccess.Hotel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHotelById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.HotelById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Hotel.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetHotelById"))
              .build();
        }
      }
    }
    return getGetHotelByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.HotelNameToUpdate,
      com.sdj3.protobuf.DataAccess.HotelNameUpdated> getUpdateHotelNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHotelName",
      requestType = com.sdj3.protobuf.DataAccess.HotelNameToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.HotelNameUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.HotelNameToUpdate,
      com.sdj3.protobuf.DataAccess.HotelNameUpdated> getUpdateHotelNameMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.HotelNameToUpdate, com.sdj3.protobuf.DataAccess.HotelNameUpdated> getUpdateHotelNameMethod;
    if ((getUpdateHotelNameMethod = AccessGrpc.getUpdateHotelNameMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateHotelNameMethod = AccessGrpc.getUpdateHotelNameMethod) == null) {
          AccessGrpc.getUpdateHotelNameMethod = getUpdateHotelNameMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.HotelNameToUpdate, com.sdj3.protobuf.DataAccess.HotelNameUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHotelName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.HotelNameToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.HotelNameUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateHotelName"))
              .build();
        }
      }
    }
    return getUpdateHotelNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.HotelDescriptionToUpdate,
      com.sdj3.protobuf.DataAccess.HotelDescriptionUpdated> getUpdateHotelDescriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHotelDescription",
      requestType = com.sdj3.protobuf.DataAccess.HotelDescriptionToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.HotelDescriptionUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.HotelDescriptionToUpdate,
      com.sdj3.protobuf.DataAccess.HotelDescriptionUpdated> getUpdateHotelDescriptionMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.HotelDescriptionToUpdate, com.sdj3.protobuf.DataAccess.HotelDescriptionUpdated> getUpdateHotelDescriptionMethod;
    if ((getUpdateHotelDescriptionMethod = AccessGrpc.getUpdateHotelDescriptionMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateHotelDescriptionMethod = AccessGrpc.getUpdateHotelDescriptionMethod) == null) {
          AccessGrpc.getUpdateHotelDescriptionMethod = getUpdateHotelDescriptionMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.HotelDescriptionToUpdate, com.sdj3.protobuf.DataAccess.HotelDescriptionUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHotelDescription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.HotelDescriptionToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.HotelDescriptionUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateHotelDescription"))
              .build();
        }
      }
    }
    return getUpdateHotelDescriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.HotelToDelete,
      com.sdj3.protobuf.DataAccess.HotelDeleted> getDeleteHotelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHotel",
      requestType = com.sdj3.protobuf.DataAccess.HotelToDelete.class,
      responseType = com.sdj3.protobuf.DataAccess.HotelDeleted.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.HotelToDelete,
      com.sdj3.protobuf.DataAccess.HotelDeleted> getDeleteHotelMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.HotelToDelete, com.sdj3.protobuf.DataAccess.HotelDeleted> getDeleteHotelMethod;
    if ((getDeleteHotelMethod = AccessGrpc.getDeleteHotelMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getDeleteHotelMethod = AccessGrpc.getDeleteHotelMethod) == null) {
          AccessGrpc.getDeleteHotelMethod = getDeleteHotelMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.HotelToDelete, com.sdj3.protobuf.DataAccess.HotelDeleted>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHotel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.HotelToDelete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.HotelDeleted.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("DeleteHotel"))
              .build();
        }
      }
    }
    return getDeleteHotelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdFoHotelList,
      com.sdj3.protobuf.DataAccess.ListOfHotels> getGetListOfHotelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetListOfHotels",
      requestType = com.sdj3.protobuf.DataAccess.CitysIdFoHotelList.class,
      responseType = com.sdj3.protobuf.DataAccess.ListOfHotels.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdFoHotelList,
      com.sdj3.protobuf.DataAccess.ListOfHotels> getGetListOfHotelsMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdFoHotelList, com.sdj3.protobuf.DataAccess.ListOfHotels> getGetListOfHotelsMethod;
    if ((getGetListOfHotelsMethod = AccessGrpc.getGetListOfHotelsMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetListOfHotelsMethod = AccessGrpc.getGetListOfHotelsMethod) == null) {
          AccessGrpc.getGetListOfHotelsMethod = getGetListOfHotelsMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CitysIdFoHotelList, com.sdj3.protobuf.DataAccess.ListOfHotels>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetListOfHotels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CitysIdFoHotelList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ListOfHotels.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetListOfHotels"))
              .build();
        }
      }
    }
    return getGetListOfHotelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.MuseumToCreate,
      com.sdj3.protobuf.DataAccess.MuseumCreated> getCreateMuseumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMuseum",
      requestType = com.sdj3.protobuf.DataAccess.MuseumToCreate.class,
      responseType = com.sdj3.protobuf.DataAccess.MuseumCreated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.MuseumToCreate,
      com.sdj3.protobuf.DataAccess.MuseumCreated> getCreateMuseumMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.MuseumToCreate, com.sdj3.protobuf.DataAccess.MuseumCreated> getCreateMuseumMethod;
    if ((getCreateMuseumMethod = AccessGrpc.getCreateMuseumMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getCreateMuseumMethod = AccessGrpc.getCreateMuseumMethod) == null) {
          AccessGrpc.getCreateMuseumMethod = getCreateMuseumMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.MuseumToCreate, com.sdj3.protobuf.DataAccess.MuseumCreated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMuseum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.MuseumToCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.MuseumCreated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("CreateMuseum"))
              .build();
        }
      }
    }
    return getCreateMuseumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.MuseumByName,
      com.sdj3.protobuf.DataAccess.Museum> getGetMuseumByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMuseumByName",
      requestType = com.sdj3.protobuf.DataAccess.MuseumByName.class,
      responseType = com.sdj3.protobuf.DataAccess.Museum.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.MuseumByName,
      com.sdj3.protobuf.DataAccess.Museum> getGetMuseumByNameMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.MuseumByName, com.sdj3.protobuf.DataAccess.Museum> getGetMuseumByNameMethod;
    if ((getGetMuseumByNameMethod = AccessGrpc.getGetMuseumByNameMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetMuseumByNameMethod = AccessGrpc.getGetMuseumByNameMethod) == null) {
          AccessGrpc.getGetMuseumByNameMethod = getGetMuseumByNameMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.MuseumByName, com.sdj3.protobuf.DataAccess.Museum>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMuseumByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.MuseumByName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Museum.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetMuseumByName"))
              .build();
        }
      }
    }
    return getGetMuseumByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.MuseumById,
      com.sdj3.protobuf.DataAccess.Museum> getGetMuseumByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMuseumById",
      requestType = com.sdj3.protobuf.DataAccess.MuseumById.class,
      responseType = com.sdj3.protobuf.DataAccess.Museum.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.MuseumById,
      com.sdj3.protobuf.DataAccess.Museum> getGetMuseumByIdMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.MuseumById, com.sdj3.protobuf.DataAccess.Museum> getGetMuseumByIdMethod;
    if ((getGetMuseumByIdMethod = AccessGrpc.getGetMuseumByIdMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetMuseumByIdMethod = AccessGrpc.getGetMuseumByIdMethod) == null) {
          AccessGrpc.getGetMuseumByIdMethod = getGetMuseumByIdMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.MuseumById, com.sdj3.protobuf.DataAccess.Museum>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMuseumById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.MuseumById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Museum.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetMuseumById"))
              .build();
        }
      }
    }
    return getGetMuseumByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.MuseumNameToUpdate,
      com.sdj3.protobuf.DataAccess.MuseumNameUpdated> getUpdateMuseumNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMuseumName",
      requestType = com.sdj3.protobuf.DataAccess.MuseumNameToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.MuseumNameUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.MuseumNameToUpdate,
      com.sdj3.protobuf.DataAccess.MuseumNameUpdated> getUpdateMuseumNameMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.MuseumNameToUpdate, com.sdj3.protobuf.DataAccess.MuseumNameUpdated> getUpdateMuseumNameMethod;
    if ((getUpdateMuseumNameMethod = AccessGrpc.getUpdateMuseumNameMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateMuseumNameMethod = AccessGrpc.getUpdateMuseumNameMethod) == null) {
          AccessGrpc.getUpdateMuseumNameMethod = getUpdateMuseumNameMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.MuseumNameToUpdate, com.sdj3.protobuf.DataAccess.MuseumNameUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMuseumName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.MuseumNameToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.MuseumNameUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateMuseumName"))
              .build();
        }
      }
    }
    return getUpdateMuseumNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.MuseumDescriptionToUpdate,
      com.sdj3.protobuf.DataAccess.MuseumDescriptionUpdated> getUpdateMuseumDescriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMuseumDescription",
      requestType = com.sdj3.protobuf.DataAccess.MuseumDescriptionToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.MuseumDescriptionUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.MuseumDescriptionToUpdate,
      com.sdj3.protobuf.DataAccess.MuseumDescriptionUpdated> getUpdateMuseumDescriptionMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.MuseumDescriptionToUpdate, com.sdj3.protobuf.DataAccess.MuseumDescriptionUpdated> getUpdateMuseumDescriptionMethod;
    if ((getUpdateMuseumDescriptionMethod = AccessGrpc.getUpdateMuseumDescriptionMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateMuseumDescriptionMethod = AccessGrpc.getUpdateMuseumDescriptionMethod) == null) {
          AccessGrpc.getUpdateMuseumDescriptionMethod = getUpdateMuseumDescriptionMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.MuseumDescriptionToUpdate, com.sdj3.protobuf.DataAccess.MuseumDescriptionUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMuseumDescription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.MuseumDescriptionToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.MuseumDescriptionUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateMuseumDescription"))
              .build();
        }
      }
    }
    return getUpdateMuseumDescriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.MuseumToDelete,
      com.sdj3.protobuf.DataAccess.MuseumDeleted> getDeleteMuseumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMuseum",
      requestType = com.sdj3.protobuf.DataAccess.MuseumToDelete.class,
      responseType = com.sdj3.protobuf.DataAccess.MuseumDeleted.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.MuseumToDelete,
      com.sdj3.protobuf.DataAccess.MuseumDeleted> getDeleteMuseumMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.MuseumToDelete, com.sdj3.protobuf.DataAccess.MuseumDeleted> getDeleteMuseumMethod;
    if ((getDeleteMuseumMethod = AccessGrpc.getDeleteMuseumMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getDeleteMuseumMethod = AccessGrpc.getDeleteMuseumMethod) == null) {
          AccessGrpc.getDeleteMuseumMethod = getDeleteMuseumMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.MuseumToDelete, com.sdj3.protobuf.DataAccess.MuseumDeleted>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMuseum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.MuseumToDelete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.MuseumDeleted.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("DeleteMuseum"))
              .build();
        }
      }
    }
    return getDeleteMuseumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForMuseumList,
      com.sdj3.protobuf.DataAccess.ListOfMuseums> getGetListOfMuseumsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetListOfMuseums",
      requestType = com.sdj3.protobuf.DataAccess.CitysIdForMuseumList.class,
      responseType = com.sdj3.protobuf.DataAccess.ListOfMuseums.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForMuseumList,
      com.sdj3.protobuf.DataAccess.ListOfMuseums> getGetListOfMuseumsMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForMuseumList, com.sdj3.protobuf.DataAccess.ListOfMuseums> getGetListOfMuseumsMethod;
    if ((getGetListOfMuseumsMethod = AccessGrpc.getGetListOfMuseumsMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetListOfMuseumsMethod = AccessGrpc.getGetListOfMuseumsMethod) == null) {
          AccessGrpc.getGetListOfMuseumsMethod = getGetListOfMuseumsMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CitysIdForMuseumList, com.sdj3.protobuf.DataAccess.ListOfMuseums>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetListOfMuseums"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CitysIdForMuseumList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ListOfMuseums.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetListOfMuseums"))
              .build();
        }
      }
    }
    return getGetListOfMuseumsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ParkToCreate,
      com.sdj3.protobuf.DataAccess.ParkCreated> getCreateParkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePark",
      requestType = com.sdj3.protobuf.DataAccess.ParkToCreate.class,
      responseType = com.sdj3.protobuf.DataAccess.ParkCreated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ParkToCreate,
      com.sdj3.protobuf.DataAccess.ParkCreated> getCreateParkMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ParkToCreate, com.sdj3.protobuf.DataAccess.ParkCreated> getCreateParkMethod;
    if ((getCreateParkMethod = AccessGrpc.getCreateParkMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getCreateParkMethod = AccessGrpc.getCreateParkMethod) == null) {
          AccessGrpc.getCreateParkMethod = getCreateParkMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ParkToCreate, com.sdj3.protobuf.DataAccess.ParkCreated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePark"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ParkToCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ParkCreated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("CreatePark"))
              .build();
        }
      }
    }
    return getCreateParkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ParkByName,
      com.sdj3.protobuf.DataAccess.Park> getGetParkByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetParkByName",
      requestType = com.sdj3.protobuf.DataAccess.ParkByName.class,
      responseType = com.sdj3.protobuf.DataAccess.Park.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ParkByName,
      com.sdj3.protobuf.DataAccess.Park> getGetParkByNameMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ParkByName, com.sdj3.protobuf.DataAccess.Park> getGetParkByNameMethod;
    if ((getGetParkByNameMethod = AccessGrpc.getGetParkByNameMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetParkByNameMethod = AccessGrpc.getGetParkByNameMethod) == null) {
          AccessGrpc.getGetParkByNameMethod = getGetParkByNameMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ParkByName, com.sdj3.protobuf.DataAccess.Park>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetParkByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ParkByName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Park.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetParkByName"))
              .build();
        }
      }
    }
    return getGetParkByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ParkById,
      com.sdj3.protobuf.DataAccess.Park> getGetParkByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetParkById",
      requestType = com.sdj3.protobuf.DataAccess.ParkById.class,
      responseType = com.sdj3.protobuf.DataAccess.Park.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ParkById,
      com.sdj3.protobuf.DataAccess.Park> getGetParkByIdMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ParkById, com.sdj3.protobuf.DataAccess.Park> getGetParkByIdMethod;
    if ((getGetParkByIdMethod = AccessGrpc.getGetParkByIdMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetParkByIdMethod = AccessGrpc.getGetParkByIdMethod) == null) {
          AccessGrpc.getGetParkByIdMethod = getGetParkByIdMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ParkById, com.sdj3.protobuf.DataAccess.Park>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetParkById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ParkById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Park.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetParkById"))
              .build();
        }
      }
    }
    return getGetParkByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ParkNameToUpdate,
      com.sdj3.protobuf.DataAccess.ParkNameUpdated> getUpdateParkNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParkName",
      requestType = com.sdj3.protobuf.DataAccess.ParkNameToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.ParkNameUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ParkNameToUpdate,
      com.sdj3.protobuf.DataAccess.ParkNameUpdated> getUpdateParkNameMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ParkNameToUpdate, com.sdj3.protobuf.DataAccess.ParkNameUpdated> getUpdateParkNameMethod;
    if ((getUpdateParkNameMethod = AccessGrpc.getUpdateParkNameMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateParkNameMethod = AccessGrpc.getUpdateParkNameMethod) == null) {
          AccessGrpc.getUpdateParkNameMethod = getUpdateParkNameMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ParkNameToUpdate, com.sdj3.protobuf.DataAccess.ParkNameUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParkName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ParkNameToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ParkNameUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateParkName"))
              .build();
        }
      }
    }
    return getUpdateParkNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ParkDescriptionToUpdate,
      com.sdj3.protobuf.DataAccess.ParkDescriptionUpdated> getUpdateParkDescriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParkDescription",
      requestType = com.sdj3.protobuf.DataAccess.ParkDescriptionToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.ParkDescriptionUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ParkDescriptionToUpdate,
      com.sdj3.protobuf.DataAccess.ParkDescriptionUpdated> getUpdateParkDescriptionMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ParkDescriptionToUpdate, com.sdj3.protobuf.DataAccess.ParkDescriptionUpdated> getUpdateParkDescriptionMethod;
    if ((getUpdateParkDescriptionMethod = AccessGrpc.getUpdateParkDescriptionMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateParkDescriptionMethod = AccessGrpc.getUpdateParkDescriptionMethod) == null) {
          AccessGrpc.getUpdateParkDescriptionMethod = getUpdateParkDescriptionMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ParkDescriptionToUpdate, com.sdj3.protobuf.DataAccess.ParkDescriptionUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParkDescription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ParkDescriptionToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ParkDescriptionUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateParkDescription"))
              .build();
        }
      }
    }
    return getUpdateParkDescriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ParkToDelete,
      com.sdj3.protobuf.DataAccess.ParkDeleted> getDeleteParkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePark",
      requestType = com.sdj3.protobuf.DataAccess.ParkToDelete.class,
      responseType = com.sdj3.protobuf.DataAccess.ParkDeleted.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ParkToDelete,
      com.sdj3.protobuf.DataAccess.ParkDeleted> getDeleteParkMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ParkToDelete, com.sdj3.protobuf.DataAccess.ParkDeleted> getDeleteParkMethod;
    if ((getDeleteParkMethod = AccessGrpc.getDeleteParkMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getDeleteParkMethod = AccessGrpc.getDeleteParkMethod) == null) {
          AccessGrpc.getDeleteParkMethod = getDeleteParkMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ParkToDelete, com.sdj3.protobuf.DataAccess.ParkDeleted>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePark"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ParkToDelete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ParkDeleted.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("DeletePark"))
              .build();
        }
      }
    }
    return getDeleteParkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForParkList,
      com.sdj3.protobuf.DataAccess.ListOfParks> getGetListOfParksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetListOfParks",
      requestType = com.sdj3.protobuf.DataAccess.CitysIdForParkList.class,
      responseType = com.sdj3.protobuf.DataAccess.ListOfParks.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForParkList,
      com.sdj3.protobuf.DataAccess.ListOfParks> getGetListOfParksMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForParkList, com.sdj3.protobuf.DataAccess.ListOfParks> getGetListOfParksMethod;
    if ((getGetListOfParksMethod = AccessGrpc.getGetListOfParksMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetListOfParksMethod = AccessGrpc.getGetListOfParksMethod) == null) {
          AccessGrpc.getGetListOfParksMethod = getGetListOfParksMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CitysIdForParkList, com.sdj3.protobuf.DataAccess.ListOfParks>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetListOfParks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CitysIdForParkList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ListOfParks.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetListOfParks"))
              .build();
        }
      }
    }
    return getGetListOfParksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.RestaurantToCreate,
      com.sdj3.protobuf.DataAccess.RestaurantCreated> getCreateRestaurantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRestaurant",
      requestType = com.sdj3.protobuf.DataAccess.RestaurantToCreate.class,
      responseType = com.sdj3.protobuf.DataAccess.RestaurantCreated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.RestaurantToCreate,
      com.sdj3.protobuf.DataAccess.RestaurantCreated> getCreateRestaurantMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.RestaurantToCreate, com.sdj3.protobuf.DataAccess.RestaurantCreated> getCreateRestaurantMethod;
    if ((getCreateRestaurantMethod = AccessGrpc.getCreateRestaurantMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getCreateRestaurantMethod = AccessGrpc.getCreateRestaurantMethod) == null) {
          AccessGrpc.getCreateRestaurantMethod = getCreateRestaurantMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.RestaurantToCreate, com.sdj3.protobuf.DataAccess.RestaurantCreated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRestaurant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.RestaurantToCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.RestaurantCreated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("CreateRestaurant"))
              .build();
        }
      }
    }
    return getCreateRestaurantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.RestaurantByName,
      com.sdj3.protobuf.DataAccess.Restaurant> getGetRestaurantByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRestaurantByName",
      requestType = com.sdj3.protobuf.DataAccess.RestaurantByName.class,
      responseType = com.sdj3.protobuf.DataAccess.Restaurant.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.RestaurantByName,
      com.sdj3.protobuf.DataAccess.Restaurant> getGetRestaurantByNameMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.RestaurantByName, com.sdj3.protobuf.DataAccess.Restaurant> getGetRestaurantByNameMethod;
    if ((getGetRestaurantByNameMethod = AccessGrpc.getGetRestaurantByNameMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetRestaurantByNameMethod = AccessGrpc.getGetRestaurantByNameMethod) == null) {
          AccessGrpc.getGetRestaurantByNameMethod = getGetRestaurantByNameMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.RestaurantByName, com.sdj3.protobuf.DataAccess.Restaurant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRestaurantByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.RestaurantByName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Restaurant.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetRestaurantByName"))
              .build();
        }
      }
    }
    return getGetRestaurantByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.RestaurantById,
      com.sdj3.protobuf.DataAccess.Restaurant> getGetRestaurantByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRestaurantById",
      requestType = com.sdj3.protobuf.DataAccess.RestaurantById.class,
      responseType = com.sdj3.protobuf.DataAccess.Restaurant.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.RestaurantById,
      com.sdj3.protobuf.DataAccess.Restaurant> getGetRestaurantByIdMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.RestaurantById, com.sdj3.protobuf.DataAccess.Restaurant> getGetRestaurantByIdMethod;
    if ((getGetRestaurantByIdMethod = AccessGrpc.getGetRestaurantByIdMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetRestaurantByIdMethod = AccessGrpc.getGetRestaurantByIdMethod) == null) {
          AccessGrpc.getGetRestaurantByIdMethod = getGetRestaurantByIdMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.RestaurantById, com.sdj3.protobuf.DataAccess.Restaurant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRestaurantById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.RestaurantById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Restaurant.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetRestaurantById"))
              .build();
        }
      }
    }
    return getGetRestaurantByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.RestaurantNameToUpdate,
      com.sdj3.protobuf.DataAccess.RestaurantNameUpdated> getUpdateRestaurantNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRestaurantName",
      requestType = com.sdj3.protobuf.DataAccess.RestaurantNameToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.RestaurantNameUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.RestaurantNameToUpdate,
      com.sdj3.protobuf.DataAccess.RestaurantNameUpdated> getUpdateRestaurantNameMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.RestaurantNameToUpdate, com.sdj3.protobuf.DataAccess.RestaurantNameUpdated> getUpdateRestaurantNameMethod;
    if ((getUpdateRestaurantNameMethod = AccessGrpc.getUpdateRestaurantNameMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateRestaurantNameMethod = AccessGrpc.getUpdateRestaurantNameMethod) == null) {
          AccessGrpc.getUpdateRestaurantNameMethod = getUpdateRestaurantNameMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.RestaurantNameToUpdate, com.sdj3.protobuf.DataAccess.RestaurantNameUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRestaurantName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.RestaurantNameToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.RestaurantNameUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateRestaurantName"))
              .build();
        }
      }
    }
    return getUpdateRestaurantNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.RestaurantDescriptionToUpdate,
      com.sdj3.protobuf.DataAccess.RestaurantDescriptionUpdated> getUpdateRestaurantDescriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRestaurantDescription",
      requestType = com.sdj3.protobuf.DataAccess.RestaurantDescriptionToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.RestaurantDescriptionUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.RestaurantDescriptionToUpdate,
      com.sdj3.protobuf.DataAccess.RestaurantDescriptionUpdated> getUpdateRestaurantDescriptionMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.RestaurantDescriptionToUpdate, com.sdj3.protobuf.DataAccess.RestaurantDescriptionUpdated> getUpdateRestaurantDescriptionMethod;
    if ((getUpdateRestaurantDescriptionMethod = AccessGrpc.getUpdateRestaurantDescriptionMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateRestaurantDescriptionMethod = AccessGrpc.getUpdateRestaurantDescriptionMethod) == null) {
          AccessGrpc.getUpdateRestaurantDescriptionMethod = getUpdateRestaurantDescriptionMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.RestaurantDescriptionToUpdate, com.sdj3.protobuf.DataAccess.RestaurantDescriptionUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRestaurantDescription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.RestaurantDescriptionToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.RestaurantDescriptionUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateRestaurantDescription"))
              .build();
        }
      }
    }
    return getUpdateRestaurantDescriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.RestaurantToDelete,
      com.sdj3.protobuf.DataAccess.RestaurantDeleted> getDeleteRestaurantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRestaurant",
      requestType = com.sdj3.protobuf.DataAccess.RestaurantToDelete.class,
      responseType = com.sdj3.protobuf.DataAccess.RestaurantDeleted.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.RestaurantToDelete,
      com.sdj3.protobuf.DataAccess.RestaurantDeleted> getDeleteRestaurantMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.RestaurantToDelete, com.sdj3.protobuf.DataAccess.RestaurantDeleted> getDeleteRestaurantMethod;
    if ((getDeleteRestaurantMethod = AccessGrpc.getDeleteRestaurantMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getDeleteRestaurantMethod = AccessGrpc.getDeleteRestaurantMethod) == null) {
          AccessGrpc.getDeleteRestaurantMethod = getDeleteRestaurantMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.RestaurantToDelete, com.sdj3.protobuf.DataAccess.RestaurantDeleted>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRestaurant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.RestaurantToDelete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.RestaurantDeleted.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("DeleteRestaurant"))
              .build();
        }
      }
    }
    return getDeleteRestaurantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForRestaurantList,
      com.sdj3.protobuf.DataAccess.ListOfRestaurants> getGetListOfRestaurantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetListOfRestaurant",
      requestType = com.sdj3.protobuf.DataAccess.CitysIdForRestaurantList.class,
      responseType = com.sdj3.protobuf.DataAccess.ListOfRestaurants.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForRestaurantList,
      com.sdj3.protobuf.DataAccess.ListOfRestaurants> getGetListOfRestaurantMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForRestaurantList, com.sdj3.protobuf.DataAccess.ListOfRestaurants> getGetListOfRestaurantMethod;
    if ((getGetListOfRestaurantMethod = AccessGrpc.getGetListOfRestaurantMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetListOfRestaurantMethod = AccessGrpc.getGetListOfRestaurantMethod) == null) {
          AccessGrpc.getGetListOfRestaurantMethod = getGetListOfRestaurantMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CitysIdForRestaurantList, com.sdj3.protobuf.DataAccess.ListOfRestaurants>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetListOfRestaurant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CitysIdForRestaurantList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ListOfRestaurants.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetListOfRestaurant"))
              .build();
        }
      }
    }
    return getGetListOfRestaurantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToCreate,
      com.sdj3.protobuf.DataAccess.ReviewCreated> getCreateReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReview",
      requestType = com.sdj3.protobuf.DataAccess.ReviewToCreate.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewCreated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToCreate,
      com.sdj3.protobuf.DataAccess.ReviewCreated> getCreateReviewMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToCreate, com.sdj3.protobuf.DataAccess.ReviewCreated> getCreateReviewMethod;
    if ((getCreateReviewMethod = AccessGrpc.getCreateReviewMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getCreateReviewMethod = AccessGrpc.getCreateReviewMethod) == null) {
          AccessGrpc.getCreateReviewMethod = getCreateReviewMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewToCreate, com.sdj3.protobuf.DataAccess.ReviewCreated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewToCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewCreated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("CreateReview"))
              .build();
        }
      }
    }
    return getCreateReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewById,
      com.sdj3.protobuf.DataAccess.Review> getGetReviewByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReviewById",
      requestType = com.sdj3.protobuf.DataAccess.ReviewById.class,
      responseType = com.sdj3.protobuf.DataAccess.Review.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewById,
      com.sdj3.protobuf.DataAccess.Review> getGetReviewByIdMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewById, com.sdj3.protobuf.DataAccess.Review> getGetReviewByIdMethod;
    if ((getGetReviewByIdMethod = AccessGrpc.getGetReviewByIdMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetReviewByIdMethod = AccessGrpc.getGetReviewByIdMethod) == null) {
          AccessGrpc.getGetReviewByIdMethod = getGetReviewByIdMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewById, com.sdj3.protobuf.DataAccess.Review>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReviewById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Review.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetReviewById"))
              .build();
        }
      }
    }
    return getGetReviewByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> getUpdateReviewCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateReviewComment",
      requestType = com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewCommentUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> getUpdateReviewCommentMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate, com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> getUpdateReviewCommentMethod;
    if ((getUpdateReviewCommentMethod = AccessGrpc.getUpdateReviewCommentMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateReviewCommentMethod = AccessGrpc.getUpdateReviewCommentMethod) == null) {
          AccessGrpc.getUpdateReviewCommentMethod = getUpdateReviewCommentMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate, com.sdj3.protobuf.DataAccess.ReviewCommentUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateReviewComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewCommentUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateReviewComment"))
              .build();
        }
      }
    }
    return getUpdateReviewCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> getUpdateStarReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStarReview",
      requestType = com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> getUpdateStarReviewMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate, com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> getUpdateStarReviewMethod;
    if ((getUpdateStarReviewMethod = AccessGrpc.getUpdateStarReviewMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateStarReviewMethod = AccessGrpc.getUpdateStarReviewMethod) == null) {
          AccessGrpc.getUpdateStarReviewMethod = getUpdateStarReviewMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate, com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStarReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateStarReview"))
              .build();
        }
      }
    }
    return getUpdateStarReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToDelete,
      com.sdj3.protobuf.DataAccess.ReviewDeleted> getDeleteReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReview",
      requestType = com.sdj3.protobuf.DataAccess.ReviewToDelete.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewDeleted.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToDelete,
      com.sdj3.protobuf.DataAccess.ReviewDeleted> getDeleteReviewMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToDelete, com.sdj3.protobuf.DataAccess.ReviewDeleted> getDeleteReviewMethod;
    if ((getDeleteReviewMethod = AccessGrpc.getDeleteReviewMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getDeleteReviewMethod = AccessGrpc.getDeleteReviewMethod) == null) {
          AccessGrpc.getDeleteReviewMethod = getDeleteReviewMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewToDelete, com.sdj3.protobuf.DataAccess.ReviewDeleted>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewToDelete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewDeleted.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("DeleteReview"))
              .build();
        }
      }
    }
    return getDeleteReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryForReviewList,
      com.sdj3.protobuf.DataAccess.ReveiewList> getGetListOfReviewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetListOfReviews",
      requestType = com.sdj3.protobuf.DataAccess.CategoryForReviewList.class,
      responseType = com.sdj3.protobuf.DataAccess.ReveiewList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryForReviewList,
      com.sdj3.protobuf.DataAccess.ReveiewList> getGetListOfReviewsMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryForReviewList, com.sdj3.protobuf.DataAccess.ReveiewList> getGetListOfReviewsMethod;
    if ((getGetListOfReviewsMethod = AccessGrpc.getGetListOfReviewsMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetListOfReviewsMethod = AccessGrpc.getGetListOfReviewsMethod) == null) {
          AccessGrpc.getGetListOfReviewsMethod = getGetListOfReviewsMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryForReviewList, com.sdj3.protobuf.DataAccess.ReveiewList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetListOfReviews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryForReviewList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReveiewList.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetListOfReviews"))
              .build();
        }
      }
    }
    return getGetListOfReviewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars,
      com.sdj3.protobuf.DataAccess.ReveiewList> getGetReviewsContainingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReviewsContaining",
      requestType = com.sdj3.protobuf.DataAccess.SearchReviewPeremetars.class,
      responseType = com.sdj3.protobuf.DataAccess.ReveiewList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars,
      com.sdj3.protobuf.DataAccess.ReveiewList> getGetReviewsContainingMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars, com.sdj3.protobuf.DataAccess.ReveiewList> getGetReviewsContainingMethod;
    if ((getGetReviewsContainingMethod = AccessGrpc.getGetReviewsContainingMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetReviewsContainingMethod = AccessGrpc.getGetReviewsContainingMethod) == null) {
          AccessGrpc.getGetReviewsContainingMethod = getGetReviewsContainingMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars, com.sdj3.protobuf.DataAccess.ReveiewList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReviewsContaining"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.SearchReviewPeremetars.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReveiewList.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetReviewsContaining"))
              .build();
        }
      }
    }
    return getGetReviewsContainingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReportToCreate,
      com.sdj3.protobuf.DataAccess.ReportCreated> getCreateReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReport",
      requestType = com.sdj3.protobuf.DataAccess.ReportToCreate.class,
      responseType = com.sdj3.protobuf.DataAccess.ReportCreated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReportToCreate,
      com.sdj3.protobuf.DataAccess.ReportCreated> getCreateReportMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReportToCreate, com.sdj3.protobuf.DataAccess.ReportCreated> getCreateReportMethod;
    if ((getCreateReportMethod = AccessGrpc.getCreateReportMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getCreateReportMethod = AccessGrpc.getCreateReportMethod) == null) {
          AccessGrpc.getCreateReportMethod = getCreateReportMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReportToCreate, com.sdj3.protobuf.DataAccess.ReportCreated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReportToCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReportCreated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("CreateReport"))
              .build();
        }
      }
    }
    return getCreateReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReportById,
      com.sdj3.protobuf.DataAccess.Report> getGetReportByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReportById",
      requestType = com.sdj3.protobuf.DataAccess.ReportById.class,
      responseType = com.sdj3.protobuf.DataAccess.Report.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReportById,
      com.sdj3.protobuf.DataAccess.Report> getGetReportByIdMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReportById, com.sdj3.protobuf.DataAccess.Report> getGetReportByIdMethod;
    if ((getGetReportByIdMethod = AccessGrpc.getGetReportByIdMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetReportByIdMethod = AccessGrpc.getGetReportByIdMethod) == null) {
          AccessGrpc.getGetReportByIdMethod = getGetReportByIdMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReportById, com.sdj3.protobuf.DataAccess.Report>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReportById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReportById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Report.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetReportById"))
              .build();
        }
      }
    }
    return getGetReportByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReportToDelete,
      com.sdj3.protobuf.DataAccess.ReportDeleted> getDeleteReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReport",
      requestType = com.sdj3.protobuf.DataAccess.ReportToDelete.class,
      responseType = com.sdj3.protobuf.DataAccess.ReportDeleted.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReportToDelete,
      com.sdj3.protobuf.DataAccess.ReportDeleted> getDeleteReportMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReportToDelete, com.sdj3.protobuf.DataAccess.ReportDeleted> getDeleteReportMethod;
    if ((getDeleteReportMethod = AccessGrpc.getDeleteReportMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getDeleteReportMethod = AccessGrpc.getDeleteReportMethod) == null) {
          AccessGrpc.getDeleteReportMethod = getDeleteReportMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReportToDelete, com.sdj3.protobuf.DataAccess.ReportDeleted>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReportToDelete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReportDeleted.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("DeleteReport"))
              .build();
        }
      }
    }
    return getDeleteReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.Empty,
      com.sdj3.protobuf.DataAccess.ListOfReports> getGetListOfReportsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetListOfReports",
      requestType = com.sdj3.protobuf.DataAccess.Empty.class,
      responseType = com.sdj3.protobuf.DataAccess.ListOfReports.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.Empty,
      com.sdj3.protobuf.DataAccess.ListOfReports> getGetListOfReportsMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.Empty, com.sdj3.protobuf.DataAccess.ListOfReports> getGetListOfReportsMethod;
    if ((getGetListOfReportsMethod = AccessGrpc.getGetListOfReportsMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetListOfReportsMethod = AccessGrpc.getGetListOfReportsMethod) == null) {
          AccessGrpc.getGetListOfReportsMethod = getGetListOfReportsMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.Empty, com.sdj3.protobuf.DataAccess.ListOfReports>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetListOfReports"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ListOfReports.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetListOfReports"))
              .build();
        }
      }
    }
    return getGetListOfReportsMethod;
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

    /**
     * <pre>
     *city
     * </pre>
     */
    public void createCity(com.sdj3.protobuf.DataAccess.CityToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CityCreated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCityMethod(), responseObserver);
    }

    /**
     */
    public void getCitByyname(com.sdj3.protobuf.DataAccess.CityByName request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.City> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCitByynameMethod(), responseObserver);
    }

    /**
     */
    public void getCityById(com.sdj3.protobuf.DataAccess.CityById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.City> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCityByIdMethod(), responseObserver);
    }

    /**
     */
    public void createHotel(com.sdj3.protobuf.DataAccess.HotelToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.HotelCreated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateHotelMethod(), responseObserver);
    }

    /**
     */
    public void getHotelByName(com.sdj3.protobuf.DataAccess.HotelByName request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Hotel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHotelByNameMethod(), responseObserver);
    }

    /**
     */
    public void getHotelById(com.sdj3.protobuf.DataAccess.HotelById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Hotel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHotelByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateHotelName(com.sdj3.protobuf.DataAccess.HotelNameToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.HotelNameUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHotelNameMethod(), responseObserver);
    }

    /**
     */
    public void updateHotelDescription(com.sdj3.protobuf.DataAccess.HotelDescriptionToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.HotelDescriptionUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHotelDescriptionMethod(), responseObserver);
    }

    /**
     */
    public void deleteHotel(com.sdj3.protobuf.DataAccess.HotelToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.HotelDeleted> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteHotelMethod(), responseObserver);
    }

    /**
     */
    public void getListOfHotels(com.sdj3.protobuf.DataAccess.CitysIdFoHotelList request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfHotels> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListOfHotelsMethod(), responseObserver);
    }

    /**
     */
    public void createMuseum(com.sdj3.protobuf.DataAccess.MuseumToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.MuseumCreated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMuseumMethod(), responseObserver);
    }

    /**
     */
    public void getMuseumByName(com.sdj3.protobuf.DataAccess.MuseumByName request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Museum> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMuseumByNameMethod(), responseObserver);
    }

    /**
     */
    public void getMuseumById(com.sdj3.protobuf.DataAccess.MuseumById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Museum> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMuseumByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateMuseumName(com.sdj3.protobuf.DataAccess.MuseumNameToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.MuseumNameUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMuseumNameMethod(), responseObserver);
    }

    /**
     */
    public void updateMuseumDescription(com.sdj3.protobuf.DataAccess.MuseumDescriptionToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.MuseumDescriptionUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMuseumDescriptionMethod(), responseObserver);
    }

    /**
     */
    public void deleteMuseum(com.sdj3.protobuf.DataAccess.MuseumToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.MuseumDeleted> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMuseumMethod(), responseObserver);
    }

    /**
     */
    public void getListOfMuseums(com.sdj3.protobuf.DataAccess.CitysIdForMuseumList request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfMuseums> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListOfMuseumsMethod(), responseObserver);
    }

    /**
     */
    public void createPark(com.sdj3.protobuf.DataAccess.ParkToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ParkCreated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateParkMethod(), responseObserver);
    }

    /**
     */
    public void getParkByName(com.sdj3.protobuf.DataAccess.ParkByName request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Park> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetParkByNameMethod(), responseObserver);
    }

    /**
     */
    public void getParkById(com.sdj3.protobuf.DataAccess.ParkById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Park> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetParkByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateParkName(com.sdj3.protobuf.DataAccess.ParkNameToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ParkNameUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParkNameMethod(), responseObserver);
    }

    /**
     */
    public void updateParkDescription(com.sdj3.protobuf.DataAccess.ParkDescriptionToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ParkDescriptionUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParkDescriptionMethod(), responseObserver);
    }

    /**
     */
    public void deletePark(com.sdj3.protobuf.DataAccess.ParkToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ParkDeleted> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteParkMethod(), responseObserver);
    }

    /**
     */
    public void getListOfParks(com.sdj3.protobuf.DataAccess.CitysIdForParkList request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfParks> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListOfParksMethod(), responseObserver);
    }

    /**
     */
    public void createRestaurant(com.sdj3.protobuf.DataAccess.RestaurantToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.RestaurantCreated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRestaurantMethod(), responseObserver);
    }

    /**
     */
    public void getRestaurantByName(com.sdj3.protobuf.DataAccess.RestaurantByName request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Restaurant> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRestaurantByNameMethod(), responseObserver);
    }

    /**
     */
    public void getRestaurantById(com.sdj3.protobuf.DataAccess.RestaurantById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Restaurant> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRestaurantByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateRestaurantName(com.sdj3.protobuf.DataAccess.RestaurantNameToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.RestaurantNameUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRestaurantNameMethod(), responseObserver);
    }

    /**
     */
    public void updateRestaurantDescription(com.sdj3.protobuf.DataAccess.RestaurantDescriptionToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.RestaurantDescriptionUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRestaurantDescriptionMethod(), responseObserver);
    }

    /**
     */
    public void deleteRestaurant(com.sdj3.protobuf.DataAccess.RestaurantToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.RestaurantDeleted> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRestaurantMethod(), responseObserver);
    }

    /**
     */
    public void getListOfRestaurant(com.sdj3.protobuf.DataAccess.CitysIdForRestaurantList request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfRestaurants> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListOfRestaurantMethod(), responseObserver);
    }

    /**
     */
    public void createReview(com.sdj3.protobuf.DataAccess.ReviewToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCreated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateReviewMethod(), responseObserver);
    }

    /**
     */
    public void getReviewById(com.sdj3.protobuf.DataAccess.ReviewById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Review> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReviewByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateReviewComment(com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateReviewCommentMethod(), responseObserver);
    }

    /**
     */
    public void updateStarReview(com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStarReviewMethod(), responseObserver);
    }

    /**
     */
    public void deleteReview(com.sdj3.protobuf.DataAccess.ReviewToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewDeleted> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteReviewMethod(), responseObserver);
    }

    /**
     */
    public void getListOfReviews(com.sdj3.protobuf.DataAccess.CategoryForReviewList request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReveiewList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListOfReviewsMethod(), responseObserver);
    }

    /**
     * <pre>
     *ADD THIS EVERYWHERE
     * </pre>
     */
    public void getReviewsContaining(com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReveiewList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReviewsContainingMethod(), responseObserver);
    }

    /**
     */
    public void createReport(com.sdj3.protobuf.DataAccess.ReportToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReportCreated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateReportMethod(), responseObserver);
    }

    /**
     */
    public void getReportById(com.sdj3.protobuf.DataAccess.ReportById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Report> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReportByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteReport(com.sdj3.protobuf.DataAccess.ReportToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReportDeleted> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteReportMethod(), responseObserver);
    }

    /**
     */
    public void getListOfReports(com.sdj3.protobuf.DataAccess.Empty request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfReports> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListOfReportsMethod(), responseObserver);
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
          .addMethod(
            getCreateCityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CityToCreate,
                com.sdj3.protobuf.DataAccess.CityCreated>(
                  this, METHODID_CREATE_CITY)))
          .addMethod(
            getGetCitByynameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CityByName,
                com.sdj3.protobuf.DataAccess.City>(
                  this, METHODID_GET_CIT_BYYNAME)))
          .addMethod(
            getGetCityByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CityById,
                com.sdj3.protobuf.DataAccess.City>(
                  this, METHODID_GET_CITY_BY_ID)))
          .addMethod(
            getCreateHotelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.HotelToCreate,
                com.sdj3.protobuf.DataAccess.HotelCreated>(
                  this, METHODID_CREATE_HOTEL)))
          .addMethod(
            getGetHotelByNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.HotelByName,
                com.sdj3.protobuf.DataAccess.Hotel>(
                  this, METHODID_GET_HOTEL_BY_NAME)))
          .addMethod(
            getGetHotelByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.HotelById,
                com.sdj3.protobuf.DataAccess.Hotel>(
                  this, METHODID_GET_HOTEL_BY_ID)))
          .addMethod(
            getUpdateHotelNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.HotelNameToUpdate,
                com.sdj3.protobuf.DataAccess.HotelNameUpdated>(
                  this, METHODID_UPDATE_HOTEL_NAME)))
          .addMethod(
            getUpdateHotelDescriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.HotelDescriptionToUpdate,
                com.sdj3.protobuf.DataAccess.HotelDescriptionUpdated>(
                  this, METHODID_UPDATE_HOTEL_DESCRIPTION)))
          .addMethod(
            getDeleteHotelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.HotelToDelete,
                com.sdj3.protobuf.DataAccess.HotelDeleted>(
                  this, METHODID_DELETE_HOTEL)))
          .addMethod(
            getGetListOfHotelsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CitysIdFoHotelList,
                com.sdj3.protobuf.DataAccess.ListOfHotels>(
                  this, METHODID_GET_LIST_OF_HOTELS)))
          .addMethod(
            getCreateMuseumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.MuseumToCreate,
                com.sdj3.protobuf.DataAccess.MuseumCreated>(
                  this, METHODID_CREATE_MUSEUM)))
          .addMethod(
            getGetMuseumByNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.MuseumByName,
                com.sdj3.protobuf.DataAccess.Museum>(
                  this, METHODID_GET_MUSEUM_BY_NAME)))
          .addMethod(
            getGetMuseumByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.MuseumById,
                com.sdj3.protobuf.DataAccess.Museum>(
                  this, METHODID_GET_MUSEUM_BY_ID)))
          .addMethod(
            getUpdateMuseumNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.MuseumNameToUpdate,
                com.sdj3.protobuf.DataAccess.MuseumNameUpdated>(
                  this, METHODID_UPDATE_MUSEUM_NAME)))
          .addMethod(
            getUpdateMuseumDescriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.MuseumDescriptionToUpdate,
                com.sdj3.protobuf.DataAccess.MuseumDescriptionUpdated>(
                  this, METHODID_UPDATE_MUSEUM_DESCRIPTION)))
          .addMethod(
            getDeleteMuseumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.MuseumToDelete,
                com.sdj3.protobuf.DataAccess.MuseumDeleted>(
                  this, METHODID_DELETE_MUSEUM)))
          .addMethod(
            getGetListOfMuseumsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CitysIdForMuseumList,
                com.sdj3.protobuf.DataAccess.ListOfMuseums>(
                  this, METHODID_GET_LIST_OF_MUSEUMS)))
          .addMethod(
            getCreateParkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ParkToCreate,
                com.sdj3.protobuf.DataAccess.ParkCreated>(
                  this, METHODID_CREATE_PARK)))
          .addMethod(
            getGetParkByNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ParkByName,
                com.sdj3.protobuf.DataAccess.Park>(
                  this, METHODID_GET_PARK_BY_NAME)))
          .addMethod(
            getGetParkByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ParkById,
                com.sdj3.protobuf.DataAccess.Park>(
                  this, METHODID_GET_PARK_BY_ID)))
          .addMethod(
            getUpdateParkNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ParkNameToUpdate,
                com.sdj3.protobuf.DataAccess.ParkNameUpdated>(
                  this, METHODID_UPDATE_PARK_NAME)))
          .addMethod(
            getUpdateParkDescriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ParkDescriptionToUpdate,
                com.sdj3.protobuf.DataAccess.ParkDescriptionUpdated>(
                  this, METHODID_UPDATE_PARK_DESCRIPTION)))
          .addMethod(
            getDeleteParkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ParkToDelete,
                com.sdj3.protobuf.DataAccess.ParkDeleted>(
                  this, METHODID_DELETE_PARK)))
          .addMethod(
            getGetListOfParksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CitysIdForParkList,
                com.sdj3.protobuf.DataAccess.ListOfParks>(
                  this, METHODID_GET_LIST_OF_PARKS)))
          .addMethod(
            getCreateRestaurantMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.RestaurantToCreate,
                com.sdj3.protobuf.DataAccess.RestaurantCreated>(
                  this, METHODID_CREATE_RESTAURANT)))
          .addMethod(
            getGetRestaurantByNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.RestaurantByName,
                com.sdj3.protobuf.DataAccess.Restaurant>(
                  this, METHODID_GET_RESTAURANT_BY_NAME)))
          .addMethod(
            getGetRestaurantByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.RestaurantById,
                com.sdj3.protobuf.DataAccess.Restaurant>(
                  this, METHODID_GET_RESTAURANT_BY_ID)))
          .addMethod(
            getUpdateRestaurantNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.RestaurantNameToUpdate,
                com.sdj3.protobuf.DataAccess.RestaurantNameUpdated>(
                  this, METHODID_UPDATE_RESTAURANT_NAME)))
          .addMethod(
            getUpdateRestaurantDescriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.RestaurantDescriptionToUpdate,
                com.sdj3.protobuf.DataAccess.RestaurantDescriptionUpdated>(
                  this, METHODID_UPDATE_RESTAURANT_DESCRIPTION)))
          .addMethod(
            getDeleteRestaurantMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.RestaurantToDelete,
                com.sdj3.protobuf.DataAccess.RestaurantDeleted>(
                  this, METHODID_DELETE_RESTAURANT)))
          .addMethod(
            getGetListOfRestaurantMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CitysIdForRestaurantList,
                com.sdj3.protobuf.DataAccess.ListOfRestaurants>(
                  this, METHODID_GET_LIST_OF_RESTAURANT)))
          .addMethod(
            getCreateReviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewToCreate,
                com.sdj3.protobuf.DataAccess.ReviewCreated>(
                  this, METHODID_CREATE_REVIEW)))
          .addMethod(
            getGetReviewByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewById,
                com.sdj3.protobuf.DataAccess.Review>(
                  this, METHODID_GET_REVIEW_BY_ID)))
          .addMethod(
            getUpdateReviewCommentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate,
                com.sdj3.protobuf.DataAccess.ReviewCommentUpdated>(
                  this, METHODID_UPDATE_REVIEW_COMMENT)))
          .addMethod(
            getUpdateStarReviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate,
                com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated>(
                  this, METHODID_UPDATE_STAR_REVIEW)))
          .addMethod(
            getDeleteReviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewToDelete,
                com.sdj3.protobuf.DataAccess.ReviewDeleted>(
                  this, METHODID_DELETE_REVIEW)))
          .addMethod(
            getGetListOfReviewsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryForReviewList,
                com.sdj3.protobuf.DataAccess.ReveiewList>(
                  this, METHODID_GET_LIST_OF_REVIEWS)))
          .addMethod(
            getGetReviewsContainingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.SearchReviewPeremetars,
                com.sdj3.protobuf.DataAccess.ReveiewList>(
                  this, METHODID_GET_REVIEWS_CONTAINING)))
          .addMethod(
            getCreateReportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReportToCreate,
                com.sdj3.protobuf.DataAccess.ReportCreated>(
                  this, METHODID_CREATE_REPORT)))
          .addMethod(
            getGetReportByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReportById,
                com.sdj3.protobuf.DataAccess.Report>(
                  this, METHODID_GET_REPORT_BY_ID)))
          .addMethod(
            getDeleteReportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReportToDelete,
                com.sdj3.protobuf.DataAccess.ReportDeleted>(
                  this, METHODID_DELETE_REPORT)))
          .addMethod(
            getGetListOfReportsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.Empty,
                com.sdj3.protobuf.DataAccess.ListOfReports>(
                  this, METHODID_GET_LIST_OF_REPORTS)))
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

    /**
     * <pre>
     *city
     * </pre>
     */
    public void createCity(com.sdj3.protobuf.DataAccess.CityToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CityCreated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCitByyname(com.sdj3.protobuf.DataAccess.CityByName request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.City> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCitByynameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCityById(com.sdj3.protobuf.DataAccess.CityById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.City> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCityByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createHotel(com.sdj3.protobuf.DataAccess.HotelToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.HotelCreated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateHotelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHotelByName(com.sdj3.protobuf.DataAccess.HotelByName request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Hotel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHotelByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHotelById(com.sdj3.protobuf.DataAccess.HotelById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Hotel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHotelByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateHotelName(com.sdj3.protobuf.DataAccess.HotelNameToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.HotelNameUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHotelNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateHotelDescription(com.sdj3.protobuf.DataAccess.HotelDescriptionToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.HotelDescriptionUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHotelDescriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteHotel(com.sdj3.protobuf.DataAccess.HotelToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.HotelDeleted> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteHotelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListOfHotels(com.sdj3.protobuf.DataAccess.CitysIdFoHotelList request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfHotels> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetListOfHotelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createMuseum(com.sdj3.protobuf.DataAccess.MuseumToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.MuseumCreated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMuseumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMuseumByName(com.sdj3.protobuf.DataAccess.MuseumByName request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Museum> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMuseumByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMuseumById(com.sdj3.protobuf.DataAccess.MuseumById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Museum> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMuseumByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMuseumName(com.sdj3.protobuf.DataAccess.MuseumNameToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.MuseumNameUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMuseumNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMuseumDescription(com.sdj3.protobuf.DataAccess.MuseumDescriptionToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.MuseumDescriptionUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMuseumDescriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMuseum(com.sdj3.protobuf.DataAccess.MuseumToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.MuseumDeleted> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMuseumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListOfMuseums(com.sdj3.protobuf.DataAccess.CitysIdForMuseumList request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfMuseums> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetListOfMuseumsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPark(com.sdj3.protobuf.DataAccess.ParkToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ParkCreated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateParkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getParkByName(com.sdj3.protobuf.DataAccess.ParkByName request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Park> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetParkByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getParkById(com.sdj3.protobuf.DataAccess.ParkById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Park> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetParkByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateParkName(com.sdj3.protobuf.DataAccess.ParkNameToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ParkNameUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParkNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateParkDescription(com.sdj3.protobuf.DataAccess.ParkDescriptionToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ParkDescriptionUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParkDescriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePark(com.sdj3.protobuf.DataAccess.ParkToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ParkDeleted> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteParkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListOfParks(com.sdj3.protobuf.DataAccess.CitysIdForParkList request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfParks> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetListOfParksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRestaurant(com.sdj3.protobuf.DataAccess.RestaurantToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.RestaurantCreated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRestaurantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRestaurantByName(com.sdj3.protobuf.DataAccess.RestaurantByName request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Restaurant> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRestaurantByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRestaurantById(com.sdj3.protobuf.DataAccess.RestaurantById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Restaurant> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRestaurantByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRestaurantName(com.sdj3.protobuf.DataAccess.RestaurantNameToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.RestaurantNameUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRestaurantNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRestaurantDescription(com.sdj3.protobuf.DataAccess.RestaurantDescriptionToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.RestaurantDescriptionUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRestaurantDescriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRestaurant(com.sdj3.protobuf.DataAccess.RestaurantToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.RestaurantDeleted> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRestaurantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListOfRestaurant(com.sdj3.protobuf.DataAccess.CitysIdForRestaurantList request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfRestaurants> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetListOfRestaurantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createReview(com.sdj3.protobuf.DataAccess.ReviewToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCreated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReviewById(com.sdj3.protobuf.DataAccess.ReviewById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Review> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReviewByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateReviewComment(com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateReviewCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateStarReview(com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStarReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReview(com.sdj3.protobuf.DataAccess.ReviewToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewDeleted> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListOfReviews(com.sdj3.protobuf.DataAccess.CategoryForReviewList request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReveiewList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetListOfReviewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *ADD THIS EVERYWHERE
     * </pre>
     */
    public void getReviewsContaining(com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReveiewList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReviewsContainingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createReport(com.sdj3.protobuf.DataAccess.ReportToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReportCreated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReportById(com.sdj3.protobuf.DataAccess.ReportById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Report> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReportByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReport(com.sdj3.protobuf.DataAccess.ReportToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReportDeleted> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListOfReports(com.sdj3.protobuf.DataAccess.Empty request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfReports> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetListOfReportsMethod(), getCallOptions()), request, responseObserver);
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

    /**
     * <pre>
     *city
     * </pre>
     */
    public com.sdj3.protobuf.DataAccess.CityCreated createCity(com.sdj3.protobuf.DataAccess.CityToCreate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.City getCitByyname(com.sdj3.protobuf.DataAccess.CityByName request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCitByynameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.City getCityById(com.sdj3.protobuf.DataAccess.CityById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCityByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.HotelCreated createHotel(com.sdj3.protobuf.DataAccess.HotelToCreate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateHotelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.Hotel getHotelByName(com.sdj3.protobuf.DataAccess.HotelByName request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHotelByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.Hotel getHotelById(com.sdj3.protobuf.DataAccess.HotelById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHotelByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.HotelNameUpdated updateHotelName(com.sdj3.protobuf.DataAccess.HotelNameToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHotelNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.HotelDescriptionUpdated updateHotelDescription(com.sdj3.protobuf.DataAccess.HotelDescriptionToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHotelDescriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.HotelDeleted deleteHotel(com.sdj3.protobuf.DataAccess.HotelToDelete request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHotelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ListOfHotels getListOfHotels(com.sdj3.protobuf.DataAccess.CitysIdFoHotelList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetListOfHotelsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.MuseumCreated createMuseum(com.sdj3.protobuf.DataAccess.MuseumToCreate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMuseumMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.Museum getMuseumByName(com.sdj3.protobuf.DataAccess.MuseumByName request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMuseumByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.Museum getMuseumById(com.sdj3.protobuf.DataAccess.MuseumById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMuseumByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.MuseumNameUpdated updateMuseumName(com.sdj3.protobuf.DataAccess.MuseumNameToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMuseumNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.MuseumDescriptionUpdated updateMuseumDescription(com.sdj3.protobuf.DataAccess.MuseumDescriptionToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMuseumDescriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.MuseumDeleted deleteMuseum(com.sdj3.protobuf.DataAccess.MuseumToDelete request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMuseumMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ListOfMuseums getListOfMuseums(com.sdj3.protobuf.DataAccess.CitysIdForMuseumList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetListOfMuseumsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ParkCreated createPark(com.sdj3.protobuf.DataAccess.ParkToCreate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateParkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.Park getParkByName(com.sdj3.protobuf.DataAccess.ParkByName request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetParkByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.Park getParkById(com.sdj3.protobuf.DataAccess.ParkById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetParkByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ParkNameUpdated updateParkName(com.sdj3.protobuf.DataAccess.ParkNameToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParkNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ParkDescriptionUpdated updateParkDescription(com.sdj3.protobuf.DataAccess.ParkDescriptionToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParkDescriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ParkDeleted deletePark(com.sdj3.protobuf.DataAccess.ParkToDelete request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteParkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ListOfParks getListOfParks(com.sdj3.protobuf.DataAccess.CitysIdForParkList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetListOfParksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.RestaurantCreated createRestaurant(com.sdj3.protobuf.DataAccess.RestaurantToCreate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRestaurantMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.Restaurant getRestaurantByName(com.sdj3.protobuf.DataAccess.RestaurantByName request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRestaurantByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.Restaurant getRestaurantById(com.sdj3.protobuf.DataAccess.RestaurantById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRestaurantByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.RestaurantNameUpdated updateRestaurantName(com.sdj3.protobuf.DataAccess.RestaurantNameToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRestaurantNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.RestaurantDescriptionUpdated updateRestaurantDescription(com.sdj3.protobuf.DataAccess.RestaurantDescriptionToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRestaurantDescriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.RestaurantDeleted deleteRestaurant(com.sdj3.protobuf.DataAccess.RestaurantToDelete request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRestaurantMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ListOfRestaurants getListOfRestaurant(com.sdj3.protobuf.DataAccess.CitysIdForRestaurantList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetListOfRestaurantMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewCreated createReview(com.sdj3.protobuf.DataAccess.ReviewToCreate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.Review getReviewById(com.sdj3.protobuf.DataAccess.ReviewById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReviewByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewCommentUpdated updateReviewComment(com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateReviewCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated updateStarReview(com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStarReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewDeleted deleteReview(com.sdj3.protobuf.DataAccess.ReviewToDelete request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReveiewList getListOfReviews(com.sdj3.protobuf.DataAccess.CategoryForReviewList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetListOfReviewsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *ADD THIS EVERYWHERE
     * </pre>
     */
    public com.sdj3.protobuf.DataAccess.ReveiewList getReviewsContaining(com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReviewsContainingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReportCreated createReport(com.sdj3.protobuf.DataAccess.ReportToCreate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateReportMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.Report getReportById(com.sdj3.protobuf.DataAccess.ReportById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReportByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReportDeleted deleteReport(com.sdj3.protobuf.DataAccess.ReportToDelete request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteReportMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ListOfReports getListOfReports(com.sdj3.protobuf.DataAccess.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetListOfReportsMethod(), getCallOptions(), request);
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

    /**
     * <pre>
     *city
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.CityCreated> createCity(
        com.sdj3.protobuf.DataAccess.CityToCreate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.City> getCitByyname(
        com.sdj3.protobuf.DataAccess.CityByName request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCitByynameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.City> getCityById(
        com.sdj3.protobuf.DataAccess.CityById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCityByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.HotelCreated> createHotel(
        com.sdj3.protobuf.DataAccess.HotelToCreate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateHotelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.Hotel> getHotelByName(
        com.sdj3.protobuf.DataAccess.HotelByName request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHotelByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.Hotel> getHotelById(
        com.sdj3.protobuf.DataAccess.HotelById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHotelByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.HotelNameUpdated> updateHotelName(
        com.sdj3.protobuf.DataAccess.HotelNameToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHotelNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.HotelDescriptionUpdated> updateHotelDescription(
        com.sdj3.protobuf.DataAccess.HotelDescriptionToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHotelDescriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.HotelDeleted> deleteHotel(
        com.sdj3.protobuf.DataAccess.HotelToDelete request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteHotelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ListOfHotels> getListOfHotels(
        com.sdj3.protobuf.DataAccess.CitysIdFoHotelList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetListOfHotelsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.MuseumCreated> createMuseum(
        com.sdj3.protobuf.DataAccess.MuseumToCreate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMuseumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.Museum> getMuseumByName(
        com.sdj3.protobuf.DataAccess.MuseumByName request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMuseumByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.Museum> getMuseumById(
        com.sdj3.protobuf.DataAccess.MuseumById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMuseumByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.MuseumNameUpdated> updateMuseumName(
        com.sdj3.protobuf.DataAccess.MuseumNameToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMuseumNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.MuseumDescriptionUpdated> updateMuseumDescription(
        com.sdj3.protobuf.DataAccess.MuseumDescriptionToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMuseumDescriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.MuseumDeleted> deleteMuseum(
        com.sdj3.protobuf.DataAccess.MuseumToDelete request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMuseumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ListOfMuseums> getListOfMuseums(
        com.sdj3.protobuf.DataAccess.CitysIdForMuseumList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetListOfMuseumsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ParkCreated> createPark(
        com.sdj3.protobuf.DataAccess.ParkToCreate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateParkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.Park> getParkByName(
        com.sdj3.protobuf.DataAccess.ParkByName request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetParkByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.Park> getParkById(
        com.sdj3.protobuf.DataAccess.ParkById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetParkByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ParkNameUpdated> updateParkName(
        com.sdj3.protobuf.DataAccess.ParkNameToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParkNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ParkDescriptionUpdated> updateParkDescription(
        com.sdj3.protobuf.DataAccess.ParkDescriptionToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParkDescriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ParkDeleted> deletePark(
        com.sdj3.protobuf.DataAccess.ParkToDelete request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteParkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ListOfParks> getListOfParks(
        com.sdj3.protobuf.DataAccess.CitysIdForParkList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetListOfParksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.RestaurantCreated> createRestaurant(
        com.sdj3.protobuf.DataAccess.RestaurantToCreate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRestaurantMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.Restaurant> getRestaurantByName(
        com.sdj3.protobuf.DataAccess.RestaurantByName request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRestaurantByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.Restaurant> getRestaurantById(
        com.sdj3.protobuf.DataAccess.RestaurantById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRestaurantByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.RestaurantNameUpdated> updateRestaurantName(
        com.sdj3.protobuf.DataAccess.RestaurantNameToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRestaurantNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.RestaurantDescriptionUpdated> updateRestaurantDescription(
        com.sdj3.protobuf.DataAccess.RestaurantDescriptionToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRestaurantDescriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.RestaurantDeleted> deleteRestaurant(
        com.sdj3.protobuf.DataAccess.RestaurantToDelete request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRestaurantMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ListOfRestaurants> getListOfRestaurant(
        com.sdj3.protobuf.DataAccess.CitysIdForRestaurantList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetListOfRestaurantMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewCreated> createReview(
        com.sdj3.protobuf.DataAccess.ReviewToCreate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.Review> getReviewById(
        com.sdj3.protobuf.DataAccess.ReviewById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReviewByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> updateReviewComment(
        com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateReviewCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> updateStarReview(
        com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStarReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewDeleted> deleteReview(
        com.sdj3.protobuf.DataAccess.ReviewToDelete request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReveiewList> getListOfReviews(
        com.sdj3.protobuf.DataAccess.CategoryForReviewList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetListOfReviewsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *ADD THIS EVERYWHERE
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReveiewList> getReviewsContaining(
        com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReviewsContainingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReportCreated> createReport(
        com.sdj3.protobuf.DataAccess.ReportToCreate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateReportMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.Report> getReportById(
        com.sdj3.protobuf.DataAccess.ReportById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReportByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReportDeleted> deleteReport(
        com.sdj3.protobuf.DataAccess.ReportToDelete request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteReportMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ListOfReports> getListOfReports(
        com.sdj3.protobuf.DataAccess.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetListOfReportsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_GET_BY_USERNAME = 1;
  private static final int METHODID_GET_BY_ID = 2;
  private static final int METHODID_GET_USERS_CONTAINING = 3;
  private static final int METHODID_CREATE_CITY = 4;
  private static final int METHODID_GET_CIT_BYYNAME = 5;
  private static final int METHODID_GET_CITY_BY_ID = 6;
  private static final int METHODID_CREATE_HOTEL = 7;
  private static final int METHODID_GET_HOTEL_BY_NAME = 8;
  private static final int METHODID_GET_HOTEL_BY_ID = 9;
  private static final int METHODID_UPDATE_HOTEL_NAME = 10;
  private static final int METHODID_UPDATE_HOTEL_DESCRIPTION = 11;
  private static final int METHODID_DELETE_HOTEL = 12;
  private static final int METHODID_GET_LIST_OF_HOTELS = 13;
  private static final int METHODID_CREATE_MUSEUM = 14;
  private static final int METHODID_GET_MUSEUM_BY_NAME = 15;
  private static final int METHODID_GET_MUSEUM_BY_ID = 16;
  private static final int METHODID_UPDATE_MUSEUM_NAME = 17;
  private static final int METHODID_UPDATE_MUSEUM_DESCRIPTION = 18;
  private static final int METHODID_DELETE_MUSEUM = 19;
  private static final int METHODID_GET_LIST_OF_MUSEUMS = 20;
  private static final int METHODID_CREATE_PARK = 21;
  private static final int METHODID_GET_PARK_BY_NAME = 22;
  private static final int METHODID_GET_PARK_BY_ID = 23;
  private static final int METHODID_UPDATE_PARK_NAME = 24;
  private static final int METHODID_UPDATE_PARK_DESCRIPTION = 25;
  private static final int METHODID_DELETE_PARK = 26;
  private static final int METHODID_GET_LIST_OF_PARKS = 27;
  private static final int METHODID_CREATE_RESTAURANT = 28;
  private static final int METHODID_GET_RESTAURANT_BY_NAME = 29;
  private static final int METHODID_GET_RESTAURANT_BY_ID = 30;
  private static final int METHODID_UPDATE_RESTAURANT_NAME = 31;
  private static final int METHODID_UPDATE_RESTAURANT_DESCRIPTION = 32;
  private static final int METHODID_DELETE_RESTAURANT = 33;
  private static final int METHODID_GET_LIST_OF_RESTAURANT = 34;
  private static final int METHODID_CREATE_REVIEW = 35;
  private static final int METHODID_GET_REVIEW_BY_ID = 36;
  private static final int METHODID_UPDATE_REVIEW_COMMENT = 37;
  private static final int METHODID_UPDATE_STAR_REVIEW = 38;
  private static final int METHODID_DELETE_REVIEW = 39;
  private static final int METHODID_GET_LIST_OF_REVIEWS = 40;
  private static final int METHODID_GET_REVIEWS_CONTAINING = 41;
  private static final int METHODID_CREATE_REPORT = 42;
  private static final int METHODID_GET_REPORT_BY_ID = 43;
  private static final int METHODID_DELETE_REPORT = 44;
  private static final int METHODID_GET_LIST_OF_REPORTS = 45;

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
        case METHODID_CREATE_CITY:
          serviceImpl.createCity((com.sdj3.protobuf.DataAccess.CityToCreate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CityCreated>) responseObserver);
          break;
        case METHODID_GET_CIT_BYYNAME:
          serviceImpl.getCitByyname((com.sdj3.protobuf.DataAccess.CityByName) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.City>) responseObserver);
          break;
        case METHODID_GET_CITY_BY_ID:
          serviceImpl.getCityById((com.sdj3.protobuf.DataAccess.CityById) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.City>) responseObserver);
          break;
        case METHODID_CREATE_HOTEL:
          serviceImpl.createHotel((com.sdj3.protobuf.DataAccess.HotelToCreate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.HotelCreated>) responseObserver);
          break;
        case METHODID_GET_HOTEL_BY_NAME:
          serviceImpl.getHotelByName((com.sdj3.protobuf.DataAccess.HotelByName) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Hotel>) responseObserver);
          break;
        case METHODID_GET_HOTEL_BY_ID:
          serviceImpl.getHotelById((com.sdj3.protobuf.DataAccess.HotelById) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Hotel>) responseObserver);
          break;
        case METHODID_UPDATE_HOTEL_NAME:
          serviceImpl.updateHotelName((com.sdj3.protobuf.DataAccess.HotelNameToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.HotelNameUpdated>) responseObserver);
          break;
        case METHODID_UPDATE_HOTEL_DESCRIPTION:
          serviceImpl.updateHotelDescription((com.sdj3.protobuf.DataAccess.HotelDescriptionToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.HotelDescriptionUpdated>) responseObserver);
          break;
        case METHODID_DELETE_HOTEL:
          serviceImpl.deleteHotel((com.sdj3.protobuf.DataAccess.HotelToDelete) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.HotelDeleted>) responseObserver);
          break;
        case METHODID_GET_LIST_OF_HOTELS:
          serviceImpl.getListOfHotels((com.sdj3.protobuf.DataAccess.CitysIdFoHotelList) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfHotels>) responseObserver);
          break;
        case METHODID_CREATE_MUSEUM:
          serviceImpl.createMuseum((com.sdj3.protobuf.DataAccess.MuseumToCreate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.MuseumCreated>) responseObserver);
          break;
        case METHODID_GET_MUSEUM_BY_NAME:
          serviceImpl.getMuseumByName((com.sdj3.protobuf.DataAccess.MuseumByName) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Museum>) responseObserver);
          break;
        case METHODID_GET_MUSEUM_BY_ID:
          serviceImpl.getMuseumById((com.sdj3.protobuf.DataAccess.MuseumById) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Museum>) responseObserver);
          break;
        case METHODID_UPDATE_MUSEUM_NAME:
          serviceImpl.updateMuseumName((com.sdj3.protobuf.DataAccess.MuseumNameToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.MuseumNameUpdated>) responseObserver);
          break;
        case METHODID_UPDATE_MUSEUM_DESCRIPTION:
          serviceImpl.updateMuseumDescription((com.sdj3.protobuf.DataAccess.MuseumDescriptionToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.MuseumDescriptionUpdated>) responseObserver);
          break;
        case METHODID_DELETE_MUSEUM:
          serviceImpl.deleteMuseum((com.sdj3.protobuf.DataAccess.MuseumToDelete) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.MuseumDeleted>) responseObserver);
          break;
        case METHODID_GET_LIST_OF_MUSEUMS:
          serviceImpl.getListOfMuseums((com.sdj3.protobuf.DataAccess.CitysIdForMuseumList) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfMuseums>) responseObserver);
          break;
        case METHODID_CREATE_PARK:
          serviceImpl.createPark((com.sdj3.protobuf.DataAccess.ParkToCreate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ParkCreated>) responseObserver);
          break;
        case METHODID_GET_PARK_BY_NAME:
          serviceImpl.getParkByName((com.sdj3.protobuf.DataAccess.ParkByName) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Park>) responseObserver);
          break;
        case METHODID_GET_PARK_BY_ID:
          serviceImpl.getParkById((com.sdj3.protobuf.DataAccess.ParkById) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Park>) responseObserver);
          break;
        case METHODID_UPDATE_PARK_NAME:
          serviceImpl.updateParkName((com.sdj3.protobuf.DataAccess.ParkNameToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ParkNameUpdated>) responseObserver);
          break;
        case METHODID_UPDATE_PARK_DESCRIPTION:
          serviceImpl.updateParkDescription((com.sdj3.protobuf.DataAccess.ParkDescriptionToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ParkDescriptionUpdated>) responseObserver);
          break;
        case METHODID_DELETE_PARK:
          serviceImpl.deletePark((com.sdj3.protobuf.DataAccess.ParkToDelete) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ParkDeleted>) responseObserver);
          break;
        case METHODID_GET_LIST_OF_PARKS:
          serviceImpl.getListOfParks((com.sdj3.protobuf.DataAccess.CitysIdForParkList) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfParks>) responseObserver);
          break;
        case METHODID_CREATE_RESTAURANT:
          serviceImpl.createRestaurant((com.sdj3.protobuf.DataAccess.RestaurantToCreate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.RestaurantCreated>) responseObserver);
          break;
        case METHODID_GET_RESTAURANT_BY_NAME:
          serviceImpl.getRestaurantByName((com.sdj3.protobuf.DataAccess.RestaurantByName) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Restaurant>) responseObserver);
          break;
        case METHODID_GET_RESTAURANT_BY_ID:
          serviceImpl.getRestaurantById((com.sdj3.protobuf.DataAccess.RestaurantById) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Restaurant>) responseObserver);
          break;
        case METHODID_UPDATE_RESTAURANT_NAME:
          serviceImpl.updateRestaurantName((com.sdj3.protobuf.DataAccess.RestaurantNameToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.RestaurantNameUpdated>) responseObserver);
          break;
        case METHODID_UPDATE_RESTAURANT_DESCRIPTION:
          serviceImpl.updateRestaurantDescription((com.sdj3.protobuf.DataAccess.RestaurantDescriptionToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.RestaurantDescriptionUpdated>) responseObserver);
          break;
        case METHODID_DELETE_RESTAURANT:
          serviceImpl.deleteRestaurant((com.sdj3.protobuf.DataAccess.RestaurantToDelete) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.RestaurantDeleted>) responseObserver);
          break;
        case METHODID_GET_LIST_OF_RESTAURANT:
          serviceImpl.getListOfRestaurant((com.sdj3.protobuf.DataAccess.CitysIdForRestaurantList) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfRestaurants>) responseObserver);
          break;
        case METHODID_CREATE_REVIEW:
          serviceImpl.createReview((com.sdj3.protobuf.DataAccess.ReviewToCreate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCreated>) responseObserver);
          break;
        case METHODID_GET_REVIEW_BY_ID:
          serviceImpl.getReviewById((com.sdj3.protobuf.DataAccess.ReviewById) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Review>) responseObserver);
          break;
        case METHODID_UPDATE_REVIEW_COMMENT:
          serviceImpl.updateReviewComment((com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated>) responseObserver);
          break;
        case METHODID_UPDATE_STAR_REVIEW:
          serviceImpl.updateStarReview((com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated>) responseObserver);
          break;
        case METHODID_DELETE_REVIEW:
          serviceImpl.deleteReview((com.sdj3.protobuf.DataAccess.ReviewToDelete) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewDeleted>) responseObserver);
          break;
        case METHODID_GET_LIST_OF_REVIEWS:
          serviceImpl.getListOfReviews((com.sdj3.protobuf.DataAccess.CategoryForReviewList) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReveiewList>) responseObserver);
          break;
        case METHODID_GET_REVIEWS_CONTAINING:
          serviceImpl.getReviewsContaining((com.sdj3.protobuf.DataAccess.SearchReviewPeremetars) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReveiewList>) responseObserver);
          break;
        case METHODID_CREATE_REPORT:
          serviceImpl.createReport((com.sdj3.protobuf.DataAccess.ReportToCreate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReportCreated>) responseObserver);
          break;
        case METHODID_GET_REPORT_BY_ID:
          serviceImpl.getReportById((com.sdj3.protobuf.DataAccess.ReportById) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Report>) responseObserver);
          break;
        case METHODID_DELETE_REPORT:
          serviceImpl.deleteReport((com.sdj3.protobuf.DataAccess.ReportToDelete) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReportDeleted>) responseObserver);
          break;
        case METHODID_GET_LIST_OF_REPORTS:
          serviceImpl.getListOfReports((com.sdj3.protobuf.DataAccess.Empty) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfReports>) responseObserver);
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
              .addMethod(getCreateCityMethod())
              .addMethod(getGetCitByynameMethod())
              .addMethod(getGetCityByIdMethod())
              .addMethod(getCreateHotelMethod())
              .addMethod(getGetHotelByNameMethod())
              .addMethod(getGetHotelByIdMethod())
              .addMethod(getUpdateHotelNameMethod())
              .addMethod(getUpdateHotelDescriptionMethod())
              .addMethod(getDeleteHotelMethod())
              .addMethod(getGetListOfHotelsMethod())
              .addMethod(getCreateMuseumMethod())
              .addMethod(getGetMuseumByNameMethod())
              .addMethod(getGetMuseumByIdMethod())
              .addMethod(getUpdateMuseumNameMethod())
              .addMethod(getUpdateMuseumDescriptionMethod())
              .addMethod(getDeleteMuseumMethod())
              .addMethod(getGetListOfMuseumsMethod())
              .addMethod(getCreateParkMethod())
              .addMethod(getGetParkByNameMethod())
              .addMethod(getGetParkByIdMethod())
              .addMethod(getUpdateParkNameMethod())
              .addMethod(getUpdateParkDescriptionMethod())
              .addMethod(getDeleteParkMethod())
              .addMethod(getGetListOfParksMethod())
              .addMethod(getCreateRestaurantMethod())
              .addMethod(getGetRestaurantByNameMethod())
              .addMethod(getGetRestaurantByIdMethod())
              .addMethod(getUpdateRestaurantNameMethod())
              .addMethod(getUpdateRestaurantDescriptionMethod())
              .addMethod(getDeleteRestaurantMethod())
              .addMethod(getGetListOfRestaurantMethod())
              .addMethod(getCreateReviewMethod())
              .addMethod(getGetReviewByIdMethod())
              .addMethod(getUpdateReviewCommentMethod())
              .addMethod(getUpdateStarReviewMethod())
              .addMethod(getDeleteReviewMethod())
              .addMethod(getGetListOfReviewsMethod())
              .addMethod(getGetReviewsContainingMethod())
              .addMethod(getCreateReportMethod())
              .addMethod(getGetReportByIdMethod())
              .addMethod(getDeleteReportMethod())
              .addMethod(getGetListOfReportsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
