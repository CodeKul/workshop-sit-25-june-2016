/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//

function changeIt(inputElement) {

    var obj = {};
    
    var label = document
            .getElementById("labelStatus");

    label.innerHTML = inputElement.value;
}