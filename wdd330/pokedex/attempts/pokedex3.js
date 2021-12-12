
let pokemonMasterlist = [];
let apiUrl = 'https://pokeapi.co/api/v2/pokemon/?limit=150';

export function getMatter() {
    return pokemonMasterlist;
}


function addMaster(data) {
    if (typeof data === "object" && "name" in data && "detailsUrl" in data) {
        pokemonMasterlist.push(data);
    } else {
        console.log("ERROR: Data does not contain a Pokemon...")
    }
}

function loadList() {
    return fetch(apiUrl)
    .then(function (response) {
        return response.json();
    })
}
loadList();
console.log(pokemonMasterlist);



const pokemonList = [];

export function getArray() {
    return pokemonList;
}

const apiArray =[];
let api = "";
for (let i = 1; i <= 150; i++) {
    let api = `https://pokeapi.co/api/v2/pokemon/${i}`
    apiArray.push(fetch(api)
    .then(res => res.json()));
}
Promise.all(apiArray)
.then((results) => {
    //console.log(results);
    results.forEach((data) => {
        //console.log(data);
        pokemonList.push(
            {
                id: data.id,
                name: data.name,
                image: data.sprites["front_default"],
                caught: false,
                type: data.types.map((type) => type.type.name).join(', ')
                
            }
        )
        
    })
});
//console.log(pokemonList);