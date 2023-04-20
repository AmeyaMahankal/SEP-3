// See https://aka.ms/new-console-template for more information

using ConsoleAppJ;
using Grpc.Net.Client;


    Console.WriteLine("Starting connection");
    using var channel = GrpcChannel.ForAddress("http://localhost:9090");
    var client = new Retriever.RetrieverClient(channel);
    Console.WriteLine("Connection made");
    TextInput t1 = new TextInput();
    t1.Input = "chicken";
    Console.WriteLine("Sending to java");
    TextOutput reply =  client.ProductsRetriever(t1);
    Console.WriteLine(reply.Output);



