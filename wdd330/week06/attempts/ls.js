//exports object data
export class Data {
    id = ""; //define object as blank
    content = ""; //define object as blank
    completed = false; //define default value as false
    //generate object with content
    constructor(id, content) {
        this.id = id; //defines id and parameter id from constructor
        this.content = content; //defines content and parameter content from constructor
        this.completed = false; //defines new object as false for completed
        
    }
    toggleCompleted() {
        this.completed = !this.completed; //takes completed and swaps true and false value 
    } 
}



