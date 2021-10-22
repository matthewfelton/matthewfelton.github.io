//import local stored data object
import { Data } from "./ls.js";
//export utility functions
export class Utility {
    todoList = []; //defines a blank array
    //generates items to array
    constructor() {
        this.todoList = [];
    }
    
    addTodo(todoContent) {
        this.todoList.push(new Data(this.todoList.length, todoContent));
    }
    
    removeTodo(id) {
        this.todoList = this.todoList.filter((data) => data.id !== id);
    }
    updateTodo(id) {
        this.todoList = this.todoList.map((data) => {
            if (data.id === id) data.toggleCompleted();
            return data;
        });
    }
}