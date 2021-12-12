import pokemonjs from "./pokemon.js";
import { localStorage } from "./ls.js";

const ls = new localStorage();
const pokemon = new pokemonjs();
const monList = document.querySelector(".mon_list")
let fullPokemonList = {};
let currentList = 'full';
let bottomNumber = 12;

pokemon.getInitialPokemonList().then((res) => {
    monList.innerHTML = "";
    fullPokemonList = res;
    if (fullPokemonList && Object.keys(fullPokemonList).length != 0) {
        createList(Object.keys(fullPokemonList).slice(0, bottomNumber));
    } else {
        monList.innerHTML = "ERROR: Pokémon have escaped Dex... Beware Jurassic Pokémon Park"
    }
}).finally((e) => {
    addEventListenerToPokemon(Object.keys(fullPokemonList).slice(0, bottomNumber));
    pokemon.getRestOfPokemon(fullPokemonList).then((res) => {
        fullPokemonList = res;
    });
})

function addEventListenerToPokemon(arr) {
    arr.forEach((e) => {
        document
            .getElementById(`${fullPokemonList[e].id}check`)
            .addEventListener("click", () => {
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
        `<li class="card" id="${fullPokemonList[e].id}">
            <input type="checkbox" class="checkOne" id="${fullPokemonList[e].id}check"></input>
            <img class="ball_icon"src="images/pokeball.png"></img>
            <input type="checkbox" class="checkTwo" id="${fullPokemonList[e].id}shiny"></input>
            <img class="shiny_icon"src="images/shiny.png"></img>
            <h2>${fullPokemonList[e].name[0].toUpperCase()}${fullPokemonList[e].name.slice(1)}</h2>
            <img class="typeOne" src="images/${fullPokemonList[e].typeOne}.png" loading="lazy"/></img>
            ${fullPokemonList[e].typeTwo ? `<img class='typeTwo' src='images/${fullPokemonList[e].typeTwo}.png' loading='lazy'/></img>` : ''}
            <img class="sprites" id="${fullPokemonList[e].id}image" src='${fullPokemonList[e].shiny ? fullPokemonList[e].simage : fullPokemonList[e].image}' loading="lazy"></img>
        </li>
        `
    });
}

function allButton() {
    monList.innerHTML = "";
    const displayList = Object.keys(fullPokemonList);
    createList(displayList);
    addEventListenerToPokemon(displayList);
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

document.getElementById("next").addEventListener("click", () => {
    monList.innerHTML = "";
    let orgBottomNumber = bottomNumber;
    bottomNumber += 12;
    if (bottomNumber > 1118) {
        orgBottomNumber = 1118 - 12;
        bottomNumber = 1118;
    }
    const displayList = Object.keys(fullPokemonList).slice(orgBottomNumber, bottomNumber);
    createList(displayList);
    addEventListenerToPokemon(displayList);
})

document.getElementById("prev").addEventListener("click", () => {
    monList.innerHTML = "";
    const orgBottomNumber = bottomNumber - 24;
    bottomNumber = bottomNumber - 12;
    if (bottomNumber < 0) {
        bottomNumber = 12;
    }
    const displayList = Object.keys(fullPokemonList).slice(orgBottomNumber, bottomNumber);
    createList(displayList);
    addEventListenerToPokemon(displayList);
})