
using Grpc.Net.Client;

class Programs
{
    static async Task Main(string[] args)
    {
        var inPut = new UserGetUsername();
        var channel = GrpcChannel.ForAddress("http://localhost:9090");
        var client = new Access.AccessClient(channel);
        UserGetUsername request = new UserGetUsername
        {
            Username = "jeff"
        };
        User reply = await client.GetByUsernameAsync(request);
        Console.WriteLine(reply.Password);


    }
    
    
}