import { pokemonjs } from "./pokemon.js";

const pokemon = new pokemonjs();
const monList = document.querySelector(".mon_list")

const updatePokedex = () => {
    monList.innerHTML = "";
    if (pokemon.fullList != "") {
        pokemon.fullList.array.forEach((e) => {
            monList.innerHTML += 
            `<li class="card ${e.caught ? "collected" : ""}" id="${e.id}">
            <input type="checkbox" id="${e.id}check/>`
        });
    } else {
        monList.innerHTML = "ERROR: Array is empty"
    }
    if (pokemon.fullList != "") {
        pokemon.fullList.forEach((e, i) => {
            document
                .getElementById(`${e.id}check`)
                .addEventListener("click", () => {
                    pokemon.updateList(i);
                    document.getElementById(e.id).classList.toggle("collected");
                    updatePokedex();
            });
        });
    } else if (pokemon.caughtList != "") {
        pokemon.caughtList.forEach((e, i) => {
            document
                .getElementById(`${e.id}check`)
                .addEventListener("click", () => {
                    pokemon.updateList(i);
                    document.getElementById(e.id).classList.toggle("collected");
                    document.getElementById(e.id).classList.toggle("hidden");
                    updatePokedex();
            });
        });
    } else {
        pokemon.uncaughtList.forEach((e, i) => {
            document
                .getElementById(`${e.id}check`)
                .addEventListener("click", () => {
                    pokemon.updateList(i);
                    document.getElementById(e.id).classList.toggle("uncollected");
                    document.getElementById(e.id).classList.toggle("hidden");
                    updatePokedex();
            });
        });
    }
}
updatePokedex();
