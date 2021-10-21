// array to hold todo list items
let todoItems = [];
//create object for todo list and moves it to array
function addItem(text) {
    // todo object
    const todo = {
        text, //content
        checked: false, //task marked uncomplete or complete
        id: Date.now(), //generate an id for the object 
    };
    //pushes object to the array
    todoItems.push(todo);
    console.log(todoItems);
}
// select form
const form = document.querySelector('.todoForm');
// event listener for a submit event
form.addEventListener('click', event => {
    //stop refreshing of page
    event.preventDefault();
    const formSubmit = document.querySelector('.todoSubmit');
    //select form input
    const formInput = document.querySelector('.todoInput');
    //get input value and trims extra whitespaces off
    const data = formInput.value.trim();
    //valids that the entry is not simply an empty string
    if (data !== '') {
        //sents data to the addItem function
        addItem(data);
        //sets input value to blank for next input
        formInput.value = '';
        //return to input to allow for multiple entries
        formInput.focus();
    }
});