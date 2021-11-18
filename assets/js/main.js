//array for list generation
const links = [
    {
        label: "Week 01 Notes" ,
        url: "wdd330/week01/"
    } ,
    {
        label: "Week 02 Notes" ,
        url: "wdd330/week02/"
    } , 
    {
        label: "Week 03 Notes" ,
        url: "wdd330/week03/"
    } ,
    {
        label: "Week 04 Notes" ,
        url: "wdd330/week04/"
    } ,
    {
        label: "Week 05 Notes" ,
        url: "wdd330/week05/"
    } ,
    {
        label: "Week 06 ToDo List" ,
        url: "wdd330/week06/"
    } ,
    {
        label: "Week 07 Notes" ,
        url: "wdd330/week07/"
    } ,
    {
        label: "Week 08 Notes" ,
        url: "wdd330/week08/"
    } ,
    {
        label: "Week 09 Notes" ,
        url: "wdd330/week09/"
    } ,
    {
        label: "Week 10 Notes" ,
        url: "wdd330/week10/"
    }
]
//select the container for to deposit array label
const select = document.querySelector("#wdd330Container");

//loop for selecting array item
for (i = 0; i <= links.length; i++) {
    //generate list item tag
    let listItem = document.createElement("li");

    //assign id for link generation and text
    listItem.setAttribute("id","assign");
    listItem.innerText = links[i].label + "; ";

    //generate href tag
    let link = document.createElement("a");

    // assign href to a tag and styling and text
    link.setAttribute("href", links[i].url);
    link.setAttribute("class", "assignments");
    link.innerText = "Access Here";

    //assign list items to container and link to container
    select.appendChild(listItem);
    listItem.appendChild(link);
}