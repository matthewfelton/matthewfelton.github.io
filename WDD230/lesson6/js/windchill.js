//The formula to calculate the wind chill factor is LaTeX:
//f=35.74+0.6215\:t-35.75\:s^{0.16}+0.4275\:t\:s^{0.16}f = 35.74 + 0.6215 t − 35.75 s 0.16 + 0.4275 t s 0.16,
//where f is the wind chill factor in Fahrenheit, t is the air average temperature in Fahrenheit, 
//and s is the wind speed in miles per hour.

const temperature = parseFloat(document.getElementById("temp").textContent);
const wSpeed = parseFloat(document.getElementById("windSpeed").textContent);
if (wSpeed > 3 && temperature <= 50){
    let wc = Math.round(35.74 + (0.6215 * temperature) - (35.75 * Math.pow(wSpeed, 0.16)) + (0.4275 * temperature * Math.pow(wSpeed, 0.16)));
    document.getElementById("windChill").textContent = wc + "\xB0F;";
}else {
    document.getElementById("windChill").textContent = "None";
}