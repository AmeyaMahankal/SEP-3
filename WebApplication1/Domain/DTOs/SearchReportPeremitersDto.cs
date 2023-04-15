namespace Shared.DTOs;

public class SearchReportPeremitersDto
{
    public int? ReportContainsId { get; }

    public SearchReportPeremitersDto(int? reportContainsId)
    {
        ReportContainsId = reportContainsId;
    }
}