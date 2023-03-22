namespace Domain.DTOs;

public class SearchUserParametersDto
{
    public string? UsernameContains { get; }
    //public string PasswordContains{get;}

    public SearchUserParametersDto(string? usernameContains/*, string passwordContains*/)
    {
        UsernameContains = usernameContains;
        //PasswordContains = passwordContains;
    }
    
}