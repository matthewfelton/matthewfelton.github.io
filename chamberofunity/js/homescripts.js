function addDays(date, days) {
  var result = new Date(date);
  result.setDate(result.getDate() + days);
  return result;
}

const today = new Date();
const todayDayNumber = today.getDay();

//console.log(time);

const weekDay = new Array(7);
weekDay[0] = "Sunday";
weekDay[1] = "Monday";
weekDay[2] = "Tuesday";
weekDay[3] = "Wednesday";
weekDay[4] = "Thursday";
weekDay[5] = "Friday";
weekDay[6] = "Saturday";

const apiURL = "//api.openweathermap.org/data/2.5/onecall?lat=34.802868&lon=-86.971672&units=imperial&appid=300a54035f682f83ebf3aa7d44d398ba";

fetch(apiURL)
  .then((response) => response.json())
  .then((weatherInfo) => {
    
    //console.log(weatherInfo);


    document.getElementById('currently').textContent = weatherInfo.current.weather[0].description;
    document.getElementById('temp').textContent = Math.round(aweatherInfo.current.temp);
    document.getElementById('humidity').textContent = weatherInfo.current.humidity;

    //console.log(apiData.alert);

    if (apiData.alert == undefined){
      document.getElementById("close").classList.add("disabled");
    } else {
      document.getElementById('weatheralert').textContent = weatherInfo.alerts[0].description;
      document.getElementById("alerttitle").textContent = weatherInfo.alerts[0].event;
    }
    
    var i;
       
    for (i = 0; i < 3; i++) {
         let forecastDayNumber = addDays(today, i).getDay()
      

  

        
            let theDay = document.createElement("div");
            theDay.classList.add("w_box");
  

            let dayName = document.createElement("h4");
            let theDayName = document.createElement("span");
            theDayName.textContent = weekDay[forecastDayNumber];
            dayName.appendChild(theDayName);
            

            let iconcode = weatherInfo.daily[i].weather[0].icon;
            let iconPath = "//openweathermap.org/img/w/" + iconcode + ".png";
            let weatherIcon = document.createElement("img");
            weatherIcon.src = iconPath;
            weatherIcon.setAttribute("alt", weatherInfo.daily[0].weather[0].description)
            weatherIcon.classList.add("w-icon");
            
            let theTemp = document.createElement("p");
            theTemp.textContent = "Temp: " + Math.round(weatherInfo.daily[i].temp.day) + "\xB0";
  
    
            theDay.appendChild(dayName);
            theDay.appendChild(weatherIcon);
            theDay.appendChild(theTemp);
           
  
            document.getElementById("weatherforecast").appendChild(theDay);
          
            
        } 
   
 }); 
 function removeAlert() {
    
  document.getElementById("close").classList.add("disabled");
}