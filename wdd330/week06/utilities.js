// import local stored data object
import { Data } from "./ls.js";
const store = new Data();
// export utility functions
export class Utility {
    // generates items to array
    constructor() {
        this.todoList = store.get('toDoList');
        if (!this.todoList) {
            this.todoList = [];
        }
        this.displayList = this.todoList;
    }
    
    addTodo(todoContent) {
        this.todoList.push(
            {
                id: Date.now(),
                content: todoContent,
                completed: false
            }
        );
        store.set('toDoList', this.todoList);
    }                                      
    
    removeTodo(i) {
        this.todoList.splice(i, 1);
        store.set('toDoList', this.todoList);
    }

    updateTodo(i) {
        this.todoList[i] = {
            id: this.todoList[i].id,
            content: this.todoList[i].content,
            completed: !this.todoList[i].completed,
        }
        store.set('toDoList', this.todoList);
    }

    updateDisplayList(view) {
        if (view === 'all') {
            this.displayList = this.todoList;
        } else {
            // Set the display list to the elements that have the completed value that is the same as
            // the view value. true/false
            this.displayList = this.todoList.filter((element) =>  element.completed === view);
        }
    }
}