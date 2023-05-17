using System.Text;
using Application.DaoInterfaces;
using Application.Logic;
using Application.LogicInterface;
using Domain.Auth;
using FileData;
using FileData.DAOs;
using FileData.GrpcDAOs;
using Microsoft.AspNetCore.Authentication.JwtBearer;
using Microsoft.IdentityModel.Tokens;
using WebApplication1.Services;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddScoped<FileContext>();

builder.Services.AddScoped<IUserDao, UserDAO>();  
builder.Services.AddScoped<IUserLogic, UserLogic>();

builder.Services.AddScoped<IPostDao, PostFileDao>();
builder.Services.AddScoped<IPostLogic, PostLogic>();
builder.Services.AddScoped<ICityDao, CityFileDao>();
builder.Services.AddScoped<ICityLogic, CityLogic>();

//Hotels controllers
builder.Services.AddScoped<IHotelDao, HotelFileDao>();
builder.Services.AddScoped<IHotelLogic, HotelLogic>();
builder.Services.AddScoped<IHotelsReviewDao, HotelsReviewDao>(); 
builder.Services.AddScoped<IHotelsReviewLogic, HotelsReviewLogic>();

//Museums controllers
builder.Services.AddScoped<IMuseumDao, MuseumDAO>();
builder.Services.AddScoped<IMuseumLogic, MuseumLogic>();
builder.Services.AddScoped<IMuseumsReviewDao, MuseumsReviewDao>(); 
builder.Services.AddScoped<IMuseumsReviewLogic, MuseumsReviewLogic>();

//Parks controllers
builder.Services.AddScoped<IParkDao, ParkDAO>();
builder.Services.AddScoped<IParkLogic, ParkLogic>();
builder.Services.AddScoped<IParksReviewDao, ParksReviewDao>(); 
builder.Services.AddScoped<IParksReviewLogic, ParksReviewLogic>();

//Restaurants controllers
builder.Services.AddScoped<IRestaurantDao, RestaurantDAO>();
builder.Services.AddScoped<IRestaurantLogic, RestaurantLogic>();
builder.Services.AddScoped<IRestaurantsReviewDao, RestaurantsReviewDao>(); 
builder.Services.AddScoped<IRestaurantsReviewLogic, RestaurantsReviewLogic>();

//Reports controllers
builder.Services.AddScoped<IReportDao, ReportDAO>();
builder.Services.AddScoped<IReportLogic, ReportLogic>();

builder.Services.AddScoped<IAuthService, AuthService>();

builder.Services.AddControllers();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

builder.Services.AddAuthentication(JwtBearerDefaults.AuthenticationScheme).AddJwtBearer(options =>
{
    options.RequireHttpsMetadata = false;
    options.SaveToken = true;
    options.TokenValidationParameters = new TokenValidationParameters()
    {
        ValidateIssuer = true,
        ValidateAudience = true,
        ValidAudience = builder.Configuration["Jwt:Audience"],
        ValidIssuer = builder.Configuration["Jwt:Issuer"],
        IssuerSigningKey = new SymmetricSecurityKey(Encoding.UTF8.GetBytes(builder.Configuration["Jwt:Key"]))
    };
});

AuthorizationPolicies.AddPolicies(builder.Services);

var app = builder.Build();

app.UseCors(x => x
    .AllowAnyMethod()
    .AllowAnyHeader()
    .SetIsOriginAllowed(origin => true) // allow any origin
    .AllowCredentials());

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.UseHttpsRedirection();

app.UseAuthentication();

app.UseAuthorization();

app.MapControllers();

app.Run();