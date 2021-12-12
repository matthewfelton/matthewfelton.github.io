export class localStorage {
    constructor() {
    }
    set(k, v){
        window.localStorage.setItem(k, JSON.stringify(v));
    }
    get(k) {
        return JSON.parse(window.localStorage.getItem(k))
    }
}