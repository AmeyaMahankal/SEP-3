package com.server;

import com.database.DAOImpl;
import com.models.Animal;
import com.models.Product;
import com.sdj3.protobuf.RetrieverGrpc;
import com.sdj3.protobuf.RetrieverOuterClass;
import io.grpc.stub.StreamObserver;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RetrieverServer extends RetrieverGrpc.RetrieverImplBase {
    public RetrieverServer() throws SQLException {
    }
    DAOImpl dao= new DAOImpl();
    List<Integer> regs= new ArrayList<>();
    List<String> prods= new ArrayList<>();


    @Override
    public void registrationNumbersRetriever(RetrieverOuterClass.TextInput request,
                                             StreamObserver<RetrieverOuterClass.TextOutput>
                                                     responseObserver) throws SQLException {
        regs= dao.getRegistrationNumbers(request.getInput().toString());
        System.out.println("recived req ==> " + request.toString() );
        RetrieverOuterClass.TextOutput output =
                RetrieverOuterClass.TextOutput.newBuilder()
                        .setOutput(regs.toString()).setCode(200).build();
        responseObserver.onNext(output);
        responseObserver.onCompleted();}

    @Override
    public void productsRetriever(RetrieverOuterClass.TextInput request, StreamObserver<RetrieverOuterClass.TextOutput> responseObserver) throws SQLException {
        prods= dao.getProducts(request.getInput().toString());
        System.out.println("recived req ==> " + request.toString());
        RetrieverOuterClass.TextOutput output =
                RetrieverOuterClass.TextOutput.newBuilder()
                        .setOutput(prods.toString()).setCode(200).build();
        responseObserver.onNext(output);
        responseObserver.onCompleted();}
    }

