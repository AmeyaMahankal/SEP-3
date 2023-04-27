﻿using Application.DaoInterfaces;
using Application.LogicInterface;
using Domain.DTOs;
using Domain.Models;

namespace Application.Logic;

public class ReportLogic: IReportLogic
{ 
    
    private readonly IReportDao ReportDao;
    private readonly IReviewDao ReviewDao;


    public ReportLogic(IReportDao reportDao, IReviewDao reviewDao)
    {
        this.ReportDao = reportDao;
        this.ReviewDao = reviewDao;
    }

    public async Task<Report> CreateAsync(ReportCreationDto dto)
    {
        Review? review = await ReviewDao.GetByIdAsync(dto.ReviewID);
        if (review==null)
        {
            throw new Exception($"Review with id {dto.ReviewID} was not found.");
        }
        
        Report report = new Report(dto.Description, dto.ReviewID, review);
        Report created = await ReportDao.CreateAsync(report);
        return created;
    }

    
    
    public Task<IEnumerable<Report>> GetAsync(SearchReportPeremitersDto searchReportPeremitersDto)
    {
        return ReportDao.GetAsync(searchReportPeremitersDto);
    }

    public async Task DeleteAsync(int id)
    {
        Report? report = await ReportDao.GetByIdAsync(id);
        if (report == null)
        {
            throw new Exception($"Report with ID {id} was not found!");
        }

        await ReportDao.DeleteAsync(id);
    }
}