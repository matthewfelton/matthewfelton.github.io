const D = new Date();
const todayDayNumber = D.getDay();
let forecastDayNumber = todayDayNumber;
const weekDay = new Array(7);
weekDay[0] = "Sunday";
weekDay[1] = "Monday";
weekDay[2] = "Tuesday";
weekDay[3] = "Wednesday";
weekDay[4] = "Thursday";
weekDay[5] = "Friday";
weekDay[6] = "Saturday";


const apiURL = "//api.openweathermap.org/data/2.5/forecast?id=5585010&units=imperial&appid=300a54035f682f83ebf3aa7d44d398ba";

//Go fetch it and then wait for a response.
fetch(apiURL)
  .then((response) => response.json())
  .then((weatherInfo) => {
    //Once it comes back, display it to the console.
    console.log(weatherInfo);
    console.log(weatherInfo.city.name);

    const weatherlist = weatherInfo.list;
    document.getElementById('currently').textContent = weatherlist[0].weather[0].description;
    document.getElementById('temp').textContent = Math.round(weatherlist[0].main.temp);
    document.getElementById('humidity').textContent = weatherlist[0].main.humidity;
    document.getElementById('windSpeed').textContent = Math.round(weatherlist[0].wind.speed);
    const temperature = parseFloat(weatherlist[0].main.temp)
    const wSpeed = parseFloat(weatherlist[0].wind.speed)
    
    
   

    
  
    
     

 }); //end of "then" fat arrow function
