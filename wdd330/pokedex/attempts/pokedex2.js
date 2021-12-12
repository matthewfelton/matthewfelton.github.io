


let pokeApiCall = [];

export function getApiCall() {
    return pokeApiCall;
}

async function paginated_fetch(
    url = "https://pokeapi.co/api/v2/pokemon/",
    start = 1,
    lastCall = []
) {
    return fetch(`${url}${start}`)
    .then(response => {
        if (!response.ok) {
            throw Error(response.statusText);
        } else {
            let res = response.json();
            return res;
        }
    })
    .then(function (data) {
        let result = data.data;
        pokeApiCall = [...lastCall, ...pokeApiCall];
        if (result.length !== 0) {
            start += 20;
            return paginated_fetch(url, start, pokeApiCall);
        }

    })
    .catch(function(error) {
        console.log(error);
    });
}
paginated_fetch();
console.log(pokeApiCall);