import{getData, setText} from '../js/demo1.js'

window.doMaths = function doMaths() {
    let num = parseInt(getData('number'))

    let s1 = '<table border = 1 class = "ctable" ><tbody>';
    debugger
    for(let i = 1 ; i < 11 ; i++) {
        s1 += '<tr> <td>' + (num) + '</td> <td> * </td> <td>' + (i) + '</td> <td> = </td><td>'  + (num * i) + '</td></tr>'
    }
    s1 += '</tbody></table>'
    setText('math' , s1)
}


// doMaths()