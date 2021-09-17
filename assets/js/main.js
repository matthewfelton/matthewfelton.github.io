//array for list generation
const links = [
    {
        label: "Week 01 Notes" ,
        url: "WDD330/Week01/index.html"
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