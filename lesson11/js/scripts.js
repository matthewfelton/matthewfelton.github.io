function toggleMenu() {
    
    document.getElementById("primaryNav").classList.toggle("disabled");
    document.getElementById("primaryOpen").classList.toggle("disabled");
    document.getElementById("primaryClose").classList.toggle("disabled");
}

let daynames = [
    "Sunday",
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday"
];
let months = [
    "January",
    "February",
    "March",
    "April",
    "May",
    "June",
    "July",
    "August",
    "September",
    "October",
    "November",
    "December"
];
let d = new Date();
let dayName = daynames[d.getDay()];
let monthName = months[d.getMonth()];
let year = d.getFullYear()
let fulldate = dayName + ", " + monthName + " " + d.getDate() + " " + year;

document.getElementById("getYear").textContent = year;
document.getElementById("currentYear").textContent = fulldate;


//const today = new Date();
//const dayNumber = today.getDay();
//const promo = document.getElementById("popup")
//if (dayNumber == 5) {
//    element.classList.add("showme");
//} else {
//    element.classList.add("hideme");
//}

WebFont.load({
    google: {
        families: ["Patua One", "Merriweather"]
    }
});

function changeSeverity(val) {
    document.getElementById('stormseverity').innerHTML = val; 
  }