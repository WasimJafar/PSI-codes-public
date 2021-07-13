console.log('Welcome to JS')

function doAddition() {
    // console.log('Welcome to Addition method')

    let num1 = getData('first-number');
    let num2 = getData('second-number');

    let num3 = parseInt(num1) + parseInt(num2);
    setData('result' , num3);
}

function setData(id_name , res) {
    document.getElementById(id_name).value = res;
}

function getData(id_name) {
    return document.getElementById(id_name).value;
}

function setText(id_name , res) {
    document.getElementById(id_name).innerHTML = res;
}

//module export: same package-> export | diff package-> module.export
export {setData, getData, setText}