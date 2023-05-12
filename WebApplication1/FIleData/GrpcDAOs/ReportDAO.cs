using Application.DaoInterfaces;
using DataAccessClient;
using Domain.DTOs;
using Grpc.Net.Client;
using Report = Domain.Models.Report;

namespace FileData.GrpcDAOs;

public class ReportDAO : IReportDao
{
    private Access.AccessClient client;
    
    public ReportDAO()
    {
        var channel = GrpcChannel.ForAddress("http://localhost:9090");
        client = new Access.AccessClient(channel);
    }
    
    public Task<Report> CreateAsync(Report report)
    {
        
        ReportToCreate request = new ReportToCreate()
        {
            Description = report.Description,
            Reviewid = report.ReviewId,
            Userid = report.UserId
        };

        var send = client.CreateReport(request);
        
        
        return Task.FromResult(report);
    }

    public Task<IEnumerable<Report>> GetAsync(SearchReportPeremitersDto searchReportPeremitersDto)
    {
        Empty request = new Empty();

        var send = client.GetListOfReports(request);

        List<Report> reports = new List<Report>();

        foreach (var VARIABLE in send.Report)
        {
            Report report = new Report(VARIABLE.Userid, VARIABLE.Description, VARIABLE.Reviewid)
            {
                Id = VARIABLE.Id
            };

            reports.Add(report);
        }

        IEnumerable<Report> Ireports = reports;

        return Task.FromResult(Ireports);
    }

    public Task<Report?> GetByIdAsync(int dtoReviewId)
    {
        ReportById request = new ReportById()
        {
            Reportid = dtoReviewId
        };

        var send = client.GetReportById(request);

        Report report = new Report(send.Userid, send.Description, send.Reviewid)
        {
            Id = send.Id
        };
        
        return Task.FromResult<Report?>(report);
    }

    public Task DeleteAsync(int id)
    {
        ReportToDelete request = new ReportToDelete()
        {
            Reportid = id
        };

        var send = client.DeleteReport(request);

        return Task.CompletedTask;
    }
}