﻿using Domain.DTOs;
using sep3.DTOs;
using SEP3lu;

namespace Application.LogicInterface;

public interface IHotelLogic
{
    
        Task<Hotel> CreateAsync(HotelCreationDto hotelToCreate);
        Task<IEnumerable<Hotel>> GetAsync(SearchHotelParametersDto searchParameters);
        Task UpdateAsync(HotelUpdateDto dto);

        Task DeleteAsync(int id);

    
}
