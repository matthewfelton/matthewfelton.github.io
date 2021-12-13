import pokemonjs from "./pokemon.js";
import { localStorage } from "./ls.js";

const ls = new localStorage();
const pokemon = new pokemonjs();
const monList = document.querySelector(".mon_list")
const details = document.querySelector(".detail")
let fullPokemonList = {};

let bottomNumber = 12;
// Grabs the first set of pokemon to allow for quicker page load.
pokemon.getInitialPokemonList().then((res) => {
    monList.innerHTML = "";
    fullPokemonList = res;
    if (fullPokemonList && Object.keys(fullPokemonList).length != 0) {
        createList(Object.keys(fullPokemonList).slice(0, bottomNumber));
    } else {
        monList.innerHTML = "ERROR: Pokémon have escaped Dex... Beware Jurassic Pokémon Park"
    }
    //pulls the remaining pokemon after load
}).finally((e) => {
    addEventListenerToPokemon(Object.keys(fullPokemonList).slice(0, bottomNumber));
    pokemon.getRestOfPokemon(fullPokemonList).then((res) => {
        fullPokemonList = res;
    });
})
// adds listeners to each checkbox in object
function addEventListenerToPokemon(arr) {
    arr.forEach((e) => {
        document
            .getElementById(`${fullPokemonList[e].id}check`)
            .addEventListener("click", () => {
                fullPokemonList[e].collected = !fullPokemonList[e].collected;
                ls.set('pokemonList', fullPokemonList)
                
                let change = document.getElementById(`${fullPokemonList[e].id}`);
                if (fullPokemonList[e].collected == true ){
                    change.innerHTML = `<p class="replace">Congrats on ${fullPokemonList[e].shiny ? "Shiny" : ""} ${fullPokemonList[e].name[0].toUpperCase()}${fullPokemonList[e].name.slice(1)}</p>
                                        <img class="caught" src="images/caught.png"></img>`
                } else {
                    change.innerHTML = `<p class="replace gone">Bye! ${fullPokemonList[e].shiny ? "Shiny" : ""} ${fullPokemonList[e].name[0].toUpperCase()}${fullPokemonList[e].name.slice(1)}</p>
                                        <img class="leave" src='${fullPokemonList[e].shiny ? fullPokemonList[e].sbimage : fullPokemonList[e].bimage}'></img>`
                }
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
// builds line item under monList
function createList (arr) {
    arr.forEach((e) => {
        monList.innerHTML += 
        `<li class="card" id="${fullPokemonList[e].id}">
            <h1># ${fullPokemonList[e].id}</h1>
            <input type="checkbox" class="checkOne" id="${fullPokemonList[e].id}check"></input>
            <img class="ball_icon"src="images/pokeball.png" loading="lazy"></img>
            <input type="checkbox" class="checkTwo" id="${fullPokemonList[e].id}shiny"></input>
            <img class="shiny_icon"src="images/shiny.png" loading="lazy"></img>
            <h2>${fullPokemonList[e].name[0].toUpperCase()}${fullPokemonList[e].name.slice(1)}</h2>
            <img class="typeOne" src="images/${fullPokemonList[e].typeOne}.png" loading="lazy"/></img>
            ${fullPokemonList[e].typeTwo ? `<img class='typeTwo' src='images/${fullPokemonList[e].typeTwo}.png' loading='lazy'/></img>` : ''}
            <img class="sprites " id="${fullPokemonList[e].id}image" src='${fullPokemonList[e].shiny ? fullPokemonList[e].simage : fullPokemonList[e].image}' 
            loading="lazy"'></img>
        </li>
        `
    });
}
//sets class to all and filters accordingly
function allButton() {
    monList.innerHTML = "";
    const displayList = Object.keys(fullPokemonList).slice(0, 12);
    document.getElementById("btnMind").classList.add("full");
    document.getElementById("btnMind").classList.remove("collected");
    document.getElementById("btnMind").classList.remove("unCollected");
    createList(displayList);
    addEventListenerToPokemon(displayList);
}
document.getElementById("allBtn").addEventListener("click", () => {
    allButton();
})
//sets class to collected and filters accordingly
function collectedButton() {
    monList.innerHTML = "";
    const displayList = Object.keys(fullPokemonList).filter((e) => fullPokemonList[e].collected).slice(0, 12);
    document.getElementById("btnMind").classList.remove("full");
    document.getElementById("btnMind").classList.add("collected");
    document.getElementById("btnMind").classList.remove("unCollected");
    createList(displayList);
    addEventListenerToPokemon(displayList);
    
}
document.getElementById("collectedBtn").addEventListener("click", () => {
    collectedButton();
})
//sets class to uncollected and filters accordingly
function uncollectedButton() {
    monList.innerHTML = "";
    const displayList = Object.keys(fullPokemonList).filter((e) => !fullPokemonList[e].collected).slice(0, 12);
    document.getElementById("btnMind").classList.remove("full");
    document.getElementById("btnMind").classList.remove("collected");
    document.getElementById("btnMind").classList.add("unCollected");
    createList(displayList);
    addEventListenerToPokemon(displayList);
}
document.getElementById("uncollectedBtn").addEventListener("click", () => {
    uncollectedButton();
})


// refreshes monList html based on present class
document.getElementById("refresh").addEventListener("click", () => {
    monList.innerHTML = "";
    switch (btnMind.className) {
        case btnMind.className = 'mon_list collected':
            collectedButton();
            break;
        case btnMind.className = 'mon_list unCollected':
            uncollectedButton();
            break;
        case btnMind.className = 'mon_list full':
        default:
            allButton();
            break;
    }
})
//lists for next button clicks and based on class filter and manuplates data to show proper list and amount
document.getElementById("next").addEventListener("click", () => {
    monList.innerHTML = "";
    let orgBottomNumber = bottomNumber;
    bottomNumber += 12;
    if (bottomNumber > 1118) {
        orgBottomNumber = 1118 - 12;
        bottomNumber = 1118;
    }
    if (btnMind.className == "mon_list full") {
        const displayList = Object.keys(fullPokemonList).slice(orgBottomNumber, bottomNumber)
        createList(displayList);
        addEventListenerToPokemon(displayList);
    } else if (btnMind.className == "mon_list collected") {
        if (bottomNumber > Object.keys(fullPokemonList).filter((e) => fullPokemonList[e].collected).length) {
            orgBottomNumber = Object.keys(fullPokemonList).filter((e) => fullPokemonList[e].collected).length - 12;
            bottomNumber = Object.keys(fullPokemonList).filter((e) => fullPokemonList[e].collected).length;
            if (orgBottomNumber < 0) {
                orgBottomNumber = 0;
            }
        }
        const displayList = Object.keys(fullPokemonList).filter((e) => fullPokemonList[e].collected).slice(orgBottomNumber, bottomNumber);
        createList(displayList);
        addEventListenerToPokemon(displayList);
    } else {
        if (bottomNumber > Object.keys(fullPokemonList).filter((e) => !fullPokemonList[e].collected).length) {
            orgBottomNumber = Object.keys(fullPokemonList).filter((e) => !fullPokemonList[e].collected).length - 12;
            bottomNumber = Object.keys(fullPokemonList).filter((e) => !fullPokemonList[e].collected).length;
            if (orgBottomNumber < 0) {
                orgBottomNumber = 0;
            }
        }
        const displayList = Object.keys(fullPokemonList).filter((e) => !fullPokemonList[e].collected).slice(orgBottomNumber, bottomNumber);
        createList(displayList);
        addEventListenerToPokemon(displayList);
    }
})
//lists for prev button clicks and based on class filter and manuplates data to show proper list and amount
document.getElementById("prev").addEventListener("click", () => {
    monList.innerHTML = "";
    let orgBottomNumber = bottomNumber - 24;
    bottomNumber = bottomNumber - 12;
    if (bottomNumber <= 12) {
        bottomNumber = 12;
        if (orgBottomNumber < 0) {
            orgBottomNumber = 0;
        }
    }
    if (btnMind.className == "mon_list full") {
        const displayList = Object.keys(fullPokemonList).slice(orgBottomNumber, bottomNumber)
        createList(displayList);
        addEventListenerToPokemon(displayList);
    } else if (btnMind.className == "mon_list collected") {
        if (bottomNumber > Object.keys(fullPokemonList).filter((e) => fullPokemonList[e].collected).length) {
            orgBottomNumber = Object.keys(fullPokemonList).filter((e) => fullPokemonList[e].collected).length - 12;
            bottomNumber = Object.keys(fullPokemonList).filter((e) => fullPokemonList[e].collected).length;
            if (orgBottomNumber < 0) {
                orgBottomNumber = 0;
            } 
        }
        const displayList = Object.keys(fullPokemonList).filter((e) => fullPokemonList[e].collected).slice(orgBottomNumber, bottomNumber);
        createList(displayList);
        addEventListenerToPokemon(displayList);
    } else {
        if (bottomNumber > Object.keys(fullPokemonList).filter((e) => !fullPokemonList[e].collected).length) {
            orgBottomNumber = Object.keys(fullPokemonList).filter((e) => !fullPokemonList[e].collected).length + 12;
            bottomNumber = Object.keys(fullPokemonList).filter((e) => !fullPokemonList[e].collected).length;
            if (orgBottomNumber < 0) {
                orgBottomNumber = 0;
            }
        }
        const displayList = Object.keys(fullPokemonList).filter((e) => !fullPokemonList[e].collected).slice(orgBottomNumber, bottomNumber);
        createList(displayList);
        addEventListenerToPokemon(displayList);
    }
})












