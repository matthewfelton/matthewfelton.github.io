//imports utility
import { Utility } from "./utilities.js";
//initializes utility
const todoUtility = new Utility();
const todoList = document.querySelector(".todo_list");
const taskTodo = document.getElementById("tasks-left");

const updateTodoView = () => {
    todoList.innerHTML = "";
    //e = element i = index
    todoUtility.displayList.forEach((e, i) => {
        //creates a li templete for todo list output
        todoList.innerHTML += `<li class="todo_card ${e.completed ? "done" : ""}" id="${e.id}">
            <input type="checkbox" id="${e.id}check"/>
            <h3 class="todo_title">${e.content}</h3>
            <button class="remove" id="delete${e.id}"> 
                &cross;
            </button>
        </li>`;
    });

    todoUtility.displayList.forEach((e, i) => {    
        // Addes listener to checkbox to update todo list when checkbox is checked.
        document
        .getElementById(`${e.id}check`)
        .addEventListener("click", () => {
            todoUtility.updateTodo(i);
            document.getElementById(e.id).classList.toggle("done");
            updateTodoView();
        });

        // Addes listener to x to remove item from todo list.
        document
        .getElementById(`delete${e.id}`)
        .addEventListener("click", () => {
            todoUtility.removeTodo(i);
            updateTodoView();
        });

        // Sets the checked value of the check box to the completed value of the object.
        document.getElementById(e.id + 'check').checked = e.completed;
    });
    taskTodo.innerHTML = `<p>${todoUtility.todoList.filter((element) => !element.completed).length} tasks left</p>`;
}

//collect input data from html element
const todoInput = document.getElementById("todo_input");
//select the form and listen for submit
document.getElementById("add_todo").addEventListener("submit", (e) => {
    e.preventDefault(); //stops default page refresh on submit
    
    //validates if entry is blank
    if (todoInput.value !== "") {
        todoUtility.addTodo(todoInput.value); //sents data to the addItem function
        todoInput.value = ""; //sets input value to blank for next input
        todoInput.focus(); //return to input to allow for multiple entries
    }
    updateTodoView();
});

document.getElementById("all-tasks-btn").addEventListener("click", () => {
    todoUtility.updateDisplayList('all');
    updateTodoView();
});
document.getElementById("active-tasks-btn").addEventListener("click", () => {
    todoUtility.updateDisplayList(false);
    updateTodoView();
});
document.getElementById("completed-tasks-btn").addEventListener("click", () => {
    todoUtility.updateDisplayList(true);
    updateTodoView();
});

updateTodoView();
