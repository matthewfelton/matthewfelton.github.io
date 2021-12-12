import { localStorage } from "./ls.js";

const ls = new localStorage();
let pokemonList = {};

export default class pokemonjs {
    constructor() {
    }

    getInitialPokemonList = async () => {
        const apiArray = [];
        let api = "";
        for (let i = 1; i <= 151; i++) {
            let api = `https://pokeapi.co/api/v2/pokemon/${i}`
            apiArray.push(fetch(api)
            .then(res => res.json()));
        }
        const savedPokemon = ls.get('pokemonList');
        return Promise.all(apiArray)
        .then((results) => {
            results.forEach((data) => {
                pokemonList[data.name] = {
                    id: data.id,
                    name: data.name, 
                    image: data.sprites["front_default"],
                    simage: data.sprites["front_shiny"],
                    bimage: data.sprites["back_default"],
                    sbimage: data.sprites["back_shiny"],
                    collected: false,
                    typeOne: data.types[0].type.name,
                    typeTwo: data.types[1] ? data.types[1].type.name : '',
                    shiny: false,
                };
                if (savedPokemon && savedPokemon[data.name]) {
                    if (savedPokemon[data.name].collected) {
                        pokemonList[data.name].collected = true;
                    }
                    if (savedPokemon[data.name].shiny) {
                        pokemonList[data.name].shiny = true;
                    }
                }
            });
            return pokemonList;
        });
    }

    getRestOfPokemon = async (pokemonList) => {
        const savedPokemon = ls.get('pokemonList');
        const apiArray = [];
        async function performAPICall(url) {
            return fetch(url)
            .then((res) => {
                return res.json();
            })
            .then((data) => {
                data.results.forEach((d) => {
                    apiArray.push(
                        fetch(d.url).then(res => res.json())
                    );
                })
                if (data.next) {
                    return performAPICall(data.next);
                }
            })
        }
        await performAPICall('https://pokeapi.co/api/v2/pokemon/?offset=151&limit=500');
        return Promise.all(apiArray)
        .then((results) => {
            results.forEach((data) => {
                pokemonList[data.name] = pokemonList[data.name] = {
                    id: data.id,
                    name: data.name, 
                    image: data.sprites["front_default"],
                    simage: data.sprites["front_shiny"],
                    bimage: data.sprites["back_default"],
                    sbimage: data.sprites["back_shiny"],
                    collected: false,
                    typeOne: data.types[0].type.name,
                    typeTwo: data.types[1] ? data.types[1].type.name : '',
                    shiny: false,
                };
                if (savedPokemon && savedPokemon[data.name]) {
                    if (savedPokemon[data.name].collected) {
                        pokemonList[data.name].collected = true;
                    }
                    if (savedPokemon[data.name].shiny) {
                        pokemonList[data.name].shiny = true;
                    }
                }
            });
            return pokemonList;
        });
    }
}