//import hikes javascript
import Hikes from './hikes.js';
const myHikes = new Hikes('hikes');

//you call this by doing myHike.showHikeList()

window.addEventListener("load", () => {
    myHikes.showHikeList();
});
myHikes.hikeList;
//What code do we need to make the event listener ontouchend to only show the selected hike details?
