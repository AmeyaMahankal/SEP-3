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

   /*     //CREATE USER--

      DataAccess.UserCreate request=DataAccess.UserCreate.newBuilder()
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


        DataAccess.ReviewsCommentToUpdate reviewsCommentToUpdate= DataAccess.ReviewsCommentToUpdate.newBuilder()
                .setId(1)
                .setComment("very good")
                .build();

        DataAccess.ReviewCommentUpdated reviewCommentUpdated =blockingStub.updateReviewComment(reviewsCommentToUpdate);
        System.out.println(reviewCommentUpdated);



        DataAccess.ReviewToDelete reviewToDelete=DataAccess.ReviewToDelete.newBuilder()
                .setId(2).build();

        DataAccess.ReviewDeleted reviewDeleted= blockingStub.deleteReview(reviewToDelete);
        System.out.println("Received and created ==> " + reviewDeleted.getCode());


        DataAccess.CategoryForReviewList categoryForReviewList= DataAccess.CategoryForReviewList.newBuilder().setCategoryid(1)
                .setCategoryname("lknlknl")
                .setCategorytype("sadfsdg")
                .build();
        DataAccess.ReveiewList reveiewList= blockingStub.getListOfReviews(categoryForReviewList);
        System.out.println(reveiewList.getReviewsList());



        DataAccess.ReviewStarReviewToUpdate reviewStarReviewToUpdate= DataAccess.ReviewStarReviewToUpdate.newBuilder()
                .setId(1)
                .setStarreview(5)
                .build();

        DataAccess.ReviewsStarReviewUpdated re =blockingStub.updateStarReview(reviewStarReviewToUpdate);
        System.out.println(re);


        //REPORTS

        DataAccess.Empty empty= DataAccess.Empty.newBuilder().setEmpty("sadf").build();
        DataAccess.ListOfReports reports= blockingStub.getListOfReports(empty);
        System.out.println(reports.getReportList());




        DataAccess.ReportToDelete built=DataAccess.ReportToDelete.newBuilder()
                .setReportid(2).build();

        DataAccess.ReportDeleted reportDeleted= blockingStub.deleteReport(built);
        System.out.println("Received and created ==> " + reportDeleted.getCode());

        DataAccess.ReportById reportById= DataAccess.ReportById.newBuilder()
                .setReportid(3)
                .build();

        DataAccess.Report whatever =blockingStub.getReportById(reportById);
        System.out.println(whatever.toString());




        DataAccess.ReportToCreate reportToCreate= DataAccess.ReportToCreate.newBuilder()
                .setUserid(1)
                .setDescription("sdafsdg")
                .setReviewid(2)
                .build();

        DataAccess.ReportCreated reportCreated= blockingStub.createReport(reportToCreate);

        System.out.println(reportCreated);*/

    }
}
