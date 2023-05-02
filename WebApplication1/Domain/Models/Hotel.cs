namespace SEP3lu;

public class Hotel
{
   public int Id { get; set; }
      public string Name { get; set; }
      public string Description { get; set; }
      
  
      public Hotel ( string name, string description)
      {
          
          Name = name;
          Description = description;
      }
}