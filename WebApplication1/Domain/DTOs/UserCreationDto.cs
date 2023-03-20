namespace Domain.DTOs;

public class UserCreationDto
{
    public string UserName { get; }
    public string passWord { get; }

    public UserCreationDto(string userName,string password)
    {
        UserName = userName;
        passWord = password;

    }
}