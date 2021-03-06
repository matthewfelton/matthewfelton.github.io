const day = new Date();
const todayDayNumber = day.getDay();

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
    //console.log(weatherInfo);
    //console.log(weatherInfo.city.name);
    let forecastDayNumber = todayDayNumber;
    const weatherlist = weatherInfo.current;

    document.getElementById('currently').textContent = weatherlist[0].weather[0].description;
    document.getElementById('temp').textContent = Math.round(weatherlist[0].main.temp);
    document.getElementById('humidity').textContent = weatherlist[0].main.humidity;
    document.getElementById('windSpeed').textContent = Math.round(weatherlist[0].wind.speed);
    const temperature = parseFloat(weatherlist[0].main.temp)
    const wSpeed = parseFloat(weatherlist[0].wind.speed)
    if (wSpeed > 3 && temperature <= 50){
      let wc = Math.round(35.74 + (0.6215 * temperature) - (35.75 * Math.pow(wSpeed, 0.16)) + (0.4275 * temperature * Math.pow(wSpeed, 0.16)));
      document.getElementById("windChill").textContent = wc + "\xB0F;";
    } else {
      document.getElementById("windChill").textContent = "None";
   }
    
    for (i = 0; i < weatherlist.length; i++) {
      let time = weatherlist[i].dt_txt;
      //noon in current city
      if (time.includes("18:00:00")) {
          forecastDayNumber += 1;
          if (forecastDayNumber === 7) {forecastDayNumber = 0;}

          let theDay = document.createElement("div");
          theDay.classList.add("w_box");

          let dayName = document.createElement("h3");
          let theDayName = document.createElement("span");
          theDayName.textContent = weekDay[forecastDayNumber];
          dayName.appendChild(theDayName);

          let iconcode = weatherlist[i].weather[0].icon;
          let iconPath = "//openweathermap.org/img/w/" + iconcode + ".png";
          let weatherIcon = document.createElement("img");
          weatherIcon.src = iconPath;
          weatherIcon.setAttribute("alt", weatherlist[0].weather[0].description)
          weatherIcon.classList.add("w-icon");
          

          let theTemp = document.createElement("p");
          theTemp.textContent = "Temp: " + Math.round(weatherlist[i].main.temp) + "\xB0";

  
          theDay.appendChild(dayName);
          theDay.appendChild(weatherIcon);
          theDay.appendChild(theTemp);
         

          document.getElementById("weatherforecast").appendChild(theDay);
        
        
        } //end if
      } //end for

 }); //end of "then" fat arrow function
 
 const requestURL = 'https://byui-cit230.github.io/weather/data/towndata.json';
 fetch(requestURL)
 .then(function (response) {
     return response.json();
 })
 .then(function (jsonObject) {
     const towns = jsonObject["towns"];
     for (let i = 0; i < towns.length; i++) {
         if (towns[i].name == "Fish Haven") {
 
            let eventBox = document.createElement("div");
            eventBox.classList.add("events");
            for (let x = 0; x < towns[i].events.length; x++) {
                let event = document.createElement("p");
                event.textContent = towns[i].events[x];
                eventBox.appendChild(event);
                document.getElementById("event_box").appendChild(eventBox);
            }
 
         }
     }
 })