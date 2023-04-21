namespace Domain.DTOs;

public class SearchReportPeremitersDto
{
    public int? ReportContainsId { get; }
    

    public SearchReportPeremitersDto(int? reportContainsId)
    {
        ReportContainsId = reportContainsId;
    }
}