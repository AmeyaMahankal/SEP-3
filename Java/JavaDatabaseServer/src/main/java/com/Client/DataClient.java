package com.Client;

import com.sdj3.protobuf.AccessGrpc;
import com.sdj3.protobuf.DataAccess;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class DataClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost",9090)
                .usePlaintext().build();

        AccessGrpc.AccessBlockingStub blockingStub=AccessGrpc.newBlockingStub(managedChannel);

        //CREATE USER--

   /*    DataAccess.UserCreate request=DataAccess.UserCreate.newBuilder()
                .setUserName("sdgfagwqerqw")
                .setPassWord("rsyhtr5uhyrth").build();

        DataAccess.UserCreateResponse response= blockingStub.createUser(request);
        System.out.println("Received and created ==> " + response.getUserName());

        //GET USERNAME--

      DataAccess.UserGetUsername request2= DataAccess.UserGetUsername.newBuilder()
                .setUsername("bobby")
                .build();

        DataAccess.User response2 =blockingStub.getByUsername(request2);
        System.out.println(response2.getPassword());



        // GET ALL REPORTS

        DataAccess.Empty empty= DataAccess.Empty.newBuilder().setEmpty("sadf").build();
        DataAccess.ListOfReports reports= blockingStub.getListOfReports(empty);
        System.out.println(reports.getReportList());





        //Review

        DataAccess.ReviewToCreate reviewToCreate= DataAccess.ReviewToCreate.newBuilder().setComment("sdafsdg")
                .setStarreview(3)
                .setUserid(1)
                .setCategoryid(2)
                .setCategoryname("esdefsdg")
                .setCategorytype("safdsg").build();

        DataAccess.ReviewCreated asfsaf= blockingStub.createReview(reviewToCreate);

        System.out.println(reviewToCreate);


        DataAccess.ReviewToCreate review= DataAccess.ReviewToCreate.newBuilder()
                .setComment("345146")
                .setStarreview(2)
                .setUserid(2).setCategoryid(4)
                .setCategoryname("twqrer")
                .setCategorytype("asfdsf")
        .build();

        DataAccess.ReviewCreated asfdsf= blockingStub.createReview(review);
        System.out.println("Received and created ==> " + asfdsf.getComment() + asfdsf.getStarreview()  ) ;


        DataAccess.ReviewsCommentToUpdate request2= DataAccess.ReviewsCommentToUpdate.newBuilder()
                .setId(1)
                .setComment("very good")
                .build();

        DataAccess.ReviewCommentUpdated response2 =blockingStub.updateReviewComment(request2);
        System.out.println(response2);
*/


        DataAccess.ReviewToDelete request=DataAccess.ReviewToDelete.newBuilder()
                .setId(2).build();

        DataAccess.ReviewDeleted response= blockingStub.deleteReview(request);
        System.out.println("Received and created ==> " + response.getCode());


    }
}
