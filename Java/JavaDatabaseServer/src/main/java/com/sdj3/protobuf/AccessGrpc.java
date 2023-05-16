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

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToCreate,
      com.sdj3.protobuf.DataAccess.CategoryCreated> getCreateHotelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateHotel",
      requestType = com.sdj3.protobuf.DataAccess.CategoryToCreate.class,
      responseType = com.sdj3.protobuf.DataAccess.CategoryCreated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToCreate,
      com.sdj3.protobuf.DataAccess.CategoryCreated> getCreateHotelMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToCreate, com.sdj3.protobuf.DataAccess.CategoryCreated> getCreateHotelMethod;
    if ((getCreateHotelMethod = AccessGrpc.getCreateHotelMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getCreateHotelMethod = AccessGrpc.getCreateHotelMethod) == null) {
          AccessGrpc.getCreateHotelMethod = getCreateHotelMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryToCreate, com.sdj3.protobuf.DataAccess.CategoryCreated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateHotel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryToCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryCreated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("CreateHotel"))
              .build();
        }
      }
    }
    return getCreateHotelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryById,
      com.sdj3.protobuf.DataAccess.Category> getGetHotelByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHotelById",
      requestType = com.sdj3.protobuf.DataAccess.CategoryById.class,
      responseType = com.sdj3.protobuf.DataAccess.Category.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryById,
      com.sdj3.protobuf.DataAccess.Category> getGetHotelByIdMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryById, com.sdj3.protobuf.DataAccess.Category> getGetHotelByIdMethod;
    if ((getGetHotelByIdMethod = AccessGrpc.getGetHotelByIdMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetHotelByIdMethod = AccessGrpc.getGetHotelByIdMethod) == null) {
          AccessGrpc.getGetHotelByIdMethod = getGetHotelByIdMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryById, com.sdj3.protobuf.DataAccess.Category>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHotelById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Category.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetHotelById"))
              .build();
        }
      }
    }
    return getGetHotelByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryNameToUpdate,
      com.sdj3.protobuf.DataAccess.CategoryNameUpdated> getUpdateHotelNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHotelName",
      requestType = com.sdj3.protobuf.DataAccess.CategoryNameToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.CategoryNameUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryNameToUpdate,
      com.sdj3.protobuf.DataAccess.CategoryNameUpdated> getUpdateHotelNameMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryNameToUpdate, com.sdj3.protobuf.DataAccess.CategoryNameUpdated> getUpdateHotelNameMethod;
    if ((getUpdateHotelNameMethod = AccessGrpc.getUpdateHotelNameMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateHotelNameMethod = AccessGrpc.getUpdateHotelNameMethod) == null) {
          AccessGrpc.getUpdateHotelNameMethod = getUpdateHotelNameMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryNameToUpdate, com.sdj3.protobuf.DataAccess.CategoryNameUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHotelName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryNameToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryNameUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateHotelName"))
              .build();
        }
      }
    }
    return getUpdateHotelNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate,
      com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> getUpdateHotelDescriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHotelDescription",
      requestType = com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate,
      com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> getUpdateHotelDescriptionMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate, com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> getUpdateHotelDescriptionMethod;
    if ((getUpdateHotelDescriptionMethod = AccessGrpc.getUpdateHotelDescriptionMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateHotelDescriptionMethod = AccessGrpc.getUpdateHotelDescriptionMethod) == null) {
          AccessGrpc.getUpdateHotelDescriptionMethod = getUpdateHotelDescriptionMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate, com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHotelDescription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateHotelDescription"))
              .build();
        }
      }
    }
    return getUpdateHotelDescriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToDelete,
      com.sdj3.protobuf.DataAccess.CategoryDeleted> getDeleteHotelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHotel",
      requestType = com.sdj3.protobuf.DataAccess.CategoryToDelete.class,
      responseType = com.sdj3.protobuf.DataAccess.CategoryDeleted.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToDelete,
      com.sdj3.protobuf.DataAccess.CategoryDeleted> getDeleteHotelMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToDelete, com.sdj3.protobuf.DataAccess.CategoryDeleted> getDeleteHotelMethod;
    if ((getDeleteHotelMethod = AccessGrpc.getDeleteHotelMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getDeleteHotelMethod = AccessGrpc.getDeleteHotelMethod) == null) {
          AccessGrpc.getDeleteHotelMethod = getDeleteHotelMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryToDelete, com.sdj3.protobuf.DataAccess.CategoryDeleted>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHotel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryToDelete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryDeleted.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("DeleteHotel"))
              .build();
        }
      }
    }
    return getDeleteHotelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForCategoryList,
      com.sdj3.protobuf.DataAccess.ListOfACategory> getGetListOfHotelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetListOfHotels",
      requestType = com.sdj3.protobuf.DataAccess.CitysIdForCategoryList.class,
      responseType = com.sdj3.protobuf.DataAccess.ListOfACategory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForCategoryList,
      com.sdj3.protobuf.DataAccess.ListOfACategory> getGetListOfHotelsMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForCategoryList, com.sdj3.protobuf.DataAccess.ListOfACategory> getGetListOfHotelsMethod;
    if ((getGetListOfHotelsMethod = AccessGrpc.getGetListOfHotelsMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetListOfHotelsMethod = AccessGrpc.getGetListOfHotelsMethod) == null) {
          AccessGrpc.getGetListOfHotelsMethod = getGetListOfHotelsMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CitysIdForCategoryList, com.sdj3.protobuf.DataAccess.ListOfACategory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetListOfHotels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CitysIdForCategoryList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ListOfACategory.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetListOfHotels"))
              .build();
        }
      }
    }
    return getGetListOfHotelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToCreate,
      com.sdj3.protobuf.DataAccess.ReviewCreated> getCreateHotelsReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateHotelsReview",
      requestType = com.sdj3.protobuf.DataAccess.ReviewToCreate.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewCreated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToCreate,
      com.sdj3.protobuf.DataAccess.ReviewCreated> getCreateHotelsReviewMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToCreate, com.sdj3.protobuf.DataAccess.ReviewCreated> getCreateHotelsReviewMethod;
    if ((getCreateHotelsReviewMethod = AccessGrpc.getCreateHotelsReviewMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getCreateHotelsReviewMethod = AccessGrpc.getCreateHotelsReviewMethod) == null) {
          AccessGrpc.getCreateHotelsReviewMethod = getCreateHotelsReviewMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewToCreate, com.sdj3.protobuf.DataAccess.ReviewCreated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateHotelsReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewToCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewCreated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("CreateHotelsReview"))
              .build();
        }
      }
    }
    return getCreateHotelsReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewById,
      com.sdj3.protobuf.DataAccess.Review> getGetHotelsReviewByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHotelsReviewById",
      requestType = com.sdj3.protobuf.DataAccess.ReviewById.class,
      responseType = com.sdj3.protobuf.DataAccess.Review.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewById,
      com.sdj3.protobuf.DataAccess.Review> getGetHotelsReviewByIdMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewById, com.sdj3.protobuf.DataAccess.Review> getGetHotelsReviewByIdMethod;
    if ((getGetHotelsReviewByIdMethod = AccessGrpc.getGetHotelsReviewByIdMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetHotelsReviewByIdMethod = AccessGrpc.getGetHotelsReviewByIdMethod) == null) {
          AccessGrpc.getGetHotelsReviewByIdMethod = getGetHotelsReviewByIdMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewById, com.sdj3.protobuf.DataAccess.Review>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHotelsReviewById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Review.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetHotelsReviewById"))
              .build();
        }
      }
    }
    return getGetHotelsReviewByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> getUpdateHotelsReviewCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHotelsReviewComment",
      requestType = com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewCommentUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> getUpdateHotelsReviewCommentMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate, com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> getUpdateHotelsReviewCommentMethod;
    if ((getUpdateHotelsReviewCommentMethod = AccessGrpc.getUpdateHotelsReviewCommentMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateHotelsReviewCommentMethod = AccessGrpc.getUpdateHotelsReviewCommentMethod) == null) {
          AccessGrpc.getUpdateHotelsReviewCommentMethod = getUpdateHotelsReviewCommentMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate, com.sdj3.protobuf.DataAccess.ReviewCommentUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHotelsReviewComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewCommentUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateHotelsReviewComment"))
              .build();
        }
      }
    }
    return getUpdateHotelsReviewCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> getUpdateHotelsStarReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHotelsStarReview",
      requestType = com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> getUpdateHotelsStarReviewMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate, com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> getUpdateHotelsStarReviewMethod;
    if ((getUpdateHotelsStarReviewMethod = AccessGrpc.getUpdateHotelsStarReviewMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateHotelsStarReviewMethod = AccessGrpc.getUpdateHotelsStarReviewMethod) == null) {
          AccessGrpc.getUpdateHotelsStarReviewMethod = getUpdateHotelsStarReviewMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate, com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHotelsStarReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateHotelsStarReview"))
              .build();
        }
      }
    }
    return getUpdateHotelsStarReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToDelete,
      com.sdj3.protobuf.DataAccess.ReviewDeleted> getDeleteHotelReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHotelReview",
      requestType = com.sdj3.protobuf.DataAccess.ReviewToDelete.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewDeleted.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToDelete,
      com.sdj3.protobuf.DataAccess.ReviewDeleted> getDeleteHotelReviewMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToDelete, com.sdj3.protobuf.DataAccess.ReviewDeleted> getDeleteHotelReviewMethod;
    if ((getDeleteHotelReviewMethod = AccessGrpc.getDeleteHotelReviewMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getDeleteHotelReviewMethod = AccessGrpc.getDeleteHotelReviewMethod) == null) {
          AccessGrpc.getDeleteHotelReviewMethod = getDeleteHotelReviewMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewToDelete, com.sdj3.protobuf.DataAccess.ReviewDeleted>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHotelReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewToDelete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewDeleted.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("DeleteHotelReview"))
              .build();
        }
      }
    }
    return getDeleteHotelReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars,
      com.sdj3.protobuf.DataAccess.ReveiewList> getGetHotelReviewsContainingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHotelReviewsContaining",
      requestType = com.sdj3.protobuf.DataAccess.SearchReviewPeremetars.class,
      responseType = com.sdj3.protobuf.DataAccess.ReveiewList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars,
      com.sdj3.protobuf.DataAccess.ReveiewList> getGetHotelReviewsContainingMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars, com.sdj3.protobuf.DataAccess.ReveiewList> getGetHotelReviewsContainingMethod;
    if ((getGetHotelReviewsContainingMethod = AccessGrpc.getGetHotelReviewsContainingMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetHotelReviewsContainingMethod = AccessGrpc.getGetHotelReviewsContainingMethod) == null) {
          AccessGrpc.getGetHotelReviewsContainingMethod = getGetHotelReviewsContainingMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars, com.sdj3.protobuf.DataAccess.ReveiewList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHotelReviewsContaining"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.SearchReviewPeremetars.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReveiewList.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetHotelReviewsContaining"))
              .build();
        }
      }
    }
    return getGetHotelReviewsContainingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToCreate,
      com.sdj3.protobuf.DataAccess.CategoryCreated> getCreateMuseumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMuseum",
      requestType = com.sdj3.protobuf.DataAccess.CategoryToCreate.class,
      responseType = com.sdj3.protobuf.DataAccess.CategoryCreated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToCreate,
      com.sdj3.protobuf.DataAccess.CategoryCreated> getCreateMuseumMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToCreate, com.sdj3.protobuf.DataAccess.CategoryCreated> getCreateMuseumMethod;
    if ((getCreateMuseumMethod = AccessGrpc.getCreateMuseumMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getCreateMuseumMethod = AccessGrpc.getCreateMuseumMethod) == null) {
          AccessGrpc.getCreateMuseumMethod = getCreateMuseumMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryToCreate, com.sdj3.protobuf.DataAccess.CategoryCreated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMuseum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryToCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryCreated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("CreateMuseum"))
              .build();
        }
      }
    }
    return getCreateMuseumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryById,
      com.sdj3.protobuf.DataAccess.Category> getGetMuseumByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMuseumById",
      requestType = com.sdj3.protobuf.DataAccess.CategoryById.class,
      responseType = com.sdj3.protobuf.DataAccess.Category.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryById,
      com.sdj3.protobuf.DataAccess.Category> getGetMuseumByIdMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryById, com.sdj3.protobuf.DataAccess.Category> getGetMuseumByIdMethod;
    if ((getGetMuseumByIdMethod = AccessGrpc.getGetMuseumByIdMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetMuseumByIdMethod = AccessGrpc.getGetMuseumByIdMethod) == null) {
          AccessGrpc.getGetMuseumByIdMethod = getGetMuseumByIdMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryById, com.sdj3.protobuf.DataAccess.Category>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMuseumById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Category.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetMuseumById"))
              .build();
        }
      }
    }
    return getGetMuseumByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryNameToUpdate,
      com.sdj3.protobuf.DataAccess.CategoryNameUpdated> getUpdateMuseumNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMuseumName",
      requestType = com.sdj3.protobuf.DataAccess.CategoryNameToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.CategoryNameUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryNameToUpdate,
      com.sdj3.protobuf.DataAccess.CategoryNameUpdated> getUpdateMuseumNameMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryNameToUpdate, com.sdj3.protobuf.DataAccess.CategoryNameUpdated> getUpdateMuseumNameMethod;
    if ((getUpdateMuseumNameMethod = AccessGrpc.getUpdateMuseumNameMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateMuseumNameMethod = AccessGrpc.getUpdateMuseumNameMethod) == null) {
          AccessGrpc.getUpdateMuseumNameMethod = getUpdateMuseumNameMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryNameToUpdate, com.sdj3.protobuf.DataAccess.CategoryNameUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMuseumName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryNameToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryNameUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateMuseumName"))
              .build();
        }
      }
    }
    return getUpdateMuseumNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate,
      com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> getUpdateMuseumDescriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMuseumDescription",
      requestType = com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate,
      com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> getUpdateMuseumDescriptionMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate, com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> getUpdateMuseumDescriptionMethod;
    if ((getUpdateMuseumDescriptionMethod = AccessGrpc.getUpdateMuseumDescriptionMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateMuseumDescriptionMethod = AccessGrpc.getUpdateMuseumDescriptionMethod) == null) {
          AccessGrpc.getUpdateMuseumDescriptionMethod = getUpdateMuseumDescriptionMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate, com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMuseumDescription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateMuseumDescription"))
              .build();
        }
      }
    }
    return getUpdateMuseumDescriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToDelete,
      com.sdj3.protobuf.DataAccess.CategoryDeleted> getDeleteMuseumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMuseum",
      requestType = com.sdj3.protobuf.DataAccess.CategoryToDelete.class,
      responseType = com.sdj3.protobuf.DataAccess.CategoryDeleted.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToDelete,
      com.sdj3.protobuf.DataAccess.CategoryDeleted> getDeleteMuseumMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToDelete, com.sdj3.protobuf.DataAccess.CategoryDeleted> getDeleteMuseumMethod;
    if ((getDeleteMuseumMethod = AccessGrpc.getDeleteMuseumMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getDeleteMuseumMethod = AccessGrpc.getDeleteMuseumMethod) == null) {
          AccessGrpc.getDeleteMuseumMethod = getDeleteMuseumMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryToDelete, com.sdj3.protobuf.DataAccess.CategoryDeleted>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMuseum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryToDelete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryDeleted.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("DeleteMuseum"))
              .build();
        }
      }
    }
    return getDeleteMuseumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForCategoryList,
      com.sdj3.protobuf.DataAccess.ListOfACategory> getGetListOfMuseumsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetListOfMuseums",
      requestType = com.sdj3.protobuf.DataAccess.CitysIdForCategoryList.class,
      responseType = com.sdj3.protobuf.DataAccess.ListOfACategory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForCategoryList,
      com.sdj3.protobuf.DataAccess.ListOfACategory> getGetListOfMuseumsMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForCategoryList, com.sdj3.protobuf.DataAccess.ListOfACategory> getGetListOfMuseumsMethod;
    if ((getGetListOfMuseumsMethod = AccessGrpc.getGetListOfMuseumsMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetListOfMuseumsMethod = AccessGrpc.getGetListOfMuseumsMethod) == null) {
          AccessGrpc.getGetListOfMuseumsMethod = getGetListOfMuseumsMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CitysIdForCategoryList, com.sdj3.protobuf.DataAccess.ListOfACategory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetListOfMuseums"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CitysIdForCategoryList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ListOfACategory.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetListOfMuseums"))
              .build();
        }
      }
    }
    return getGetListOfMuseumsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToCreate,
      com.sdj3.protobuf.DataAccess.ReviewCreated> getCreateMuseumsReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMuseumsReview",
      requestType = com.sdj3.protobuf.DataAccess.ReviewToCreate.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewCreated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToCreate,
      com.sdj3.protobuf.DataAccess.ReviewCreated> getCreateMuseumsReviewMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToCreate, com.sdj3.protobuf.DataAccess.ReviewCreated> getCreateMuseumsReviewMethod;
    if ((getCreateMuseumsReviewMethod = AccessGrpc.getCreateMuseumsReviewMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getCreateMuseumsReviewMethod = AccessGrpc.getCreateMuseumsReviewMethod) == null) {
          AccessGrpc.getCreateMuseumsReviewMethod = getCreateMuseumsReviewMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewToCreate, com.sdj3.protobuf.DataAccess.ReviewCreated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMuseumsReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewToCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewCreated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("CreateMuseumsReview"))
              .build();
        }
      }
    }
    return getCreateMuseumsReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewById,
      com.sdj3.protobuf.DataAccess.Review> getGetMuseumsReviewByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMuseumsReviewById",
      requestType = com.sdj3.protobuf.DataAccess.ReviewById.class,
      responseType = com.sdj3.protobuf.DataAccess.Review.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewById,
      com.sdj3.protobuf.DataAccess.Review> getGetMuseumsReviewByIdMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewById, com.sdj3.protobuf.DataAccess.Review> getGetMuseumsReviewByIdMethod;
    if ((getGetMuseumsReviewByIdMethod = AccessGrpc.getGetMuseumsReviewByIdMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetMuseumsReviewByIdMethod = AccessGrpc.getGetMuseumsReviewByIdMethod) == null) {
          AccessGrpc.getGetMuseumsReviewByIdMethod = getGetMuseumsReviewByIdMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewById, com.sdj3.protobuf.DataAccess.Review>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMuseumsReviewById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Review.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetMuseumsReviewById"))
              .build();
        }
      }
    }
    return getGetMuseumsReviewByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> getUpdateMuseumsReviewCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMuseumsReviewComment",
      requestType = com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewCommentUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> getUpdateMuseumsReviewCommentMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate, com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> getUpdateMuseumsReviewCommentMethod;
    if ((getUpdateMuseumsReviewCommentMethod = AccessGrpc.getUpdateMuseumsReviewCommentMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateMuseumsReviewCommentMethod = AccessGrpc.getUpdateMuseumsReviewCommentMethod) == null) {
          AccessGrpc.getUpdateMuseumsReviewCommentMethod = getUpdateMuseumsReviewCommentMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate, com.sdj3.protobuf.DataAccess.ReviewCommentUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMuseumsReviewComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewCommentUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateMuseumsReviewComment"))
              .build();
        }
      }
    }
    return getUpdateMuseumsReviewCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> getUpdateMuseumsStarReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMuseumsStarReview",
      requestType = com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> getUpdateMuseumsStarReviewMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate, com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> getUpdateMuseumsStarReviewMethod;
    if ((getUpdateMuseumsStarReviewMethod = AccessGrpc.getUpdateMuseumsStarReviewMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateMuseumsStarReviewMethod = AccessGrpc.getUpdateMuseumsStarReviewMethod) == null) {
          AccessGrpc.getUpdateMuseumsStarReviewMethod = getUpdateMuseumsStarReviewMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate, com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMuseumsStarReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateMuseumsStarReview"))
              .build();
        }
      }
    }
    return getUpdateMuseumsStarReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToDelete,
      com.sdj3.protobuf.DataAccess.ReviewDeleted> getDeleteMuseumsReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMuseumsReview",
      requestType = com.sdj3.protobuf.DataAccess.ReviewToDelete.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewDeleted.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToDelete,
      com.sdj3.protobuf.DataAccess.ReviewDeleted> getDeleteMuseumsReviewMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToDelete, com.sdj3.protobuf.DataAccess.ReviewDeleted> getDeleteMuseumsReviewMethod;
    if ((getDeleteMuseumsReviewMethod = AccessGrpc.getDeleteMuseumsReviewMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getDeleteMuseumsReviewMethod = AccessGrpc.getDeleteMuseumsReviewMethod) == null) {
          AccessGrpc.getDeleteMuseumsReviewMethod = getDeleteMuseumsReviewMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewToDelete, com.sdj3.protobuf.DataAccess.ReviewDeleted>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMuseumsReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewToDelete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewDeleted.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("DeleteMuseumsReview"))
              .build();
        }
      }
    }
    return getDeleteMuseumsReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars,
      com.sdj3.protobuf.DataAccess.ReveiewList> getGetMuseumsReviewsContainingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMuseumsReviewsContaining",
      requestType = com.sdj3.protobuf.DataAccess.SearchReviewPeremetars.class,
      responseType = com.sdj3.protobuf.DataAccess.ReveiewList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars,
      com.sdj3.protobuf.DataAccess.ReveiewList> getGetMuseumsReviewsContainingMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars, com.sdj3.protobuf.DataAccess.ReveiewList> getGetMuseumsReviewsContainingMethod;
    if ((getGetMuseumsReviewsContainingMethod = AccessGrpc.getGetMuseumsReviewsContainingMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetMuseumsReviewsContainingMethod = AccessGrpc.getGetMuseumsReviewsContainingMethod) == null) {
          AccessGrpc.getGetMuseumsReviewsContainingMethod = getGetMuseumsReviewsContainingMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars, com.sdj3.protobuf.DataAccess.ReveiewList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMuseumsReviewsContaining"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.SearchReviewPeremetars.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReveiewList.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetMuseumsReviewsContaining"))
              .build();
        }
      }
    }
    return getGetMuseumsReviewsContainingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToCreate,
      com.sdj3.protobuf.DataAccess.CategoryCreated> getCreateParkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePark",
      requestType = com.sdj3.protobuf.DataAccess.CategoryToCreate.class,
      responseType = com.sdj3.protobuf.DataAccess.CategoryCreated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToCreate,
      com.sdj3.protobuf.DataAccess.CategoryCreated> getCreateParkMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToCreate, com.sdj3.protobuf.DataAccess.CategoryCreated> getCreateParkMethod;
    if ((getCreateParkMethod = AccessGrpc.getCreateParkMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getCreateParkMethod = AccessGrpc.getCreateParkMethod) == null) {
          AccessGrpc.getCreateParkMethod = getCreateParkMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryToCreate, com.sdj3.protobuf.DataAccess.CategoryCreated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePark"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryToCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryCreated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("CreatePark"))
              .build();
        }
      }
    }
    return getCreateParkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryById,
      com.sdj3.protobuf.DataAccess.Category> getGetParkByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetParkById",
      requestType = com.sdj3.protobuf.DataAccess.CategoryById.class,
      responseType = com.sdj3.protobuf.DataAccess.Category.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryById,
      com.sdj3.protobuf.DataAccess.Category> getGetParkByIdMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryById, com.sdj3.protobuf.DataAccess.Category> getGetParkByIdMethod;
    if ((getGetParkByIdMethod = AccessGrpc.getGetParkByIdMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetParkByIdMethod = AccessGrpc.getGetParkByIdMethod) == null) {
          AccessGrpc.getGetParkByIdMethod = getGetParkByIdMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryById, com.sdj3.protobuf.DataAccess.Category>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetParkById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Category.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetParkById"))
              .build();
        }
      }
    }
    return getGetParkByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryNameToUpdate,
      com.sdj3.protobuf.DataAccess.CategoryNameUpdated> getUpdateParkNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParkName",
      requestType = com.sdj3.protobuf.DataAccess.CategoryNameToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.CategoryNameUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryNameToUpdate,
      com.sdj3.protobuf.DataAccess.CategoryNameUpdated> getUpdateParkNameMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryNameToUpdate, com.sdj3.protobuf.DataAccess.CategoryNameUpdated> getUpdateParkNameMethod;
    if ((getUpdateParkNameMethod = AccessGrpc.getUpdateParkNameMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateParkNameMethod = AccessGrpc.getUpdateParkNameMethod) == null) {
          AccessGrpc.getUpdateParkNameMethod = getUpdateParkNameMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryNameToUpdate, com.sdj3.protobuf.DataAccess.CategoryNameUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParkName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryNameToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryNameUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateParkName"))
              .build();
        }
      }
    }
    return getUpdateParkNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate,
      com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> getUpdateParkDescriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParkDescription",
      requestType = com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate,
      com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> getUpdateParkDescriptionMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate, com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> getUpdateParkDescriptionMethod;
    if ((getUpdateParkDescriptionMethod = AccessGrpc.getUpdateParkDescriptionMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateParkDescriptionMethod = AccessGrpc.getUpdateParkDescriptionMethod) == null) {
          AccessGrpc.getUpdateParkDescriptionMethod = getUpdateParkDescriptionMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate, com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParkDescription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateParkDescription"))
              .build();
        }
      }
    }
    return getUpdateParkDescriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToDelete,
      com.sdj3.protobuf.DataAccess.CategoryDeleted> getDeleteParkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePark",
      requestType = com.sdj3.protobuf.DataAccess.CategoryToDelete.class,
      responseType = com.sdj3.protobuf.DataAccess.CategoryDeleted.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToDelete,
      com.sdj3.protobuf.DataAccess.CategoryDeleted> getDeleteParkMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToDelete, com.sdj3.protobuf.DataAccess.CategoryDeleted> getDeleteParkMethod;
    if ((getDeleteParkMethod = AccessGrpc.getDeleteParkMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getDeleteParkMethod = AccessGrpc.getDeleteParkMethod) == null) {
          AccessGrpc.getDeleteParkMethod = getDeleteParkMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryToDelete, com.sdj3.protobuf.DataAccess.CategoryDeleted>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePark"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryToDelete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryDeleted.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("DeletePark"))
              .build();
        }
      }
    }
    return getDeleteParkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForCategoryList,
      com.sdj3.protobuf.DataAccess.ListOfACategory> getGetListOfParksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetListOfParks",
      requestType = com.sdj3.protobuf.DataAccess.CitysIdForCategoryList.class,
      responseType = com.sdj3.protobuf.DataAccess.ListOfACategory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForCategoryList,
      com.sdj3.protobuf.DataAccess.ListOfACategory> getGetListOfParksMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForCategoryList, com.sdj3.protobuf.DataAccess.ListOfACategory> getGetListOfParksMethod;
    if ((getGetListOfParksMethod = AccessGrpc.getGetListOfParksMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetListOfParksMethod = AccessGrpc.getGetListOfParksMethod) == null) {
          AccessGrpc.getGetListOfParksMethod = getGetListOfParksMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CitysIdForCategoryList, com.sdj3.protobuf.DataAccess.ListOfACategory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetListOfParks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CitysIdForCategoryList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ListOfACategory.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetListOfParks"))
              .build();
        }
      }
    }
    return getGetListOfParksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToCreate,
      com.sdj3.protobuf.DataAccess.ReviewCreated> getCreateParksReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateParksReview",
      requestType = com.sdj3.protobuf.DataAccess.ReviewToCreate.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewCreated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToCreate,
      com.sdj3.protobuf.DataAccess.ReviewCreated> getCreateParksReviewMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToCreate, com.sdj3.protobuf.DataAccess.ReviewCreated> getCreateParksReviewMethod;
    if ((getCreateParksReviewMethod = AccessGrpc.getCreateParksReviewMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getCreateParksReviewMethod = AccessGrpc.getCreateParksReviewMethod) == null) {
          AccessGrpc.getCreateParksReviewMethod = getCreateParksReviewMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewToCreate, com.sdj3.protobuf.DataAccess.ReviewCreated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateParksReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewToCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewCreated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("CreateParksReview"))
              .build();
        }
      }
    }
    return getCreateParksReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewById,
      com.sdj3.protobuf.DataAccess.Review> getGetParksReviewByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetParksReviewById",
      requestType = com.sdj3.protobuf.DataAccess.ReviewById.class,
      responseType = com.sdj3.protobuf.DataAccess.Review.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewById,
      com.sdj3.protobuf.DataAccess.Review> getGetParksReviewByIdMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewById, com.sdj3.protobuf.DataAccess.Review> getGetParksReviewByIdMethod;
    if ((getGetParksReviewByIdMethod = AccessGrpc.getGetParksReviewByIdMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetParksReviewByIdMethod = AccessGrpc.getGetParksReviewByIdMethod) == null) {
          AccessGrpc.getGetParksReviewByIdMethod = getGetParksReviewByIdMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewById, com.sdj3.protobuf.DataAccess.Review>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetParksReviewById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Review.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetParksReviewById"))
              .build();
        }
      }
    }
    return getGetParksReviewByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> getUpdateParksReviewCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParksReviewComment",
      requestType = com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewCommentUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> getUpdateParksReviewCommentMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate, com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> getUpdateParksReviewCommentMethod;
    if ((getUpdateParksReviewCommentMethod = AccessGrpc.getUpdateParksReviewCommentMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateParksReviewCommentMethod = AccessGrpc.getUpdateParksReviewCommentMethod) == null) {
          AccessGrpc.getUpdateParksReviewCommentMethod = getUpdateParksReviewCommentMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate, com.sdj3.protobuf.DataAccess.ReviewCommentUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParksReviewComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewCommentUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateParksReviewComment"))
              .build();
        }
      }
    }
    return getUpdateParksReviewCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> getUpdateParksStarReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParksStarReview",
      requestType = com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> getUpdateParksStarReviewMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate, com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> getUpdateParksStarReviewMethod;
    if ((getUpdateParksStarReviewMethod = AccessGrpc.getUpdateParksStarReviewMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateParksStarReviewMethod = AccessGrpc.getUpdateParksStarReviewMethod) == null) {
          AccessGrpc.getUpdateParksStarReviewMethod = getUpdateParksStarReviewMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate, com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParksStarReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateParksStarReview"))
              .build();
        }
      }
    }
    return getUpdateParksStarReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToDelete,
      com.sdj3.protobuf.DataAccess.ReviewDeleted> getDeleteParksReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteParksReview",
      requestType = com.sdj3.protobuf.DataAccess.ReviewToDelete.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewDeleted.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToDelete,
      com.sdj3.protobuf.DataAccess.ReviewDeleted> getDeleteParksReviewMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToDelete, com.sdj3.protobuf.DataAccess.ReviewDeleted> getDeleteParksReviewMethod;
    if ((getDeleteParksReviewMethod = AccessGrpc.getDeleteParksReviewMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getDeleteParksReviewMethod = AccessGrpc.getDeleteParksReviewMethod) == null) {
          AccessGrpc.getDeleteParksReviewMethod = getDeleteParksReviewMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewToDelete, com.sdj3.protobuf.DataAccess.ReviewDeleted>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteParksReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewToDelete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewDeleted.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("DeleteParksReview"))
              .build();
        }
      }
    }
    return getDeleteParksReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars,
      com.sdj3.protobuf.DataAccess.ReveiewList> getGetParksReviewsContainingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetParksReviewsContaining",
      requestType = com.sdj3.protobuf.DataAccess.SearchReviewPeremetars.class,
      responseType = com.sdj3.protobuf.DataAccess.ReveiewList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars,
      com.sdj3.protobuf.DataAccess.ReveiewList> getGetParksReviewsContainingMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars, com.sdj3.protobuf.DataAccess.ReveiewList> getGetParksReviewsContainingMethod;
    if ((getGetParksReviewsContainingMethod = AccessGrpc.getGetParksReviewsContainingMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetParksReviewsContainingMethod = AccessGrpc.getGetParksReviewsContainingMethod) == null) {
          AccessGrpc.getGetParksReviewsContainingMethod = getGetParksReviewsContainingMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars, com.sdj3.protobuf.DataAccess.ReveiewList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetParksReviewsContaining"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.SearchReviewPeremetars.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReveiewList.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetParksReviewsContaining"))
              .build();
        }
      }
    }
    return getGetParksReviewsContainingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToCreate,
      com.sdj3.protobuf.DataAccess.CategoryCreated> getCreateRestaurantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRestaurant",
      requestType = com.sdj3.protobuf.DataAccess.CategoryToCreate.class,
      responseType = com.sdj3.protobuf.DataAccess.CategoryCreated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToCreate,
      com.sdj3.protobuf.DataAccess.CategoryCreated> getCreateRestaurantMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToCreate, com.sdj3.protobuf.DataAccess.CategoryCreated> getCreateRestaurantMethod;
    if ((getCreateRestaurantMethod = AccessGrpc.getCreateRestaurantMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getCreateRestaurantMethod = AccessGrpc.getCreateRestaurantMethod) == null) {
          AccessGrpc.getCreateRestaurantMethod = getCreateRestaurantMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryToCreate, com.sdj3.protobuf.DataAccess.CategoryCreated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRestaurant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryToCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryCreated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("CreateRestaurant"))
              .build();
        }
      }
    }
    return getCreateRestaurantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryById,
      com.sdj3.protobuf.DataAccess.Category> getGetRestaurantByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRestaurantById",
      requestType = com.sdj3.protobuf.DataAccess.CategoryById.class,
      responseType = com.sdj3.protobuf.DataAccess.Category.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryById,
      com.sdj3.protobuf.DataAccess.Category> getGetRestaurantByIdMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryById, com.sdj3.protobuf.DataAccess.Category> getGetRestaurantByIdMethod;
    if ((getGetRestaurantByIdMethod = AccessGrpc.getGetRestaurantByIdMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetRestaurantByIdMethod = AccessGrpc.getGetRestaurantByIdMethod) == null) {
          AccessGrpc.getGetRestaurantByIdMethod = getGetRestaurantByIdMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryById, com.sdj3.protobuf.DataAccess.Category>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRestaurantById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Category.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetRestaurantById"))
              .build();
        }
      }
    }
    return getGetRestaurantByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryNameToUpdate,
      com.sdj3.protobuf.DataAccess.CategoryNameUpdated> getUpdateRestaurantNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRestaurantName",
      requestType = com.sdj3.protobuf.DataAccess.CategoryNameToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.CategoryNameUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryNameToUpdate,
      com.sdj3.protobuf.DataAccess.CategoryNameUpdated> getUpdateRestaurantNameMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryNameToUpdate, com.sdj3.protobuf.DataAccess.CategoryNameUpdated> getUpdateRestaurantNameMethod;
    if ((getUpdateRestaurantNameMethod = AccessGrpc.getUpdateRestaurantNameMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateRestaurantNameMethod = AccessGrpc.getUpdateRestaurantNameMethod) == null) {
          AccessGrpc.getUpdateRestaurantNameMethod = getUpdateRestaurantNameMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryNameToUpdate, com.sdj3.protobuf.DataAccess.CategoryNameUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRestaurantName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryNameToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryNameUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateRestaurantName"))
              .build();
        }
      }
    }
    return getUpdateRestaurantNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate,
      com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> getUpdateRestaurantDescriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRestaurantDescription",
      requestType = com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate,
      com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> getUpdateRestaurantDescriptionMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate, com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> getUpdateRestaurantDescriptionMethod;
    if ((getUpdateRestaurantDescriptionMethod = AccessGrpc.getUpdateRestaurantDescriptionMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateRestaurantDescriptionMethod = AccessGrpc.getUpdateRestaurantDescriptionMethod) == null) {
          AccessGrpc.getUpdateRestaurantDescriptionMethod = getUpdateRestaurantDescriptionMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate, com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRestaurantDescription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateRestaurantDescription"))
              .build();
        }
      }
    }
    return getUpdateRestaurantDescriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToDelete,
      com.sdj3.protobuf.DataAccess.CategoryDeleted> getDeleteRestaurantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRestaurant",
      requestType = com.sdj3.protobuf.DataAccess.CategoryToDelete.class,
      responseType = com.sdj3.protobuf.DataAccess.CategoryDeleted.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToDelete,
      com.sdj3.protobuf.DataAccess.CategoryDeleted> getDeleteRestaurantMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CategoryToDelete, com.sdj3.protobuf.DataAccess.CategoryDeleted> getDeleteRestaurantMethod;
    if ((getDeleteRestaurantMethod = AccessGrpc.getDeleteRestaurantMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getDeleteRestaurantMethod = AccessGrpc.getDeleteRestaurantMethod) == null) {
          AccessGrpc.getDeleteRestaurantMethod = getDeleteRestaurantMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CategoryToDelete, com.sdj3.protobuf.DataAccess.CategoryDeleted>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRestaurant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryToDelete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CategoryDeleted.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("DeleteRestaurant"))
              .build();
        }
      }
    }
    return getDeleteRestaurantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForCategoryList,
      com.sdj3.protobuf.DataAccess.ListOfACategory> getGetListOfRestaurantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetListOfRestaurant",
      requestType = com.sdj3.protobuf.DataAccess.CitysIdForCategoryList.class,
      responseType = com.sdj3.protobuf.DataAccess.ListOfACategory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForCategoryList,
      com.sdj3.protobuf.DataAccess.ListOfACategory> getGetListOfRestaurantMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.CitysIdForCategoryList, com.sdj3.protobuf.DataAccess.ListOfACategory> getGetListOfRestaurantMethod;
    if ((getGetListOfRestaurantMethod = AccessGrpc.getGetListOfRestaurantMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetListOfRestaurantMethod = AccessGrpc.getGetListOfRestaurantMethod) == null) {
          AccessGrpc.getGetListOfRestaurantMethod = getGetListOfRestaurantMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.CitysIdForCategoryList, com.sdj3.protobuf.DataAccess.ListOfACategory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetListOfRestaurant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.CitysIdForCategoryList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ListOfACategory.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetListOfRestaurant"))
              .build();
        }
      }
    }
    return getGetListOfRestaurantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToCreate,
      com.sdj3.protobuf.DataAccess.ReviewCreated> getCreateRestaurantsReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRestaurantsReview",
      requestType = com.sdj3.protobuf.DataAccess.ReviewToCreate.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewCreated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToCreate,
      com.sdj3.protobuf.DataAccess.ReviewCreated> getCreateRestaurantsReviewMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToCreate, com.sdj3.protobuf.DataAccess.ReviewCreated> getCreateRestaurantsReviewMethod;
    if ((getCreateRestaurantsReviewMethod = AccessGrpc.getCreateRestaurantsReviewMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getCreateRestaurantsReviewMethod = AccessGrpc.getCreateRestaurantsReviewMethod) == null) {
          AccessGrpc.getCreateRestaurantsReviewMethod = getCreateRestaurantsReviewMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewToCreate, com.sdj3.protobuf.DataAccess.ReviewCreated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRestaurantsReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewToCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewCreated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("CreateRestaurantsReview"))
              .build();
        }
      }
    }
    return getCreateRestaurantsReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewById,
      com.sdj3.protobuf.DataAccess.Review> getGetRestaurantsReviewByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRestaurantsReviewById",
      requestType = com.sdj3.protobuf.DataAccess.ReviewById.class,
      responseType = com.sdj3.protobuf.DataAccess.Review.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewById,
      com.sdj3.protobuf.DataAccess.Review> getGetRestaurantsReviewByIdMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewById, com.sdj3.protobuf.DataAccess.Review> getGetRestaurantsReviewByIdMethod;
    if ((getGetRestaurantsReviewByIdMethod = AccessGrpc.getGetRestaurantsReviewByIdMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetRestaurantsReviewByIdMethod = AccessGrpc.getGetRestaurantsReviewByIdMethod) == null) {
          AccessGrpc.getGetRestaurantsReviewByIdMethod = getGetRestaurantsReviewByIdMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewById, com.sdj3.protobuf.DataAccess.Review>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRestaurantsReviewById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.Review.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetRestaurantsReviewById"))
              .build();
        }
      }
    }
    return getGetRestaurantsReviewByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> getUpdateRestaurantsReviewCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRestaurantsReviewComment",
      requestType = com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewCommentUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> getUpdateRestaurantsReviewCommentMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate, com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> getUpdateRestaurantsReviewCommentMethod;
    if ((getUpdateRestaurantsReviewCommentMethod = AccessGrpc.getUpdateRestaurantsReviewCommentMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateRestaurantsReviewCommentMethod = AccessGrpc.getUpdateRestaurantsReviewCommentMethod) == null) {
          AccessGrpc.getUpdateRestaurantsReviewCommentMethod = getUpdateRestaurantsReviewCommentMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate, com.sdj3.protobuf.DataAccess.ReviewCommentUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRestaurantsReviewComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewCommentUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateRestaurantsReviewComment"))
              .build();
        }
      }
    }
    return getUpdateRestaurantsReviewCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> getUpdateRestaurantsStarReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRestaurantsStarReview",
      requestType = com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate,
      com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> getUpdateRestaurantsStarReviewMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate, com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> getUpdateRestaurantsStarReviewMethod;
    if ((getUpdateRestaurantsStarReviewMethod = AccessGrpc.getUpdateRestaurantsStarReviewMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getUpdateRestaurantsStarReviewMethod = AccessGrpc.getUpdateRestaurantsStarReviewMethod) == null) {
          AccessGrpc.getUpdateRestaurantsStarReviewMethod = getUpdateRestaurantsStarReviewMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate, com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRestaurantsStarReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("UpdateRestaurantsStarReview"))
              .build();
        }
      }
    }
    return getUpdateRestaurantsStarReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToDelete,
      com.sdj3.protobuf.DataAccess.ReviewDeleted> getDeleteRestaurantsReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRestaurantsReview",
      requestType = com.sdj3.protobuf.DataAccess.ReviewToDelete.class,
      responseType = com.sdj3.protobuf.DataAccess.ReviewDeleted.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToDelete,
      com.sdj3.protobuf.DataAccess.ReviewDeleted> getDeleteRestaurantsReviewMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.ReviewToDelete, com.sdj3.protobuf.DataAccess.ReviewDeleted> getDeleteRestaurantsReviewMethod;
    if ((getDeleteRestaurantsReviewMethod = AccessGrpc.getDeleteRestaurantsReviewMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getDeleteRestaurantsReviewMethod = AccessGrpc.getDeleteRestaurantsReviewMethod) == null) {
          AccessGrpc.getDeleteRestaurantsReviewMethod = getDeleteRestaurantsReviewMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.ReviewToDelete, com.sdj3.protobuf.DataAccess.ReviewDeleted>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRestaurantsReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewToDelete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReviewDeleted.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("DeleteRestaurantsReview"))
              .build();
        }
      }
    }
    return getDeleteRestaurantsReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars,
      com.sdj3.protobuf.DataAccess.ReveiewList> getGetRestaurantsReviewsContainingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRestaurantsReviewsContaining",
      requestType = com.sdj3.protobuf.DataAccess.SearchReviewPeremetars.class,
      responseType = com.sdj3.protobuf.DataAccess.ReveiewList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars,
      com.sdj3.protobuf.DataAccess.ReveiewList> getGetRestaurantsReviewsContainingMethod() {
    io.grpc.MethodDescriptor<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars, com.sdj3.protobuf.DataAccess.ReveiewList> getGetRestaurantsReviewsContainingMethod;
    if ((getGetRestaurantsReviewsContainingMethod = AccessGrpc.getGetRestaurantsReviewsContainingMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGetRestaurantsReviewsContainingMethod = AccessGrpc.getGetRestaurantsReviewsContainingMethod) == null) {
          AccessGrpc.getGetRestaurantsReviewsContainingMethod = getGetRestaurantsReviewsContainingMethod =
              io.grpc.MethodDescriptor.<com.sdj3.protobuf.DataAccess.SearchReviewPeremetars, com.sdj3.protobuf.DataAccess.ReveiewList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRestaurantsReviewsContaining"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.SearchReviewPeremetars.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.protobuf.DataAccess.ReveiewList.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GetRestaurantsReviewsContaining"))
              .build();
        }
      }
    }
    return getGetRestaurantsReviewsContainingMethod;
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
    public void createHotel(com.sdj3.protobuf.DataAccess.CategoryToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryCreated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateHotelMethod(), responseObserver);
    }

    /**
     */
    public void getHotelById(com.sdj3.protobuf.DataAccess.CategoryById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Category> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHotelByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateHotelName(com.sdj3.protobuf.DataAccess.CategoryNameToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryNameUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHotelNameMethod(), responseObserver);
    }

    /**
     */
    public void updateHotelDescription(com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHotelDescriptionMethod(), responseObserver);
    }

    /**
     */
    public void deleteHotel(com.sdj3.protobuf.DataAccess.CategoryToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDeleted> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteHotelMethod(), responseObserver);
    }

    /**
     */
    public void getListOfHotels(com.sdj3.protobuf.DataAccess.CitysIdForCategoryList request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfACategory> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListOfHotelsMethod(), responseObserver);
    }

    /**
     */
    public void createHotelsReview(com.sdj3.protobuf.DataAccess.ReviewToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCreated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateHotelsReviewMethod(), responseObserver);
    }

    /**
     */
    public void getHotelsReviewById(com.sdj3.protobuf.DataAccess.ReviewById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Review> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHotelsReviewByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateHotelsReviewComment(com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHotelsReviewCommentMethod(), responseObserver);
    }

    /**
     */
    public void updateHotelsStarReview(com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHotelsStarReviewMethod(), responseObserver);
    }

    /**
     */
    public void deleteHotelReview(com.sdj3.protobuf.DataAccess.ReviewToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewDeleted> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteHotelReviewMethod(), responseObserver);
    }

    /**
     */
    public void getHotelReviewsContaining(com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReveiewList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHotelReviewsContainingMethod(), responseObserver);
    }

    /**
     */
    public void createMuseum(com.sdj3.protobuf.DataAccess.CategoryToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryCreated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMuseumMethod(), responseObserver);
    }

    /**
     */
    public void getMuseumById(com.sdj3.protobuf.DataAccess.CategoryById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Category> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMuseumByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateMuseumName(com.sdj3.protobuf.DataAccess.CategoryNameToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryNameUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMuseumNameMethod(), responseObserver);
    }

    /**
     */
    public void updateMuseumDescription(com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMuseumDescriptionMethod(), responseObserver);
    }

    /**
     */
    public void deleteMuseum(com.sdj3.protobuf.DataAccess.CategoryToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDeleted> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMuseumMethod(), responseObserver);
    }

    /**
     */
    public void getListOfMuseums(com.sdj3.protobuf.DataAccess.CitysIdForCategoryList request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfACategory> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListOfMuseumsMethod(), responseObserver);
    }

    /**
     */
    public void createMuseumsReview(com.sdj3.protobuf.DataAccess.ReviewToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCreated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMuseumsReviewMethod(), responseObserver);
    }

    /**
     */
    public void getMuseumsReviewById(com.sdj3.protobuf.DataAccess.ReviewById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Review> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMuseumsReviewByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateMuseumsReviewComment(com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMuseumsReviewCommentMethod(), responseObserver);
    }

    /**
     */
    public void updateMuseumsStarReview(com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMuseumsStarReviewMethod(), responseObserver);
    }

    /**
     */
    public void deleteMuseumsReview(com.sdj3.protobuf.DataAccess.ReviewToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewDeleted> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMuseumsReviewMethod(), responseObserver);
    }

    /**
     */
    public void getMuseumsReviewsContaining(com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReveiewList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMuseumsReviewsContainingMethod(), responseObserver);
    }

    /**
     */
    public void createPark(com.sdj3.protobuf.DataAccess.CategoryToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryCreated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateParkMethod(), responseObserver);
    }

    /**
     */
    public void getParkById(com.sdj3.protobuf.DataAccess.CategoryById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Category> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetParkByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateParkName(com.sdj3.protobuf.DataAccess.CategoryNameToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryNameUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParkNameMethod(), responseObserver);
    }

    /**
     */
    public void updateParkDescription(com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParkDescriptionMethod(), responseObserver);
    }

    /**
     */
    public void deletePark(com.sdj3.protobuf.DataAccess.CategoryToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDeleted> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteParkMethod(), responseObserver);
    }

    /**
     */
    public void getListOfParks(com.sdj3.protobuf.DataAccess.CitysIdForCategoryList request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfACategory> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListOfParksMethod(), responseObserver);
    }

    /**
     */
    public void createParksReview(com.sdj3.protobuf.DataAccess.ReviewToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCreated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateParksReviewMethod(), responseObserver);
    }

    /**
     */
    public void getParksReviewById(com.sdj3.protobuf.DataAccess.ReviewById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Review> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetParksReviewByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateParksReviewComment(com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParksReviewCommentMethod(), responseObserver);
    }

    /**
     */
    public void updateParksStarReview(com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParksStarReviewMethod(), responseObserver);
    }

    /**
     */
    public void deleteParksReview(com.sdj3.protobuf.DataAccess.ReviewToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewDeleted> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteParksReviewMethod(), responseObserver);
    }

    /**
     */
    public void getParksReviewsContaining(com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReveiewList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetParksReviewsContainingMethod(), responseObserver);
    }

    /**
     */
    public void createRestaurant(com.sdj3.protobuf.DataAccess.CategoryToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryCreated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRestaurantMethod(), responseObserver);
    }

    /**
     */
    public void getRestaurantById(com.sdj3.protobuf.DataAccess.CategoryById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Category> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRestaurantByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateRestaurantName(com.sdj3.protobuf.DataAccess.CategoryNameToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryNameUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRestaurantNameMethod(), responseObserver);
    }

    /**
     */
    public void updateRestaurantDescription(com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRestaurantDescriptionMethod(), responseObserver);
    }

    /**
     */
    public void deleteRestaurant(com.sdj3.protobuf.DataAccess.CategoryToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDeleted> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRestaurantMethod(), responseObserver);
    }

    /**
     */
    public void getListOfRestaurants(com.sdj3.protobuf.DataAccess.CitysIdForCategoryList request,
                                     io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfACategory> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListOfRestaurantMethod(), responseObserver);
    }

    /**
     */
    public void createRestaurantsReview(com.sdj3.protobuf.DataAccess.ReviewToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCreated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRestaurantsReviewMethod(), responseObserver);
    }

    /**
     */
    public void getRestaurantsReviewById(com.sdj3.protobuf.DataAccess.ReviewById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Review> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRestaurantsReviewByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateRestaurantsReviewComment(com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRestaurantsReviewCommentMethod(), responseObserver);
    }

    /**
     */
    public void updateRestaurantsStarReview(com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRestaurantsStarReviewMethod(), responseObserver);
    }

    /**
     */
    public void deleteRestaurantsReview(com.sdj3.protobuf.DataAccess.ReviewToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewDeleted> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRestaurantsReviewMethod(), responseObserver);
    }

    /**
     */
    public void getRestaurantsReviewsContaining(com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReveiewList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRestaurantsReviewsContainingMethod(), responseObserver);
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
                com.sdj3.protobuf.DataAccess.CategoryToCreate,
                com.sdj3.protobuf.DataAccess.CategoryCreated>(
                  this, METHODID_CREATE_HOTEL)))
          .addMethod(
            getGetHotelByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryById,
                com.sdj3.protobuf.DataAccess.Category>(
                  this, METHODID_GET_HOTEL_BY_ID)))
          .addMethod(
            getUpdateHotelNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryNameToUpdate,
                com.sdj3.protobuf.DataAccess.CategoryNameUpdated>(
                  this, METHODID_UPDATE_HOTEL_NAME)))
          .addMethod(
            getUpdateHotelDescriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate,
                com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated>(
                  this, METHODID_UPDATE_HOTEL_DESCRIPTION)))
          .addMethod(
            getDeleteHotelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryToDelete,
                com.sdj3.protobuf.DataAccess.CategoryDeleted>(
                  this, METHODID_DELETE_HOTEL)))
          .addMethod(
            getGetListOfHotelsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CitysIdForCategoryList,
                com.sdj3.protobuf.DataAccess.ListOfACategory>(
                  this, METHODID_GET_LIST_OF_HOTELS)))
          .addMethod(
            getCreateHotelsReviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewToCreate,
                com.sdj3.protobuf.DataAccess.ReviewCreated>(
                  this, METHODID_CREATE_HOTELS_REVIEW)))
          .addMethod(
            getGetHotelsReviewByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewById,
                com.sdj3.protobuf.DataAccess.Review>(
                  this, METHODID_GET_HOTELS_REVIEW_BY_ID)))
          .addMethod(
            getUpdateHotelsReviewCommentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate,
                com.sdj3.protobuf.DataAccess.ReviewCommentUpdated>(
                  this, METHODID_UPDATE_HOTELS_REVIEW_COMMENT)))
          .addMethod(
            getUpdateHotelsStarReviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate,
                com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated>(
                  this, METHODID_UPDATE_HOTELS_STAR_REVIEW)))
          .addMethod(
            getDeleteHotelReviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewToDelete,
                com.sdj3.protobuf.DataAccess.ReviewDeleted>(
                  this, METHODID_DELETE_HOTEL_REVIEW)))
          .addMethod(
            getGetHotelReviewsContainingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.SearchReviewPeremetars,
                com.sdj3.protobuf.DataAccess.ReveiewList>(
                  this, METHODID_GET_HOTEL_REVIEWS_CONTAINING)))
          .addMethod(
            getCreateMuseumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryToCreate,
                com.sdj3.protobuf.DataAccess.CategoryCreated>(
                  this, METHODID_CREATE_MUSEUM)))
          .addMethod(
            getGetMuseumByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryById,
                com.sdj3.protobuf.DataAccess.Category>(
                  this, METHODID_GET_MUSEUM_BY_ID)))
          .addMethod(
            getUpdateMuseumNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryNameToUpdate,
                com.sdj3.protobuf.DataAccess.CategoryNameUpdated>(
                  this, METHODID_UPDATE_MUSEUM_NAME)))
          .addMethod(
            getUpdateMuseumDescriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate,
                com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated>(
                  this, METHODID_UPDATE_MUSEUM_DESCRIPTION)))
          .addMethod(
            getDeleteMuseumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryToDelete,
                com.sdj3.protobuf.DataAccess.CategoryDeleted>(
                  this, METHODID_DELETE_MUSEUM)))
          .addMethod(
            getGetListOfMuseumsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CitysIdForCategoryList,
                com.sdj3.protobuf.DataAccess.ListOfACategory>(
                  this, METHODID_GET_LIST_OF_MUSEUMS)))
          .addMethod(
            getCreateMuseumsReviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewToCreate,
                com.sdj3.protobuf.DataAccess.ReviewCreated>(
                  this, METHODID_CREATE_MUSEUMS_REVIEW)))
          .addMethod(
            getGetMuseumsReviewByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewById,
                com.sdj3.protobuf.DataAccess.Review>(
                  this, METHODID_GET_MUSEUMS_REVIEW_BY_ID)))
          .addMethod(
            getUpdateMuseumsReviewCommentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate,
                com.sdj3.protobuf.DataAccess.ReviewCommentUpdated>(
                  this, METHODID_UPDATE_MUSEUMS_REVIEW_COMMENT)))
          .addMethod(
            getUpdateMuseumsStarReviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate,
                com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated>(
                  this, METHODID_UPDATE_MUSEUMS_STAR_REVIEW)))
          .addMethod(
            getDeleteMuseumsReviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewToDelete,
                com.sdj3.protobuf.DataAccess.ReviewDeleted>(
                  this, METHODID_DELETE_MUSEUMS_REVIEW)))
          .addMethod(
            getGetMuseumsReviewsContainingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.SearchReviewPeremetars,
                com.sdj3.protobuf.DataAccess.ReveiewList>(
                  this, METHODID_GET_MUSEUMS_REVIEWS_CONTAINING)))
          .addMethod(
            getCreateParkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryToCreate,
                com.sdj3.protobuf.DataAccess.CategoryCreated>(
                  this, METHODID_CREATE_PARK)))
          .addMethod(
            getGetParkByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryById,
                com.sdj3.protobuf.DataAccess.Category>(
                  this, METHODID_GET_PARK_BY_ID)))
          .addMethod(
            getUpdateParkNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryNameToUpdate,
                com.sdj3.protobuf.DataAccess.CategoryNameUpdated>(
                  this, METHODID_UPDATE_PARK_NAME)))
          .addMethod(
            getUpdateParkDescriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate,
                com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated>(
                  this, METHODID_UPDATE_PARK_DESCRIPTION)))
          .addMethod(
            getDeleteParkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryToDelete,
                com.sdj3.protobuf.DataAccess.CategoryDeleted>(
                  this, METHODID_DELETE_PARK)))
          .addMethod(
            getGetListOfParksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CitysIdForCategoryList,
                com.sdj3.protobuf.DataAccess.ListOfACategory>(
                  this, METHODID_GET_LIST_OF_PARKS)))
          .addMethod(
            getCreateParksReviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewToCreate,
                com.sdj3.protobuf.DataAccess.ReviewCreated>(
                  this, METHODID_CREATE_PARKS_REVIEW)))
          .addMethod(
            getGetParksReviewByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewById,
                com.sdj3.protobuf.DataAccess.Review>(
                  this, METHODID_GET_PARKS_REVIEW_BY_ID)))
          .addMethod(
            getUpdateParksReviewCommentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate,
                com.sdj3.protobuf.DataAccess.ReviewCommentUpdated>(
                  this, METHODID_UPDATE_PARKS_REVIEW_COMMENT)))
          .addMethod(
            getUpdateParksStarReviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate,
                com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated>(
                  this, METHODID_UPDATE_PARKS_STAR_REVIEW)))
          .addMethod(
            getDeleteParksReviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewToDelete,
                com.sdj3.protobuf.DataAccess.ReviewDeleted>(
                  this, METHODID_DELETE_PARKS_REVIEW)))
          .addMethod(
            getGetParksReviewsContainingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.SearchReviewPeremetars,
                com.sdj3.protobuf.DataAccess.ReveiewList>(
                  this, METHODID_GET_PARKS_REVIEWS_CONTAINING)))
          .addMethod(
            getCreateRestaurantMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryToCreate,
                com.sdj3.protobuf.DataAccess.CategoryCreated>(
                  this, METHODID_CREATE_RESTAURANT)))
          .addMethod(
            getGetRestaurantByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryById,
                com.sdj3.protobuf.DataAccess.Category>(
                  this, METHODID_GET_RESTAURANT_BY_ID)))
          .addMethod(
            getUpdateRestaurantNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryNameToUpdate,
                com.sdj3.protobuf.DataAccess.CategoryNameUpdated>(
                  this, METHODID_UPDATE_RESTAURANT_NAME)))
          .addMethod(
            getUpdateRestaurantDescriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate,
                com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated>(
                  this, METHODID_UPDATE_RESTAURANT_DESCRIPTION)))
          .addMethod(
            getDeleteRestaurantMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CategoryToDelete,
                com.sdj3.protobuf.DataAccess.CategoryDeleted>(
                  this, METHODID_DELETE_RESTAURANT)))
          .addMethod(
            getGetListOfRestaurantMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.CitysIdForCategoryList,
                com.sdj3.protobuf.DataAccess.ListOfACategory>(
                  this, METHODID_GET_LIST_OF_RESTAURANT)))
          .addMethod(
            getCreateRestaurantsReviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewToCreate,
                com.sdj3.protobuf.DataAccess.ReviewCreated>(
                  this, METHODID_CREATE_RESTAURANTS_REVIEW)))
          .addMethod(
            getGetRestaurantsReviewByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewById,
                com.sdj3.protobuf.DataAccess.Review>(
                  this, METHODID_GET_RESTAURANTS_REVIEW_BY_ID)))
          .addMethod(
            getUpdateRestaurantsReviewCommentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate,
                com.sdj3.protobuf.DataAccess.ReviewCommentUpdated>(
                  this, METHODID_UPDATE_RESTAURANTS_REVIEW_COMMENT)))
          .addMethod(
            getUpdateRestaurantsStarReviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate,
                com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated>(
                  this, METHODID_UPDATE_RESTAURANTS_STAR_REVIEW)))
          .addMethod(
            getDeleteRestaurantsReviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.ReviewToDelete,
                com.sdj3.protobuf.DataAccess.ReviewDeleted>(
                  this, METHODID_DELETE_RESTAURANTS_REVIEW)))
          .addMethod(
            getGetRestaurantsReviewsContainingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.protobuf.DataAccess.SearchReviewPeremetars,
                com.sdj3.protobuf.DataAccess.ReveiewList>(
                  this, METHODID_GET_RESTAURANTS_REVIEWS_CONTAINING)))
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
    public void createHotel(com.sdj3.protobuf.DataAccess.CategoryToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryCreated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateHotelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHotelById(com.sdj3.protobuf.DataAccess.CategoryById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Category> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHotelByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateHotelName(com.sdj3.protobuf.DataAccess.CategoryNameToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryNameUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHotelNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateHotelDescription(com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHotelDescriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteHotel(com.sdj3.protobuf.DataAccess.CategoryToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDeleted> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteHotelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListOfHotels(com.sdj3.protobuf.DataAccess.CitysIdForCategoryList request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfACategory> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetListOfHotelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createHotelsReview(com.sdj3.protobuf.DataAccess.ReviewToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCreated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateHotelsReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHotelsReviewById(com.sdj3.protobuf.DataAccess.ReviewById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Review> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHotelsReviewByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateHotelsReviewComment(com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHotelsReviewCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateHotelsStarReview(com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHotelsStarReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteHotelReview(com.sdj3.protobuf.DataAccess.ReviewToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewDeleted> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteHotelReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHotelReviewsContaining(com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReveiewList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHotelReviewsContainingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createMuseum(com.sdj3.protobuf.DataAccess.CategoryToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryCreated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMuseumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMuseumById(com.sdj3.protobuf.DataAccess.CategoryById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Category> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMuseumByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMuseumName(com.sdj3.protobuf.DataAccess.CategoryNameToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryNameUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMuseumNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMuseumDescription(com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMuseumDescriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMuseum(com.sdj3.protobuf.DataAccess.CategoryToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDeleted> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMuseumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListOfMuseums(com.sdj3.protobuf.DataAccess.CitysIdForCategoryList request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfACategory> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetListOfMuseumsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createMuseumsReview(com.sdj3.protobuf.DataAccess.ReviewToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCreated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMuseumsReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMuseumsReviewById(com.sdj3.protobuf.DataAccess.ReviewById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Review> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMuseumsReviewByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMuseumsReviewComment(com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMuseumsReviewCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMuseumsStarReview(com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMuseumsStarReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMuseumsReview(com.sdj3.protobuf.DataAccess.ReviewToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewDeleted> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMuseumsReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMuseumsReviewsContaining(com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReveiewList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMuseumsReviewsContainingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPark(com.sdj3.protobuf.DataAccess.CategoryToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryCreated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateParkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getParkById(com.sdj3.protobuf.DataAccess.CategoryById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Category> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetParkByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateParkName(com.sdj3.protobuf.DataAccess.CategoryNameToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryNameUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParkNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateParkDescription(com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParkDescriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePark(com.sdj3.protobuf.DataAccess.CategoryToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDeleted> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteParkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListOfParks(com.sdj3.protobuf.DataAccess.CitysIdForCategoryList request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfACategory> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetListOfParksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createParksReview(com.sdj3.protobuf.DataAccess.ReviewToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCreated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateParksReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getParksReviewById(com.sdj3.protobuf.DataAccess.ReviewById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Review> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetParksReviewByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateParksReviewComment(com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParksReviewCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateParksStarReview(com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParksStarReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteParksReview(com.sdj3.protobuf.DataAccess.ReviewToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewDeleted> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteParksReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getParksReviewsContaining(com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReveiewList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetParksReviewsContainingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRestaurant(com.sdj3.protobuf.DataAccess.CategoryToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryCreated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRestaurantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRestaurantById(com.sdj3.protobuf.DataAccess.CategoryById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Category> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRestaurantByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRestaurantName(com.sdj3.protobuf.DataAccess.CategoryNameToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryNameUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRestaurantNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRestaurantDescription(com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRestaurantDescriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRestaurant(com.sdj3.protobuf.DataAccess.CategoryToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDeleted> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRestaurantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListOfRestaurant(com.sdj3.protobuf.DataAccess.CitysIdForCategoryList request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfACategory> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetListOfRestaurantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRestaurantsReview(com.sdj3.protobuf.DataAccess.ReviewToCreate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCreated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRestaurantsReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRestaurantsReviewById(com.sdj3.protobuf.DataAccess.ReviewById request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Review> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRestaurantsReviewByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRestaurantsReviewComment(com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRestaurantsReviewCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRestaurantsStarReview(com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRestaurantsStarReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRestaurantsReview(com.sdj3.protobuf.DataAccess.ReviewToDelete request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewDeleted> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRestaurantsReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRestaurantsReviewsContaining(com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request,
        io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReveiewList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRestaurantsReviewsContainingMethod(), getCallOptions()), request, responseObserver);
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
    public com.sdj3.protobuf.DataAccess.CategoryCreated createHotel(com.sdj3.protobuf.DataAccess.CategoryToCreate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateHotelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.Category getHotelById(com.sdj3.protobuf.DataAccess.CategoryById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHotelByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.CategoryNameUpdated updateHotelName(com.sdj3.protobuf.DataAccess.CategoryNameToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHotelNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated updateHotelDescription(com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHotelDescriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.CategoryDeleted deleteHotel(com.sdj3.protobuf.DataAccess.CategoryToDelete request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHotelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ListOfACategory getListOfHotels(com.sdj3.protobuf.DataAccess.CitysIdForCategoryList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetListOfHotelsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewCreated createHotelsReview(com.sdj3.protobuf.DataAccess.ReviewToCreate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateHotelsReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.Review getHotelsReviewById(com.sdj3.protobuf.DataAccess.ReviewById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHotelsReviewByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewCommentUpdated updateHotelsReviewComment(com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHotelsReviewCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated updateHotelsStarReview(com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHotelsStarReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewDeleted deleteHotelReview(com.sdj3.protobuf.DataAccess.ReviewToDelete request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHotelReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReveiewList getHotelReviewsContaining(com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHotelReviewsContainingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.CategoryCreated createMuseum(com.sdj3.protobuf.DataAccess.CategoryToCreate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMuseumMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.Category getMuseumById(com.sdj3.protobuf.DataAccess.CategoryById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMuseumByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.CategoryNameUpdated updateMuseumName(com.sdj3.protobuf.DataAccess.CategoryNameToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMuseumNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated updateMuseumDescription(com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMuseumDescriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.CategoryDeleted deleteMuseum(com.sdj3.protobuf.DataAccess.CategoryToDelete request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMuseumMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ListOfACategory getListOfMuseums(com.sdj3.protobuf.DataAccess.CitysIdForCategoryList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetListOfMuseumsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewCreated createMuseumsReview(com.sdj3.protobuf.DataAccess.ReviewToCreate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMuseumsReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.Review getMuseumsReviewById(com.sdj3.protobuf.DataAccess.ReviewById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMuseumsReviewByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewCommentUpdated updateMuseumsReviewComment(com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMuseumsReviewCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated updateMuseumsStarReview(com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMuseumsStarReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewDeleted deleteMuseumsReview(com.sdj3.protobuf.DataAccess.ReviewToDelete request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMuseumsReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReveiewList getMuseumsReviewsContaining(com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMuseumsReviewsContainingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.CategoryCreated createPark(com.sdj3.protobuf.DataAccess.CategoryToCreate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateParkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.Category getParkById(com.sdj3.protobuf.DataAccess.CategoryById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetParkByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.CategoryNameUpdated updateParkName(com.sdj3.protobuf.DataAccess.CategoryNameToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParkNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated updateParkDescription(com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParkDescriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.CategoryDeleted deletePark(com.sdj3.protobuf.DataAccess.CategoryToDelete request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteParkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ListOfACategory getListOfParks(com.sdj3.protobuf.DataAccess.CitysIdForCategoryList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetListOfParksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewCreated createParksReview(com.sdj3.protobuf.DataAccess.ReviewToCreate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateParksReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.Review getParksReviewById(com.sdj3.protobuf.DataAccess.ReviewById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetParksReviewByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewCommentUpdated updateParksReviewComment(com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParksReviewCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated updateParksStarReview(com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParksStarReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewDeleted deleteParksReview(com.sdj3.protobuf.DataAccess.ReviewToDelete request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteParksReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReveiewList getParksReviewsContaining(com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetParksReviewsContainingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.CategoryCreated createRestaurant(com.sdj3.protobuf.DataAccess.CategoryToCreate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRestaurantMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.Category getRestaurantById(com.sdj3.protobuf.DataAccess.CategoryById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRestaurantByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.CategoryNameUpdated updateRestaurantName(com.sdj3.protobuf.DataAccess.CategoryNameToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRestaurantNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated updateRestaurantDescription(com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRestaurantDescriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.CategoryDeleted deleteRestaurant(com.sdj3.protobuf.DataAccess.CategoryToDelete request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRestaurantMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ListOfACategory getListOfRestaurant(com.sdj3.protobuf.DataAccess.CitysIdForCategoryList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetListOfRestaurantMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewCreated createRestaurantsReview(com.sdj3.protobuf.DataAccess.ReviewToCreate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRestaurantsReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.Review getRestaurantsReviewById(com.sdj3.protobuf.DataAccess.ReviewById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRestaurantsReviewByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewCommentUpdated updateRestaurantsReviewComment(com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRestaurantsReviewCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated updateRestaurantsStarReview(com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRestaurantsStarReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReviewDeleted deleteRestaurantsReview(com.sdj3.protobuf.DataAccess.ReviewToDelete request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRestaurantsReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.protobuf.DataAccess.ReveiewList getRestaurantsReviewsContaining(com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRestaurantsReviewsContainingMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.CategoryCreated> createHotel(
        com.sdj3.protobuf.DataAccess.CategoryToCreate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateHotelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.Category> getHotelById(
        com.sdj3.protobuf.DataAccess.CategoryById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHotelByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.CategoryNameUpdated> updateHotelName(
        com.sdj3.protobuf.DataAccess.CategoryNameToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHotelNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> updateHotelDescription(
        com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHotelDescriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.CategoryDeleted> deleteHotel(
        com.sdj3.protobuf.DataAccess.CategoryToDelete request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteHotelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ListOfACategory> getListOfHotels(
        com.sdj3.protobuf.DataAccess.CitysIdForCategoryList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetListOfHotelsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewCreated> createHotelsReview(
        com.sdj3.protobuf.DataAccess.ReviewToCreate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateHotelsReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.Review> getHotelsReviewById(
        com.sdj3.protobuf.DataAccess.ReviewById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHotelsReviewByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> updateHotelsReviewComment(
        com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHotelsReviewCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> updateHotelsStarReview(
        com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHotelsStarReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewDeleted> deleteHotelReview(
        com.sdj3.protobuf.DataAccess.ReviewToDelete request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteHotelReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReveiewList> getHotelReviewsContaining(
        com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHotelReviewsContainingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.CategoryCreated> createMuseum(
        com.sdj3.protobuf.DataAccess.CategoryToCreate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMuseumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.Category> getMuseumById(
        com.sdj3.protobuf.DataAccess.CategoryById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMuseumByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.CategoryNameUpdated> updateMuseumName(
        com.sdj3.protobuf.DataAccess.CategoryNameToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMuseumNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> updateMuseumDescription(
        com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMuseumDescriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.CategoryDeleted> deleteMuseum(
        com.sdj3.protobuf.DataAccess.CategoryToDelete request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMuseumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ListOfACategory> getListOfMuseums(
        com.sdj3.protobuf.DataAccess.CitysIdForCategoryList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetListOfMuseumsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewCreated> createMuseumsReview(
        com.sdj3.protobuf.DataAccess.ReviewToCreate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMuseumsReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.Review> getMuseumsReviewById(
        com.sdj3.protobuf.DataAccess.ReviewById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMuseumsReviewByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> updateMuseumsReviewComment(
        com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMuseumsReviewCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> updateMuseumsStarReview(
        com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMuseumsStarReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewDeleted> deleteMuseumsReview(
        com.sdj3.protobuf.DataAccess.ReviewToDelete request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMuseumsReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReveiewList> getMuseumsReviewsContaining(
        com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMuseumsReviewsContainingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.CategoryCreated> createPark(
        com.sdj3.protobuf.DataAccess.CategoryToCreate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateParkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.Category> getParkById(
        com.sdj3.protobuf.DataAccess.CategoryById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetParkByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.CategoryNameUpdated> updateParkName(
        com.sdj3.protobuf.DataAccess.CategoryNameToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParkNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> updateParkDescription(
        com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParkDescriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.CategoryDeleted> deletePark(
        com.sdj3.protobuf.DataAccess.CategoryToDelete request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteParkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ListOfACategory> getListOfParks(
        com.sdj3.protobuf.DataAccess.CitysIdForCategoryList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetListOfParksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewCreated> createParksReview(
        com.sdj3.protobuf.DataAccess.ReviewToCreate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateParksReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.Review> getParksReviewById(
        com.sdj3.protobuf.DataAccess.ReviewById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetParksReviewByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> updateParksReviewComment(
        com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParksReviewCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> updateParksStarReview(
        com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParksStarReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewDeleted> deleteParksReview(
        com.sdj3.protobuf.DataAccess.ReviewToDelete request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteParksReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReveiewList> getParksReviewsContaining(
        com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetParksReviewsContainingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.CategoryCreated> createRestaurant(
        com.sdj3.protobuf.DataAccess.CategoryToCreate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRestaurantMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.Category> getRestaurantById(
        com.sdj3.protobuf.DataAccess.CategoryById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRestaurantByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.CategoryNameUpdated> updateRestaurantName(
        com.sdj3.protobuf.DataAccess.CategoryNameToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRestaurantNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated> updateRestaurantDescription(
        com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRestaurantDescriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.CategoryDeleted> deleteRestaurant(
        com.sdj3.protobuf.DataAccess.CategoryToDelete request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRestaurantMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ListOfACategory> getListOfRestaurant(
        com.sdj3.protobuf.DataAccess.CitysIdForCategoryList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetListOfRestaurantMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewCreated> createRestaurantsReview(
        com.sdj3.protobuf.DataAccess.ReviewToCreate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRestaurantsReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.Review> getRestaurantsReviewById(
        com.sdj3.protobuf.DataAccess.ReviewById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRestaurantsReviewByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated> updateRestaurantsReviewComment(
        com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRestaurantsReviewCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated> updateRestaurantsStarReview(
        com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRestaurantsStarReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReviewDeleted> deleteRestaurantsReview(
        com.sdj3.protobuf.DataAccess.ReviewToDelete request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRestaurantsReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.protobuf.DataAccess.ReveiewList> getRestaurantsReviewsContaining(
        com.sdj3.protobuf.DataAccess.SearchReviewPeremetars request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRestaurantsReviewsContainingMethod(), getCallOptions()), request);
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
  private static final int METHODID_GET_HOTEL_BY_ID = 8;
  private static final int METHODID_UPDATE_HOTEL_NAME = 9;
  private static final int METHODID_UPDATE_HOTEL_DESCRIPTION = 10;
  private static final int METHODID_DELETE_HOTEL = 11;
  private static final int METHODID_GET_LIST_OF_HOTELS = 12;
  private static final int METHODID_CREATE_HOTELS_REVIEW = 13;
  private static final int METHODID_GET_HOTELS_REVIEW_BY_ID = 14;
  private static final int METHODID_UPDATE_HOTELS_REVIEW_COMMENT = 15;
  private static final int METHODID_UPDATE_HOTELS_STAR_REVIEW = 16;
  private static final int METHODID_DELETE_HOTEL_REVIEW = 17;
  private static final int METHODID_GET_HOTEL_REVIEWS_CONTAINING = 18;
  private static final int METHODID_CREATE_MUSEUM = 19;
  private static final int METHODID_GET_MUSEUM_BY_ID = 20;
  private static final int METHODID_UPDATE_MUSEUM_NAME = 21;
  private static final int METHODID_UPDATE_MUSEUM_DESCRIPTION = 22;
  private static final int METHODID_DELETE_MUSEUM = 23;
  private static final int METHODID_GET_LIST_OF_MUSEUMS = 24;
  private static final int METHODID_CREATE_MUSEUMS_REVIEW = 25;
  private static final int METHODID_GET_MUSEUMS_REVIEW_BY_ID = 26;
  private static final int METHODID_UPDATE_MUSEUMS_REVIEW_COMMENT = 27;
  private static final int METHODID_UPDATE_MUSEUMS_STAR_REVIEW = 28;
  private static final int METHODID_DELETE_MUSEUMS_REVIEW = 29;
  private static final int METHODID_GET_MUSEUMS_REVIEWS_CONTAINING = 30;
  private static final int METHODID_CREATE_PARK = 31;
  private static final int METHODID_GET_PARK_BY_ID = 32;
  private static final int METHODID_UPDATE_PARK_NAME = 33;
  private static final int METHODID_UPDATE_PARK_DESCRIPTION = 34;
  private static final int METHODID_DELETE_PARK = 35;
  private static final int METHODID_GET_LIST_OF_PARKS = 36;
  private static final int METHODID_CREATE_PARKS_REVIEW = 37;
  private static final int METHODID_GET_PARKS_REVIEW_BY_ID = 38;
  private static final int METHODID_UPDATE_PARKS_REVIEW_COMMENT = 39;
  private static final int METHODID_UPDATE_PARKS_STAR_REVIEW = 40;
  private static final int METHODID_DELETE_PARKS_REVIEW = 41;
  private static final int METHODID_GET_PARKS_REVIEWS_CONTAINING = 42;
  private static final int METHODID_CREATE_RESTAURANT = 43;
  private static final int METHODID_GET_RESTAURANT_BY_ID = 44;
  private static final int METHODID_UPDATE_RESTAURANT_NAME = 45;
  private static final int METHODID_UPDATE_RESTAURANT_DESCRIPTION = 46;
  private static final int METHODID_DELETE_RESTAURANT = 47;
  private static final int METHODID_GET_LIST_OF_RESTAURANT = 48;
  private static final int METHODID_CREATE_RESTAURANTS_REVIEW = 49;
  private static final int METHODID_GET_RESTAURANTS_REVIEW_BY_ID = 50;
  private static final int METHODID_UPDATE_RESTAURANTS_REVIEW_COMMENT = 51;
  private static final int METHODID_UPDATE_RESTAURANTS_STAR_REVIEW = 52;
  private static final int METHODID_DELETE_RESTAURANTS_REVIEW = 53;
  private static final int METHODID_GET_RESTAURANTS_REVIEWS_CONTAINING = 54;
  private static final int METHODID_CREATE_REPORT = 55;
  private static final int METHODID_GET_REPORT_BY_ID = 56;
  private static final int METHODID_DELETE_REPORT = 57;
  private static final int METHODID_GET_LIST_OF_REPORTS = 58;

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
          serviceImpl.createHotel((com.sdj3.protobuf.DataAccess.CategoryToCreate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryCreated>) responseObserver);
          break;
        case METHODID_GET_HOTEL_BY_ID:
          serviceImpl.getHotelById((com.sdj3.protobuf.DataAccess.CategoryById) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Category>) responseObserver);
          break;
        case METHODID_UPDATE_HOTEL_NAME:
          serviceImpl.updateHotelName((com.sdj3.protobuf.DataAccess.CategoryNameToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryNameUpdated>) responseObserver);
          break;
        case METHODID_UPDATE_HOTEL_DESCRIPTION:
          serviceImpl.updateHotelDescription((com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated>) responseObserver);
          break;
        case METHODID_DELETE_HOTEL:
          serviceImpl.deleteHotel((com.sdj3.protobuf.DataAccess.CategoryToDelete) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDeleted>) responseObserver);
          break;
        case METHODID_GET_LIST_OF_HOTELS:
          serviceImpl.getListOfHotels((com.sdj3.protobuf.DataAccess.CitysIdForCategoryList) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfACategory>) responseObserver);
          break;
        case METHODID_CREATE_HOTELS_REVIEW:
          serviceImpl.createHotelsReview((com.sdj3.protobuf.DataAccess.ReviewToCreate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCreated>) responseObserver);
          break;
        case METHODID_GET_HOTELS_REVIEW_BY_ID:
          serviceImpl.getHotelsReviewById((com.sdj3.protobuf.DataAccess.ReviewById) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Review>) responseObserver);
          break;
        case METHODID_UPDATE_HOTELS_REVIEW_COMMENT:
          serviceImpl.updateHotelsReviewComment((com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated>) responseObserver);
          break;
        case METHODID_UPDATE_HOTELS_STAR_REVIEW:
          serviceImpl.updateHotelsStarReview((com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated>) responseObserver);
          break;
        case METHODID_DELETE_HOTEL_REVIEW:
          serviceImpl.deleteHotelReview((com.sdj3.protobuf.DataAccess.ReviewToDelete) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewDeleted>) responseObserver);
          break;
        case METHODID_GET_HOTEL_REVIEWS_CONTAINING:
          serviceImpl.getHotelReviewsContaining((com.sdj3.protobuf.DataAccess.SearchReviewPeremetars) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReveiewList>) responseObserver);
          break;
        case METHODID_CREATE_MUSEUM:
          serviceImpl.createMuseum((com.sdj3.protobuf.DataAccess.CategoryToCreate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryCreated>) responseObserver);
          break;
        case METHODID_GET_MUSEUM_BY_ID:
          serviceImpl.getMuseumById((com.sdj3.protobuf.DataAccess.CategoryById) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Category>) responseObserver);
          break;
        case METHODID_UPDATE_MUSEUM_NAME:
          serviceImpl.updateMuseumName((com.sdj3.protobuf.DataAccess.CategoryNameToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryNameUpdated>) responseObserver);
          break;
        case METHODID_UPDATE_MUSEUM_DESCRIPTION:
          serviceImpl.updateMuseumDescription((com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated>) responseObserver);
          break;
        case METHODID_DELETE_MUSEUM:
          serviceImpl.deleteMuseum((com.sdj3.protobuf.DataAccess.CategoryToDelete) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDeleted>) responseObserver);
          break;
        case METHODID_GET_LIST_OF_MUSEUMS:
          serviceImpl.getListOfMuseums((com.sdj3.protobuf.DataAccess.CitysIdForCategoryList) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfACategory>) responseObserver);
          break;
        case METHODID_CREATE_MUSEUMS_REVIEW:
          serviceImpl.createMuseumsReview((com.sdj3.protobuf.DataAccess.ReviewToCreate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCreated>) responseObserver);
          break;
        case METHODID_GET_MUSEUMS_REVIEW_BY_ID:
          serviceImpl.getMuseumsReviewById((com.sdj3.protobuf.DataAccess.ReviewById) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Review>) responseObserver);
          break;
        case METHODID_UPDATE_MUSEUMS_REVIEW_COMMENT:
          serviceImpl.updateMuseumsReviewComment((com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated>) responseObserver);
          break;
        case METHODID_UPDATE_MUSEUMS_STAR_REVIEW:
          serviceImpl.updateMuseumsStarReview((com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated>) responseObserver);
          break;
        case METHODID_DELETE_MUSEUMS_REVIEW:
          serviceImpl.deleteMuseumsReview((com.sdj3.protobuf.DataAccess.ReviewToDelete) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewDeleted>) responseObserver);
          break;
        case METHODID_GET_MUSEUMS_REVIEWS_CONTAINING:
          serviceImpl.getMuseumsReviewsContaining((com.sdj3.protobuf.DataAccess.SearchReviewPeremetars) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReveiewList>) responseObserver);
          break;
        case METHODID_CREATE_PARK:
          serviceImpl.createPark((com.sdj3.protobuf.DataAccess.CategoryToCreate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryCreated>) responseObserver);
          break;
        case METHODID_GET_PARK_BY_ID:
          serviceImpl.getParkById((com.sdj3.protobuf.DataAccess.CategoryById) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Category>) responseObserver);
          break;
        case METHODID_UPDATE_PARK_NAME:
          serviceImpl.updateParkName((com.sdj3.protobuf.DataAccess.CategoryNameToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryNameUpdated>) responseObserver);
          break;
        case METHODID_UPDATE_PARK_DESCRIPTION:
          serviceImpl.updateParkDescription((com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated>) responseObserver);
          break;
        case METHODID_DELETE_PARK:
          serviceImpl.deletePark((com.sdj3.protobuf.DataAccess.CategoryToDelete) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDeleted>) responseObserver);
          break;
        case METHODID_GET_LIST_OF_PARKS:
          serviceImpl.getListOfParks((com.sdj3.protobuf.DataAccess.CitysIdForCategoryList) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfACategory>) responseObserver);
          break;
        case METHODID_CREATE_PARKS_REVIEW:
          serviceImpl.createParksReview((com.sdj3.protobuf.DataAccess.ReviewToCreate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCreated>) responseObserver);
          break;
        case METHODID_GET_PARKS_REVIEW_BY_ID:
          serviceImpl.getParksReviewById((com.sdj3.protobuf.DataAccess.ReviewById) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Review>) responseObserver);
          break;
        case METHODID_UPDATE_PARKS_REVIEW_COMMENT:
          serviceImpl.updateParksReviewComment((com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated>) responseObserver);
          break;
        case METHODID_UPDATE_PARKS_STAR_REVIEW:
          serviceImpl.updateParksStarReview((com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated>) responseObserver);
          break;
        case METHODID_DELETE_PARKS_REVIEW:
          serviceImpl.deleteParksReview((com.sdj3.protobuf.DataAccess.ReviewToDelete) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewDeleted>) responseObserver);
          break;
        case METHODID_GET_PARKS_REVIEWS_CONTAINING:
          serviceImpl.getParksReviewsContaining((com.sdj3.protobuf.DataAccess.SearchReviewPeremetars) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReveiewList>) responseObserver);
          break;
        case METHODID_CREATE_RESTAURANT:
          serviceImpl.createRestaurant((com.sdj3.protobuf.DataAccess.CategoryToCreate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryCreated>) responseObserver);
          break;
        case METHODID_GET_RESTAURANT_BY_ID:
          serviceImpl.getRestaurantById((com.sdj3.protobuf.DataAccess.CategoryById) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Category>) responseObserver);
          break;
        case METHODID_UPDATE_RESTAURANT_NAME:
          serviceImpl.updateRestaurantName((com.sdj3.protobuf.DataAccess.CategoryNameToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryNameUpdated>) responseObserver);
          break;
        case METHODID_UPDATE_RESTAURANT_DESCRIPTION:
          serviceImpl.updateRestaurantDescription((com.sdj3.protobuf.DataAccess.CategoryDescriptionToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDescriptionUpdated>) responseObserver);
          break;
        case METHODID_DELETE_RESTAURANT:
          serviceImpl.deleteRestaurant((com.sdj3.protobuf.DataAccess.CategoryToDelete) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.CategoryDeleted>) responseObserver);
          break;
        case METHODID_GET_LIST_OF_RESTAURANT:
          serviceImpl.getListOfRestaurants((com.sdj3.protobuf.DataAccess.CitysIdForCategoryList) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ListOfACategory>) responseObserver);
          break;
        case METHODID_CREATE_RESTAURANTS_REVIEW:
          serviceImpl.createRestaurantsReview((com.sdj3.protobuf.DataAccess.ReviewToCreate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCreated>) responseObserver);
          break;
        case METHODID_GET_RESTAURANTS_REVIEW_BY_ID:
          serviceImpl.getRestaurantsReviewById((com.sdj3.protobuf.DataAccess.ReviewById) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.Review>) responseObserver);
          break;
        case METHODID_UPDATE_RESTAURANTS_REVIEW_COMMENT:
          serviceImpl.updateRestaurantsReviewComment((com.sdj3.protobuf.DataAccess.ReviewsCommentToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewCommentUpdated>) responseObserver);
          break;
        case METHODID_UPDATE_RESTAURANTS_STAR_REVIEW:
          serviceImpl.updateRestaurantsStarReview((com.sdj3.protobuf.DataAccess.ReviewStarReviewToUpdate) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewsStarReviewUpdated>) responseObserver);
          break;
        case METHODID_DELETE_RESTAURANTS_REVIEW:
          serviceImpl.deleteRestaurantsReview((com.sdj3.protobuf.DataAccess.ReviewToDelete) request,
              (io.grpc.stub.StreamObserver<com.sdj3.protobuf.DataAccess.ReviewDeleted>) responseObserver);
          break;
        case METHODID_GET_RESTAURANTS_REVIEWS_CONTAINING:
          serviceImpl.getRestaurantsReviewsContaining((com.sdj3.protobuf.DataAccess.SearchReviewPeremetars) request,
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
              .addMethod(getGetHotelByIdMethod())
              .addMethod(getUpdateHotelNameMethod())
              .addMethod(getUpdateHotelDescriptionMethod())
              .addMethod(getDeleteHotelMethod())
              .addMethod(getGetListOfHotelsMethod())
              .addMethod(getCreateHotelsReviewMethod())
              .addMethod(getGetHotelsReviewByIdMethod())
              .addMethod(getUpdateHotelsReviewCommentMethod())
              .addMethod(getUpdateHotelsStarReviewMethod())
              .addMethod(getDeleteHotelReviewMethod())
              .addMethod(getGetHotelReviewsContainingMethod())
              .addMethod(getCreateMuseumMethod())
              .addMethod(getGetMuseumByIdMethod())
              .addMethod(getUpdateMuseumNameMethod())
              .addMethod(getUpdateMuseumDescriptionMethod())
              .addMethod(getDeleteMuseumMethod())
              .addMethod(getGetListOfMuseumsMethod())
              .addMethod(getCreateMuseumsReviewMethod())
              .addMethod(getGetMuseumsReviewByIdMethod())
              .addMethod(getUpdateMuseumsReviewCommentMethod())
              .addMethod(getUpdateMuseumsStarReviewMethod())
              .addMethod(getDeleteMuseumsReviewMethod())
              .addMethod(getGetMuseumsReviewsContainingMethod())
              .addMethod(getCreateParkMethod())
              .addMethod(getGetParkByIdMethod())
              .addMethod(getUpdateParkNameMethod())
              .addMethod(getUpdateParkDescriptionMethod())
              .addMethod(getDeleteParkMethod())
              .addMethod(getGetListOfParksMethod())
              .addMethod(getCreateParksReviewMethod())
              .addMethod(getGetParksReviewByIdMethod())
              .addMethod(getUpdateParksReviewCommentMethod())
              .addMethod(getUpdateParksStarReviewMethod())
              .addMethod(getDeleteParksReviewMethod())
              .addMethod(getGetParksReviewsContainingMethod())
              .addMethod(getCreateRestaurantMethod())
              .addMethod(getGetRestaurantByIdMethod())
              .addMethod(getUpdateRestaurantNameMethod())
              .addMethod(getUpdateRestaurantDescriptionMethod())
              .addMethod(getDeleteRestaurantMethod())
              .addMethod(getGetListOfRestaurantMethod())
              .addMethod(getCreateRestaurantsReviewMethod())
              .addMethod(getGetRestaurantsReviewByIdMethod())
              .addMethod(getUpdateRestaurantsReviewCommentMethod())
              .addMethod(getUpdateRestaurantsStarReviewMethod())
              .addMethod(getDeleteRestaurantsReviewMethod())
              .addMethod(getGetRestaurantsReviewsContainingMethod())
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
