const requestURL = 'https://byui-cit230.github.io/weather/data/towndata.json';
fetch(requestURL)
.then(function (response) {
    return response.json();
})
.then(function (jsonObject) {
    const towns = jsonObject["towns"];
    for (let i = 0; i < towns.length; i++) {
        if (towns[i].name == "Preston") {

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

let dayofweek = d.getDay();
if (dayofweek == 5) {
    document.getElementById("popup").classList.toggle("showme");
} else {
    document.getElementById("popup").classList.toggle("hideme");
}
console.log(dayofweek);
