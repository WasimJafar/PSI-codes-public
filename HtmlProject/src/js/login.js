import {setData, getData, setText} from '../js/demo1.js'

var arr = [{name : 'Wasim', email : 'w1@gmail.com', dob : '01-01-1999', phone_no : '9871428946'} , 
{name : 'Wasim1', email : 'w2@gmail.com', dob : '01-01-1999', phone_no : '9871428946'},
{name : 'Rahul', email : 'w1@gmail.com', dob : '01-01-1999', phone_no : '9871428946'} , 
{name : 'AAA', email : 'w2@gmail.com', dob : '01-01-1999', phone_no : '9871428946'}]

var arr1 = [...arr] //copy :-> spread operator | arr to individual elements

window.validate = function validate() {
    let name = getData('name')
    let email = getData('email')
    let dob = getData('dob')
    let phone_no = getData('phone_no')

    let dob_ = convertDate(dob)
   
    if(name.charAt(0) != 'W' && name.charAt(0) != 'w') {
        alert('Name does not match')
    }       
    else if(! telephoneCheck(phone_no)) {
        alert('Invalid phone number')
    }
    else {

        arr.push({
            name : name,
            email : email,
            dob : dob_,
            phone_no : phone_no
        })

    }
}

window.display = function display() {


    let table = '<table border = 1px class = "ctable"><thead><tr><th>Name</th><th>Email</th><th>DOB</th><th>Phone No</th></tr></thead><tbody>'
    
    arr1.forEach(obj => {
        table += '<tr>' +  '<td> ' +obj.name + '</td>'
        table += '<td> ' +obj.email + '</td>'
        table += '<td> ' +obj.dob + '</td>'
        table += '<td> ' +obj.phone_no + '</td> </tr>'
    })
    
    table += '</tbody></table>'
    table += '<input type="submit" class="input-submit" value="Display by Name" onclick="display1()" id = "display_btn" ">'
    table += '<input type="submit" class="input-submit" value="Display by All" onclick="display2()" id = "display_btn_all" ">'
    setText('display-data' , table)
}

window.display2 = function display2() {
    let x = getData('display_btn_all')
    arr1 = [...arr];
    console.log(arr1)
    display()
}

window.display1 = function display1() {

    let x = getData('display_btn')
    console.log(x)
  
    let name = getData('name')
    arr1 = arr.filter(element => {
        if(element.name === name){
            return true
        }
        else {return false}
    })
    display()
   

}

function telephoneCheck(str) {
    let patt = new RegExp('[1-9]{1}[0-9]{9}');
    return patt.test(str) && str.length == 10;
}

function convertDate(dob) {
    let yy = dob.substring(0 , 4)
    let mm = dob.substring(5 , 7)
    let dd = dob.substring(8)
    return dd + '-' + mm + '-' + yy
}