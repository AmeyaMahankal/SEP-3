using Application.DaoInterfaces;
using Application.Logic;
using Application.LogicInterface;
using FileData;
using FileData.DAOs;


var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddScoped<FileContext>();
builder.Services.AddScoped<ICityDao, CityFileDao>();
builder.Services.AddScoped<ICityLogic, CityLogic>();
builder.Services.AddScoped<IHotelDao, HotelFileDao>();
builder.Services.AddScoped<IHotelLogic, HotelLogic>();
builder.Services.AddScoped<IMuseumDao, MuseumFileDao>();
builder.Services.AddScoped<IMuseumLogic, MuseumLogic>();
builder.Services.AddScoped<IParkDao, ParkFileDao>();
builder.Services.AddScoped<IParkLogic, ParkLogic>();
builder.Services.AddScoped<IRestaurantDao, RestaurantFileDao>();
builder.Services.AddScoped<IRestaurantLogic, RestaurantLogic>();
builder.Services.AddControllers();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

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

app.UseAuthorization();
app.UseAuthentication();

app.MapControllers();

app.Run();