namespace Domain.Models;

public class Review
{
 public int Id { get; set; }
 public string Comment { get; set; }
 public int StarReview { get; set; }


 /*public Review(string comment, int starReview)
 {
  Comment = comment;
  StarReview = starReview;
 }*/
}