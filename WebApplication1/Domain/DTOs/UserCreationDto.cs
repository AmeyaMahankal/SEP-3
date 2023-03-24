namespace Domain.DTOs;

public class UserCreationDto
{
    public string UserName { get; }
    public string PassWord { get; }

    public UserCreationDto(string userName,string password)
    {
        UserName = userName;
        PassWord = password;

    }
}