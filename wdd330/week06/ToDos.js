//imports utility
import { Utility } from "./utilities.js";
//initializes utility
let todoUtility = new Utility();

const todoList = document.querySelector(".todo_list");
todoList.innerHTML = "";

const updateTodoView = () => {
    todoList.innerHTML = "";

    todoUtility.todoList.forEach((e) => {
        todoList.innerHTML += `<li class="todo_card ${e.status ? "done" : ""}" id="${e.id}">
            <button class="mark" id="done_${e.id}">
                &checkmark;
            </button>
            <h3 class="todo_title">${e.content}</h3>
            <button class="remove" id="delete_${e.id}"> 
                &cross;
            </button>
        </li>`;
    });

    todoUtility.todoList.forEach((e) => {
        document
        .getElementById(`done_${e.id}`)
        .addEventListener("click", () => {
            todoUtility.updateTodo(e.id);
            document.getElementById(e.id).classList.toggle("done");
        });

        document
        .getElementById(`delete_${e.id}`)
        .addEventListener("click", () => {
            todoUtility.removeTodo(e.id);
            updateTodoView();
        });
    });
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
updateTodoView();



