import pokemonjs from "./pokemon.js";
import { localStorage } from "./ls.js";

const ls = new localStorage();
const pokemon = new pokemonjs();
const monList = document.querySelector(".mon_list")
let fullPokemonList = {};
let currentList = 'full';

pokemon.getInitialPokemonList().then((res) => {
    monList.innerHTML = "";
    fullPokemonList = res;
    if (fullPokemonList && Object.keys(fullPokemonList).length != 0) {
        createList(Object.keys(fullPokemonList));
    } else {
        monList.innerHTML = "ERROR: Pokémon have escaped Dex... Beware Jurassic Pokémon Park"
    }
}).finally((e) => {
    addEventListenerToPokemon(Object.keys(fullPokemonList));
    pokemon.getRestOfPokemon(fullPokemonList).then((res) => {
        createList(Object.keys(res).slice(151));
        fullPokemonList = res;
        addEventListenerToPokemon(Object.keys(fullPokemonList));
    });
})

function addEventListenerToPokemon(arr) {
    arr.forEach((e) => {
        document
            .getElementById(`${fullPokemonList[e].id}check`)
            .addEventListener("click", () => {
                document.getElementById(fullPokemonList[e].id).classList.toggle("collected");
                document.getElementById(fullPokemonList[e].id).classList.toggle("uncollected");
                fullPokemonList[e].collected = !fullPokemonList[e].collected;
                ls.set('pokemonList', fullPokemonList);
        });
        document
            .getElementById(`${fullPokemonList[e].id}shiny`)
            .addEventListener("click", () => {
                document.getElementById(`${fullPokemonList[e].id}image`).src = !fullPokemonList[e].shiny ? fullPokemonList[e].simage : fullPokemonList[e].image;
                fullPokemonList[e].shiny = !fullPokemonList[e].shiny;
                ls.set('pokemonList', fullPokemonList);
        });
        document.getElementById(`${fullPokemonList[e].id}check`).checked = fullPokemonList[e].collected;
        document.getElementById(`${fullPokemonList[e].id}shiny`).checked = fullPokemonList[e].shiny;
    });
}

function createList (arr) {
    arr.forEach((e) => {
        monList.innerHTML += 
        `<li class="card ${fullPokemonList[e].collected ? "collected" : "uncollected"}" id="${fullPokemonList[e].id}">
            <input type="checkbox" id="${fullPokemonList[e].id}check"/>
            <p>${fullPokemonList[e].name[0].toUpperCase()}${fullPokemonList[e].name.slice(1)}</p>
            <img class="type" src="images/${fullPokemonList[e].typeOne}.png" loading="lazy"/></img>
            ${fullPokemonList[e].typeTwo ? `<img class='type' src='images/${fullPokemonList[e].typeTwo}.png' loading='lazy'/></img>` : ''}
            <img id="${fullPokemonList[e].id}image" src='${fullPokemonList[e].shiny ? fullPokemonList[e].simage : fullPokemonList[e].image}' loading="lazy"></img>
            <input type="checkbox" id="${fullPokemonList[e].id}shiny"/>
        </li>
        `
    });
}

function allButton() {
    monList.innerHTML = "";
    createList(Object.keys(fullPokemonList));
    addEventListenerToPokemon(Object.keys(fullPokemonList));
    currentList = 'full';
}
document.getElementById("allBtn").addEventListener("click", () => {
    allButton();
})

function collectedButton() {
    monList.innerHTML = "";
    const displayList = Object.keys(fullPokemonList).filter((e) => fullPokemonList[e].collected);
    createList(displayList);
    addEventListenerToPokemon(displayList);
    currentList = 'collected';
}
document.getElementById("collectedBtn").addEventListener("click", () => {
    collectedButton();
})

function uncollectedButton() {
    monList.innerHTML = "";
    const displayList = Object.keys(fullPokemonList).filter((e) => !fullPokemonList[e].collected);
    createList(displayList);
    addEventListenerToPokemon(displayList);
    currentList = 'unCollected';
}
document.getElementById("uncollectedBtn").addEventListener("click", () => {
    uncollectedButton();
})

document.getElementById("refresh").addEventListener("click", () => {
    monList.innerHTML = "";
    switch (currentList) {
        case 'collected':
            collectedButton();
            break;
        case 'unCollected':
            uncollectedButton();
            break;
        case 'full':
        default:
            allButton();
            break;
    }
})