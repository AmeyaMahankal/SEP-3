﻿using Application.DaoInterfaces;
using Application.LogicInterface;
using sep3.DTOs;
using SEP3lu;

namespace Application.Logic;

public class RestaurantLogic: IRestaurantLogic
{
    private readonly IRestaurantDao restaurantDao;
    
    public RestaurantLogic(IRestaurantDao restaurantDao)
    {
        this.restaurantDao = restaurantDao;

    }

    public async Task<Restaurant> CreateAsync(RestaurantCreationDto dto)
    {
        Restaurant toCreate = new Restaurant(dto.Name,dto.Description)
        {
            Name = dto.Name
            , Description = dto.Description,
            Id = dto.Id

        };

        Restaurant created = await restaurantDao.CreateAsync(toCreate); 
    
        return created;
    }

    public Task<IEnumerable<Restaurant>> GetAsync(SearchRestaurantParametersDto searchRestaurantParameters)
    {
        return restaurantDao.GetAsync(searchRestaurantParameters);
    }

    public async Task UpdateAsync(RestaurantCreationDto dto)
    {
        Restaurant existing = await restaurantDao.GetByIdAsync(dto.Id);
        if (existing == null)
        {
            throw new Exception($"Restaurant with ID {dto.Id} not found!");
        }

        Restaurant? restaurant = null;
        if (dto.Id != null)
        {
            restaurant = await restaurantDao.GetByIdAsync(dto.Id);
            if (restaurant == null)
            {
                throw new Exception($"Restaurant with id {dto.Id} was not found.");
            }
        }


        string nameToUse = dto.Name ?? existing.Name;

        string descToUseToUse = dto.Description ?? existing.Description;


        Restaurant updated = new(nameToUse, descToUseToUse);
        {
            updated.Name = nameToUse;
            updated.Description = descToUseToUse;
            updated.Id = existing.Id;
        }
        await restaurantDao.UpdateAsync(updated);
    }


    public async Task DeleteAsync(int id)
    {
        Restaurant? restaurant = await restaurantDao.GetByIdAsync(id);
        if (restaurant == null)
        {
            throw new Exception("not found!");
        }

        await restaurantDao.DeleteAsync(id);
    }

   
}